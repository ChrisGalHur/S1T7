package S1T7N1;

public class TreballadorOnline extends Treballador{

	//Atributs
	private static final float preuTarifaPlana = 35;
	
	//Constructors
	public TreballadorOnline(String nom, String cognom, int preuHora) {
		super(nom, cognom, preuHora);
	}

	@Override
	public Float calcularSou(float hores) {
		float sou = (hores * this.getPreuHora()) + preuTarifaPlana;
		return sou;
	}

	public void imprimeix() {
		System.out.println("Treballador Online [ nom = " + this.getNom() + " cognom = " + this.getCognom() + ", preuHora = " + this.getPreuHora() + " ]");
	}
	
	@Deprecated
	public void vigilarTreballador() {
		System.out.println("S'ha conectat a la pantalla del treballador.");
	}
	
}
