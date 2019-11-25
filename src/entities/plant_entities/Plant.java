package entities.plant_entities;

public class Plant implements Comparable<Plant> {

    private String name;
    private double height;

    public Plant() {
    }

    public Plant(String name) {
        this.name = name;
    }

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public int compareTo(Plant o) {
        return this.getName().compareTo(o.getName());
    }
}
