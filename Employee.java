package mervegündoğmuş.Day2;

public class Employee {
    private String name;
    protected double salary;
    private int age;

    public Employee(String name, double salary, int age){
        this.name=name;
        this.salary=salary;
        this.age=age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public Double getSalary(){
        return this.salary;
    }
    public void raiseSalary(){
        this.salary=this.salary*1.4;
    }
}

