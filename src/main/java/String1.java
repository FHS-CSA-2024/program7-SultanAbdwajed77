package src.main.java;

public class String1 {
    public static void main(String[] args) {
        String1 s = new String1();
        System.out.println(s.helloName("Bob"));
        System.out.println(s.makeAbba("Hi", "Bye"));
        System.out.println(s.makeTags("i", "Yay"));
        System.out.println(s.makeOutWord("<<>>", "Yay"));
        System.out.println(s.extraEnd("Hello"));
        System.out.println(s.firstTwo("Hello"));
        System.out.println(s.withoutEnd("Hello"));
        System.out.println(s.comboString("hi", "Hello"));
        System.out.println(s.middleThree("Candy"));
        System.out.println(s.extraFront("Hello"));
        System.out.println(s.left2("Hello"));
        System.out.println(s.hasBad("badxx"));
        System.out.println(s.conCat("abc", "cat"));
        System.out.println(s.minCat("Hello", "Hi"));
        System.out.println(s.withoutX("xHix"));
        System.out.println(s.deFront("Hello"));
    }

    // Greeting method
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    // Make 'abba' format string
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    // HTML tag wrapper
    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    // Insert word in the middle of 'out' string
    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }

    // Repeat last two chars three times
    public String extraEnd(String str) {
        return str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2);
    }

    // Get the first two characters
    public String firstTwo(String str) {
        return str.length() < 2 ? str : str.substring(0, 2);
    }

    // Remove first and last characters
    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    // Short+long+short format
    public String comboString(String a, String b) {
        return a.length() < b.length() ? a + b + a : b + a + b;
    }

    // Middle 3 chars of odd length string
    public String middleThree(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 2);
    }

    // Repeat first 2 chars three times
    public String extraFront(String str) {
        return str.length() < 2 ? str + str + str : str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
    }

    // Rotate string left by 2 chars
    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    // Check if 'bad' is at start
    public boolean hasBad(String str) {
        return str.startsWith("bad") || str.startsWith("xbad");
    }

    // Concatenate strings but avoid double char overlap
    public String conCat(String a, String b) {
        if (a.endsWith(String.valueOf(b.charAt(0)))) {
            return a + b.substring(1);
        }
        return a + b;
    }

    // Concatenate strings but truncate longer string to shorter string length
    public String minCat(String a, String b) {
        return a.length() > b.length() ? a.substring(a.length() - b.length()) + b : a + b.substring(b.length() - a.length());
    }

    // Remove 'x' from the start or end
    public String withoutX(String str) {
        if (str.startsWith("x")) {
            str = str.substring(1);
        }
        if (str.endsWith("x")) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    // Remove first chars unless 'a' or 'b'
    public String deFront(String str) {
        if (str.length() < 2) return str;
        return (str.charAt(0) == 'a' ? "a" : "") + (str.charAt(1) == 'b' ? str.charAt(1) : "") + str.substring(2);
    }
}
