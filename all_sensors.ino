#include <DHT.h>
#include <DHT_U.h>

#include <ESP8266WiFi.h>
#include <WiFiClient.h>




const char* ssid = "vivo";
const char* password = "BHARTESH";
int sensorstate;
#define echoPin D5
#define pin D0
int smokestate;

WiFiServer Server(80);
WiFiClient client;

IPAddress ip(192,168,43,121);
IPAddress gateway(10,105,73,2);
IPAddress subnet(255,255,255,0);


void setup() {
  Serial.begin(9600);
  pinMode(echoPin,INPUT);
  pinMode(pin,INPUT);
  WiFi.begin(ssid,password);
  WiFi.config(ip,gateway,subnet);
  Serial.println("connecting");

  while(WiFi.status() != WL_CONNECTED)
  {
    delay(200);
    Serial.print(".");
  }
    Serial.println("connected to ");
    Serial.println(ssid);
    Serial.print("IP address  ");
    Serial.println((WiFi.localIP()));
    Server.begin();
    Serial.printf("web server started,open %s in web browser\n", WiFi.localIP().toString().c_str());
    
   
}

void loop() {
  // put your main code here, to run repeatedly:

client=Server.available();
if(client)
{
  Serial.println("client connected");
  while(client.connected())
  {
    sensorstate=digitalRead(echoPin);
    
      Serial.println(sensorstate);

      client.print(sensorstate);
      client.print('\r');
      
      
     


      
      delay(200);


    
    }
  }










}
