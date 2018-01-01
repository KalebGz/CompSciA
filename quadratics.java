public class quadratics {

 public static void main(String[] args) {

double a = Double.parseDouble(args[0]);
double b = Double.parseDouble(args[1]);
double c = Double.parseDouble(args[2]);

double nb = b * -1;
double bSquared = Math.pow(b , 2);
double indisc = (bSquared) - (4 * a * c);
double disc = Math.sqrt(indisc);
double denom = 2*a;

double ans = ((nb + disc) / denom);
double ans2 = ((nb - disc) / denom);

System.out.println("in Discriminant " + indisc);
System.out.println("Discriminant " + disc);
System.out.println("denom " + denom);
System.out.println("b^2 " + bSquared);
System.out.println(ans);
System.out.println(ans2);


 }
}