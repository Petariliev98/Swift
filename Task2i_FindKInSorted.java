import java.util.Scanner;

public class Task2i_FindKInSorted {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        String str = sc.nextLine();
        int N = Integer.parseInt(str);

        int[] arr = new int[N];

        System.out.println("enter a number");
        String str2 = sc.nextLine();
        int K = Integer.parseInt(str2);

        for (int i = 0; i < N; i++) {
            System.out.println("enter element, each one bigger than previous");
            String el = sc.nextLine();
            int number = Integer.parseInt(el);

            arr[i] = number;
        }

        if (K <= arr[N / 2]) {
            for (int i = N / 2; i >= 0; i--) {
                if (K == arr[i]) {
                    System.out.println(i);
                    break;
                }
            }
        } else if (K > arr[N / 2]) {
            for (int i = N / 2; i < N; i++) {
                if (K == arr[i]) {
                    System.out.println(i);
                    break;
                }
            }
        } else {
            System.out.println("NO such element");
        }
    }
}