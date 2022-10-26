package S1T7N1;

public class TreballadorPresencial extends Treballador{

	//Atributs
	private static final float benzina = 40;
	
	//Constructor
	public TreballadorPresencial(String nom, String cognom, int preuHora) {
		super(nom, cognom, preuHora);
	}
	
	@Override
	public Float calcularSou(float hores) {
		float sou = (hores * this.getPreuHora()) + benzina;
		return sou;
	}
	
	public void imprimeix() {
		System.out.println("Treballador Presencial [ nom = " + this.getNom() + " cognom = " + this.getCognom() + " preuHora = " + this.getPreuHora() + " ]");
	}
	
}
