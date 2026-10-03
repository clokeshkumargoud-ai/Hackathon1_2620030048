import java.util.Scanner;

public class EnergyGenerated {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter energy generated ");
        float energy = scr.nextInt();
        if(energy >= 10){
            System.out.println("Good energy generated");
        }
        else{
            System.out.println("Low energy generated ");
        }
        scr.close();
    }
}
