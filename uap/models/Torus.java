package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;
import uap.types.Typograph;

public class Torus extends Shape implements ThreeDimensional, PiRequired, MassCalculate, MassConverter, ShippingCostCalculator {
    private double R;
    private double r;

    public Torus() {
        this.R = 0;
        this.r = 0;
        setName("Donat dengan lubang");
    }

    public Torus(double R, double r) {
        this.R = R;
        this.r = r;
        setName("Donat dengan lubang");
    }

    @Override
    public double getVolume() {
        return 2 * PI * PI * R * r * r;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * PI * R * r;
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