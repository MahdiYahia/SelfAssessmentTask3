package SelfAssessmentTask3;

public class BEV extends Vehicle{
	
	public BEV(String model, Manufacture manufacture, ElectricEngine engine) {
		super(model,manufacture,engine);
	}
	@Override
	public void ShowCharacteristics(){
		System.out.println("Model: "+ model);
		System.out.println("Manufacture: "+ manufacture.getName()+ ", " + manufacture.getCountry());
		System.out.println("Engine horsepower: "+ engine.getHorsepower());
		engine.showEngineCharacteristics();
	}
}
