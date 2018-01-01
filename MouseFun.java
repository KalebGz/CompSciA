public class MouseFun{
  public static void main(String[] args){
    while(true){

      StdDraw.clear();
      double x = StdDraw.mouseX();
      double y = StdDraw.mouseY();
        StdDraw.circle(x,y,0.2);
      //StdDraw.pause(50);
    }
  }
}