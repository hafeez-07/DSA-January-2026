
public class ReverseString {

    public static void reverseString(char s[]) {
        StringBuilder sb = new StringBuilder();
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        for (char x : s) {
            sb.append(x).append(" ");
        }
        System.out.print(sb.toString());

    }

    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);

    }
}
