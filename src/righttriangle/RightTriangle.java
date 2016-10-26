
package righttriangle;

import java.util.Scanner;

/**
 * @author aldic2547
 * Date: 26/10/2016
 * Purpose: To allow the user to generate a triangle using base and height, and then calculate the area.
 */


public class RightTriangle {

    //Variables
    
    static int base,height;
    
    //Deals with user input, checking to see what they want to do, and giving the user options
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        System.out.println("Please enter one of the following:\n"
                + "1:\tAllows you to set the base\n"
                + "2:\tAllows you to set the height\n"
                + "3:\tGets the base\n"
                + "4:\tGets the height\n"
                + "5:\tGets the area of the triangle\n"
                + "0:\tExits the program\n");
        do{
            input = scan.nextInt();
            if(input == 1){
                System.out.println("\nWhat would you like to set the base to?");
                input = scan.nextInt();
                setBase(input);
            }else if(input == 2){
                System.out.println("\nWhat would you like to set the height to?");
                input = scan.nextInt();
                setHeight(input);
            }else if(input == 3){
                System.out.println("\nThe base is " + getBase());
            }else if(input == 4){
                System.out.println("\nThe height is " + getHeight());
            }else if(input == 5){
                System.out.println("\nThe area is " + area(getBase(),getHeight()));
            }else if(input == 0){
                System.exit(0);
            }
        }while(true);
    }
    //Sets the base
    public static void setBase(int bse){
        base = bse;
    }
    //Sets the height
    public static void setHeight(int hght){
        height = hght;
    }
    //Gets the base
    public static int getBase(){
        return base;
    }
    //Gets the height
    public static int getHeight(){
        return height;
    }
    //Calculates the area 
    public static int area(int bse,int hght){
        int area;
        area = (bse * hght)/2;
        return area;
    }
}
