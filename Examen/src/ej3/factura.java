package ej3;

import java.util.Scanner;

public class factura {
	public static void main(String[] args) {
		System.out.println("==========================cabecera============================");

		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);

		String[] Producto = new String[2];
		int[] Unidades = new int[2];
		double[] Precio = new double[2];

		for (int i = 1; i < 3; i++) {
			System.out.println("producto " + i);
			Producto[i-1] = s.nextLine();
			System.out.println("unidades " + i);
			Unidades[i-1] = s1.nextInt();
			System.out.println("precio " + i);
			Precio[i-1] = s2.nextDouble();
			
		}
		System.out.println("producto-Unidades-Precio");
		System.out.println("====================listado de productos======================");
		for(int i = 0; i<3;i++) {
			System.out.println(Producto[i-1]+"-"+Unidades[i-1]+"-"+Unidades[i-1]*Precio[i-1]);
			System.out.println(Producto[i-1]+"-"+Unidades[i-1]+"-"+Unidades[i-1]*Precio[i-1]);
		
		}
		double total=Unidades[i-1]*Precio[i-1];
		total=total+(Unidades[i-1]+Precio[i-1]);
		

		
		
		System.out.println("=========================pie y total==========================");
		System.out.println("total: "total);
	}
}
