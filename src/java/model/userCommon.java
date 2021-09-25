/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class userCommon {
    private int userID;
    private String name,password,email,dob;
    private int sex;
    private String address,phone,imgAvt,description,status;
    private int moneyLeft;
    private Date createTime;
    private int role;

    public userCommon() {
    }

    public userCommon(int userID, String name, String password, String email, String dob, int sex, String address, String phone, String imgAvt, String description, String status, int moneyLeft, Date createTime, int role) {
        this.userID = userID;
        this.name = name;
        this.password = password;
        this.email = email;
        this.dob = dob;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
        this.imgAvt = imgAvt;
        this.description = description;
        this.status = status;
        this.moneyLeft = moneyLeft;
        this.createTime = createTime;
        this.role = role;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImgAvt() {
        return imgAvt;
    }

    public void setImgAvt(String imgAvt) {
        this.imgAvt = imgAvt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMoneyLeft() {
        return moneyLeft;
    }

    public void setMoneyLeft(int moneyLeft) {
        this.moneyLeft = moneyLeft;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "userCommon{" + "userID=" + userID + ", name=" + name + ", password=" + password + ", email=" + email + ", dob=" + dob + ", sex=" + sex + ", address=" + address + ", phone=" + phone + ", imgAvt=" + imgAvt + ", description=" + description + ", status=" + status + ", moneyLeft=" + moneyLeft + ", createTime=" + createTime + ", role=" + role + '}';
    }

    
            
}
