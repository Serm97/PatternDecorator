package auto.decorator;

import exampledecoratorpattern.VentaAuto;

public class Polarizado extends AutomovilDecorator {

    public Polarizado(VentaAuto ventaAuto) {
        super(ventaAuto);
    }

    @Override
    public String getDescription() {
        return getVentaAuto().getDescription() + "\n • Vidrios Polarizados";
    }

    @Override
    public int getPrice() {
        return getVentaAuto().getPrice() + 580000;

    }
}
