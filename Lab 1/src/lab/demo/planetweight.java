package lab.demo;
import java.util.Scanner;
public class planetweight {
	public static void main(String[] args) {
        System.out.println(" ===== How much do I weight on earth and mars? =====\n");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input weight in kilogram: ");
        double weight = sc.nextDouble();
        double mars = (weight/9.81)*3.711;
        System.out.println("\n your weight on earth is = "+ weight + (" kg while your weight on mars is =") + mars +(" kg"));
        
}
}
