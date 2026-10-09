// single level inheritance
// in single level inheritance there is only one child class and only one parent class
// class Animal{
//     void eat(){
//         System.out.println("this animal eats food");
//     }
// }

// class Dog extends Animal{
//     void bark(){
//         System.out.println("the dog barks");
//     }
// }

// public class demo{
//     public static void main(String[] args){
//         Dog myDog= new Dog();
//         myDog.bark();
//     }
// }

// in this by using entends keyword we are extending animal class 



// -----------------------------------------------


// #multilevel inheritance
// there is multiple child classes in multilevel inheritance
// class Device{
//     void powerOn(){
//         System.out.println("calling number");
//     }
// }
// class Phone extends Device{
//     void makeCall(){
//         System.out.println("calling the number");
//     }
// }
// class SmartPhone extends Phone{
//     void browseInternet(){
//         System.out.println("Opening browser");
//     }

// }
// public class demo{
//     public static void main(String[] args){
//         SmartPhone samsingh=new SmartPhone();
//         samsingh.browseInternet();
//         samsingh.makeCall();
//         samsingh.powerOn();
//     }
// }




// ----------------------------
// herarchical inheritance
/*
\ 
  \  |\
  \  b c
*/
// one parent class is accesed by multiple child classes
// common parent
// class Shape{
//     String color="Blue";
// }

// // firsst child
// class Circle extends Shape{
//     void drawCircle(){
//         System.out.println("Drawing a"+color+"circle");
//     }
// }
// // second child
// class Rectangle extends Shape{
//     void drawRectangle(){
//         System.out.println("Drawing a"+color+"rectangle");
//     }
// }

// public class demo{
//     public static void main(String[] args){
//         Circle c= new Circle();    //#for every child class we have to create the objects 
//         Rectangle r=new Rectangle();

//         c.drawCircle();
//         r.drawRectangle();
//     }
// }

/**
 * demo
 */
/**
 * Mother
 */
/* */

/* */

class BankAccount {
  String accountHolder;

  BankAccount(String accountHolder) {
    this.accountHolder = accountHolder;
  }
  void displayDetails() {
    System.out.println("Account Holder: "+accountHolder);
  }
}

class SavingsAccount extends BankAccount {
  double interestRate = 4.5;

  SavingsAccount(String accountHolder) {
    super(accountHolder);
  }
  @Override void displayDetails() {
    super.displayDetails();
    System.out.println("Interest rate: "+ interestRate + "%");
  }


}