package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name="Staff")
public class Staff {
 
	@Id
	@GeneratedValue(generator="staff_seq")
	@SequenceGenerator(name="staff_seq",sequenceName="staff_seq",allocationSize=1)
	private int staffId;
	private String staffName;
	private String StaffAddress;
	@Transient
	private double staffSalary;
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", staffName=" + staffName + ", StaffAddress=" + StaffAddress
				+ ", staffSalary=" + staffSalary + "]";
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffAddress() {
		return StaffAddress;
	}
	public void setStaffAddress(String staffAddress) {
		StaffAddress = staffAddress;
	}
	public double getstaffSalary() {
		return staffSalary;
	}
	public void setstaffSalary(double staffSalary) {
		this.staffSalary = staffSalary;
	}

}
