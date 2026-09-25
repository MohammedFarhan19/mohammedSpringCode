package de.mohammed.springCode.model;

public class Staff {

	private String staffName;
	private String staffTitel;
	private double staffSalary;
	
	public Staff() {
		// empty Constructor
	}
	
	public Staff(String staffName, String staffTitel, double staffSalary) {
		this.staffName = staffName;
		this.staffTitel = staffTitel;
		this.staffSalary = staffSalary;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffTitel() {
		return staffTitel;
	}

	public void setStaffTitel(String staffTitel) {
		this.staffTitel = staffTitel;
	}

	public double getStaffSalary() {
		return staffSalary;
	}

	public void setStaffSalary(double staffSalary) {
		this.staffSalary = staffSalary;
	}
	
	
}
