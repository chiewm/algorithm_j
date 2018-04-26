package c02;

public class ex07 {
    public static String mystery(String s){
        int N = s.length();
        if (N <= 1){
            return s;
        }
        String a = s.substring(0, N/2);  //取 abcd    ab
        String b = s.substring(N/2, N);  //取 efg     fg
        System.out.println(mystery(b) + mystery(a));
        return mystery(b) + mystery(a);  //
    }

    public static void main(String[] args){
        String s = "abcdefg";
        System.out.println(mystery(s));
    }
}
