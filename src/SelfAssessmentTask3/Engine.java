package SelfAssessmentTask3;

public abstract class Engine {
	private int horsepower;
	
	public Engine(int horsepower) {
		this.horsepower=horsepower;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	public abstract void showEngineCharacteristics();
	
}
