package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@ Table(name="StudentJee")
@NamedQueries(@NamedQuery(name="deleteById",query="DELETE stud FROM Student stud WHERE stud.studid=11"))
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
private int studId;
private String studName;
@Transient
private int studmark;
public Student() {
	super();

}
@Override
public String toString() {
	return "Studloyee [StudId=" + studId + ", StudName=" + studName + ", Studmark=" + studmark + "]";
}
public int getstudId() {
	return studId;
}
public void setstudId(int studId) {
	this.studId = studId;
}
public String getstudName() {
	return studName;
}
public void setstudName(String studName) {
	this.studName = studName;
}
public int getstudmark() {
	return studmark;
}
public void setstudmark(int studmark) {
	this.studmark = studmark;
}

}
