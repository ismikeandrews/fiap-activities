//void setup() {
//  Serial.begin(9600);          // inicia a comunicacao serial com 9600 baud
//  pinMode(LED_BUILTIN, OUTPUT);
//}
//
//    void loop(){
//      if (Serial.available() > 0) {   
//      char caractere;               
//      caractere = Serial.read();  
//     if (caractere == 'H') {   
//           
//        digitalWrite(LED_BUILTIN, HIGH);   // liga o led
//     } else if(caractere == 'L'){
//        digitalWrite(LED_BUILTIN, LOW);    // desliga o led
//     }
//
//  delay(1000); 
//      }
// }

void setup() {
  Serial.begin(9600);          // inicia a comunicacao serial com 9600 baud
  pinMode(LED_BUILTIN, OUTPUT);
}

    void loop(){
      if (Serial.available() > 0) {   
      char caractere;               
      caractere = Serial.read();  
     if (caractere != '\n') {   
           
        if (digitalRead(LED_BUILTIN) == HIGH) {   // verifica a leitura do sensor, caso esteja ligado o led ele entra na linha abaixo
        digitalWrite(LED_BUILTIN, LOW);    // desliga o led
        } else {
        digitalWrite(LED_BUILTIN, HIGH);   // liga o led
      }
     } 
  delay(1000); 
      }
 }
