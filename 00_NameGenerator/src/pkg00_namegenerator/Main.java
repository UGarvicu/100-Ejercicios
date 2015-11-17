/*
 Creación de un generador de nombres simple
 ------------------------------------------
 - Sin llamar a una base de datos por ahora (*)
 - Le pediremos ciertas características al usuario para determinar su nombre

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg00_namegenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author unai
 */
public class Main {

    private static String Ane;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String sexo;
        String apellidoeleccion = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hola, esto es un generador de nombres simple.");
        do {
            System.out.print("Dime, ¿eres un hombre o una mujer?: ");
            sexo = br.readLine().toUpperCase();
        } while (!sexo.equals("HOMBRE") && !sexo.equals("MUJER"));
        do {
            System.out.print("¿Quieres que generemos aleatoriamente tu apellido?: ");
            apellidoeleccion = br.readLine().toUpperCase();
        } while (!apellidoeleccion.equals("SI") && !apellidoeleccion.equals("NO"));

        if (apellidoeleccion.equals("SI")) {
            System.out.println("Tu nombre completo es " + randomnombre(sexo) + " " + randomapellido(apellidoeleccion));
        } else {
            System.out.print("Dime que apellido quieres tener: ");
            apellidoeleccion = br.readLine();
            System.out.println("Tu nombre completo es " + randomnombre(sexo) + " " + apellidoeleccion);
        }
    }

    public static String randomnombre(String sexofunc) {
        String arraynombresf[] = {"Ana", "Ane", "Miren", "Amaia", "Victoria", "Esti", "Maite", "Iratxe", "Ariane", "Enara", "Irati"};
        String randomarraynombresf = (arraynombresf[new Random().nextInt(arraynombresf.length)]);
        String arraynombresm[] = {"Asier", "Oier", "Joseba", "Jorge", "Unai", "Aitor", "Koldo", "Ander", "Endika", "Juan", "Jose"};
        String randomarraynombresm = (arraynombresm[new Random().nextInt(arraynombresm.length)]);

        if (sexofunc.equals("MUJER")) {
            return randomarraynombresf;
        } else {
            return randomarraynombresm;
        }
    }

    public static String randomapellido(String apellidoeleccionfunc) {
        String arrayapellidos[] = {"García", "Vega", "Martínez", "Fernández", "Usategi", "Álvarez", "Erentxun", "González"};
        String randomarrayapellidos = (arrayapellidos[new Random().nextInt(arrayapellidos.length)]);

        return randomarrayapellidos;
    }
}
