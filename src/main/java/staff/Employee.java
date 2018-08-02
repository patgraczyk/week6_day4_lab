package staff;

public abstract class Employee {
    private String name;
    private int nin;
    private double salary;

    public Employee( String name, int nin, double salary) {
        this.name = name;
        this.nin = nin;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getNin() {
        return this.nin;
    }

    public double getSalary(){
        return this.salary;
    }

    public double raiseSalary(Double raise){
        return this.salary + raise;
    }

    public double payBonus(){
        return this.salary* 1.01;
    }
}
