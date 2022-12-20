// Java Practice
// OOPS In Java


public class Main{
    public static void main(String[] args) {
        Employee employee1 = new Employee("Joe", 26, 50000, "Tempe");
        employee1.getEmployeeInfo();
    }
}

class Employee{
    String name;
    int age;
    int salary;
    String location;

    Employee(String name,int age,int salary,String location){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    void getEmployeeInfo(){
        System.out.println(name+" is "+age+" years old and works for a salary of "+salary+" in "+location+".");
    }
}