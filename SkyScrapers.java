import java.util.Scanner;

public class SkyScrapers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = readArray(scanner);

        boolean[] includeInResult1 = solveSimple(arr);
        print(arr, includeInResult1);

        boolean[] includeInResult2 = solveAdvanced(arr);
        print(arr, includeInResult2);
    }

    public static boolean[] solveSimple(int[] arr) {
        boolean[] includeInResult = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            boolean isSkyScraper = true;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] >= arr[i]) {
                    isSkyScraper = false;
                    break;
                }
            }

            includeInResult[i] = isSkyScraper;
        }

        return includeInResult;
    }

    public static boolean[] solveAdvanced(int[] arr) {
        boolean[] includeInResult = new boolean[arr.length];

        int max = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                includeInResult[i] = true;
            }
        }

        return includeInResult;
    }

    public static void print(int[] arr, boolean[] includeInResult) {
        for (int i = 0; i < arr.length; i++) {
            if (includeInResult[i]) System.out.printf("%d ", arr[i]);
        }

        System.out.println();
    }

    public static int[] readArray(Scanner scanner) {
        String[] input = scanner.nextLine().split("\\s+");
        int[] array = new int[input.length];

        for (int i = 0; i < input.length; i++)
            array[i] = Integer.parseInt(input[i]);

        return array;
    }
}
