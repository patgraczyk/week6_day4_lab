package Manager;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager (String deptName, String name, int nin, double salary){
        super(name, nin, salary);
        this.deptName=deptName;
    }

    public String getDeptName(){
        return this.deptName;
    }
}
