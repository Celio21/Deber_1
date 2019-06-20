
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ITSLOJA
 */
public class circulo {

	private static Scanner sc;

	public static void main(String[] args){
		 
        double radio = leerNumero("Introduce el radio del circulo: ");
        double area, perimetro;
        perimetro = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);
        System.out.printf("\nEl perímetro del circulo de radio %.2f es %.2f.", radio, perimetro);
        System.out.printf("\nEl área del circulo de radio %.2f es %.2f.", radio, area);
    }
 
    private static double leerNumero(String s){
        sc = new Scanner(System.in);
        System.out.print(s);
        return sc.nextDouble();
    }
}

