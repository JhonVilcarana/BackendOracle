package pe.apirestoracle.entity;

public class Producto {
private int idproducto;
private String nomprod;
private double  precio;
private int number;
public Producto(int idproducto, String nomprod, double precio, int number) {
	super();
	this.idproducto = idproducto;
	this.nomprod = nomprod;
	this.precio = precio;
	this.number = number;
}
public Producto() {
	// TODO Auto-generated constructor stub
}
public int getIdproducto() {
	return idproducto;
}
public void setIdproducto(int idproducto) {
	this.idproducto = idproducto;
}
public String getNomprod() {
	return nomprod;
}
public void setNomprod(String nomprod) {
	this.nomprod = nomprod;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}

}
