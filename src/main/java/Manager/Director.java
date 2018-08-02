package Manager;



public class Director extends Manager {
    private double budget;
    public Director (double budget, String name, int nin, double salary, String deptName){
        super(deptName,name,nin, salary);
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }
}
