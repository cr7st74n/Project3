import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         MyMethods calc = new MyMethods() ;

//        width, int length,int  height

//        Width of the rectangle
        System.out.println("Please enter the width of the Rectangle");
        int widthR = scanner.nextInt();

//        length of the rectangle
        System.out.println("Please enter the length of the Rectangle");
        int lengthR = scanner.nextInt();

//        height of the rectangle
        System.out.println("Please enter the height of the Rectangle");
        int heightR = scanner.nextInt();

         int result = calc.surface(widthR,lengthR,heightR);
        System.out.println(" The total surface area is: " +result);

//        Test N2
        System.out.println("================================================");
//        side of the triangle
        System.out.println("Please enter the side: ");
        int sideT = scanner.nextInt();

//        hypotenuse of the rectangle
        System.out.println("Please enter the hypotenuse: ");
        int hypotenuseT = scanner.nextInt();

        double TriangleSide = calc.rightTriangle(sideT, hypotenuseT);
        System.out.println("The other side is: " +TriangleSide);

//        Test 3
        System.out.println("=======================================================");
        Die test1 = new Die();
        Die test2 = new Die();

        System.out.println("Please enter color 1: ");
        String colorUser1 = scanner.next();

        System.out.println("Please enter color 2: ");
        String colorUser2 = scanner.next();

        test1.setColor(colorUser1);
        test2.setColor(colorUser2);

        String DiceValue = calc.comboDie(test1,test2);
        System.out.println("Dice color and value: " +DiceValue);
    }
}