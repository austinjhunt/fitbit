package fitbitproject;

public class StepCount {
	private int stepCountValue;
	private UserDescription user;
	
	//weight in kg, height in cm, age in years
   //Uses user-input weight, height, age; not yet implemented
	public StepCount(double weight, double height, int age){
		user = new UserDescription(weight,height,age);
		stepCountValue = 1;
	}
	
   public StepCount() {
      user = new UserDescription() ; 
      stepCountValue = 1 ; 
   }
       
	public double calculateCalories(){
		return stepCountValue * user.getCalorieConversionFactor();
	}
	
	public int getStepCountValue(){
		return stepCountValue;
	}
	
	public void setStepCountValue(int i){
		stepCountValue +=i;
	}
	
	
	void reset(){
		stepCountValue = 0;
	}
}
