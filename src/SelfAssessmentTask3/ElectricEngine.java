package SelfAssessmentTask3;

public class ElectricEngine extends Engine{
	private int batteryCapacity;

	public ElectricEngine(int horsepower, int batteryCapacity) {
		super(horsepower);
		this.batteryCapacity=batteryCapacity;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	@Override
	public void showEngineCharacteristics() {
		System.out.println("Electric Engine: Horse Power:" + this.getHorsepower() + ", Fuel Type: "+ this.batteryCapacity+"\n\n");		
	}
	 
}
