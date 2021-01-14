import java.util.Scanner;

public class Kudeatzailea {
	ListaArticulos lista = new ListaArticulos ();
	Factura fac = new Factura ();
	
	public void menuaErakutsi() {
		System.out.println("+-----------------------MENUA-----------------------+ \r\n"
				+ "1. Hacer una venta (crear factura) \r\n"
				+ "2. Listar todos los articulos \r\n"
				+ "3. Ver los articulos saludables \r\n"
				+ "4. Sacar una lista de articulos con precios equivalentes \r\n"
				+ "5. Ver el articulo mas caro \r\n"
				+ "6. Ver los articulos con poco stock \r\n"
				+ "+---------------------------------------------------+");
	}
	public void factura() {
		try {
		Scanner input = new Scanner (System.in);
		System.out.println("Esan faktura zenbakia");
		int zenbakia = Integer.parseInt(input.nextLine());
		fac.setZenbakia(zenbakia);
		System.out.println("Esan bezeroaren izena");
		String izena = input.nextLine();
		fac.setIzena(izena);
		System.out.println("Esan bezeroaren abizena");
		String abizena = input.nextLine();
		fac.setAbizena(abizena);
		String art;
		String[] dat = null;
		int cantidad = 0;
		int i = 0;
		do {
			System.out.println("Esan artikulu kodigoa, kantitatea eta eman ENTER. Adibidez : Fres01-3");
			art=input.next();
			dat=art.split("-");
			if (dat.length==2) {
			cantidad = Integer.parseInt(dat[1]);
			i = 0;
			while (lista.getLista().size()>i) {
				if (lista.getLista().get(i).getCodigo().equalsIgnoreCase(dat[0])) {
					if (lista.getLista().get(i).getStock()<cantidad) {
						System.out.println("No hay stock suficiente");
					}else {
					lista.getLista().get(i).setStock(lista.getLista().get(i).getStock()-cantidad);
					fac.AniadirLinea(lista.getLista().get(i).getCodigo(), cantidad, lista.getLista().get(i).getPrecio()*cantidad);
					}
				}
				i++;
			}
			}
			
		}while (!art.equalsIgnoreCase("end")); 
		fac.print();
		fac.calcularTotal();
	    input.close();
		}catch(Exception e) {
			
		}
	}
	public void artGuztiak() {
		for (int i=0;i<lista.getLista().size();i++) {
			lista.getLista().get(i).verCaracteristicas();
				}
		}
	public void saludables() {
		int i = 0;
		while (lista.getLista().size()>i) {
			if (lista.getLista().get(i).saludable()) {
				lista.getLista().get(i).verCaracteristicas();
			}
			i++;
		}
	}
	public void equivalentes() {
		Scanner input = new Scanner(System.in);
		int i = 0, x = 0;
		System.out.println("Introduce el código del artículo:");
		String codigo = input.nextLine();
		System.out.print(lista.getLista().get(i).getNombre()+ "Tiene precio equivalente a estos productos:");
		while (lista.getLista().size()>i) {
			if (lista.getLista().get(i).getCodigo().equalsIgnoreCase(codigo)) {
				while (lista.getLista().size()>x) {
					if (lista.getLista().get(i).getPrecio()==lista.getLista().get(x).getPrecio()) {
						lista.getLista().get(x).verCaracteristicas();
					}
					x++;
				}
			}
			i++;
		}
		input.close();
		}
	public void pocoStock() {
		int i = 0;
		System.out.println("Lista de los articulos que tienen poco stock:");
		while (lista.getLista().size()>i) {
			if (lista.getLista().get(i).getStock()<50) {
				lista.getLista().get(i).verCaracteristicas();
			}
			i++;
		}
	}
	public void masCaro() {
		lista.masCaro().verCaracteristicas();
	}
}
