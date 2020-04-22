/**
 * 
 */
package son_package;

import father_package.father;

/**
 * @author Pro Bono
 *
 * 
 */
public class son extends father{
	
	public void print() {
		System.out.println("son.print()");
	}

	public void someMethod() {
		this.print();
		super.print();
	}
}
