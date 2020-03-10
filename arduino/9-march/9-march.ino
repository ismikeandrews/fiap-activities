
#include "DHT.h"
#define LED_VERMELHO 13
#define LED_VERDE 12
#define HIGROMETRO A1

#define DHTPIN A3
#define DHTTYPE DHT11

const int ldrPin = A2;

DHT dht(DHTPIN, DHTTYPE);

void setup() {
  Serial.begin(9600);
  dht.begin();
  pinMode(LED_VERMELHO, OUTPUT);
  pinMode(LED_VERDE, OUTPUT);
  pinMode(ldrPin, INPUT);
}

void loop() {
  float umidade = dht.readHumidity(); 
  int ldStatus = analogRead(ldrPin);
  int umidadeSolo = analogRead(HIGROMETRO);
  float temperature = dht.readTemperature(); 

   Serial.print("Umidade do ar: ");
    Serial.println(umidade);
    Serial.print("Luminosidade: ");
    Serial.println(ldStatus);
    Serial.print("Umidade do solo : ");
    Serial.println(umidadeSolo);
    Serial.print("Temperatura: ");
    Serial.println(temperature);
  
  if (umidadeSolo > 600 && ldStatus > 340) {
    digitalWrite(LED_VERMELHO, LOW);
    digitalWrite(LED_VERDE, HIGH);
   
  } else if(umidadeSolo > 600 && ldStatus < 341){
    digitalWrite(LED_VERDE, LOW);
    digitalWrite(LED_VERMELHO, HIGH);
  }
  del
} 
