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
public class Request {
private int requestID;
private int userID;
private int subjectID;
private int moneyPerSlot;
private int timePerSlot;
private String startTime;
private String endTime;
private String description;
private int status;
/*1 is off, 2 is onl*/
private int learnType;
private String reqTime;
private List<RequestSlotTime> listSlotTime;

    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public int getMoneyPerSlot() {
        return moneyPerSlot;
    }

    public void setMoneyPerSlot(int moneyPerSlot) {
        this.moneyPerSlot = moneyPerSlot;
    }

    public int getTimePerSlot() {
        return timePerSlot;
    }

    public void setTimePerSlot(int timePerSlot) {
        this.timePerSlot = timePerSlot;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getLearnType() {
        return learnType;
    }

    public void setLearnType(int learnType) {
        this.learnType = learnType;
    }

    public String getReqTime() {
        return reqTime;
    }

    public void setReqTime(String reqTime) {
        this.reqTime = reqTime;
    }

    public List<RequestSlotTime> getListSlotTime() {
        return listSlotTime;
    }

    public void setListSlotTime(List<RequestSlotTime> listSlotTime) {
        this.listSlotTime = listSlotTime;
    }

    public Request(int requestID, int userID, int subjectID, int moneyPerSlot, int timePerSlot, String startTime, String endTime, String description, int status, int learnType, String reqTime) {
        this.requestID = requestID;
        this.userID = userID;
        this.subjectID = subjectID;
        this.moneyPerSlot = moneyPerSlot;
        this.timePerSlot = timePerSlot;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
        this.status = status;
        this.learnType = learnType;
        this.reqTime = reqTime;
    }


}
