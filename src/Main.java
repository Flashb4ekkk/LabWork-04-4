import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double y;
        Scanner skan = new Scanner(System.in);
        System.out.print("R = ");
        double R = skan.nextDouble();
        double x;
        System.out.print("xp = ");
        double xp = skan.nextDouble();
        System.out.print("xk = ");
        double xk = skan.nextDouble();
        System.out.print("dx = ");
        double dx = skan.nextDouble();

        DecimalFormat df2 = new DecimalFormat("0.000");

        System.out.println("------------------------");
        System.out.println("| " + String.format("%7s", "x") + " | " + String.format("%10s", "y") + " |");
        System.out.println("------------------------");

        x = xp;
        while(x <= xk) {
            if (x <= -1 - R) {
                y = x + 1 + R;
            } else {
                if (-1 - R < x && x <= -1) {
                    y = Math.abs(Math.pow(R, 2) - Math.pow(x + 1, 2));
                } else {
                    if (-1 < x && x <= 1) {
                        y = R;
                    } else {
                        if (1 < x && x <= 2) {
                            y = R + (-1 - R) / (2 - 1) * (x - 1);
                        } else {
                            y = -1;
                        }
                    }
                }
            }

            System.out.println("| " + String.format("%7s", x) + " | " + String.format("%10s", df2.format(y)) + " |");
            x += dx;
        }
        System.out.println("------------------------");
    }
}
