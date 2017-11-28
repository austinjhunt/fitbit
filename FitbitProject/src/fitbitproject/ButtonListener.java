
package fitbitproject;


public class ButtonListener {
	private Altitude altitude;
	private StepCount stepCount;
	private SleepCycle sleepCycle;

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
        
	public void buttonSignal(String btnType){
		
	}
	
	public void trackSteps(){
		stepCount.setStepCountValue((int)(Math.random()*100) + 1);
	}
	
	public int displaySteps(){
                trackSteps();
		return stepCount.getStepCountValue();
	}
	
	public double displayCalories(){
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
	
	public String displayCurrentAltitude(){ return altitude.getLastReading(); }
}
