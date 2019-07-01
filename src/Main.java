public class Main {

    public static void main(String[] args) {

        System.out.println("VALUE  : " + isPalindrome("abc"));

    }

    static boolean isPalindrome(String string) {

        //even and uneven chars num string requires string.length()/2 checks,when string.length() is int

        System.out.println("////////////////////");

        int i, j;

        for (i = 0, j = string.length() - 1; i < string.length() / 2; i++, j--) {

            System.out.println("     ");
            System.out.println("for : i " + i);
            System.out.println("for : j " + j);
            System.out.println("     ");


            if (string.charAt(i) != string.charAt(j)) {
                System.out.println("////////////////////");
                return false;
            }
        }

        System.out.println("////////////////////");

        return true;
    }

}