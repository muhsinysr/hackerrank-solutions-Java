import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String weid = "Weid";
        String notWeid = "Not Weid";
        int n;
        System.out.println("Write Number");
        n = input.nextInt();

        if (n % 2 == 1) {
            System.out.print(weid);
        } else if (n % 2 == 0)  {
            if (n >= 2 && n <= 5) {
                System.out.println(notWeid);
            } else if (n >= 6 && n <= 20) {
                System.out.println(weid);
            } else if (n > 20) {
                System.out.println(notWeid);
            }
            
    }

    }

    }
