package auto.decorator;

import auto.decorator.AutomovilDecorator;
import exampledecoratorpattern.VentaAuto;

public class VidriosElectricos extends AutomovilDecorator {
     //Constructor se envia el paramatrea al metodo
     public VidriosElectricos(VentaAuto ventaAuto){
        //permite acumular
         super(ventaAuto);
    }
     //Metodos que retornan del componente y del decorador concreto
    @Override
    public String getDescription(){
        return getVentaAuto().getDescription() + "\n • Vidrios Eléctricos";
    }
     //Metodos que retornan del componente y del decorador concreto
    @Override
    public int getPrice(){
        return getVentaAuto().getPrice() + 200000;


    }
    
}
