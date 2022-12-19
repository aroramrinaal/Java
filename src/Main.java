// Java Practice
// OOPS In Java



public class Main{
    public static void main(String[] args) {
        Employee employee1 = new Employee("Joe",24,50000,"Tempe");
        employee1.getEmployeeInfo();
    }
}

class Employee{
    String name;
    int age;
    double salary;
    String location;

    Employee(String name,int age,double salary,String location){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    void raiseSalary(){
        this.salary = this.salary+10000;
    }

    void getEmployeeInfo(){
        System.out.println(name+" is "+age+" years old.He works in "+location+" for a salary of "+salary+".");
    }
}