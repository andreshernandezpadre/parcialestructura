
package parcialestructura;

import javax.swing.JOptionPane;

public class QuizEstructura {
    
    private int id;
    private String fecha;
    private String nombre; 
  
    
    
    
    
    
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return this. fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   //metodo comit
    public void commit (){ 
        JOptionPane.showMessageDialog(null, "jajajajaja");
    }
   
    public void push (){
        JOptionPane.showMessageDialog(null, "jejejejejje");
    }

    public void pull (){ 
        JOptionPane.showMessageDialog(null, "jijijijijiji");
    }
    
    public void clase (){   
        JOptionPane.showMessageDialog(null, "joojjojoooj");
    }
    
    public void objeto(){ 
    JOptionPane.showMessageDialog(null, "jjujujujuujuj");
    }
    
    }

