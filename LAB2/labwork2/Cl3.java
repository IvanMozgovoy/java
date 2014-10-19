package com.lab111.labwork2;

/**
 * 
 * Class which implements interface If3 and extends Cl2, consists of field of Cl1's type,
 * methods which allow to print information about class and method on console
 * 
 * @author Ivan
 * 
 * @version 1.0
 */
public class Cl3 extends Cl2 implements If3 {

    /**
     * Field of Cl1's type
     */
    public Cl1 myCl1;

	/* (non-Javadoc)
	 * @see com.lab111.labwork2.If3#meth3()
	 */
    /**
	 * Method which prints
	 * information about class and method on console
	 */

	@Override
	public void meth3() {
		System.out.println("Cl3 meth3");
		
	}

}

