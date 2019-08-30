package auto.concrete;

import auto.concrete.Automovil;

// La clase Mazda3 hereda de la Clase Automovil
public class Mazda3 extends Automovil {
     //Metodos de la clase
    @Override
    public String getDescription(){
        return "Mazda 3\n • Modelo 2011\n • Color gris\n";
    }

    @Override
    public int getPrice(){
        int precio = 20000000;
        System.out.println("Precio Auto: "+precio);
        return precio;
    }
}
