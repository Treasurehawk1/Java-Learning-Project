package com.baseball.BaseBallProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;

public class Alarm {

	public Alarm(Dodgers dod, Date currentDateTime, Date dodgerDateTime) throws ParseException, InterruptedException {	
		
		boolean alarm = false;
		
		while (!alarm) { // simple alarm that checks every 30 seconds, once it matches, will call the emailSender class
			Thread.sleep(30000); 	
			if (currentDateTime.equals(dodgerDateTime)) {
				alarm = true;
				emailSender email = new emailSender();
				email.sendEmail(dod);
				break;
			}
		}
	}
}
