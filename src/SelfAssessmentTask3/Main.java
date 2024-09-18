package SelfAssessmentTask3;

public class Main {

	public static void main(String[] args) {
		Vehicle[] vehicles = {
			    new ICEV("Camry", new Manufacture("Toyota", "Japan"), new CombustionEngine(150, "Gasoline")),
			    new BEV("Model Y",new Manufacture("Tesla", "USA"), new ElectricEngine(250, 75)),
			    new HybridV("Accord",new Manufacture("Honda", "Japan"), new HybridEngine(200,50,"Gasoline"))
			};
		for (Vehicle vehicle : vehicles) {
		    vehicle.ShowCharacteristics();
		}
	}

}
