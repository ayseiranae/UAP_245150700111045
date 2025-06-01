package uap.bases;

public abstract class Shape {
    String name;

    public Shape() {
        this.name = "";
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public abstract void printInfo();
}
