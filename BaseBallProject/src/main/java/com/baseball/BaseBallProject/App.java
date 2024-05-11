package com.baseball.BaseBallProject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.opencsv.bean.CsvToBeanBuilder;


public class App 
{
    public static void main(String[] args) throws ParseException, InterruptedException {
    	
		
		Scanner scanner = new Scanner(System.in);
		
		String choice;
		boolean run = true;
		StartAlarm alarm = new StartAlarm();
		Thread ala = new Thread(alarm);
		
		while (run) {
			System.out.println("Choose select one of the following for:");
			System.out.println("A to set the alarm (only does this once)");
			System.out.println("B to cancel the alarm");
			System.out.println("C to quit out of switch and wait for the alarm to finish");
			System.out.print  ("Q to quit the program: ");
			choice = scanner.nextLine();
		
			switch (choice) {
				case "A":
				case "a":			
					if (!ala.isAlive()) {
					ala.start();
					}
					else {
						System.out.println("Thread is already running!");
					}
					break;
				case "B":
				case "b":
					if (ala.isAlive()) {
						ala.interrupt();
					}
					else {
						System.out.println("No Thread is running!");
					}
					break;
				case "C":
				case "c":
					run = false;
					break;
				case "Q":
				case "q":
					run = false;
					if (ala.isAlive()) {
						ala.interrupt();
					}
					break;
				default: System.out.println("Pick one of the options fool!");
			}
		}
		
		
    }	
}
