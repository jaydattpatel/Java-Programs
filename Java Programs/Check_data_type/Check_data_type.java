
class Check_data_type{
    
    public static void main(String args[]) {  

        int intData = 15;         
        float floatData = 20.5f;  
        char charData = 'X';
        
        Integer integerData = 25;         
        Double doubleData = 35.5; 
        String str = "Hello";
          
        // show datatypes of variables by using getClass() and getSimpleName() methods  
        System.out.println(intData + " is of type " + ((Object)intData).getClass().getSimpleName());         
        System.out.println(floatData + " is of type " + ((Object)floatData).getClass().getSimpleName());  
        System.out.println(charData + " is of type " + ((Object)charData).getClass().getSimpleName());  
        System.out.println(integerData + " is of type " + integerData.getClass().getSimpleName());         
        System.out.println(doubleData + " is of type " + doubleData.getClass().getSimpleName()); 
        System.out.println(str + " is of type " + str.getClass().getSimpleName());  
    }  
}