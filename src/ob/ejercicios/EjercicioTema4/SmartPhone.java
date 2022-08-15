package ob.ejercicios.EjercicioTema4;


public class SmartPhone extends SmartDevice {
    String os;
    Boolean cam;

    public SmartPhone() {

    }

    public SmartPhone(String os, Boolean cam, String network, String protocol, String model, String brand, String year, Integer battery ) {
        super(network, protocol, model, brand, year, battery);
        this.os = os;
        this.cam = cam;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "os='" + os + '\'' +
                ", cam=" + cam +
                ", network='" + network + '\'' +
                ", protocol='" + protocol + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year='" + year + '\'' +
                ", battery=" + battery +
                '}';
    }
}
