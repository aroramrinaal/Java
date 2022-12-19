public class Main{
    public static void main(String[] args) {
        Bunny myBunny = new Bunny();
        myBunny.age = 3;
        myBunny.name = "Flopsy";
        myBunny.getName();
    }
}

class Bunny{
    String name;
    int age;

    void getName(){
        System.out.println("Name of the bunny is "+name+".");
    }
}

// Java Practice
// OOPS In Java