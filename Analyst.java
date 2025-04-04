public class Analyst extends Employee {
    

    //Constructor
    public Analyst(String name, double salary, int age) {
        super(name, age, salary);
    }

    public double getAnnualBonus() {
        return super.salary * .05;
    }
}
