package recursion;

// Implement a function that reverses a string using iteration...and then recursion!
// reverseString("yoyo mastery")
// should return: "yretsam oyoy"
public class ReverseString {

    public String reverseStringRecursive(String string) {
        System.out.println("String -> " + string);
        if (string.equals("")) {
            return "";
        }
        String s = reverseStringRecursive(string.substring(1)) + string.charAt(0);
        System.out.println(s);
        return s;
    }


    public static void main(String[] args) {
        ReverseString reverse = new ReverseString();
        System.out.println(reverse.reverseStringRecursive("yoyo mastery"));
    }
}
