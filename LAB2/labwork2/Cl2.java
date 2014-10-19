package com.lab111.labwork2;
/**
 * 
 * Class which implements interface If2, consists of field of If1's type,
 * methods which allow to print information about class and method on console
 * 
 * @author Ivan
 * @version 1.0
 */
public class Cl2 implements If2 {

    /**
     * Field of If1's type
     */
    public If1 myIf1;

	/* (non-Javadoc)
	 * @see com.lab111.labwork2.If2#meth2()
	 */
    
    /**
	 * Method which prints
	 * information about class and method on console
	 */

	@Override
	public void meth2() {
		System.out.println("Cl2 meth2");
		
	}

}

