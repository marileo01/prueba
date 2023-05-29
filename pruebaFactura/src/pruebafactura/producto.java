
package pruebafactura;


public class producto {
    
private int cantidadPro;
private String descrip;
private double precio;
private double descuento;
private double subtotal;

    public producto(int cantidadPro, String descrip, double precio, double descuento) {
        
       if(cantidadPro &gt; 0){
        
        this.cantidadPro = cantidadPro;
    }
        
        this.descrip = descrip;
        
        if(precio &gt; 0){this.precio = precio;}
        
        if(descuento >= 0) {this.descuento = descuento;}
        else if (descuento >= 0 && descuento <=30){this.descuento = descuento;} 
        
        this.subtotal = cantidadPro * precio * (1 - descuento / 100);
        
    }
    

    public void setCantidadPro(int cantidadPro) {
         this.cantidadPro = cantidadPro;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getCantidadPro() {
        return this.cantidadPro;
    }

    public String getDescrip() {
        return this.descrip;
    }

    public double getPrecio() {
        return this.precio;
    }

    public double getDescuento() {
        return this.descuento;
    }

    public double getSubtotal() {
        return this.subtotal;
    }

    public void getMontoFactura(){
    
        if( getCantidadPro() &lt; 0){ this.cantidadPro = 1;}
        
        if( getPrecio() &lt; 0){ this.cantidadPro = 0;} 
        
        
        System.out.printf( "\n ***** FACTURA *****\n\n" );
        System.out.printf( "\n Descripción del producto: %s" , getDescrip() );
        System.out.printf( "\n Cantidad del producto: %d" , getCantidadPro() );
        System.out.printf( "\n Precio unitario del producto: %f" , getPrecio() );
       
        //Totalizar el monto de la compra
        System.out.printf( "\n\n El total a pagar es: %f" , getSubtotal());
        
    }
     
}
