
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Conexion {
  Connection conexion = null;
  public Connection insertarDocente(int id, String names, String apellidopat, String apellidomat, String rfc,
                                String calle,String num,String col,String mun,String edo,String civil,
                                String tel){
      String sentenciaSQL = "insert into docentes(noEmpleado,nombre,apellidoPaterno,apellidoMaterno,rfc,calle,numero,colonia,municipio,estado,estadoCivil,telefono) values(?,?,?,?,?,?,?,?,?,?,?,?)" ;
      try{
       //Se inicia la conexión con la base de datos para prepararla. 
       Class.forName("com.mysql.cj.jdbc.Driver");
       conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoadolfo","root","password");
       //se agregan los datos del docente
       PreparedStatement sentencia = conexion.prepareStatement(sentenciaSQL);
       sentencia.setInt(1,id);
       sentencia.setString(2,names);
       sentencia.setString(3,apellidopat);
       sentencia.setString(4,apellidomat);
       sentencia.setString(5,rfc);
       sentencia.setString(6,calle);
       sentencia.setString(7,num);
       sentencia.setString(8,col);
       sentencia.setString(9,mun);
       sentencia.setString(10,edo);
       sentencia.setString(11,civil);
       sentencia.setString(12,tel);
       sentencia.executeUpdate();
       JOptionPane.showMessageDialog(null,"Registro guardado con éxito","Actividad Complementaria",JOptionPane.INFORMATION_MESSAGE);
        //Se tiene que mandar a cerrar para ahorro de recursos en producción  
       sentencia.close();
       conexion.close();
      }
      catch(ClassNotFoundException|SQLException e){
        JOptionPane.showMessageDialog(null,"Sin conexión "+e,"Actividad Complementaria",JOptionPane.ERROR_MESSAGE);
      }  
     
      return conexion;
  }
  public Connection insertarAlumno(int id, String nombres, String apellidopat,String apellidomat,
          String email, String tel, String calle, String num, String col, String mun, String edo,
          String curp,String mat, int semestreCurso, int idEspecialidad){
      String sentenciaSQL = "insert into alumnos(idAlumno,nombre,apellidoPaterno,apellidoMaterno,email,"
              + "telefono,calle,numero,colonia,municipio,estado,curp,matricula,semestreCurso,idEspecialidad)"
              + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      try{
        //Se inicia la conexión con la base de datos para prepararla. 
       Class.forName("com.mysql.cj.jdbc.Driver");
       conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoadolfo","root","password");
       //se agregan los datos del alumno
       PreparedStatement sentencia = conexion.prepareStatement(sentenciaSQL);
       sentencia.setInt(1,id);
       sentencia.setString(2,nombres);
       sentencia.setString(3,apellidopat);
       sentencia.setString(4,apellidomat);
       sentencia.setString(5,email);
       sentencia.setString(6,tel);
       sentencia.setString(7,calle);
       sentencia.setString(8,num);
       sentencia.setString(9,col);
       sentencia.setString(10,mun);
       sentencia.setString(11,edo);
       sentencia.setString(12,curp);
       sentencia.setString(13,mat);
       sentencia.setInt(14,semestreCurso);
       sentencia.setInt(15,idEspecialidad);
       sentencia.executeUpdate();
       JOptionPane.showMessageDialog(null,"Registro guardado con éxito","Actividad Complementaria",JOptionPane.INFORMATION_MESSAGE);
        //Se tiene que mandar a cerrar para ahorro de recursos en producción  
       sentencia.close();
       conexion.close();
      }
      catch(ClassNotFoundException|SQLException e){
        JOptionPane.showMessageDialog(null,"Sin conexión "+e,"Actividad Complementaria",JOptionPane.ERROR_MESSAGE);  
      }
      return conexion;
  }
  public Connection cargarTablaAlumnos(JTable tabla, String cadena){
      String [] registros = new String[4]; //se crea un arreglo de registros cuyo tamaño depende de las columnas.
      String sql = "SELECT idAlumno,nombre,apellidoPaterno,apellidoMaterno FROM alumnos WHERE CONCAT(nombre,' ',apellidoPaterno,' ',apellidoMaterno) LIKE '%"+cadena+"%'"; 
       DefaultTableModel modelo;
      String[] columnas = {"id","Nombre","Apellido Paterno","Apellido Materno"};
      modelo = new DefaultTableModel(null,columnas);  
    try{
       //Se inicia la conexión con la base de datos para prepararla. 
      Class.forName("com.mysql.cj.jdbc.Driver");
       conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoadolfo","root","password");     
      Statement st = conexion.createStatement();
      ResultSet rs = st.executeQuery(sql);
      while(rs.next()){//rs va a estar mandando datos por cada registro que salga de respuesta del SELECT
       for(int i=0;i<4;i++){ //i depende del tamaño de las columnas 
        registros[i] = rs.getString(i+1); //Aquí la base de datos deposita los registros
       
       }
        modelo.addRow(registros); //Se añaden los registros al modelo. 
      }
      tabla.setModel(modelo); //Se añaden los modelos a la tabla. 
       //Se tiene que mandar a cerrar para ahorro de recursos en producción  
       st.close();
       conexion.close();
    }
    catch(ClassNotFoundException|SQLException e){
       JOptionPane.showMessageDialog(null,"Sin conexión "+e,"Actividad Complementaria",JOptionPane.ERROR_MESSAGE); 
    }
    return conexion;  
  }
  
  public Connection actualizarRegistroAlumno(JTable tablaAlumnos,int fila, String email,String telefono,String calle,String numero,String colonia,
                            String municipio,String estado,String curp,String matricula,int semestreCurso,int idEspecialidad){
         TableModel modeloTablaAlumnos;
    modeloTablaAlumnos = tablaAlumnos.getModel();
    String idS = modeloTablaAlumnos.getValueAt(fila,0).toString();
    int id = Integer.parseInt(idS);
    String sentenciaSQL = "UPDATE alumnos SET email = ?,telefono = ?,calle = ?,numero = ?,colonia = ?,municipio = ?,estado = ?,curp = ?,matricula = ?,semestreCurso = ?, idEspecialidad = ? WHERE idAlumno = ?";                                                      
    try{
      //Se inicia la conexión con la base de datos para prepararla. 
      Class.forName("com.mysql.cj.jdbc.Driver");
       conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoadolfo","root","password");  
       PreparedStatement st = conexion.prepareStatement(sentenciaSQL);
       st.setString(1,email);
       st.setString(2,telefono);
       st.setString(3,calle);
       st.setString(4,numero);
       st.setString(5,colonia);
       st.setString(6,municipio);
       st.setString(7,estado);
       st.setString(8,curp);
       st.setString(9,matricula);
       st.setInt(10,semestreCurso);
       st.setInt(11,idEspecialidad);
       st.setInt(12,id);
       st.executeUpdate();
       JOptionPane.showMessageDialog(null,"Registro actualizado con éxito","Actividad Complementaria",JOptionPane.INFORMATION_MESSAGE);
        //Se tiene que mandar a cerrar para ahorro de recursos en producción  
       st.close();
       conexion.close();
    }
    catch(ClassNotFoundException|SQLException e){
      JOptionPane.showMessageDialog(null,"Sin conexión "+e,"Actividad Complementaria",JOptionPane.ERROR_MESSAGE);    
    }
      return conexion;
  }
  
  public Connection eliminarRegistroAlumno(JTable tablaBajasAlumnos, int fila){
    TableModel modelo;
    modelo = tablaBajasAlumnos.getModel();
    String idS = modelo.getValueAt(fila,0).toString();
    int id = Integer.parseInt(idS);
    String sentenciaEliminarAlumno = "delete from alumnos where idAlumno= "+id+" ";
    try{
      //Se inicia la conexión con la base de datos para prepararla. 
      Class.forName("com.mysql.cj.jdbc.Driver");
       conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoadolfo","root","password");  
       Statement st = conexion.createStatement();
       st.executeUpdate(sentenciaEliminarAlumno);
       JOptionPane.showMessageDialog(null,"Registro borrado con éxito","Actividad Complementaria",JOptionPane.INFORMATION_MESSAGE);
        //Se tiene que mandar a cerrar para ahorro de recursos en producción  
       st.close();
       conexion.close();
    }
    catch(ClassNotFoundException|SQLException e){
      JOptionPane.showMessageDialog(null,"Sin conexión "+e,"Actividad Complementaria",JOptionPane.ERROR_MESSAGE);    
    }
    
    
    
    return conexion;  
  }
  public Connection cargarTablaDocentes(JTable tablaDocentes, String cad){
      String [] registros = new String[4]; 
      String sql = "SELECT noEmpleado,nombre,apellidoPaterno,apellidoMaterno FROM docentes WHERE CONCAT(nombre,' ',apellidoPaterno,' ',apellidoMaterno) LIKE '%"+cad+"%'"; 
       DefaultTableModel modeloTablaDocentes;
      String[] columnas = {"id","Nombre","Apellido Paterno","Apellido Materno"};
      modeloTablaDocentes = new DefaultTableModel(null,columnas);  
    try{
       //Se inicia la conexión con la base de datos para prepararla. 
      Class.forName("com.mysql.cj.jdbc.Driver");
       conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoadolfo","root","password");     
      Statement st = conexion.createStatement();
      ResultSet rs = st.executeQuery(sql);
      while(rs.next()){
       for(int i=0;i<4;i++){
        registros[i] = rs.getString(i+1);
       
       }
        modeloTablaDocentes.addRow(registros);
      }
      tablaDocentes.setModel(modeloTablaDocentes);
       //Se tiene que mandar a cerrar para ahorro de recursos en producción  
       st.close();
       conexion.close();
    }
    catch(ClassNotFoundException|SQLException e){
       JOptionPane.showMessageDialog(null,"Sin conexión "+e,"Actividad Complementaria",JOptionPane.ERROR_MESSAGE); 
    }
    return conexion;  
  }
  public Connection actualizarDataPersonalDocente(JTable tablaDocentes, int fila, String calle, String numero, String colonia,
                                     String municipio, String estado, String estadoCivil,String telefono){
       TableModel modeloTablaDocentes;
    modeloTablaDocentes = tablaDocentes.getModel();
    String idS = modeloTablaDocentes.getValueAt(fila,0).toString();
    int id = Integer.parseInt(idS);
    String sentenciaSQL = "UPDATE docentes SET calle = ?,numero = ?,colonia = ?,municipio = ?,estado = ?,estadoCivil = ?,telefono = ? WHERE noEmpleado = ?";                                                      
    try{
      //Se inicia la conexión con la base de datos para prepararla. 
      Class.forName("com.mysql.cj.jdbc.Driver");
       conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoadolfo","root","password");  
       PreparedStatement st = conexion.prepareStatement(sentenciaSQL);
       st.setString(1,calle);
       st.setString(2,numero);
       st.setString(3,colonia);
       st.setString(4,municipio);
       st.setString(5,estado);
       st.setString(6,estadoCivil);
       st.setString(7,telefono);
       st.setInt(8,id);
       st.executeUpdate();
       JOptionPane.showMessageDialog(null,"Registro actualizado con éxito","Actividad Complementaria",JOptionPane.INFORMATION_MESSAGE);
        //Se tiene que mandar a cerrar para ahorro de recursos en producción  
       st.close();
       conexion.close();
    }
    catch(ClassNotFoundException|SQLException e){
      JOptionPane.showMessageDialog(null,"Sin conexión "+e,"Actividad Complementaria",JOptionPane.ERROR_MESSAGE);    
    }
      return conexion;
  }
  
   public Connection eliminarRegistroDocente(JTable tablaBajasDocentes, int fila){
    TableModel modeloTablaBajasDocentes;
    modeloTablaBajasDocentes = tablaBajasDocentes.getModel();
    String idS = modeloTablaBajasDocentes.getValueAt(fila,0).toString();
    int id = Integer.parseInt(idS);
    String sentenciaEliminarDocente = "delete from docentes where noEmpleado= "+id+" ";
    try{
      //Se inicia la conexión con la base de datos para prepararla. 
      Class.forName("com.mysql.cj.jdbc.Driver");
       conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoadolfo","root","password");  
       Statement st = conexion.createStatement();
       st.executeUpdate(sentenciaEliminarDocente);
       JOptionPane.showMessageDialog(null,"Registro borrado con éxito","ConexiónBD",JOptionPane.INFORMATION_MESSAGE);
        //Se tiene que mandar a cerrar para ahorro de recursos en producción  
       st.close();
       conexion.close();
    }
    catch(ClassNotFoundException|SQLException e){
      JOptionPane.showMessageDialog(null,"Sin conexión "+e,"Actividad Complementaria",JOptionPane.ERROR_MESSAGE);    
    }
    return conexion;
   }
   
   public Connection cargarTablaCalificaciones(JTable tablaCalif){
     String [] registros = new String[2]; 
       String sql = "SELECT clave,nombre FROM materias WHERE semestrePlaneado = 3 AND idEspecialidad = 1 "; 
        DefaultTableModel modeloTablaCalificaciones;
      String[] columnas = {"Clave","Nombre"};
      modeloTablaCalificaciones = new DefaultTableModel(null,columnas);  
      try{
       //Se inicia la conexión con la base de datos para prepararla. 
       Class.forName("com.mysql.cj.jdbc.Driver");
       conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoadolfo","root","password");     
      Statement st = conexion.createStatement();
      ResultSet rs = st.executeQuery(sql);   
      while(rs.next()){
       for(int i=0;i<2;i++){
        registros[i] = rs.getString(i+1);     
       }
        modeloTablaCalificaciones.addRow(registros);
      }
      tablaCalif.setModel(modeloTablaCalificaciones);
       //Se tiene que mandar a cerrar para ahorro de recursos en producción  
       st.close();
       conexion.close();
      }
      catch(ClassNotFoundException|SQLException e){
       JOptionPane.showMessageDialog(null,"Sin conexión "+e,"Actividad Complementaria",JOptionPane.ERROR_MESSAGE); 
    }
     return conexion;
   }
  
  public Connection cargarTablaBecas(JTable tablaBecas){
    String [] registros = new String[4];
    String sql = "SELECT folio,programa,vigencia,estatus FROM becas"; 
     DefaultTableModel modeloTablaBecas;
      String[] columnas = {"Folio","Programa","Vigencia","Status"};
      modeloTablaBecas = new DefaultTableModel(null,columnas);  
      try{
        //Se inicia la conexión con la base de datos para prepararla. 
       Class.forName("com.mysql.cj.jdbc.Driver");
       conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoadolfo","root","password");     
      Statement st = conexion.createStatement();
      ResultSet rs = st.executeQuery(sql);   
      while(rs.next()){
       for(int i=0;i<4;i++){
        registros[i] = rs.getString(i+1);     
       }
        modeloTablaBecas.addRow(registros);
      }
      tablaBecas.setModel(modeloTablaBecas);
       //Se tiene que mandar a cerrar para ahorro de recursos en producción  
       st.close();
       conexion.close();
      }
      catch(ClassNotFoundException|SQLException e){
       JOptionPane.showMessageDialog(null,"Sin conexión "+e,"Actividad Complementaria",JOptionPane.ERROR_MESSAGE); 
    }
    return conexion;
  }
  public Connection cargarMateriassegSemestre(JTable tablaMaterias , int semestre){
    String [] registros = new String[2]; 
       String sql = "SELECT clave,nombre FROM materias WHERE semestrePlaneado = "+semestre+" AND idEspecialidad = 1 "; 
        DefaultTableModel modeloTablaMaterias;
      String[] columnas = {"Clave","Nombre"};
      modeloTablaMaterias= new DefaultTableModel(null,columnas);  
      try{
        //Se inicia la conexión con la base de datos para prepararla. 
       Class.forName("com.mysql.cj.jdbc.Driver");
       conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoadolfo","root","password");     
      Statement st = conexion.createStatement();
      ResultSet rs = st.executeQuery(sql);   
      while(rs.next()){
       for(int i=0;i<2;i++){
        registros[i] = rs.getString(i+1);     
       }
        modeloTablaMaterias.addRow(registros);
      }
      tablaMaterias.setModel(modeloTablaMaterias);
       //Se tiene que mandar a cerrar para ahorro de recursos en producción  
       st.close();
       conexion.close();
      }
      catch(ClassNotFoundException|SQLException e){
       JOptionPane.showMessageDialog(null,"Sin conexión "+e,"Actividad Complementaria",JOptionPane.ERROR_MESSAGE); 
    }
    return conexion;
  }
  
 public Connection actualizarRegistroDocente(JTable tablaDocente,int fila,String expLaboral, String tAnterior,
         String cedula, String ultimo, int idEspecialidad ){
      TableModel modeloTablaDocentes;
    modeloTablaDocentes = tablaDocente.getModel();
    String idS = modeloTablaDocentes.getValueAt(fila,0).toString();
    int id = Integer.parseInt(idS);
    String sentenciaSQL = "UPDATE docentes SET experienciaLaboral = ?,trabajoAnterior = ?,cedulaProfesional = ?,ultimogradodeestudio = ?,idEspecialidad = ? WHERE noEmpleado = ?";                                                      
    try{
      //Se inicia la conexión con la base de datos para prepararla. 
      Class.forName("com.mysql.cj.jdbc.Driver");
       conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoadolfo","root","password");  
       PreparedStatement st = conexion.prepareStatement(sentenciaSQL);
       st.setString(1,expLaboral);
       st.setString(2,tAnterior);
       st.setString(3,cedula);
       st.setString(4,ultimo);
       st.setInt(5,idEspecialidad);
       st.setInt(6,id);
       st.executeUpdate();
       JOptionPane.showMessageDialog(null,"Registro actualizado con éxito","Actividad Complementaria",JOptionPane.INFORMATION_MESSAGE);
        //Se tiene que mandar a cerrar para ahorro de recursos en producción  
       st.close();
       conexion.close();
    }
    catch(ClassNotFoundException|SQLException e){
      JOptionPane.showMessageDialog(null,"Sin conexión "+e,"Actividad Complementaria",JOptionPane.ERROR_MESSAGE);    
    }
     return conexion;
     
 }
 

public Connection cargarBusquedaDocente(JTable tablaDocentes,int id){
    String [] registros = new String[7]; 
    String sql = "SELECT nombre,apellidoPaterno,apellidoMaterno,RFC,municipio,estado,telefono FROM docentes WHERE noEmpleado = "+id+""; 
    DefaultTableModel modeloTablaDocente;
      String[] columnas = {"Nombre","Apellido Paterno","Apellido Materno","RFC","Municipio","Estado","Telefono"};
      modeloTablaDocente = new DefaultTableModel(null,columnas);  
      try{
       //Se inicia la conexión con la base de datos para prepararla. 
       Class.forName("com.mysql.cj.jdbc.Driver");
       conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoadolfo","root","password");     
      Statement st = conexion.createStatement();
      ResultSet rs = st.executeQuery(sql);   
      while(rs.next()){
       for(int i=0;i<7;i++){
        registros[i] = rs.getString(i+1);     
       }
        modeloTablaDocente.addRow(registros);
      }
      tablaDocentes.setModel(modeloTablaDocente);
       //Se tiene que mandar a cerrar para ahorro de recursos en producción  
       st.close();
       conexion.close();
      }
      catch(ClassNotFoundException|SQLException e){
       JOptionPane.showMessageDialog(null,"Sin conexión "+e,"Actividad Complementaria",JOptionPane.ERROR_MESSAGE); 
    }
    return conexion;
}

public Connection cargarBusquedaAlumno(JTable tablaAlumnos,String cad){
     String [] registros = new String[9];//se crea un arreglo de registros cuyo tamaño depende de las columnas.
      DefaultTableModel modeloTablaAlumnos;
    String sql = "SELECT idAlumno,nombre,apellidoPaterno,apellidoMaterno,email,telefono,municipio,estado,matricula FROM alumnos WHERE CONCAT(nombre,' ',apellidoPaterno,' ',apellidoMaterno) LIKE '%"+cad+"%'"; 
    String[] columnas = {"id","Nombre","Apellido Paterno","Apellido Materno","RFC","Municipio","Estado","Telefono"};
     modeloTablaAlumnos = new DefaultTableModel(null,columnas);  
       tablaAlumnos.setModel(modeloTablaAlumnos);    
      try{
        //Se inicia la conexión con la base de datos para prepararla. 
       Class.forName("com.mysql.cj.jdbc.Driver");
       conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoadolfo","root","password");     
      Statement st = conexion.createStatement();
      ResultSet rs = st.executeQuery(sql);   
      while(rs.next()){//rs va a estar mandando datos por cada registro que salga de respuesta del SELECT
       for(int i=0;i<9;i++){//i depende del tamaño de las columnas
        registros[i] = rs.getString(i+1);  //Aquí la base de datos deposita los registros   
       }
        modeloTablaAlumnos.addRow(registros); //Se añaden los modelos a la tabla. 
      }  
      tablaAlumnos.setModel(modeloTablaAlumnos);
       //Se tiene que mandar a cerrar para ahorro de recursos en producción  
       st.close();
       conexion.close();
      }
      catch(ClassNotFoundException|SQLException e){
       JOptionPane.showMessageDialog(null,"Sin conexión "+e,"Actividad Complementaria",JOptionPane.ERROR_MESSAGE); 
    }
    return conexion;
}

public Connection cargarBusquedaPerfil(JTable tablaPerfil,int id){
    String [] registros = new String[7]; //se crea un arreglo de registros cuyo tamaño depende de las columnas.
    String sql = "SELECT nombre,apellidoPaterno,apellidoMaterno,experienciaLaboral,trabajoAnterior,cedulaProfesional,ultimogradodeestudio FROM docentes WHERE noEmpleado = "+id+""; 
    DefaultTableModel modeloTablaDocente;
      String[] columnas = {"Nombre","Apellido Paterno","Apellido Materno","Experiencia Laboral","Trabajo Anterior","Cedula Profesional","Ultimo Grado de Estudios"};
      modeloTablaDocente = new DefaultTableModel(null,columnas);  
      try{
       //se inicia la conexión
       Class.forName("com.mysql.cj.jdbc.Driver");
       conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoadolfo","root","password");     
      Statement st = conexion.createStatement();
      ResultSet rs = st.executeQuery(sql);   
      while(rs.next()){ //rs va a estar mandando datos por cada registro que salga de respuesta del SELECT
       for(int i=0;i<7;i++){ //i depende del tamaño de las columnas
        registros[i] = rs.getString(i+1); //Aquí la base de datos deposita los registros
       }
        modeloTablaDocente.addRow(registros); //Se añaden los modelos a la tabla. 
      }
      tablaPerfil.setModel(modeloTablaDocente);// se indica el modelo a cubrir por la tabla. 
      //Se tiene que mandar a cerrar para ahorro de recursos en producción  
      st.close(); 
       conexion.close();
      }
      catch(ClassNotFoundException|SQLException e){
       JOptionPane.showMessageDialog(null,"Sin conexión "+e,"Actividad Complementaria",JOptionPane.ERROR_MESSAGE); 
    }
    return conexion;
}

}
