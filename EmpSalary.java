package JavaPractice;

import java.util.Scanner;
class Employee {
    public void calculateSalary() {
        System.out.println("Base salary calculation for Employee.");
    }
}
class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    public Manager(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        double totalSalary = baseSalary + bonus;
        System.out.println("Manager's total salary: " + totalSalary);
    }
}
class Developer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Developer(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public void calculateSalary() {
        double totalSalary = hourlyRate * hoursWorked;
        System.out.println("Developer's total salary: " + totalSalary);
    }
}

public class EmpSalary {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

    
        Employee[] employees = new Employee[3];


        System.out.print("Enter Manager's base salary: ");
        double managerBaseSalary = scanner.nextDouble();
        System.out.print("Enter Manager's bonus: ");
        double managerBonus = scanner.nextDouble();
        employees[0] = new Manager(managerBaseSalary, managerBonus);


        System.out.print("Enter Developer's hourly rate: ");
        double developerHourlyRate = scanner.nextDouble();
        System.out.print("Enter Developer's hours worked: ");
        int developerHoursWorked = scanner.nextInt();
        employees[1] = new Developer(developerHourlyRate, developerHoursWorked);

    
        employees[2] = new Employee();

    
        for (Employee employee : employees) {
            employee.calculateSalary();
        }


        scanner.close();
    }
}
