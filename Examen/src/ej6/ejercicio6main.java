package ej6;

public class ejercicio6main {
	public static void main(String[] args) {
		caballo a= new caballo();
		System.out.println("el animal");
		a.beber();
		a.cazar();
		a.comer();
		System.out.println("=====================");
		System.out.println("el caballo");
		a.correr();
		a.cabalgar();
		a.trotar();
		System.out.println("=====================");

	System.out.println("el gato");
	gato b=new gato();
	b.croqueta();
	b.patita();
	b.saltar();
	}
}
