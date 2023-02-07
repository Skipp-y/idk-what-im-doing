import java.util.Scanner;
public class Assignment1A {
    //Ask the user for three numbers between 0 and 255
    public static void main (String[] args){
        int red;
        int redinverted;
        int green;
        int greeninverted;
        int blue;
        int blueinverted;


        Scanner scan = new Scanner (System.in);
        System.out.print ("Enter your red value between 0-255: ");
        red = scan.nextInt(); //Number user enters
        redinverted = 255-red; //Inverted

        System.out.print ("Enter your green value between 0-255: ");
        green = scan.nextInt(); //Number user enters
        greeninverted = 255-green; //Inverted

        System.out.print("Enter your blue value between 0-255: ");
        blue = scan.nextInt(); //Number user enters
        blueinverted = 255-blue; //Inverted

        System.out.println("The inverted color is red= " + redinverted + ", green= " + greeninverted + ", blue= " + blueinverted);

        float floatred = (float) redinverted / 255;
        float floatgreen = (float) greeninverted / 255;
        float floatblue = (float) blueinverted / 255;
        //Floating point display
        System.out.printf("With floating points, that would be red=%.4f, green=%.4f, blue=%.4f", floatred, floatgreen, floatblue);
    }
}
