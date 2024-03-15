
package Pack3;

import Pack2.*;

public class E extends C{
    public void fun(){
        System.out.println("Package-3: E");        
        System.out.println("In class E access protected C.y = " + y);
    }
}
