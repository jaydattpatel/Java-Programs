/*
author: Jaydatt Patel
Switch function : It will compare values with each 'case' and if match then flow control transferred to that 'case' and execution jump out of switch using 'break'. If we not use 'break' statement then will continue to execute rest of 'case' untill it found 'break'.
*/
class nobreak {

    public static void main(String args[])
    {
        int i = 0;
        for(i = 0; i<12 ; i++)
        {
            switch(i)
            {
                case 0: System.out.println(i+" Case 0");
                case 1: System.out.println(i+" Case 1");
                case 2: System.out.println(i+" Case 2");
                case 3: System.out.println(i+" Case 3");
                case 4: System.out.println(i+" i is less then 5\n"); break;
                case 5: System.out.println(i+" Case 5");
                case 6: System.out.println(i+" Case 6");
                case 7: System.out.println(i+" Case 7");
                case 8: System.out.println(i+" Case 8");
                case 9: System.out.println(i+" i  is less then 10\n"); break;
                default: System.out.println(i+" i  is more then 10\n"); break;

            }
        }
    }
   
}
