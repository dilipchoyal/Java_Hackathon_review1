import java.util.Scanner;
class WasteCollection
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vehicle Number: ");
        String vehicleNumber = sc.next();
        System.out.println("Wasted collected in kilograms: ");
        double wasteCollected = sc.nextDouble();
        System.out.println("Number of collection points: ");
        int collectionPoints = sc.nextInt();
        System.out.println("Vehicle status: " );
        char vehicleStatus = sc.next().charAt(0);
        System.out.println("Vehicle Number entered: " + vehicleNumber);
        System.out.println("Waste collected: " + wasteCollected + " kg");
        System.out.println("Collection points: " + collectionPoints);
        System.out.println("Vehicle status: " + vehicleStatus);
        sc.close();
    }
}