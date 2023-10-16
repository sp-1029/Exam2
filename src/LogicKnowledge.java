import java.util.Scanner;

public class LogicKnowledge {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert numbers");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        System.out.println(greenTicket(a, b, c));
        System.out.println("insert chocolate values");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        System.out.println(makeChocolate(a, b, c));
    }
    public static int greenTicket(int a, int b, int c) {
        int returnValue = 0;
        if(a == b) {
            returnValue += 10;
            if(a == c) {
                returnValue += 10;
            }
            return returnValue;
        }
        if(a == c || b == c) {
            returnValue += 10;
        }
        return returnValue;
    }

    public static int makeChocolate(int small, int large, int goal) {
        while(true) {
            if(goal >= 5 && large > 0) {
                large--;
                goal -= 5;
            }
            if(goal < 5 || large <= 0) {
                break;
            }
        }
        if(goal == 0) {
            return 0;
        }
        int smallToSell = 0;
        while(true) {
            if(goal > 0 && small > 0) {
                smallToSell++;
                goal--;
                small--;
            } else if(goal > 0) {
                return -1;
            } else {
                return smallToSell;
            }
        }
    }
}
