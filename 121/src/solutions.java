public class solutions {
    public static void main (String [] args)
    {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }

    public static int max(int[] prices)
    {
        int max = 0;
        for (int i = 0; i < prices.length; i++)
        {
            for (int j = i + 1; j < prices.length; j++) {
                if(prices[j] - prices[i] > max) {
                    max = prices[j] - prices[i];
                }
            }
        }

        return max;
    }

    public static int maxProfit(int[] prices) {
        int i = 1;
        int tmp = 0;
        int pro = 0;
        int base = prices[0];
        while (i < prices.length)
        {
            if ((prices[i] > base))
            {
                tmp = prices[i] - base;
                if (tmp > pro)
                {
                    pro = tmp;
                }
            }else
            {
                base = prices[i];
            }
            i ++;
        }
        return pro;
    }

}
