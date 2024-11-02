import java.util.Scanner;

class currency {

    public static void main(String[] args) {
        System.out.println("1:Rupees ");
        System.out.println("2:Dollar");
        System.out.println("3:Euro");

        System.out.println("Enter your choice:");
        Scanner s = new Scanner(System.in);

        int choice = s.nextInt();

        System.out.println("Enter the amount:");
        int amount = s.nextInt();

        switch (choice) {
            case 1:
                from_rupee(amount);
                break;
            case 2:
                from_dollar(amount);
                break;
            case 3:
                from_euro(amount);
                break;
            default:
                System.out.println("Enter a valid choice");
        }
        
    }


    public static void from_rupee(int amount){

        System.out.println("1 Rupee : " + 0.13 + "Dollar\n");
        System.out.println("1 Rupee : " + 0.11 + "Euro\n");
        System.out.println(amount+"Rupee :" + (amount*0.13) + "Dollars\n");
        System.out.println(amount+ "Rupee : "+(amount*0.11)+ "Euro\n");

    }
    public static void from_dollar(int amount){

        System.out.println("1 Dollar : " + 80 + "Rupee\n");
        System.out.println("1 Dollar : " + 0.91 + "Euro\n");
        System.out.println(amount+"Dollar :" + (amount*80) + "Rupee\n");
        System.out.println(amount+ "Dollar : "+(amount*0.91)+ "Euro\n");
    
    }

    public static void from_euro(int amount){

        System.out.println("1 Euro : " + 1.1 + "Dollar\n");
        System.out.println("1 Euro : " + 90 + "Rupee\n");
        System.out.println(amount+"Euro :" + (amount*1.1) + "Dollars\n");
        System.out.println(amount+ "Euro : "+(amount*90)+ "Rupee\n");
    }

}