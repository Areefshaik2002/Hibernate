package com.sample;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "Trainer_Table")
@Entity
public class Trainer {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "Trainer_id")
	private long id;
	@Column(name = "Trainer_name")
	private String name;
	@Column(name = "Trainer_Salary")
	private double salary;
	@Column(name = "Expert_in")
	private String subject;
	
	 public Trainer() {}

	public Trainer(long id, String name, double salary, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.subject = subject;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return id +" "+ name +" " + salary +" "+ subject + " ";
	}
	 
	 
}
