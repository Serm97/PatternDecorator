package auto.decorator;

import exampledecoratorpattern.VentaAuto;

public class Blindaje extends AutomovilDecorator {

    public Blindaje(VentaAuto ventaAuto) {
        super(ventaAuto);
    }

    @Override
    public String getDescription() {
        return getVentaAuto().getDescription() + "\n • Blindaje";
    }

    @Override
    public int getPrice() {
        return getVentaAuto().getPrice() + 180000;
    }
}
