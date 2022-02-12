import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    
    public static double calculateHorizontalDistance(double angle, double velocity, double height) {
        double radian = Math.toRadians(angle);
        double a =velocity* (Math.sin(radian));
        double b =velocity* (Math.cos(radian));
        double g=9.8;
        return ((b/g)*(a+Math.sqrt(((a*a)+(2*g*height)))));
    }
     public static double calculateVerticalDistance(double heigh, double rebound) {
		return (heigh*((1+rebound)/(1-rebound)));    
	}
    public static void vertical(){
        double heigh;
        double rebound;
        double v_dis;
        System.out.println("enter height");
        heigh=sc.nextDouble();
        System.out.println("enter rebound ");
        rebound=sc.nextDouble();
	    if(rebound<=0 || rebound>=1){
            System.out.println("Invalid fraction");
            return;
        }
        v_dis=calculateVerticalDistance( heigh,  rebound);
        System.out.println("Distance: "+v_dis);
    }
    public static void horizontal(){
        double angle;
        double velocity;
        double height;
        double h_dis;
        System.out.println("enter angle ");
        angle=sc.nextDouble();
        System.out.println("enter velocity ");
        velocity=sc.nextDouble();
        System.out.println("enter height");
        height=sc.nextDouble();
        if(velocity<0){
            System.out.println("Invalid velocity");
            return;
        }
        if(height<=0){
            System.out.println("Invalid height");
            return;
        }
        if(angle<0 || angle>90){
            System.out.println("Invalid angle");
            return;
        }
        
        h_dis=calculateHorizontalDistance(angle,velocity,height);

        System.out.println("Distance: "+h_dis);
    }
    public static void main(String args[]) {
        System.out.println("Distance calculation type (H-Horizontal, V-Vertical):");
        String ip = sc.next();
        if(ip.equals("v")|| ip.equals("V")){
            vertical();
        }else if(ip.equals("h") || ip.equals("H")){
            horizontal();
        }else{
            return;
        }

    }
}