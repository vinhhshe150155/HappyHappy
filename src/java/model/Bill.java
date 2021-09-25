package model;
public class Bill {
private int    billID;
private int courseID;
private int userID;
private int amount;
private String billDate;
private String description; 
/*1 - Mentee to web, 2 - Web to mentor*/
private int billType; 
private int status;
private String createTime;

    public Bill(int billID, int courseID, int userID, int amount, String billDate, String description, int billType, int status, String createTime) {
        this.billID = billID;
        this.courseID = courseID;
        this.userID = userID;
        this.amount = amount;
        this.billDate = billDate;
        this.description = description;
        this.billType = billType;
        this.status = status;
        this.createTime = createTime;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBillType() {
        return billType;
    }

    public void setBillType(int billType) {
        this.billType = billType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

  

}
