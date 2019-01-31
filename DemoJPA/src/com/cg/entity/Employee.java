package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;

@Entity
@ Table(name="EmployeeJee")
public class Employee {
@Id
private int empId;
private String empName;
private int empSal;
public Employee() {
	
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getEmpSal() {
	return empSal;
}
public void setEmpSal(int empSal) {
	this.empSal = empSal;
}

}
