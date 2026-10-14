/**
 * Engine
 */
// class Engine {
//     void start() {
//         System.out.println("Engine is starting..");

//     }

// }
// class car(
//     private Engine engine;
//     car(){
//         this.engine =  new Engine();
//     }
//     void drive() {
//     engine.start();
//     System.out.println("car is moving");
// }

// )

class Address{
    String city;
    String state;
    int pincode;

    Address(String city, String state, int pincode) {
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
    void displayAddress() {
        System.out.println(city + ", "+ state + "," + pincode);
    }
}
class Student{
    String name; 
    int rollNumber;
    Address address;

    Student(String name, int rollNumber, Address address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;
    }

    void displayProfile() {
        System.out.println("Student: "+ name +"\nRoll No."+rollNumber);
        System.out.println("Lives at: ");
    }
}