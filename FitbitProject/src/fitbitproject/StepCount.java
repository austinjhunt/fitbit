package fitbitproject;

public class StepCount {
	private int stepCountValue;
	private UserDescription user;
	
	//weight in kg, height in cm, age in years
	public StepCount(double weight, double height, int age){
		user = new UserDescription(weight,height,age);
		stepCountValue = 1;
	}
	
        public StepCount() {
            stepCountValue = 1 ; 
        }
        /* incorporating this into UI later, after presentation*/ 
        
	public double calculateCalories(){
		return stepCountValue * user.getCalorieConversionFactor();
	}
	
	public int getStepCountValue(){
		return stepCountValue;
	}
	
	public void setStepCountValue(int i){
		stepCountValue +=i;
	}
	private void archive(){
		
	}
	
	private void reset(){
		stepCountValue = 0;
	}
}
