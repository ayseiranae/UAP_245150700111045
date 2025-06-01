package uap.mains;

import java.util.Scanner;
import uap.models.Sphere;
import uap.models.Torus;
import uap.types.Typograph;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("_______________________________________________________");
        Typograph.center("Kalkulator Pabrik Cetakan Donat Rumahan");
        Typograph.center("RIESYA NADIHA DEVVY");
        Typograph.center("245150700111045");
        System.out.println("_______________________________________________________");
        
        Typograph.center("Donat dengan lubang");
        System.out.println("_______________________________________________________");
        System.out.print("Isikan Major Radius : ");
        double R = sc.nextDouble();
        System.out.print("Isikan Minor Radius : ");
        double r = sc.nextDouble();
        
        Torus torus = new Torus(R, r);
        torus.printInfo();
        
        Typograph.center("Donat tanpa lubang");
        System.out.println("_______________________________________________________");
        System.out.print("Isikan radius : ");
        double radius = sc.nextDouble();
        
        Sphere sphere = new Sphere(radius);
        sphere.printInfo();
        
        sc.close();
    }
}