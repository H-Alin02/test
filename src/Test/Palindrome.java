package Test;

public class Palindrome {

    public Palindrome(){

    }

    public int parolePalindrome(String stringa) {
        int parolePalindrome = 0;
        String[] stringhe = stringa.split(" ");
        for(String s : stringhe){
            if(palindroma(s))
                parolePalindrome++;
        }
        return parolePalindrome;
    }

    boolean palindroma(String s){
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }
}
