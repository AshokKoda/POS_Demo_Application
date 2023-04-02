package com.example.managementproject.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "reg_no")
    private String regNo;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "phone_no")
    private String phoneNo;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "created_on")
    private Date createdOn;

    public Customers() {
    }

    public Customers(int id, String regNo, String firstName, String lastName, String emailId, String phoneNo, Date dob,
            Date createdOn) {
        this.id = id;
        this.regNo = regNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.phoneNo = phoneNo;
        this.dob = dob;
        this.createdOn = createdOn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        return "Customers [id=" + id + ", regNo=" + regNo + ", firstName=" + firstName + ", lastName=" + lastName
                + ", emailId=" + emailId + ", phoneNo=" + phoneNo + ", dob=" + dob + ", createdOn=" + createdOn + "]";
    }

}
