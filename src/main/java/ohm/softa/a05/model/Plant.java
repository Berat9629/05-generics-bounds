package ohm.softa.a05.model;

import java.util.Objects;

public abstract class Plant implements Comparable<Plant> {
    private double height;
    private String family;
    private String name;

    public Plant(double height, String family, String name ){
        this.height = height;
        this.family = family;
        this.name = name;
    }
    public double getHeight(){
        return height;
    }
    public String getFamily(){
        return family;
    }
    public String getName(){
        return name;
    }
    public abstract PlantColor getColor();

    @Override
    public String toString() {
        return "Plant{" +
                "height=" + height +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", color='"+ this.getColor() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Plant plant){
        return Double.compare(this.height, plant.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, family, name, this.getColor());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return Double.compare(plant.height, height) == 0 &&
                Objects.equals(family, plant.family) &&
                Objects.equals(name, plant.name) &&
                Objects.equals(this.getColor(), plant.getColor());
    }


}
