package ohm.softa.a05.tests.models;

import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.PlantColor;
import org.junit.jupiter.api.Test;

public class Plant {

    @Test
    void MichiundSerdar(){
        Flower flower = new Flower(1,"Basaran","Serdar", PlantColor.RED);
    }
}
