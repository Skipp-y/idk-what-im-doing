import java.util.Scanner;
public class Assignment1C {

    public static void main(String[] args) { //you idiot you dont have to do all that
        //make variables for each thing
        //month has 2 with number and name(string)
        int day;
        int monthnum;
        String monthstr;
        int year;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the day (number): ");
        day = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter the month (number): ");
        monthnum = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter the month (String): ");
        monthstr = scan.nextLine();

        System.out.print("Enter the year (number): ");
        year = scan.nextInt();

        System.out.println("Here are some ways to represent the date: ");
        System.out.println(monthnum + "/" + day + "/" + year);
        System.out.println(year + "/" + day + "/" + monthnum );
        System.out.println(day + "/" + monthnum + "/" + year);
        System.out.println(monthstr + " " + day + ", " + year);
        System.out.println(day + " " + monthstr + " "+  year);










    }
}
