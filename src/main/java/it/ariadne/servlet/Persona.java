package it.ariadne.servlet;

public class Persona {

	public Persona(String name, String position, String office, String extn, String startDate, String salary) {
		super();
		this.name = name;
		this.position = position;
		this.office = office;
		this.extn = extn;
		this.startDate = startDate;
		this.salary = salary;
	}

	public Persona() {
		super();
	}

	private String name;
	private String position;
	private String office;
	private String extn;
	private String startDate;
	private String salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getExtn() {
		return extn;
	}

	public void setExtn(String extn) {
		this.extn = extn;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

}
