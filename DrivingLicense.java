import java.util.Scanner;

public class DrivingLicense {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int id = scan.nextInt();
        String name = scan.next();
        int age = scan.nextInt();
        String address = scan.next();

        System.out.println("license id " + id );
        
        System.out.println("name of the person " + name);

        System.out.println("age of the person " + age);
        
        System.out.println("address " + address);
        if (age < 18)
        {
            System.out.println("Not eligble for DRIVING LICENSE");
        }
        else 
        {
            System.out.println("Eligble for DRIVING LICENSE");
        }
    }
}
