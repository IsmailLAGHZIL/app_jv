package methode;

import static java.lang.Math.abs;
import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.JEP;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

public class erreur_simpson{
    
     public String Derive(String fonction) {
        String deriv = "";
        DJep Derive = new DJep();
        Derive.addStandardFunctions();
        Derive.addStandardConstants();
        Derive.addComplex();
        Derive.setAllowUndeclared(true);
        Derive.setAllowAssignment(true);
        Derive.setImplicitMul(true);
        Derive.addStandardDiffRules();
        try {
            Node node = Derive.parse(fonction);
            Node diff = Derive.differentiate(node, "x");
            Node simp = Derive.simplify(diff);
            deriv = Derive.toString(simp);
        }catch(ParseException e) {
            e.printStackTrace();
        }   
        return deriv;
    }
     public String erreurMethodeSimpson(String a1,String b1,String fx,String partitions){
        
     String message=null;
     String df="",ddf="";
     try{
         JEP objJEP = new JEP();
         objJEP.addStandardFunctions();
         objJEP.addStandardConstants();
         objJEP.setImplicitMul(true);
         
         objJEP.parseExpression(a1);
         double a = objJEP.getValue();
         
         objJEP.parseExpression(b1);
         double b = objJEP.getValue();
         
         int n = Integer.parseInt(partitions);
         double h = (b-a)/n;
         double x[] = new double[n+1];
         
         x[0] = a + (h/2);
         x[n] = b;
         
         for(int i=1;i<x.length-1;i++){
             
           x[i] = x[0] + (i*h);
             
         }
       df=  Derive(fx);
         ddf=  Derive(df);
         double fxi[] = new double[n+1];
         
         
         for(int i=0;i<n;i++){
           fxi[i] = objJEP.addVariable("x",x[i]);
           objJEP.parseExpression(ddf);
           fxi[i] = objJEP.getValue();
           
         }
         double m = fxi[0];
         
         for(int i=0;i<n;i++){
             if(m < fxi[i]){
             m = fxi[i];
             
             }
         }
         
         double er = abs((b-a)*(b-a)*(b-a)*(b-a)*(b-a)*m)/(180*n*n*n*n);
         message = Double.toString(er);
         
     }
        
        catch(Exception e){
            
         message = "erreur";  
        }
     return message;
    }
    
}
