package com.seleniumExpress.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Passport_One2One")
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Passport_Id")
	private int pid;
	
	@Column(name = "Passport_Number")
	private String pNumber;

	@OneToOne(mappedBy ="pass",cascade = CascadeType.ALL)
	private Student stu;

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getpNumber() {
		return pNumber;
	}

	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}

	@Override
	public String toString() {
		return "Passport [pid=" + pid + ", pNumber=" + pNumber + ", stu=" + stu + "]";
	}

}
