import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name.");
        name = sc.nextLine();
        System.out.println("Hello "+name);
    }
}