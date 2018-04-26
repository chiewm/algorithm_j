package c02;

public class ex06 {
    public static boolean isCircularRotaltion(String s, String t){
        return (s.length() == t.length()) && ((t + t).contains(s)) ;
    }

    public static void main(String[] args){
        String s = "ACTGACGHC";
        String t = "TGACGHCAC";
        System.out.println(isCircularRotaltion(s, t));
    }
}
