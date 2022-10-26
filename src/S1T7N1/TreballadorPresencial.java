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
	
	@Deprecated
	public void megafonia() {
		System.out.println("S'ha trucat per megafonia al treballador.");
	}
	
	@Deprecated
	public void diesel() {
	float benzinaDiesel = (float) (benzina - (benzina * 0.15));
	System.out.println(benzinaDiesel);
	}
}
