import java.util.Scanner;

public class AdvancedPlayground {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        //Bitwise Operators
        int andR = a & b;
        int orR = a | b;
        int xorR = a ^ b;
        int leftShiftR = a << 1;

        //Ternary Operator
        int greaterNum = (a > b) ? a : b;
        String printMsg = (a == b) ? "Both are equal" : ("Larger is " + greaterNum);

        System.out.println(printMsg);
        System.out.println("a & b = " + andR);
        System.out.println("a | b = " + orR);
        System.out.println("a ^ b = " + xorR);
        System.out.println("a << 1 = "  + leftShiftR);
    }
}

