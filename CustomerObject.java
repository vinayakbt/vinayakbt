package com.classes;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerObject {
@Id
private  int custId;
private float custbalance;
private String custName;
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public float getCustbalance() {
	return custbalance;
}
public void setCustbalance(float custbalance) {
	this.custbalance = custbalance;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}



}
