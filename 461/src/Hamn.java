public class Hamn {

        public static void main (String[] arg)
        {
            int x = 1,y = 4;
            System.out.println(Hamn(x, y));
        }
        public static int hamn (int x, int y)
        {
            int num = 0;
            while (x != 0 || y != 0)
            {
                if ((x & 1) != (y & 1))
                {
                    num++;
                }
                x = x >> 1;
                y = y >> 1;
            }
            return num;
        }
        public  static int Hamn (int x, int y)
        {
            int z = x ^ y;
            int num = 0;
            while (z != 0)
            {
                num += z & 1;
                z = z >> 1;
            }
            return num;
        }
    }

