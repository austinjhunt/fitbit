
package fitbitproject;


public class UserDescription {
	private double weight; //kg
	private double height; //cm
	private int age; //years
	private double calorieConversionFactor;

	public UserDescription(){
		weight = 75; //average age of US male
		height = 177;//average height of US male
		age = 40; //average age of US male
		this.calculateCalorieConversionFactor();
	}
        
        
        public UserDescription(double w, double h, int a){ 
                weight = w; 
                height = h;
                age = a; 
                        
        }
	
	public double getCalorieConversionFactor(){
		return calorieConversionFactor;
	}
	
	public void setWeight(double w){
		weight = w;
		this.calculateCalorieConversionFactor();
	}
	
	public void setHeight(double h){
		height = h;
		this.calculateCalorieConversionFactor();
	}
	
	//In charge of updating calorieConversionFactor when the constructor or setters are called
	void calculateCalorieConversionFactor(){
		calorieConversionFactor = (10 * weight + 6.25 * height - 5 * age + 5) / 1000 ; //Basal metabolic rate for men
	}
	
}
