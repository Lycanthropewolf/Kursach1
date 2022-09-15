import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {


        Employee emp1 = new Employee(" Petrov Ivan Ivanovich", 35000, 1);
        Employee emp2 = new Employee(" Ivanov Petr Ivanovich", 45000, 2);
        Employee emp3 = new Employee(" Zaharov Vitya Yanovich", 56000, 5);
        Employee emp4 = new Employee(" Kutuzov Dima Urich", 32999, 4);
        Employee emp5 = new Employee(" Zhdanov Kolya Artemevich", 25000, 5);
        Employee emp6 = new Employee(" Kutusova Zoya Evgenevna", 15000, 3);
        Employee emp7 = new Employee(" Glupaya Inna Efremovna", 24000, 3);
        Employee emp8 = new Employee(" Neganov Gora Igorevich", 17000, 3);
        Employee emp9 = new Employee(" Sumov Geka Antonovich", 450000, 1);
        Employee emp10 = new Employee(" Kakashkin Petr Dimonovich", 40000, 2);


        employees[0] = emp1;
        employees[1] = emp2;
        employees[2]= emp3;
        employees[3]=emp4;
        employees[4]=emp5;
        employees[5]=emp6;
        employees[6]=emp7;
        employees[7]=emp8;
        employees[8]=emp9;
        employees[9]=emp10;
        printEmployees();
        printFullNames();
        minSalary();
        maxSalary();
        calculateTotalSalary();


    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();

        }
        System.out.println(sum);
        return sum;
    }

    public static Employee minSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }

        }System.out.println(result);
        return result;
    }

    public static Employee maxSalary(){
        Employee result= employees[0];
        int maxSalary= employees[0].getSalary();
        for (Employee employee: employees){
            if( employee.getSalary()> maxSalary){
                maxSalary= employee.getSalary();
                result=employee;
            }

        }System.out.println(result);
        return result;
    }

    public static double calculateAverageSalary(){
        return calculateTotalSalary()/(double)employees.length;
    }

    public static void printFullNames(){
        for (Employee employee: employees){
            System.out.println(employee.getFIO());
        }
    }
}