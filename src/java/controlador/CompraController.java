
package controlador;

import conexion.Conexion;
import dao.CompraDao;
import java.util.List;
import java.util.Scanner;
import modelo.Compra;


public class CompraController {
    
     
     
    
    public static void main(String[] args) {
        
        
        
        //el que arrancara el proyecto
        
        Scanner scan=new Scanner(System.in);
        
        //un objeto tipo:    para pasarlo a dao
        
        Compra compr=new Compra(0);//se puede probar con un valor 1 para ocasionar un error---por el autoincrementable
        
        Conexion conn = new Conexion();
        //pasarle una conexion al objeto
        CompraDao comprd=new CompraDao(conn);
        
        //pide los datos 
        System.out.println("Ingrese nombre : ");
        compr.setNombre_libro(scan.next());
        
        System.out.println("Ingrese editorial ");
        compr.setEditorial(scan.next());
        
        System.out.println("ingrese precio : ");
        compr.setPrecio(scan.nextInt());
        
        
        System.out.println("Ingrese fecha de compra ");
        compr.setFecha(scan.next());
        
        //me devuelve un booelan
        boolean respuesta = comprd.insertar(compr);
        
        //comprueba mi respuesta 
        if(respuesta){
            System.out.println("Su registro fue guardado con exito ");
        }else {
            System.out.println("error al guardar un registro");
    
       }  
        List <Compra> list= comprd.ConsultarAll();
        for(Compra comp1: list){
            System.out.println("El id del libro es : " + comp1.getId());
            System.out.println("El nombre del libro es : " + comp1.getNombre_libro());
            System.out.println("La editorial del libro es : " + comp1.getEditorial());
            System.out.println("El precio del libro es : "  + comp1.getPrecio());
            System.out.println("La fecha de compra fue : " + comp1.getFecha());
            
    }
        
        
    }
    
   
   
    
}
