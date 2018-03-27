import jdk.nashorn.internal.ir.ContinueNode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] arg) {
        String J = "z";
        String S = "zcdeadez";
        System.out.print(num_hash(J, S));
    }

    public static int numJewelsInStones (String J, String S) {
        int num = 0;
        char [] Jnew,Snew;
        Jnew = J.toCharArray();
        Snew = S.toCharArray();
        Arrays.sort(Jnew);
        Arrays.sort(Snew);
        int j = 0;
        int s= 0;
        while (j < Jnew.length)
        {
            if (Jnew[j] == Snew[s])
            {
                num ++;
                s ++;
                if (s == Snew.length)
                    break;
            }
            else if (Jnew[j] < Snew[s])
            {
                j ++;
            }
            else
            {
                s ++;
                if (s == Snew.length)
                    break;
            }
        }
        return num;
    }

    public static int num_hash (String J, String S)
    {
        int num = 0;
        Set<Character> jewels = new HashSet();
        for (char j:J.toCharArray())
        {
            jewels.add(j);
        }
        for (char s: S.toCharArray())
        {
            if(jewels.contains(s))
                num ++;
        }
        return num;


    }

    public static int num(String J, String S)
    {
        boolean[] pool = new boolean[256];
        int num = 0;
        for (int i = 0; i < J.length(); i++)
        {
            pool[J.charAt(i)] = true;
        }
        for (int i = 0; i < S.length(); i++)
        {
            if(pool[S.charAt(i)])
                num ++;
        }
        return num;
    }
}