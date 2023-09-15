/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadorademonedas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class calculadorademonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner directorio = new Scanner(System.in);
        double peso = directorio.nextDouble();

        final double euro = 18.21;

        final double dolar = 17.07;

        final double yen = 0.12;

        final double libra = 21.18;
        
        System.out.println("el resultado en euros es" + peso/euro);
        System.out.println("el resultado en euros es" + peso/dolar);
        System.out.println("el resultado en euros es" + peso/yen);
        System.out.println("el resultado en euros es" + peso/libra);
    }
}
        // TODO code application logic here

