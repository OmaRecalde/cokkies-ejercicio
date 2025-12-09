package models;

public class Producto {
    //Declaramos las variables de mi objeto producto
    private long idProducto;
    private String nombre;
    private String categoria;
    private double precio;
    /*
    *
    *
    */
    public Producto(){


    }
    public Producto(long idProducto, String nombre, String categoria, double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }
    /*
    * METODOS GETTER AND SETTER
    * */
    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
    }
    public long getIdProducto() {
        return idProducto;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   public void setCategoria(String categoria) {
        this.categoria = categoria;
   }
    public void getcategoria(String categoria) {
        this.categoria = categoria;
    }

}
