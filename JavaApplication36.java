import java.util.Scanner;

public class Task3a_IsPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word");
        String str = sc.nextLine();

        char[] chars = str.toCharArray();

        int count = chars.length - 1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars[count]) {
                System.out.println("false");
                break;
            } else if (i == (chars.length / 2) - 1) {
                System.out.println("true");
                break;
            }
            count--;
        }
    }
}
