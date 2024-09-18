package SelfAssessmentTask3;

public class HybridEngine extends Engine{
	
	
	private int batteryCapacity;
	
	private String fuelType;

	public	HybridEngine(int horsepower, int batteryCapacity, String fuelType) {
		super(horsepower);
		this.batteryCapacity=batteryCapacity;
		this.fuelType = fuelType;
	}
	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	@Override
	public void showEngineCharacteristics() {
		System.out.println("Hybrid Engine: Horse Power:" + this.getHorsepower() + ", Fuel Type: "+ this.fuelType+", Battery Capacity: "+this.batteryCapacity+"\n\n");		
	}
	
}
