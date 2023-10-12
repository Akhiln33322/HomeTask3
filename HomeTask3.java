class Engine {
    String engineMaterial;
    int chassisId;

    public Engine(String engineMaterial, int chassisId) {
        this.engineMaterial = engineMaterial;
        this.chassisId = chassisId;
    }

    public String getEnginematerial() {
        return engineMaterial;
    }

    public int getChassisId() {
        return chassisId;
    }

}

class CombustionEngine extends Engine {
    public CombustionEngine(String engineMaterial, int chasisId) {
        super(engineMaterial, chasisId);
    }
}

class ElectricEngine extends Engine {
    public ElectricEngine(String engineMaterial, int chasisId) {
        super(engineMaterial, chasisId);
    }
}

class HybridEngine extends Engine {
    public HybridEngine(String engineMaterial, int chasisId) {
        super(engineMaterial, chasisId);
    }
}

 class Manufacture {
    private String manufactureName;
    private int manufactureYear;
    private int manufactureCost;

    public Manufacture(String manufactureName, int manufactureYear, int manufactureCost) {
        this.manufactureName = manufactureName;
        this.manufactureYear = manufactureYear;
        this.manufactureCost = manufactureCost;
    }

    public String getManufactureName() {
        return manufactureName;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }
    
    public int getManufactureCost() {
        return manufactureCost;
    }
}

abstract class Vehicle {
    private Manufacture manufacture;
    private Engine engine;

    public Vehicle(Manufacture manufacture, Engine engine) {
        this.manufacture = manufacture;
        this.engine = engine;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    public Engine getEngine() {
        return engine;
    }

    public abstract void ShowCharacteristics();
}

class ICEV extends Vehicle {
    public ICEV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    public void ShowCharacteristics() {
        System.out.println("Type of Vehicle is Internal Combustion Engine Vehicle(ICEV)");
        System.out.println("Engine Material: " + getEngine().getEnginematerial());
        System.out.println("Engine Chassis ID : " + getEngine().getChassisId());
        System.out.println("Manufacturer Name is " + getManufacture().getManufactureName());
        System.out.println("Manufacturing year is " + getManufacture().getManufactureYear());
        System.out.println("Manufacturing cost is " + getManufacture().getManufactureCost() + " Euro");
    }
}

class BEV extends Vehicle {
    public BEV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    public void ShowCharacteristics() {
        System.out.println("Type of Vehicle is Battery Electric Vehicle(BEV)");
        System.out.println("Engine Material: " + getEngine().getEnginematerial());
        System.out.println("Engine Chassis ID : " + getEngine().getChassisId());
        System.out.println("Manufacturer Name is " + getManufacture().getManufactureName());
        System.out.println("Manufacturing year is " + getManufacture().getManufactureYear());
        System.out.println("Manufacturing cost is " + getManufacture().getManufactureCost() + " Euro");
    }
}

class HybridV extends Vehicle {
    public HybridV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    public void ShowCharacteristics() {
        System.out.println("Type of Vehicle is Hybrid Vehicle(HybridV)");
        System.out.println("Engine Material: " + getEngine().getEnginematerial());
        System.out.println("Engine Chassis ID : " + getEngine().getChassisId());
        System.out.println("Manufacturer Name is " + getManufacture().getManufactureName());
        System.out.println("Manufacturing year is " + getManufacture().getManufactureYear());
        System.out.println("Manufacturing cost is " + getManufacture().getManufactureCost() + " Euro");
    }
}

public class HomeTask3 {
    public static void main(String[] args) {
        Manufacture bmw = new Manufacture("BMW", 2022, 35000);
        Manufacture audi = new Manufacture("Audi", 2021, 30000);
        Manufacture benz = new Manufacture("Benz", 2023, 40000);
        Manufacture tesla = new Manufacture("Tesla", 2023, 35000);
        Manufacture porsche = new Manufacture("Porsche", 2022, 45000);

        Engine combustionEngine = new Engine("Iron", 54531);
        Engine combustionEngine1 = new Engine("Cast Iron", 54535);
        Engine electricEngine = new Engine("alsuminium",15678);
        Engine hybridEngine = new Engine("Stell", 73657);

        ICEV vehicle1 = new ICEV(bmw, combustionEngine);
        ICEV vehicle2 = new ICEV(porsche, combustionEngine1);
        ICEV vehicle3 = new ICEV(benz, combustionEngine);
        
        BEV vehicle4 = new BEV(tesla, electricEngine);
        BEV vehicle5 = new BEV(bmw, electricEngine);
        BEV vehicle6 = new BEV(benz, electricEngine);
        BEV vehicle7 = new BEV(audi, electricEngine);
        
        HybridV vehicle8 = new HybridV(porsche, hybridEngine);
        HybridV vehicle9 = new HybridV(audi, hybridEngine);
        HybridV vehicle10 = new HybridV(benz, hybridEngine);
                
        

        Vehicle[] vehicles = { vehicle1, vehicle2, vehicle3, vehicle4, vehicle5, vehicle6, vehicle7, vehicle8, vehicle9, vehicle10};

        for (Vehicle vehicle : vehicles) {
            vehicle.ShowCharacteristics();
            System.out.println();
        }
    }
}