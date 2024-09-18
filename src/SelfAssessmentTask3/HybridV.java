package SelfAssessmentTask3;

public class HybridV extends Vehicle{
	public HybridV(String model, Manufacture manufacture,HybridEngine engine) {
		super(model,manufacture, engine);
	}
	public void ShowCharacteristics(){
		System.out.println("Model: "+ model);
		System.out.println("Manufacture: "+ manufacture.getName()+ ", " + manufacture.getCountry());
		System.out.println("Engine horsepower: "+ engine.getHorsepower());
		engine.showEngineCharacteristics();
	}
}
