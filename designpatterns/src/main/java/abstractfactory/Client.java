package abstractfactory;
public class Client{
	public static void main(String args[]){
		AbstractFactory pf=FactoryMaker.getFactory("a");
		AbstractProductA product=pf.createProductA();
		//more function calls on product
		
		AbstractFactory pfb=FactoryMaker.getFactory("b");
		AbstractProductB productb=pfb.createProductB();
		
	}
}