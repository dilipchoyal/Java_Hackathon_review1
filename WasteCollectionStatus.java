import java.util.Scanner;
class WasteCollectionStatus
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the waste colletion amount in kg: ");
        double wasteAmount = sc.nextDouble();
        if(wasteAmount>=100)
        {
            System.out.println("Collection Target Achieved");
        }
        else
        {
            System.out.println("More Waste Collection Required");
        }
    }
}