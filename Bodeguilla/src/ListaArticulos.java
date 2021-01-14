import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class ListaArticulos {
	
	ArrayList <Articulo> lista = null;

	public ListaArticulos() {
		try {
			
			lista = new ArrayList <Articulo> ();
			
			BufferedReader buffer = new BufferedReader(new FileReader("fitxategiak/articulos.txt"));
			
			String line = buffer.readLine();
			String [] data, dat;
			String [] ce =null;
			int x=0;
			while (line!=null) {
				
				data=line.split("::");
				
				
				if (data[0].contains("WINE")) {
					Vino v = new Vino (data[0], data[1], data[2], Double.parseDouble(data[3]), Integer.parseInt(data[4]),
							data [5], data[6], Integer.parseInt(data[7]),data[8], Integer.parseInt(data[9]));
					lista.add(v);
					
					
				} else if (data[0].contains("FRES")){
					Refresco r = new Refresco (data[0], data[1], data[2], Double.parseDouble(data[3]), Integer.parseInt(data[4]),
						data[5], Boolean.parseBoolean(data[6]), Boolean.parseBoolean(data[7]), Integer.parseInt(data[8]));
					lista.add(r);


					
				} else if (data[0].contains("BEER")) {
					Cerveza c = new Cerveza (data[0], data[1], data[2], Double.parseDouble(data[3]), Integer.parseInt(data[4]),
						data[5], data[6].split(","), Double.parseDouble(data[7]));
					lista.add(c);
				}
				
				line=buffer.readLine();
				
			}
			buffer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Ez da fitxategia irakurri");
		}
	}
	
	
	
	public String [] Reponer () {
		int i=0,r=0;
		
		String [] repo = null;
		while (lista.size()>i){
			if (lista.get(i).getStock()<50) {
				repo[r]= lista.get(i).getCodigo();
				r++;
			}
			i++;
		}
		return repo;
	}
	
	public Articulo masCaro() {
		double max = 0;
		int x = 0;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getPrecio() > max) {
				max = lista.get(i).getPrecio();
				x = i;
			}
		}
		return lista.get(x);
	}
	
	public double precio (String codigo) {
		int i=0;
		while (lista.size()>i) {
			if (lista.get(i).getCodigo().equalsIgnoreCase(codigo)) {
				return lista.get(i).getPrecio();
			}
		}
		return 0;
		
	}



	public ArrayList<Articulo> getLista() {
		return lista;
	}



	public void setLista(ArrayList<Articulo> lista) {
		this.lista = lista;
	}
	
	}
