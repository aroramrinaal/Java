public class practice {
    public static void main(String[] args) {
        Engineer engineer1 = new Engineer();
        engineer1.name = "Mrinaal";
        System.out.println(engineer1.name);
    }
}



class Employee{
    int employeeId;
    String name;
    int age;
    double salary;
}


class Engineer extends Employee{
    double bonus = 10000+salary;
}

class Manager extends Employee{
    double bonus = 20000+salary;
}
