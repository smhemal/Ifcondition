
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
        
        JOptionPane.showMessageDialog(null, "Welcome to BMI Calculator");
        strHt = JOptionPane.showInputDialog(null," Please Enter Height (m) ");
        strWt = JOptionPane.showInputDialog(null, " Please Enter Weight (Kgs) ");
        
        double ht;
        double wt;
        double bmi;
        
        ht = Double.parseDouble(strHt);
        wt = Double.parseDouble(strWt);
        
        bmi = wt/(ht*ht);
        
        String nf = "###.##";
        //nf=number format
        //Pattern identify the number format   
        DecimalFormat df = new DecimalFormat(nf);
        //df = decimal format
        String fbmi = df.format(bmi);
        //bmi is conver to number two decimal format
       
        System.out.println(" My BMI is " + fbmi + " Kg/m2 " );
        JOptionPane.showMessageDialog(null, "My BMI is  " + fbmi);
        //print decimal format
         
        if (bmi > 25) { 
            JOptionPane.showMessageDialog(null," You are Obese ","Alert",
                    JOptionPane.WARNING_MESSAGE);
                    } else if (bmi < 18) {  
                        JOptionPane.showMessageDialog(null," You are Under Weight ","Alert",
                    JOptionPane.WARNING_MESSAGE);} else { 
                        JOptionPane.showMessageDialog(null," You are at Average weight ","Alert",
                    JOptionPane.WARNING_MESSAGE);}
}
}