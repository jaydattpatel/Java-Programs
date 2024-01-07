/*
author: Jaydatt Patel
Generic function, we define flexible datatype place holder within function. 
We can not pass premitive datatype like int,char,float in this method.
 */
class Gen1{
    public Integer id;    
    public String name;

}
public class Generic_function {
    
        static <T> void genericDisplay(T element)
            {
              
                    System.out.println(element.getClass().getName()
                                + " = " + element);
            }
    
        public static void main (String[] args)
            {
                genericDisplay(11);
                genericDisplay("JAVA Programming");
                genericDisplay(1.0);
                Gen1 gen = new Gen1();
                genericDisplay(gen);

            }
    }
    
