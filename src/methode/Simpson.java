package methode;
import java.awt.*;
import javax.swing.*;
import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.ParseException;
public class Simpson {
     public String MethodeSimpson(String a1,String b1,String fx,String partition){
        
     String message=null;
     
     try{
         JEP objJEP = new JEP();
         objJEP.addStandardFunctions();
         objJEP.addStandardConstants();
         objJEP.setImplicitMul(true);
         
         objJEP.parseExpression(a1);
         double a = objJEP.getValue();
         
         objJEP.parseExpression(b1);
         double b = objJEP.getValue();
         
         int n = Integer.parseInt(partition);
         if(n%2!=0){
             throw new Exception("erreur");
         }
         double h = (b-a)/n;
         double x[] = new double[n+1];
         
         x[0] = a ;
         x[n] = b;
         
         for(int i=1;i<x.length;i++){
             
           x[i] = x[0] + (i*h);
             
         }
         
         double fxi[] = new double[n+1];
         double m = 0;
         
         for(int i=0;i<=n;i++){
           fxi[i] = objJEP.addVariable("x",x[i]);
           objJEP.parseExpression(fx);
           fxi[i] = objJEP.getValue();
           
         }
          for(int i=1;i<n;i++){
            if(n%2!=0){
             m=m+(4*fxi[i]);
         }else{
             m=m+(2*fxi[i]);
         }
         }
         m=m+fxi[0]+fxi[n];
         
         for(int i=0;i<=n;i++){
             m = m + fxi[i];
         }
         
         m = (h*m)/3;
         message = Double.toString(m);
         
     }
        
        catch(Exception e){
            
         message = "erreur";  
        }
     return message;
}
}