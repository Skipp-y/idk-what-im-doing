import java.util.Scanner;

public class Assignment1B {
    public static void main(String[] args) {
        String item;
        int howmany;
        double cost;
        double totalitem1cost;

        Scanner scan = new Scanner(System.in);
        System.out.print("What're you buying? ");
        item = scan.nextLine();

        System.out.print("How many? ");
        howmany = scan.nextInt();

        System.out.print("What do they cost? ");
        cost = scan.nextDouble();

        totalitem1cost = cost * howmany;

        Scanner sc = new Scanner(System.in);
        String seconditem;
        int howmanysecond;
        double costsecond;
        double totalitem2cost;


        System.out.print("What else're you buying? ");
        seconditem = sc.nextLine();//clears buffer

        System.out.print("How many? ");
        howmanysecond = sc.nextInt();
        sc.nextLine();

        System.out.print("How much do they cost? ");
        costsecond = sc.nextDouble();

        totalitem2cost = costsecond * howmanysecond;

        double sum = totalitem1cost + totalitem2cost;

        System.out.println("Your list:");
        System.out.println("----");
        System.out.println(item + "(" + howmany + ")");
        System.out.print("$" + cost);
        System.out.println(" (total price: " + "$" + totalitem1cost + ")");
        //add second item
        System.out.println("     ");
        System.out.println(seconditem + "(" + howmanysecond + ")");
        System.out.print("$" + costsecond);
        System.out.println(" (total price: " + "$" + totalitem2cost + ")");
        System.out.println("    ");
        System.out.print("Total Cost: " + "$" + sum);
    }
}