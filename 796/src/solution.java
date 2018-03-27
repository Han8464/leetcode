import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class solution {
    public static void main (String args[])
    {
        String A = "vcuszhlbtpmksjleuchmjffufrwpiddgyynfujnqblngzoogzg";
        String B = "fufrwpiddgyynfujnqblngzoogzgvcuszhlbtpmksjleuchmjf";
        System.out.println(rotateString(A, B));
    }
    public static boolean rotateString(String A, String B) {
        Queue<Character> newA = new LinkedList<>();
        for ( int i = 0; i < A.length(); i ++)
        {
            newA.add(A.charAt(i));
        }
        int len = 0;
        int a = 0;//表示是否已经将所有A中字符比较完毕
        int b = 0;
        while (a < A.length() * 2)
        {
            char var = newA.poll();
            if (B.charAt(b) == var)
            {
                len ++;
                if ( len == A.length())
                    return true;
                b ++;
            }else if (B.charAt(0) != var)
            {
                b = 0;
                len = 0;
            } else
            {
                b = 1;
                len = 1;
            }
            newA.add(var);
            a ++;
        }
        return false;
    }

}
