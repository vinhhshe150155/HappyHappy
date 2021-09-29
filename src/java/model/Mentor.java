package model;

import java.util.List;

public class Mentor {
    private int mentorID;
    private String name;
    private String password;
    private String email;
    private String dob;
    private int sex;
    private String education;
    private int yearExperiment;
    private String address;
    private String phone;
    private String intro;
    private String imgAvt;
    private String imgAuthen1;
    private String imgAuthen2;
    private String description;
    private int authen;
    private String status;
    private int moneyLeft;
    private String createTime;
    private List<Major> listMajor;

    public Mentor(int mentorID, String name, String password, String email, String dob, int sex, String education, int yearExperiment, String address, String phone, String intro, String imgAvt, String imgAuthen1, String imgAuthen2, String description, int authen, String status, int moneyLeft, String createTime) {
        this.mentorID = mentorID;
        this.name = name;
        this.password = password;
        this.email = email;
        this.dob = dob;
        this.sex = sex;
        this.education = education;
        this.yearExperiment = yearExperiment;
        this.address = address;
        this.phone = phone;
        this.intro = intro;
        this.imgAvt = imgAvt;
        this.imgAuthen1 = imgAuthen1;
        this.imgAuthen2 = imgAuthen2;
        this.description = description;
        this.authen = authen;
        this.status = status;
        this.moneyLeft = moneyLeft;
        this.createTime = createTime;
    }

    public Mentor() {
    }

    public int getMentorID() {
        return mentorID;
    }

    public void setMentorID(int mentorID) {
        this.mentorID = mentorID;
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

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getYearExperiment() {
        return yearExperiment;
    }

    public void setYearExperiment(int yearExperiment) {
        this.yearExperiment = yearExperiment;
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

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getImgAvt() {
        return imgAvt;
    }

    public void setImgAvt(String imgAvt) {
        this.imgAvt = imgAvt;
    }

    public String getImgAuthen1() {
        return imgAuthen1;
    }

    public void setImgAuthen1(String imgAuthen1) {
        this.imgAuthen1 = imgAuthen1;
    }

    public String getImgAuthen2() {
        return imgAuthen2;
    }

    public void setImgAuthen2(String imgAuthen2) {
        this.imgAuthen2 = imgAuthen2;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAuthen() {
        return authen;
    }

    public void setAuthen(int authen) {
        this.authen = authen;
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public List<Major> getListMajor() {
        return listMajor;
    }

    public void setListMajor(List<Major> listMajor) {
        this.listMajor = listMajor;
    }

    @Override
    public String toString() {
        return "Mentor{" + "mentorID=" + mentorID + ", name=" + name + ", password=" + password + ", email=" + email + ", dob=" + dob + ", sex=" + sex + ", education=" + education + ", yearExperiment=" + yearExperiment + ", address=" + address + ", phone=" + phone + ", intro=" + intro + ", imgAvt=" + imgAvt + ", imgAuthen1=" + imgAuthen1 + ", imgAuthen2=" + imgAuthen2 + ", description=" + description + ", authen=" + authen + ", status=" + status + ", moneyLeft=" + moneyLeft + ", createTime=" + createTime + ", listMajor=" + listMajor + '}';
    }

   
    
    
}
