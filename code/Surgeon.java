package code;

public class Surgeon extends Doctor {
	
	protected boolean isOperating;
	
	public Surgeon() {
		
	}
	
	public Surgeon(String name, int number, String specialty, boolean isOperating) {
		this.name = name;
		this.number = number;
		this.specialty = specialty;
		this.isOperating = isOperating;
	}
	
	public void work() {
		if (this.isOperating) {
			System.out.println(this.name + " works for the hospital. " + this.name + " is operating now.");
		} else {
			System.out.println(this.name + " works for the hospital. " + this.name + " is not operating now.");	
		}
	}
	
	public String toString() {
		return this.name + " " + this.number + " " + this.specialty + " Operating: " + this.isOperating;
	}

}
