import java.util.Scanner;

public class TotalEnergyGenerated {

    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy){
        return morningEnergy + eveningEnergy;
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter morning energy :");
        double x = scr.nextDouble();
        System.out.println("Enter evening energy :");
        double y = scr.nextDouble();
        System.out.println(calculateTotalEnergy(x,y));
    }
}
