package mervegündoğmuş.Day2;

public class Main {
    public static void main(String[] args) {
        Engineer employeeOne = new Engineer("Esra Erdağı",100000,28);
        Salesperson employeeTwo= new Salesperson("Kübra Kaygız",100000,31,0.50);

        employeeOne.getAnnualBonus();
        employeeTwo.raiseSalary();
        employeeTwo.getCommissionPercentage();

        System.out.println(employeeOne.salary);
        System.out.println(employeeOne.getAnnualBonus());
        System.out.println(employeeTwo.salary);
        System.out.println(employeeTwo.getCommissionPercentage());

    }
}
