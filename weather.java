public class weather {
 public static void main(String[] args) {

double t = Double.parseDouble(args[0]);
double v = Double.parseDouble(args[1]);
double x = (0.4275* t) - 35.75 ;
double y = Math.pow ( v , .16);

double w = (35.74 + (0.6215 * t)+ (x * y));
                      

  System.out.println(w);
  


 }
 }