
package com.seleniumExpress.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_One2One")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Student_Id")
	private Integer id;

	@Column(name = "Student_Name")
	private String sname;

	@Column(name = "Student_Mobile_Number")
	private Long mobiel_Number;

	@Column(name = "student_age")
	private Integer age;

	@Column(name = "student_city")
	private String city;

	public Passport getPass() {
		return pass;
	}

	public void setPass(Passport pass) {
		this.pass = pass;
	}

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "Passport_Id", unique = true)
	private Passport pass;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Long getMobiel_Number() {
		return mobiel_Number;
	}

	public void setMobiel_Number(Long mobiel_Number) {
		this.mobiel_Number = mobiel_Number;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", mobiel_Number=" + mobiel_Number + ", age=" + age
				+ ", city=" + city + ", pass=" + pass + "]";
	}

}
