public class solutions {
    public static void main (String arg[])
    {
        String move = "DURDLDRRLL";
        System.out.println(judge (move));
    }
    public static boolean judge (String moves)
    {
        int x = 0;
        int y = 0;
        for (int i = 0; i < moves.length(); i++)
        {
            switch (moves.charAt(i)) {
                case 'R':
                    x = x + 1;
                    break;
                case 'L':
                    x = x - 1;
                    break;
                case 'U':
                    y = y + 1;
                    break;
                case 'D':
                    y = y - 1;
                    break;
            }

        }
        if (x == 0 && y == 0) {
            return true;
        }else
        {
            return false;
        }
    }

}
