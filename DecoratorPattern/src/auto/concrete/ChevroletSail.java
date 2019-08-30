package auto.concrete;

import auto.concrete.Automovil;

// La clase ChevroletSail hereda de la Clase Automovil
public class ChevroletSail extends Automovil {
    //Metodos de la clase retorna un String
    @Override
    public String getDescription(){
        return "Chevrolet Sail\n • Modelo 2019\n • Color rojo\n";
    }
    //Metodos de la clase retorna un Int
    @Override
    public int getPrice(){
        int precio = 30000000;
        System.out.println("Precio Auto: "+precio+"\n");
        return precio;
    }
}

