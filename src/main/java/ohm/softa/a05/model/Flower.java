package ohm.softa.a05.model;

public class Flower extends Plant{
    private final PlantColor color;
    public Flower(double height, String family, String name, PlantColor color){
        super(height, family, name);

        if(color == PlantColor.GREEN){
            throw new IllegalArgumentException("A plant may not be green!");
        }

        this.color = color;
    }

    public PlantColor getColor(){
        return color;
    }

}
