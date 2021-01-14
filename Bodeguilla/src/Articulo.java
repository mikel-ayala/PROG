
public abstract class Articulo {
	protected String codigo;
	protected String nombre;
	protected String marca;
	protected double precio;
	protected int stock;
	
	public Articulo (String cod, String n, String mar, double p, int s){
		codigo=cod;
		nombre=n;
		marca=mar;
		precio=p;
		stock=s;
	}
	
	public void aumentarStock (int a){
		stock+=a;
	}
	
	public void disminuirStock(int d) {
		stock-=d;
	}
	
	public abstract void verCaracteristicas();
	
	public abstract boolean saludable ();
	
	public boolean equivalentes (Articulo art) {
		return true;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
