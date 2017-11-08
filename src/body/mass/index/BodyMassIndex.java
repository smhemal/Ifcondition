
package body.mass.index;

import java.text.DecimalFormat;//Import DecimalFormat API is needed  
import javax.swing.JOptionPane;

/**
 *@author S M H S CHANDRASENA
 */
public class BodyMassIndex {

    public static void main(String[] args) {
        String strHt;
        String strWt;
        
        strHt = JOptionPane.showInputDialog(null," Please Enter Height (m) ");
        strWt = JOptionPane.showInputDialog(null, " Please Enter Weight (Kgs) ");
        
        double ht;
        double wt;
        double bmi;
        
        ht = Double.parseDouble(strHt);
        wt = Double.parseDouble(strWt);
        
        bmi = wt/(ht*ht);
        
        String pattern = "###,###.##";
        //Pattern identify the number format   
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String format = decimalFormat.format(bmi);
        //bmi is conver to number two decimal format
       
        System.out.println(" My BMI is " + format + " Kg/m2 " );
        //print decimal format
}
}