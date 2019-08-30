package auto.decorator;

import auto.decorator.AutomovilDecorator;
import exampledecoratorpattern.VentaAuto;

public class Mp4Player extends AutomovilDecorator {
    //Constructor se envia el paramatrea al metodo
    public Mp4Player(VentaAuto ventaAuto){
        super(ventaAuto);
    }
    //Metodos que retornan del componente y del decorador concreto
    @Override
    public String getDescription(){
        return getVentaAuto().getDescription() + "\n • Reproductor Mp4";
    }
    //Metodos que retornan del componente y del decorador concreto
    @Override
    public int getPrice(){
        return getVentaAuto().getPrice() + 400000;
    }
}
