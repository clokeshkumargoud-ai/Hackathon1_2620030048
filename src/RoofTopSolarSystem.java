import java.util.Scanner;

public class RoofTopSolarSystem {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter panel id :");
        int panelId = scr.nextInt();
        System.out.print("Enter Energy generated in kWh:");
        float energy =scr.nextFloat();
        System.out.print("Enter number of Solar panels :");
        int solar= scr.nextInt();
        System.out.print("Enter System status :");
        char status = scr.next().charAt(0);
        System.out.println();
        System.out.println("panel id :"+ panelId);
        System.out.println("Energy generated :"+ energy);
        System.out.println("solar panels :"+ solar);
        System.out.println("System status :"+status);
        scr.close();
    }
}
