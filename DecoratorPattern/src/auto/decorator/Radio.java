package auto.decorator;

import exampledecoratorpattern.VentaAuto;

public class Radio extends AutomovilDecorator {

    private int tipoRadio;

    public Radio(VentaAuto ventaAuto, int tipoRadio) {
        super(ventaAuto);
        this.tipoRadio = tipoRadio;
    }

    @Override
    public String getDescription() {
        String radio = "";
        switch (this.tipoRadio){
            case 1:
                radio = "Basico";
                break;
            case 2:
                radio = "GPS";
                break;
            case 3:
                radio = "DVD";
                break;
        }


        return getVentaAuto().getDescription() + "\n • Radio " + radio;
    }

    @Override
    public int getPrice() {
        int precioRadio = 0;
        switch (this.tipoRadio){
            case 1:
                precioRadio = 20000;
                break;
            case 2:
                precioRadio = 35000;
                break;
            case 3:
                precioRadio = 50000;
                break;
        }

        return getVentaAuto().getPrice() + precioRadio;

    }
}
