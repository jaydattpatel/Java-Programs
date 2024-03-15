/*
author: Jaydatt Patel
Switch function : It will compare values with each 'case' and if match then flow control transferred to that 'case' and execution jump out of switch using 'break'. If we not use 'break' statement then will continue to execute rest of 'case' untill it found 'break'.
*/
class Switch_1 {

    public static void main(String args[])
    {
        String ss = "fri";
        switch(ss.toLowerCase())
        {	
            case "sun":System.out.println("Sunday");break;
            case "mon":System.out.println("Monday");break;
            case "tue":System.out.println("Tuesday");break;
            case "wed":System.out.println("Wednesday");break;
            case "thur":System.out.println("Thursday");break; 
            case "fri":System.out.println("Friday");break;
            case "sat":System.out.println("Saturday");break;
            default:System.out.println("Invalid Input");break;
        }
        
    }
   
}
