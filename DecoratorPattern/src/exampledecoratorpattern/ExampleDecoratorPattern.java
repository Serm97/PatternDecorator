package exampledecoratorpattern;

import auto.concrete.Bmw;
import auto.concrete.ChevroletSail;
import auto.decorator.*;

import java.text.NumberFormat;
import java.util.Locale;

public class ExampleDecoratorPattern {
    //Cliente
    public static void main(String[] args) {
        VentaAuto automovil= new ChevroletSail();
        automovil=new Mp4Player(automovil);
        automovil=new LlantasLujo(automovil);
        automovil=new AireAcondicionado(automovil);
        automovil=new VidriosElectricos(automovil);

        generarFactura(automovil);

        VentaAuto bmw = new Bmw();
        bmw = new LlantasLujo(bmw);
        bmw = new Radio(bmw,3);
        bmw = new Polarizado(bmw);
        bmw = new Blindaje(bmw);

        generarFactura(bmw);


          
    }

    public static void generarFactura(VentaAuto auto){

        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);

        System.out.println("\n\n--------  FACTURA DE COMPRA ----------");
        System.out.println("Descripción" + "\n________________________\n");
        System.out.print(auto.getDescription());
        System.out.print("\n________________________");
        System.out.print("\nPrecios\n");
        System.out.print("\nPrecio Total > " + format.format(auto.getPrice()));

    }
    
}
