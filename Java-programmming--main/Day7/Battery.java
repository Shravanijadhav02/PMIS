// class Battery {
//     int capacityMah;
//     Battery(int capacityMah) {
//         this.capacityMah = capacityMah;
//     }

//     void drain() {
//         System.out.println("Battery Used.\nCapacity remaining: "+ (capacityMah - 100) + "mAh")
//     } 
// }

// class Camera{
//     int pix;

//     Camera(int pix) {
//         this.pix = pix;
//     }
//     void takePhoto() {
//         System.out.println("Click...captures a photo with " + pix + "sensor");
//     }
// }

// class Phone{
//     String brand;
//     Battery battery;
//     Camera camera;

//     Phone(String brand, Battery battery, Camera camera) {
//         this.brand = brand;
//         this.battery = battery;
//         this.camera = camera;
//     }

//     void snapPicture() {
//         System.out.println("[ " + brand + " ]" + " is active. ");
//         camera.takePhoto();
//         battery.drain();
//     }
// }

class Student{
    String name;
    static String collegeNmae = "IIT Bombay";
    Student(String name) {
        this.name = name;
    }
    void stucol() {
        System.out.println(name = " studies in " + collegeName);
    }
}