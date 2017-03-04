import java.time.LocalDateTime;
import java.util.Scanner;

public class Task2a_PrintLargestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        String str = sc.nextLine();
        int N = Integer.parseInt(str);

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println("enter element " + (i + 1));
            String str2 = sc.nextLine();
            int number = Integer.parseInt(str2);

            arr[i] = number;
        }

        int maxNum = arr[0];
        for (int k = 0; k < N; k++) {
            if (arr[k] > maxNum) {
                maxNum = arr[k];
            }
        }
        System.out.println(maxNum);

    }
}
