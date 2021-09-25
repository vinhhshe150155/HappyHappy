/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Admin
 */
public class Course {
    private int courseID;
    private int subjectID;
    private int menteeID;
    private int mentorID;
    private int slots;
    private int timePerSlot;
    private int moneyPerSlot;
    private String timeStart;
    private String timeEnd;
    private int learnType;
    private int status;
    private String description;
    private String createTime;
    private List<CourseSlot> listCourseSlot;

    public Course(int courseID, int subjectID, int menteeID, int mentorID, int slots, int timePerSlot, int moneyPerSlot, String timeStart, String timeEnd, int learnType, int status, String description, String createTime) {
        this.courseID = courseID;
        this.subjectID = subjectID;
        this.menteeID = menteeID;
        this.mentorID = mentorID;
        this.slots = slots;
        this.timePerSlot = timePerSlot;
        this.moneyPerSlot = moneyPerSlot;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.learnType = learnType;
        this.status = status;
        this.description = description;
        this.createTime = createTime;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public int getMenteeID() {
        return menteeID;
    }

    public void setMenteeID(int menteeID) {
        this.menteeID = menteeID;
    }

    public int getMentorID() {
        return mentorID;
    }

    public void setMentorID(int mentorID) {
        this.mentorID = mentorID;
    }

    public int getSlots() {
        return slots;
    }

    public void setSlots(int slots) {
        this.slots = slots;
    }

    public int getTimePerSlot() {
        return timePerSlot;
    }

    public void setTimePerSlot(int timePerSlot) {
        this.timePerSlot = timePerSlot;
    }

    public int getMoneyPerSlot() {
        return moneyPerSlot;
    }

    public void setMoneyPerSlot(int moneyPerSlot) {
        this.moneyPerSlot = moneyPerSlot;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public int getLearnType() {
        return learnType;
    }

    public void setLearnType(int learnType) {
        this.learnType = learnType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public List<CourseSlot> getListCourseSlot() {
        return listCourseSlot;
    }

    public void setListCourseSlot(List<CourseSlot> listCourseSlot) {
        this.listCourseSlot = listCourseSlot;
    }
    
                    
}
