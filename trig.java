public class trig {
 public static void main(String[] args) {

  double a = Double.parseDouble(args[0]);
  
 double x = Math.pow(Math.sin(a),2);
double z = Math.pow(Math.cos(a),2);
double sum = x+z;

  System.out.println(sum);
  


 }
 }