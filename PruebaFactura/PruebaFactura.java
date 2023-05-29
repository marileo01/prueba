package pruebafactura;

import java.util.Scanner;

public class PruebaFactura {
    private String numPieza;
    private String descrip;
    private int cantidadVend;
    private double precio;
    
   public void setNumPieza(String numPieza){
        this.numPieza = numPieza;
    }
    public void setDescrip(String descrip){
        this.descrip = descrip;
    }
    public void setCantidadVend(int cantidadVend){
        this.cantidadVend = cantidadVend;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public String getNumPieza(){
        return numPieza;
    }
    public String getDescrip(){
        return descrip;
    }
    public int getCantidadVend(){
      return cantidadVend;
    }
    public double getPrecio(){
        return precio;
    }
    public void Imprimir(){
        System.out.println("Num. pieza: " + getNumPieza());
        System.out.println("Descripcion: " + getDescrip());
        System.out.println("Cantidad: " + getCantidadVend());
        System.out.println("Precio: " + getPrecio());

    }
    public void Facturas(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Num. pieza: ");
        setNumPieza(entrada.nextLine()); //Leer una cadena
        System.out.println("Descripcion: ");
        setDescrip(entrada.nextLine());
        System.out.println("Cantidad: ");
        setCantidadVend(entrada.nextInt());
        System.out.println("Precio: ");
        setPrecio(entrada.nextDouble());
    }

    public static void main(String[] args) {
        

        PruebaFactura prod1 = new PruebaFactura();
        
        prod1.Facturas();
        
        System.out.println("Producto 1: ");
        prod1.Imprimir();
    }
        
}


      
   
        
    

