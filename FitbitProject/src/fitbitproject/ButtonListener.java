
package fitbitproject;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;


public class ButtonListener {
	private Altitude altitude;
	private StepCount stepCount;
	private SleepCycle sleepCycle;
        DateTimeFormatter formatter;
        Instant instant; 
        
        
        /* Constructor that uses user-input weight, height, and age; yet to be implemented*/ 
	public ButtonListener(double w, double h, int a){
		altitude = new Altitude();
		stepCount = new StepCount(w,h,a);
		sleepCycle = new SleepCycle();
                
	}
	
        public ButtonListener(){
            altitude = new Altitude(); 
            sleepCycle = new SleepCycle();
            stepCount = new StepCount(); 
        }
        
        public String displayTime() { 
            instant = instant.now();
            formatter = DateTimeFormatter.ofLocalizedDateTime( FormatStyle.SHORT )
                     .withLocale( Locale.UK )
                     .withZone( ZoneId.systemDefault() );
            String output = formatter.format(instant);
            return output;
        }
	
	
	
	
	public int displaySteps(){
                stepCount.setStepCountValue((int)(Math.random()*100) + 1);
		return stepCount.getStepCountValue();
	}
	
	public double displayCalories(){
                stepCount.setStepCountValue((int)(Math.random()*100) + 1);
		return stepCount.calculateCalories();
	}
	
	public void startSleep(){
		sleepCycle.startSleepCycle();
                
	}
	
	public void endSleep(){
		sleepCycle.endSleepCycle();
	}
	
	public String displaySleepDuration(){
		return sleepCycle.calculateSleepDuration();
	}
	
	public String displayCurrentAltitude(){ 
            return altitude.getLastReading(); 
        }
        
        public int displayStairCount() {
            return altitude.getStairCount();
        }
        
        
}
