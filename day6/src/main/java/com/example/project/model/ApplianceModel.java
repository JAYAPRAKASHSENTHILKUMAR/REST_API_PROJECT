package com.example.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="appliancemodel")
public class ApplianceModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int CustomerId; 
	@Column(name = "Customername")
	private String customerName;
	@Column(name = "Applianceid")
	private int applianceId;
	@Column(name = "Appliancetype")
	private String applianceType;
	@Column(name = "Purchasedate")
	private int purchaseDate;
	@Column(name = "Warrantystarttime")
	private int  warrantystartTime;
	@Column(name = "Warrantyendtime")
	private int  warrantyendTime;
	@Column(name = "Problem")
	private String problemDescription;
	@Column(name = "Mobileno")
	private int mobileNo;
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getApplianceId() {
		return applianceId;
	}
	public void setApplianceId(int applianceId) {
		this.applianceId = applianceId;
	}
	public String getApplianceType() {
		return applianceType;
	}
	public void setApplianceType(String applianceType) {
		this.applianceType = applianceType;
	}
	public int getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(int purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public int getWarrantystartTime() {
		return warrantystartTime;
	}
	public void setWarrantystartTime(int warrantystartTime) {
		this.warrantystartTime = warrantystartTime;
	}
	public int getWarrantyendTime() {
		return warrantyendTime;
	}
	public void setWarrantyendTime(int warrantyendTime) {
		this.warrantyendTime = warrantyendTime;
	}
	public String getProblemDescription() {
		return problemDescription;
	}
	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	

}
