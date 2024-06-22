import java.util.Scanner;

public class CheckEqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] first = readArray(scanner), second = readArray(scanner);
        if (areEqual(first, second)) System.out.println("Yes");
        else System.out.println("No");
    }

    public static boolean areEqual(int[] first, int[] second) {
        if (first.length != second.length) return false;

        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) return false;
        }

        return true;
    }

    public static int[] readArray(Scanner scanner) {
        String[] input = scanner.nextLine().split("\\s+");
        int[] array = new int[input.length];

        for (int i = 0; i < input.length; i++)
            array[i] = Integer.parseInt(input[i]);

        return array;
    }
}
