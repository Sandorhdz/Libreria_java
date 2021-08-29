
package modelo;

public class Compra {
    
  private int  id ;
private String nombre_libro; 
private String editorial  ;
private int precio ;
private String fecha; 

//cada vez que cree un objeto de tipo compra me pedira un id
public Compra(int id ){
    this.id=id;
}

//pedir informacion y devolverla
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNombre_libro() {
            return nombre_libro;
        }

        public void setNombre_libro(String nombre_libro) {
            this.nombre_libro = nombre_libro;
        }

        public String getEditorial() {
            return editorial;
        }

        public void setEditorial(String editorial) {
            this.editorial = editorial;
        }

        public int getPrecio() {
            return precio;
        }

        public void setPrecio(int precio) {
            this.precio = precio;
        }

        public String getFecha() {
            return fecha;
        }

        public void setFecha(String fecha) {
            this.fecha = fecha;
        }
           
}

