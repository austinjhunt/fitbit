package fitbitproject;


import java.util.*;
import java.time.*;
import java.util.concurrent.TimeUnit;
import java.time.temporal.ChronoUnit;

public class SleepCycle {
	private Instant startTime;
	private Instant endTime;
	
	public void startSleepCycle(){
		startTime = Instant.now();
	}
	
	public void endSleepCycle(){
		endTime = Instant.now();
	}
	
	public Instant getStartTime() {
		return startTime;
	}

	public Instant getEndTime() {
		return endTime;
	}

	//Returns hours:minutes:seconds
	public String calculateSleepDuration(){
		int hours = (int) ChronoUnit.HOURS.between(this.startTime, this.endTime);
		int minutes = (int) ChronoUnit.MINUTES.between(this.startTime, this.endTime) - (60 * hours);
		int seconds = (int) ChronoUnit.SECONDS.between(this.startTime, this.endTime) - (3600 * hours) - (60 * minutes);
		return hours + ":" + minutes + ":" + seconds;
		
	}
	
}
