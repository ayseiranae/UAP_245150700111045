package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;
import uap.types.Typograph;

public class Sphere extends Shape implements ThreeDimensional, PiRequired, MassCalculate, MassConverter, ShippingCostCalculator {
    private double r;

    public Sphere() {
        this.r = 0;
        setName("Donat tanpa lubang");
    }

    public Sphere(double r) {
        this.r = r;
        setName("Donat tanpa lubang");
    }

    @Override
    public double getVolume() {
        return (4.0 / 3) * PI * r * r * r;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * r * r;
    }

    @Override
    public double getMass() {
        return getSurfaceArea() * THICKNESS * DENSITY;
    }

    @Override
    public double gramToKilogram() {
        return Math.ceil(getMass() / DENOMINATOR);
    }

    @Override
    public double calculateCost() {
        return gramToKilogram() * PRICE_PER_KG;
    }

    @Override
    public void printInfo() {
        System.out.println("_______________________________________________________");
        Typograph.center(getName());
        System.out.println("_______________________________________________________");
        Typograph.justify("Volume          ", getVolume());
        Typograph.justify("Luas permukaan  ", getSurfaceArea());
        Typograph.justify("Massa           ", getMass());
        Typograph.justify("Massa dalam kg  ", gramToKilogram());
        Typograph.justify("Biaya kirim (Rp)", calculateCost());
        System.out.println("_______________________________________________________");
    }
}