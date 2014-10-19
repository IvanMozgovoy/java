package com.lab111.labwork2;
/**
 * 
 * Class which implements interface If1, consists of field of Cl1's type,
 * methods which allow to print information about class and method on console
 * 
 * @author  Ivan
 * @version 1.0
 */
public class Cl1 implements If1 {

    /**
     * Field of Cl1's type
     */
    public Cl1 myCl1;

	/* (non-Javadoc)
	 * @see com.lab111.labwork2.If2#meth2()
	 */
    /**
	 * Method which extended from interface If2 by interface If1 It prints
	 * information about class and method on console
	 */

	@Override
	public void meth2() {
		System.out.println("Cl1 meth2");
		
	}

	/* (non-Javadoc)
	 * @see com.lab111.labwork2.If1#meth1()
	 */
	/**
	 * Method which prints
	 * information about class and method on console
	 */

	@Override
	public void meth1() {
		System.out.println("Cl1 meth1");
		
	}
    
}

