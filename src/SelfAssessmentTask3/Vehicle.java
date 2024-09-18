package SelfAssessmentTask3;

public abstract class Vehicle {
	protected String model;
    protected Manufacture manufacture;
    protected Engine engine;
    
    public Vehicle(String model, Manufacture manufacture, Engine engine) {
    	this.model = model;
    	this.manufacture = manufacture;
    	this.engine=engine;
    }
	public abstract void ShowCharacteristics();
}
