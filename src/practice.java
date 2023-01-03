abstract class Animal{
  abstract void animalSound();
  public void eat(){
    System.out.println("I am eating.");
  }
}

class Dog extends Animal{
  public void animalSound(){
    System.out.println("bark,bark!");
  }
}

class Pig extends Animal{
  public void animalSound(){
    System.out.println("wee,wee!");
  }
}

 class practice{
  public static void main(String[] args) {
    Dog myDog = new Dog();
    myDog.animalSound();
    myDog.eat();
  }
}