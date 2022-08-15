package ob.ejercicios.EjercicioTema4;

public class Main {
    public static void main(String[] args) {
        SmartPhone phoneSinParam;
        phoneSinParam = new SmartPhone();

        phoneSinParam.network = "4G";
        phoneSinParam.battery = 6000;
        phoneSinParam.cam = true;
        phoneSinParam.brand = "samsung";
        phoneSinParam.model = "S22";
        phoneSinParam.protocol = null;
        phoneSinParam.os = "android";
        phoneSinParam.year =  "2022";

        System.out.println(phoneSinParam.toString());

        SmartWatch watchConParam = new SmartWatch("123", null, "NA", "Smart", "Samsung", "2020", 250 );
        System.out.print(watchConParam.toString());

    }
}
