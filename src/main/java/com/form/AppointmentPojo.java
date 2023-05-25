package com.form;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appointment")
public class AppointmentPojo {
	@Id
	@GeneratedValue
	private int pid;
	private String pname;
	private int age;
	private String mobile;
	public AppointmentPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppointmentPojo(String pname, int age, String mobile) {
		super();
		this.pname = pname;
		this.age = age;
		this.mobile = mobile;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
