package uap.types;

public class Typograph {
    String label;
    double value;
    String text;

    public static void justify(String label, double value) {
        int width = 55;
        int separator = 20;
        System.out.print(String.format("%-" + separator + "s: %" + (width - separator - 2) + "s\n", label, value));
    }

    public static void center(String text) {
        int tengah = (55 - text.length()) / 2;        
        for (int i = 0; i < tengah; i++) {
            System.out.print(" ");
        }        
        System.out.println(text);
    }
}