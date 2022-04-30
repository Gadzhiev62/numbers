import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Multi myMulti = new Multi();
        myMulti.multiplyMinMax(sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        myMulti.multiplyMinMax(sc.nextInt(), sc.nextInt(), sc.nextInt());
        myMulti.multiplyMinMax(sc.nextShort(), sc.nextShort(), sc.nextShort());
    }
}
