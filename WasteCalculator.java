import java.util.Scanner;
class WasteCalculator 
{
     public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter waste collected at  Point 1 in kilograms ");
        double point1 = sc.nextDouble();

        System.out.print("Enter waste collected at Point 2 in kilograms ");
        double point2 = sc.nextDouble();

        
        double totalWaste = calculateTotalWaste(point1, point2);

        
        System.out.println("The total waste collected from both points is: " + totalWaste + " kg");
        
        sc.close();
    }

    }
