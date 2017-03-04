import java.util.Scanner;

public class Task2b_PrintSortedNumbers {

    public static void main(String[] args) {

        //Creating the array and setting the number of its elements ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        String str = sc.nextLine();
        int N = Integer.parseInt(str);

        int[] arr = new int[N];

        //Giving value to the elements
        for (int i = 0; i < N; i++) {
            System.out.println("enter element " + (i + 1));
            String str2 = sc.nextLine();
            int number = Integer.parseInt(str2);

            arr[i] = number;
        }

        //Sorting and printing the array simultaneously
        int minNum;
        int minNumIndex = 0;
        int temp;

        for (int h = 0; h < N; h++) {
            int count = h;
            minNum = arr[h];
            while (count < N) {
                if (arr[count] < minNum) {
                    minNum = arr[count];
                    minNumIndex = count;
                }
                count++;
            }
            temp = arr[h];
            arr[h] = minNum;
            arr[minNumIndex] = temp;
            System.out.print(arr[h] + " ");
        }

    }
}