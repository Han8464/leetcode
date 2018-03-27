public class solutions {
    public static void main (String [] args)
    {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(max(prices));

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
        int j = 1;
        int pro = 0;
        for (int i = 0; i < prices.length; i++)
        {
            if (prices[j] >= prices[i])
            {
                j++;
            }else if (findMax(prices,i,j) > pro)
            {
                pro = findMax(prices,i,j);
                i = j;
                j ++;
            }
        }
        return pro;

    }
    public static int findMax(int[] price, int a, int b)
    {
        int i = a;
        int tmp = price[0];
        int pro = 0;
        while (i < b)
        {
            if ((price[i] - tmp) > pro)
            {
                pro = price[i] - tmp;
            }
        }

        return pro;
    }
}
