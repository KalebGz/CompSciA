public class bmr{
  public static void main (String[] args){
    
    double weight = Double.parseDouble(args[1]);
    double height = Double.parseDouble(args[2]);
    double age = Double.parseDouble(args[3]);
    String gender = args[0];
    double bmrC = ((10*weight) + (6.25 * height) - (5 * age));
    
    if (gender.equalsIgnoreCase("m")){
      bmrC +=5;
    }else if (gender.equalsIgnoreCase("f")) {
      bmrC -= 161;
    }
    System.out.println(bmrC);
  }
  
}