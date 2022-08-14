package ob.ejercicios;

public class EjercicioTema3 {
    public static void main(String[] args) {

        String[] vocales = {"a", "e", "i", "o", "u"};
        String aeiou = "";

        for(String v : vocales){
            //System.out.print(v);
            aeiou = aeiou.concat(v);
        }

        System.out.println(aeiou);

    }

}
