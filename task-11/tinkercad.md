<pre>
#include <Servo.h>
#include <LiquidCrystal.h>

// initialize the library with the numbers of the interface pins
LiquidCrystal lcd(12, 11, 5, 4, 3, 2);

Servo myservo;  // create servo object to control a servo
int pos = 0;    // variable to store the servo position
int ldrPin = A0; // LDR connected to analog pin A0

void setup() {
  myservo.attach(9);  // attaches the servo on pin 9 to the servo object
  lcd.begin(16, 2);   // set up the LCD's number of columns and rows:
}

void loop() {
  int ldrStatus = analogRead(ldrPin); // read the value from the LDR

  if (ldrStatus >= 200) { // adjust this value based on your ambient light conditions
    for (pos = 0; pos <= 180; pos += 1) { // goes from 0 degrees to 180 degrees
      myservo.write(pos); // tell servo to go to position in variable 'pos'
      delay(15); // waits 15ms for the servo to reach the position
    }
    lcd.clear();
    lcd.print("ROOF OPEN");
  } else {
    for (pos = 180; pos >= 0; pos -= 1) { // goes from 180 degrees to 0 degrees
      myservo.write(pos); // tell servo to go to position in variable 'pos'
      delay(15); // waits 15ms for the servo to reach the position
    }
    lcd.clear();
    lcd.print("ROOF CLOSED");
  }
}
</pre>