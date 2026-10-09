class Car {

    String color;
    String Brand;
    int speed;

    // Constructor
    Car(String color, String Brand, int speed) {
        this.color = color;
        this.Brand = Brand;
        this.speed = speed;
    }

    // Display car information
    void displayinfo() {
        System.out.println("Brand: " + this.Brand);
        System.out.println("Color: " + this.color);
        System.out.println("Speed: " + this.speed);
    }

    // Accelerate the car
    void accelerate(int increase) {
        int originalSpeed = this.speed;

        this.speed += increase;

        System.out.println("Original speed: " + originalSpeed);
        System.out.println(this.Brand + " accelerated by " + increase);
        System.out.println("New speed: " + this.speed);
    }

    // Main method
    public static void main(String[] args) {

        Car car1 = new Car("Red", "BMW", 60);

        car1.displayinfo();

        System.out.println();

        car1.accelerate(20);
    }
}