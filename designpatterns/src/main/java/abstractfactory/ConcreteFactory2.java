package abstractfactory;
class ConcreteFactory2 extends AbstractFactory{
	public AbstractProductA createProductA(){
		return new ProductA2("ProductA2");
	}
	AbstractProductB createProductB(){
		return new ProductB2("ProductB2");
	}
}