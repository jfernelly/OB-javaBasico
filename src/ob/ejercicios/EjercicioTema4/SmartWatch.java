package ob.ejercicios.EjercicioTema4;

public class SmartWatch extends SmartDevice{
    String serie;

    public SmartWatch(){}

    public SmartWatch(String serie, String network, String protocol, String model, String brand, String year, Integer battery){
        super(network, protocol, model, brand, year, battery);
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "serie='" + serie + '\'' +
                ", network='" + network + '\'' +
                ", protocol='" + protocol + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year='" + year + '\'' +
                ", battery=" + battery +
                '}';
    }
}
