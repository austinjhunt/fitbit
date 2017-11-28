package fitbitproject;


import java.util.ArrayList;
import java.time.*;



public class Altitude {
	private ArrayList<Integer> altitudeList;
	private Integer seedValue = 5;
	private int stairCount = 0;

	public Altitude() {
		altitudeList = new ArrayList<Integer>();
	}

	public String takeMeasurement(){
		altitudeList.add((int) (seedValue + Math.random() * 10));
		return "Current Altitude: " + altitudeList.get(altitudeList.size()-1) + "ft.\n";
				
	}

	public String getLastReading(){
		return this.takeMeasurement();
	}
        

	public int getStairCount(){
		int measurementDiff;
                altitudeList.add((int) (seedValue + Math.random() * 100));
		for (int i = 1; i < altitudeList.size(); i++) {
			measurementDiff = (altitudeList.get(i) - altitudeList.get(i - 1));
			if (measurementDiff > 0){
				stairCount = stairCount + measurementDiff;
			}
		}
		return (stairCount/20);
	}

}