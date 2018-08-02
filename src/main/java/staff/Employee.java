package staff;

public abstract class Employee {
    private String name;
    private int nin;
    private int salary;

    public Employee( String name, int nin, int salary) {
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

    public int getSalary(){
        return this.salary;
    }

    public double raiseSalary(double raise){
        return this.salary + raise;
    }

    public double payBonus(){
        return this.salary* 1.01;
    }
}
