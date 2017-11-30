package fitbitproject;
/* This class was used for testing purposes. It does not play a role in the functionality 
of our project.*/ 

import java.util.*;
import java.time.*;
import java.util.concurrent.TimeUnit;
import java.time.temporal.ChronoUnit;

public class Runner {

	public static void main(String[] args) {
		/*
		 * Testing Instant Class and TimeUnit.sleep() for emulation
		Instant start = Instant.now();
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Instant end = Instant.now();
		System.out.println("start: " + start.toString() + "\nend: " + end.toString());
		System.out.println("difference: " + ChronoUnit.SECONDS.between(start, end));
		*/
		
		/*
		 * Testing StepCount and UserDescription
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your weight (kg), height(cm), and age (years).");
	   double weight = sc.nextDouble();
	   double height = sc.nextDouble();
	   int age = sc.nextInt();
	   ButtonListener bl = new ButtonListener(weight,height,age);
	   //in lieu of JavaSwing UI, where user pushes buttons
	   System.out.println("Step count: " + bl.displaySteps());
	   System.out.println("Calorie count: " + bl.displayCalories());
	   */
		
		ButtonListener bl = new ButtonListener();
		System.out.println(bl.displayCalories());
		
		
		/* 
		ButtonListener bl = new ButtonListener(52,165,20);
		bl.trackSteps();
		bl.trackSteps();
		bl.trackSteps();
		System.out.println(bl.displaySteps());
		*/ 
		/*
		 * Testing SleepCycle
		ButtonListener bl = new ButtonListener(52,165,20);
		bl.startSleep();
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		bl.endSleep();
		System.out.println("You slept for " + bl.displaySleepDuration() + " (hours:minutes:seconds)");
		*/

	}

}
