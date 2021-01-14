
public class Cerveza extends Articulo {

		private String origen;
		private String[] cereales;
		private double alcohol;
		
		public Cerveza (String cod, String n, String mar, double p, int s, String origen, String[] cereales, double alcohol) {
			super(cod, n, mar, p, s);
			this.origen = origen;
			this.cereales = cereales;
			this.alcohol = alcohol;
		}
		
		public void verCaracteristicas() {
			System.out.println("\r\n _____________________________________ "
					+ "\r\n Codigo:" + codigo 
					+ "\r\n Nombre: " + nombre 
					+ "\r\n Marca: " + marca 
					+ "\r\n Precio ----------->" + precio  
					+ "\r\n Stock ----------->" + stock 
					+ "\r\n Origen ----------->" + origen 
					+ "\r\n Cereales ----------->" + cereales 
					+ "\r\n Alcohol -----------> " + alcohol
					+ "\r\n ");
		}
		public boolean saludable() {
			if (origen.equals("Belgium")) {
				return true;
			}
			else {
				return false;
			}
		}
		public void bebida_muy_alcoholica() {
			if (alcohol>=6) {
				precio = precio*1.05;
			}
		}
		public String getOrigen() {
			return origen;
		}
		public void setOrigen(String origen) {
			this.origen = origen;
		}
		public String[] getCereales() {
			return cereales;
		}
		public void setCereales(String[] cereales) {
			this.cereales = cereales;
		}
		public double getAlcohol() {
			return alcohol;
		}
		public void setAlcohol(double alcohol) {
			this.alcohol = alcohol;
		}


		
		
		
}
