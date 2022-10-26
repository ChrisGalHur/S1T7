package S1T7N1;

public class Main1 {

	public static void main(String[] args) {
		/*- Exercici 1
		-Crea una jerarquia d�objectes amb tres classes:  Treballador, TreballadorOnline i TreballadorPresencial.
		-La classe Treballador t� els atributs nom, cognom, preu/hora, i el m�tode calcularSou() 
		-que rep per par�metre el nombre d'hores treballades i el multiplica pel preu/hora. Les classes filles l'han de sobreescriure,
		-emprant @Override.
		-Des del main() de la classe Principal, fes les invocacions necess�ries per demostrar el funcionament de l�anotaci� @Override.
		-En els treballadors presencials, el m�tode per calcular el seu sou, rebr� per par�metre el nombre d�hores treballades al mes.
		-A l�hora de calcular el sou es multiplicar� el nombre d�hores treballades pel preu/hora,
		-m�s el valor d'un atribut static anomenat benzina que afegirem en aquesta classe.
		-En els treballadors online, el m�tode per calcular el seu sou rebr� per par�metre el nombre d'hores treballades al mes.
		-A l'hora de calcular el sou es multiplicar� el nombre d'hores treballades pel preu/hora i se li sumar� el preu de la tarifa plana d'Internet,
		que ser� una constant de la classe TreballadorOnline.*/

		float souT;
		float souTO;
		float souTP;
		
		Treballador sinIdentificar = new Treballador("Pedro", "Jimenez", 15);

		TreballadorOnline online1 = new TreballadorOnline("Adri�n" , "Serra", 15);
		
		TreballadorPresencial presencial1 = new TreballadorPresencial("Javier", "Dionisio", 15);

		sinIdentificar.imprimeix();
		System.out.println("Sou = " + sinIdentificar.calcularSou(40));
		online1.imprimeix();
		System.out.println("Sou = " + online1.calcularSou(40));
		presencial1.imprimeix();
		System.out.println("Sou = " + presencial1.calcularSou(40));
		
	}

}
