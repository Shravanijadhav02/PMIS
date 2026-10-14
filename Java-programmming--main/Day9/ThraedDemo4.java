package Multithreading;

public class ThreadDemo1 implements Runnable {
    public void  run() {
        System.out.println("Now the thraed is running...");
    }
    public static void main(String[] args) {
        Runnable obj = new threadDemo4();
        Thraed t1 = new Thraed(obj,"My new thraed");
        t1.start();
        String str=t1.getName();
        System.out.println(Str);
        
    }
}