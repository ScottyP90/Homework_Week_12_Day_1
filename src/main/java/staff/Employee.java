package staff;

public abstract class Employee {

    private String name;
    private int NINumber;
    private double salary;

    public Employee(String name, int NINumber, double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNINumber() {
        return NINumber;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(Double raise){
        if (raise > 0){
            this.salary += raise;
        }
        return getSalary();
    }

    public double payBonus(){
        Double payBounus = getSalary() * 0.01;
        return payBounus;
    }

    public void changeName(String name) {
        if (name != null && name != ""){
            this.name = name;
        }
    }
}
