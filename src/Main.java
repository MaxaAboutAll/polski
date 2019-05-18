import java.util.Scanner;

public class Main
{
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        CalculateClass myCalc = new CalculateClass();
        System.out.println(myCalc.calculate(sc.nextLine()));
    }
}
