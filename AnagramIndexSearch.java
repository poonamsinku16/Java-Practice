import java.util.*;
public class AnagramIndexSearch {

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String[] dictionary = new String[n];

        for (int i = 0; i < n; i++) {
            dictionary[i] = in.next();
        }

        String target = in.next();

        int index = -1;

        for (int i = 0; i < n; i++) {
            if (isAnagram(dictionary[i], target)) {
                index = i;
                break;
            }
        }

        System.out.println(index);

        
    }
}