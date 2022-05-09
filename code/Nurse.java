package code;

public class Nurse extends HospitalEmployee {
	
	protected int numOfPatients;
	
	public Nurse() {
		
	}
	
	public Nurse(String name, int number, int numOfPatients) {
		this.name = name;
		this.number = number;
		this.numOfPatients = numOfPatients;
	}
	
	public void work() {
		System.out.println(this.name + " works for the hospital. " + this.name + " is a nurse with " + this.numOfPatients + " patients");
	}
	
	public String toString() {
		return this.name + " has " + this.numOfPatients + " patients.";
	}

}