package code;

public class HospitalEmployee {
    protected String name;
    protected int number;

    public HospitalEmployee() {
    }

    public HospitalEmployee(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void work() {
        System.out.println (name + " works for the hospital.");
    }

    public String toString() {
        return this.name + " " + this.number;
    }
}