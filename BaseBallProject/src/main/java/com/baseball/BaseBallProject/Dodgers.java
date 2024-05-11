package com.baseball.BaseBallProject;

import com.opencsv.bean.CsvBindByName;

public class Dodgers {

	@CsvBindByName(column = "START DATE")
	private String startDate;
	
	@CsvBindByName(column = "START TIME")
	private String startTime;
	
	@CsvBindByName(column = "START TIME ET")
	private String startTimeEt;
	
	@CsvBindByName(column = "SUBJECT") // what the game is
	private String subject;
	
	@CsvBindByName(column = "LOCATION")
	private String location;
	
	@CsvBindByName(column = "DESCRIPTION")
	private String description;
	
	@CsvBindByName(column = "END DATE")
	private String endDate;
	
	@CsvBindByName(column = "END DATE ET")
	private String endDateEt;
	
	@CsvBindByName(column = "END TIME")
	private String endTime;
	
	@CsvBindByName(column = "END TIME ET")
	private String endTimeEt;
	
	@CsvBindByName(column = "REMINDER OFF")
	private String reminderOff;
	
	@CsvBindByName(column = "REMINDER ON")
	private String reminderOn;
	
	@CsvBindByName(column = "REMINDER DATE")
	private String reminderDate;
	
	@CsvBindByName(column = "REMINDER TIME")
	private String reminderTime;
	
	@CsvBindByName(column = "REMINDER TIME ET")
	private String reminderTimeEt;
	
	@CsvBindByName(column = "SHOWTIMEAS FREE")
	private String showtimeasFree;
	
	@CsvBindByName(column = "SHOWTIMEAS BUSY")
	private String showtimeasBusy;

	@CsvBindByName
	private String dodgersGames;
	
	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStartTimeEt() {
		return startTimeEt;
	}

	public void setStartTimeEt(String startTimeEt) {
		this.startTimeEt = startTimeEt;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getEndDateEt() {
		return endDateEt;
	}

	public void setEndDateEt(String endDateEt) {
		this.endDateEt = endDateEt;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getEndTimeEt() {
		return endTimeEt;
	}

	public void setEndTimeEt(String endTimeEt) {
		this.endTimeEt = endTimeEt;
	}

	public String getReminderOff() {
		return reminderOff;
	}

	public void setReminderOff(String reminderOff) {
		this.reminderOff = reminderOff;
	}

	public String getReminderOn() {
		return reminderOn;
	}

	public void setReminderOn(String reminderOn) {
		this.reminderOn = reminderOn;
	}

	public String getReminderDate() {
		return reminderDate;
	}

	public void setReminderDate(String reminderDate) {
		this.reminderDate = reminderDate;
	}

	public String getReminderTime() {
		return reminderTime;
	}

	public void setReminderTime(String reminderTime) {
		this.reminderTime = reminderTime;
	}

	public String getReminderTimeEt() {
		return reminderTimeEt;
	}

	public void setReminderTimeEt(String reminderTimeEt) {
		this.reminderTimeEt = reminderTimeEt;
	}

	public String getShowtimeasFree() {
		return showtimeasFree;
	}

	public void setShowtimeasFree(String showtimeasFree) {
		this.showtimeasFree = showtimeasFree;
	}

	public String getShowtimeasBusy() {
		return showtimeasBusy;
	}

	public void setShowtimeasBusy(String showtimeasBusy) {
		this.showtimeasBusy = showtimeasBusy;
	}
	

	@Override
	public String toString() {
		return "Dodgers [startDate=" + startDate + ", startTime=" + startTime + ", startTimeEt=" + startTimeEt
				+ ", subject=" + subject + ", location=" + location + ", description=" + description + ", endDate="
				+ endDate + ", endDateEt=" + endDateEt + ", endTime=" + endTime + ", endTimeEt=" + endTimeEt
				+ ", reminderOff=" + reminderOff + ", reminderOn=" + reminderOn + ", reminderDate=" + reminderDate
				+ ", reminderTime=" + reminderTime + ", reminderTimeEt=" + reminderTimeEt + ", showtimeasFree="
				+ showtimeasFree + ", showtimeasBusy=" + showtimeasBusy + "]";
	}
	
}
