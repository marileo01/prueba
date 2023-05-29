package pruebafactura;

import java.util.Scanner;

public class PruebaFactura {

    
    public static void main(String[] args) {
    
       int cantidadPro;
       String descrip;
       double precio;
       
       Factura factura = new Factura("0", "Ninguna", 1, 0.0);
       
        System.out.println("\n Descripción del producto: %d" , factura.getDescrip() );
        System.out.println("\n Cantidad de producto: %s" , factura.getCantidadPro() );
        System.out.println("\n Precio unitario del producto: %f" , factura.getPrecio() );
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("\n Escriba el nombre del producto: ");
        descrip = teclado.nextLine();
        factura.setDescrip( descrip );
        
        System.out.println("\n Escriba la cantidad del producto: ");
        cantidadPro = teclado.nextInt();
        factura.setCantidadPro( cantidadPro );
        
        System.out.println("\n Escriba el precio del producto");
        precio = teclado.nextDouble();
        factura.setPrecio( precio );
        
        factura.getMontoFactura();
        
        System.out.println();
        System.out.println();
        
    }
}
        
        
        
    

