/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dt;
import java.util.*;
import java.text.*;
/**
 *
 * @author makhanyi
 */
public class DT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
          Scanner sc = new Scanner(System.in);
      
           System.out.print("Enter date: ");
           String str = sc.nextLine();
             try {
         Date date = sdf.parse(str); 
 
         sdf = new SimpleDateFormat("EEE, d MMM yyyy");
         System.out.println("Date: " + sdf.format(date));
      } catch (ParseException e) { 
         System.out.println("Parse Exception");
      }
        
        
        
    }
    
}
