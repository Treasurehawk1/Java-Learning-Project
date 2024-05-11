package com.baseball.BaseBallProject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.opencsv.bean.CsvToBeanBuilder;

public class StartAlarm implements Runnable {

	@Override
	public void run()  {
		
		String fileName = "C:\\Users\\steve\\Downloads\\GameTicketPromotionPrice.csv";
		
		List<Dodgers> beans = null;
		try {
			beans = new CsvToBeanBuilder(new FileReader(fileName))
					.withType(Dodgers.class)
					.build()
					.parse();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SimpleDateFormat time = new SimpleDateFormat("MM/dd/yy");
		String test = time.format(new Date());
		Date currentDate = null;
		try {
			currentDate = time.parse(test);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int compare;
		for (Dodgers Dod : beans) {
			
			String dodgerFormatted = Dod.getStartDate() + " " + Dod.getStartTime();
			
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy hh:mm aa", Locale.US);
			String currentTime;
			
			Date currentDateTime = null;
			Date dodgerDateTime = null;
			try {
				dodgerDateTime = sdf.parse(dodgerFormatted);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			currentTime = sdf.format(new Date());
			try {
				currentDateTime = sdf.parse(currentTime);
			} catch (ParseException e) {
				e.printStackTrace();
			}		
			if (dodgerDateTime.equals(currentDateTime) || dodgerDateTime.after(currentDateTime)) {
				try {
					new Alarm(Dod, currentDateTime, dodgerDateTime);
				} catch (ParseException | InterruptedException e) {
					e.printStackTrace();
				}
				break;
			}
		}
	}
}