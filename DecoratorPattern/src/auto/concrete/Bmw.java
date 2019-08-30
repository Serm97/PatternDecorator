package auto.concrete;

public class Bmw extends Automovil{
    @Override
    public String getDescription() {
        return "BMW X6\n • Modelo 2019\n • Color Negro\n";
    }

    @Override
    public int getPrice() {
        int precio = 40000000;
        System.out.println("Precio Auto: "+precio);
        return precio;
    }
}
