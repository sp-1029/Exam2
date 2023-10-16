import java.util.Arrays;
import java.util.Scanner;

public class ArrayKnowledge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        int start;
        int end;
        int step;
        int counter = 0;
        System.out.println("type in string");
        string = scanner.nextLine();
        char[] characters = stringToArray(string);
        for(int i = characters.length; i > 0; i--) {
            System.out.println(characters[counter]);
            counter++;
        }
        System.out.println("type in array information");
        start = scanner.nextInt();
        end = scanner.nextInt();
        step = scanner.nextInt();
        System.out.println(Arrays.toString(generateArrayWithBounds(start, end, step)));
    }

    public static char[] stringToArray(String string) {
        return string.toCharArray();
    }

    public static int[] generateArrayWithBounds(int start, int end, int step) {
        int[] array = new int[end];
        int count = 0;
        for(int i = start; i < end; i += step) {
            array[count] = (i);
            count++;
        }
        int[] newArray = new int[count];
        for(int i = 0; i < count; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
}
