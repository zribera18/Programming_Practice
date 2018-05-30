package Interview;

public class StringReverse {
    public static String stringReverse(String a){
        char[] x = a.toCharArray();
        String tmp = "";

        for (int i = a.length() - 1; i >= 0; i--){
            tmp += x[i];
        }
        return tmp;
    }

    public static boolean palindromeChecker(String a){
        String reverse = stringReverse(a);

        if ( a.equals(reverse) ) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args){
        System.out.println(stringReverse("Hello"));
        System.out.println(palindromeChecker("mom"));
    }
}
