package javatpoint;

// Without method overloading.....
//
//class vehicle{
//    void run(){
//        System.out.println("vehicle is running!");
//    }
//
//}
//public class bike extends vehicle {
//    public static void main(String[] args) {
//        bike b = new bike();
//        b.run();
//    }
//}

// ... With method overloading  ///
class vehicle{
    void run(){
        System.out.println("Vehicle is running!");
    }
}
public class bike extends vehicle{
    void run(){
        System.out.println("Vehicle is running safely!");
    }

    public static void main(String[] args) {
        vehicle b = new vehicle();
        b.run();
    }
}

