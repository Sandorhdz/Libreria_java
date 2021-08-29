
package dao;

import conexion.Conexion;
import modelo.Compra;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;



public class CompraDao {
    //necesitamos una variable conexion
    
    Conexion conn;
    
    //cada vez que se cree un objeto de tipo compraDao, se le pida una conexion
    
    public CompraDao(Conexion conn){
        this.conn=conn;
    }
    //metodo para ir a guardar a la base de datos

   
    
    public boolean insertar(Compra compr){
        String sql="insert into compra values(?,?,?,?,? )";
        try{
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
            //
            ps.setInt(1,compr.getId());
            ps.setString(2,compr.getNombre_libro());
            ps.setString(3,compr.getEditorial());
            ps.setInt(4, (int) compr.getPrecio());
            ps.setString(5,compr.getFecha());
            //ejecutamos el ps
            //va a la tabla y modifica a la hora de insertar los datos y los trae...
            ps.executeUpdate();
            
            
            return true;
        }catch (Exception e){
            return false;
        }
  }      
        public List <Compra> ConsultarAll(){
            String sql ="select * from compra";
            try{
                PreparedStatement ps =conn.conectar().prepareStatement(sql);
                ResultSet rs=ps.executeQuery();
                 Compra compr;
                List<Compra> lista=new LinkedList<>();
               
            while(rs.next()){
                compr=new Compra(rs.getInt("id"));
                compr.setNombre_libro(rs.getNString("nombre_libro"));
                compr.setEditorial(rs.getString("editorial"));
                compr.setPrecio(rs.getInt("precio"));
                compr.setFecha(rs.getString("fecha"));
                lista.add(compr);
            }
            return lista;
            }catch(Exception e ){
                return null;
            }
                
            }
        
     }  

