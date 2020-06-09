import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

/**
 * 
 */

/**
 * @author Pro Bono
 *
 * 
 */
interface A{
	A print1();
}
interface B{
	void print();
}
interface C extends A, B{

}

abstract class abs{
	 abstract void print();
}
public class AB extends abs{
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		
	}

}
