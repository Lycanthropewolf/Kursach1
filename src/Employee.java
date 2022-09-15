public class Employee {
    private static int coonter = 1;
    private String FIO;
    private int salary;
    private int department;
    private Integer id;

    public Employee(String FIO, int salary, int department) {
        this.FIO = FIO;
        this.salary = salary;
        this.department = department;
        this.id=coonter++;
    

    }

    public String getFIO() {

        return FIO;
    }

    public int getSalary() {

        return salary;
    }

    public int getDepartment() {

        return department;
    }

    public int getId() {
        return id;
    }



    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return FIO + ", зарплата: " + salary + ", отдел: " + department + ", ID:" + id + ".";
    }



}
