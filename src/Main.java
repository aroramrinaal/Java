// Java Practice
// OOPS In Java

public class Main{
    public static void main(String[] args) {
        BabyDog myPet = new BabyDog();
        myPet.eating();
        myPet.bark();
        myPet.weeps();
    }
}

class Animal{
    void eating(){
        System.out.println("eating...");
    }
}


class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }  
}


class BabyDog extends Dog{
    void weeps(){
        System.out.println("weeping...");
    }
}