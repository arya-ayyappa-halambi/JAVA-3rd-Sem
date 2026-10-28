import java.util.Scanner;

// Abstract base class
abstract class EnergySource {
    protected String sourceId;
    protected String sourceName;
    protected double energyGenerated; // in kWh

    public EnergySource(String sourceId, String sourceName, double energyGenerated) {
        this.sourceId = sourceId;
        this.sourceName = sourceName;
        this.energyGenerated = energyGenerated;
    }

    // Abstract method to be implemented by derived classes
    public abstract double calculateEfficiency();

    // Method to display general source details
    public void displayDetails() {
        System.out.println("----------------------------------------");
        System.out.println("Source ID        : " + sourceId);
        System.out.println("Source Name      : " + sourceName);
        System.out.println("Energy Generated : " + energyGenerated + " kWh");
        System.out.printf("Efficiency       : %.2f%%\n", calculateEfficiency());
        System.out.println("----------------------------------------");
    }
}

// Derived class: SolarEnergy
class SolarEnergy extends EnergySource {

    public SolarEnergy(String sourceId, String sourceName, double energyGenerated) {
        super(sourceId, sourceName, energyGenerated);
    }

    @Override
    public double calculateEfficiency() {
        // Efficiency = (Energy Generated / 5000) * 100
        return (energyGenerated / 5000.0) * 100.0;
    }
}

// Derived class: WindEnergy
class WindEnergy extends EnergySource {

    public WindEnergy(String sourceId, String sourceName, double energyGenerated) {
        super(sourceId, sourceName, energyGenerated);
    }

    @Override
    public double calculateEfficiency() {
        // Efficiency = (Energy Generated / 8000) * 100
        return (energyGenerated / 8000.0) * 100.0;
    }
}

// Main class to demonstrate Dynamic Method Dispatch
public class EnergyManagement {
    public static void main(String[] args) {
        // Reference of abstract superclass
        EnergySource ref;

        // Creating SolarEnergy instance and binding to superclass reference
        ref = new SolarEnergy("SOL-101", "Rooftop Solar Plant", 4250.0);
        System.out.println("Demonstrating Dynamic Method Dispatch for Solar Energy:");
        ref.displayDetails(); // Dynamic binding resolves calculateEfficiency() to SolarEnergy

        // Creating WindEnergy instance and binding to superclass reference
        ref = new WindEnergy("WND-202", "Offshore Wind Turbine", 6400.0);
        System.out.println("\nDemonstrating Dynamic Method Dispatch for Wind Energy:");
        ref.displayDetails(); // Dynamic binding resolves calculateEfficiency() to WindEnergy
    }
}