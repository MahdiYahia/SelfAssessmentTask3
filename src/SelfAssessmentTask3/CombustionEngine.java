package SelfAssessmentTask3;

public class CombustionEngine extends Engine {
	private String fuelType;
	
	public CombustionEngine(int horsepower, String fuelType) {
		super(horsepower);
		this.fuelType=fuelType;
	}
	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	@Override
	public void showEngineCharacteristics() {
		System.out.println("Combustion Engine: Horse Power:" + this.getHorsepower() + ", Fuel Type: "+ this.fuelType+"\n\n");
	}
}
