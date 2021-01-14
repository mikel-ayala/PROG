import java.util.*;

public class Factura implements Facturacion {
	private int zenbakia;
	private String Izena;
	private String Abizena;
	private double total;
	ArrayList <LineaFactura> lineas =null;
	
	public void AniadirLinea (String codigo, int cantidad, double total) {
		
	}
	@Override
	public void print() {
		Scanner input = new Scanner (System.in);
		System.out.println("Esan faktura zenbakia");
		int zenbakia= input.nextInt();
		System.out.println("Esan bezeroaren izena");
		String izena= input.next();
		System.out.println("Bezeroaren abizena");
		String abizena= input.next();
		System.out.println("Esan artikulu kodigoa, kantitatea eta eman ENTER");
		String art=input.next();
		while (!art.equalsIgnoreCase("end"));{
			System.out.println("Esan artikulu kodigoa, kantitatea eta eman ENTER");
			art=input.next();
		}
		
	}
	public void calcularTotal() {
		
	}

	public int getZenbakia() {
		return zenbakia;
	}

	public void setZenbakia(int zenbakia) {
		this.zenbakia = zenbakia;
	}

	public String getIzena() {
		return Izena;
	}

	public void setIzena(String izena) {
		Izena = izena;
	}

	public String getAbizena() {
		return Abizena;
	}

	public void setAbizena(String abizena) {
		Abizena = abizena;
	}

	public ArrayList<LineaFactura> getLineas() {
		return lineas;
	}

	public void setLineas(ArrayList<LineaFactura> lineas) {
		this.lineas = lineas;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	

}
