package auto.concrete;

public class ChevroletSprint extends Automovil {
    @Override
    public String getDescription() {
        return "Chevrolet Sprint\n • Modelo 2002\n • Color Azul Mate\n";
    }

    @Override
    public int getPrice() {
        int precio = 80000000;
        System.out.println("Precio Auto: "+precio);
        return precio;
    }
}
