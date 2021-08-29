
package conexion;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
   static String bd="libreria";
   static String user ="root";
   static String pass="root";
   //motor base de datos depende: cadena conexion
   static String url="jdbc:mysql://localhost:3306/" + bd ;
    Connection conn=null;
    
    //ocupamos un constructor para que todo lo genere ,cada vez que se cree un objeto
   //de tipo conexion o cada vez que se utilice el objeto.
 
    //un constructor poner datos de la conexion, jala archivo,jala librerias, pasa parametros, 
    //todo lo que necesita para que se conecta ,aca mismo valida si esta bien todo muestra.
    public Conexion(){
        //cada conexion se coloca sobre un try catch, por cualquier cosa o problema dado
        
        try{
           
            //Forname : datos que se necesitan, y que se mandan a traer de tipo de la libreria: carpetas en la libreria
            //metodo para pedir a libreria: drivers de conexion
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(url, user, pass);
            if(conn!= null){
                System.out.println("Exito en la conexion");
            }
        }catch (Exception e){
            System.out.println("error de conexion" + e);
            //la letra e es la que logra mandar informacion o mensajes del error
            
        }
        
    }//metodos para conectarme 
    public Connection conectar(){
        return conn;
    }
    //si quiero desconectar
    
    public void desconectar () throws Exception{
        conn.close();
        
    }
}
