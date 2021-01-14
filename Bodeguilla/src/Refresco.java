
public class Refresco extends Articulo {

	private String sabor;
	private boolean zumo;
	private boolean gas;
	private int azucar;
	
	public Refresco(String cod, String n, String mar, double p, int s, String sa,boolean zu, boolean ga, int az) {
		super (cod, n, mar, p, s);
		sabor=sa;
		zumo =zu;
		gas=ga;
		azucar=az;
	}
	public boolean saludable() {
		if (azucar<25) {return true;}
		
		else {return false;}
	}
	public void verCaracteristicas() {	
		System.out.println("\r\n _____________________________________"
				+ "\r\n Codigo: " + codigo + 
				"\r\n Nombre: " + nombre +
				"\r\n Marca: " + marca +
				"\r\n Precio -----------> " + precio + 
				"\r\n Stock ----------->" + stock + 
				"\r\n Sabor ----------->" + sabor + 
				"\r\n Zumo ----------->" + zumo + 
				"\r\n Gas ----------->" + gas + 
				"\r\n Azucar ----------->" + azucar
				+ "\r\n ");
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean isZumo() {
		return zumo;
	}

	public void setZumo(boolean zumo) {
		this.zumo = zumo;
	}

	public String isGas() {
		if (gas) {
			return "Bai";
		}
		else {
			return "Ez";
		}
	}

	public void setGas(boolean gas) {
		this.gas = gas;
	}

	public int getAzucar() {
		return azucar;
	}

	public void setAzucar(int azucar) {
		this.azucar = azucar;
	}
	
	
}
