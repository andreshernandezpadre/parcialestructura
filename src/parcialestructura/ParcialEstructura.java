
package parcialestructura;

import javax.swing.JOptionPane;

public class ParcialEstructura {
    public static void main (String []  args){
        
      
         QuizEstructura obj = new QuizEstructura();
        int i=1;
        while(i==1){
        int opc = Integer.parseInt(JOptionPane.showInputDialog(null,"PARCIAL\n"+
                                           "1. QUE ES UN COMMIT?\n"+
                                           "2. QUE ES UN PUSH?\n"+
                                           "3. QUE ES UN PULL?\n"+
                                           "4. QUE ES UNA CLASE?\n"+
                                           "5. QUE ES UN OBJETO?\n"+
                                           "6. NOMBRE\n"+
                                           "7. FECHA\n"+
                                           "8. SALIR"));
        
        
      switch(opc){
            case 1:
                obj.commit();
                break;
               
            case 2:
                obj.push();
                break;
               
            case 3:
                obj.pull();
                break;
               
            case 4:
                obj.clase();
                break;
               
            case 5:
                obj.objeto();
                break;
               
            case 6:
                obj.setNombre("Andres felipe hernandez");
                JOptionPane.showMessageDialog(null, obj.getNombre());
                break;
               
            case 7:
                obj.setFecha("Octubre 9 , 2019.");
                JOptionPane.showMessageDialog(null, obj.getFecha());
                break;
               
            case 8:
                i=0;
                JOptionPane.showMessageDialog(null, "Saliendo...");
                break;
               
            default:
                JOptionPane.showMessageDialog(null, "ingrese un valor valido");
        }
    }
    }
}