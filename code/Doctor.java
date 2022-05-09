package assignment-3;

public class Doctor extends HospitalEmployee {
	
	protected String specialty;
	
	public Doctor() {
		
	}
	
	public Doctor(String name, int number, String specialty) {
		this.name = name;
		this.number = number;
		this.specialty = specialty;
	}
	
	public void work() {
        System.out.println (this.name + " works for the hospital. " + this.name + " is a(n) " + this.specialty + " doctor.");
    }
	
	public String toString() {
		return this.name + " " + this.number + " " + this.specialty;
	}

}