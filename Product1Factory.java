package ch02.abstractfactory;

public class Product1Factory implements IFactory {

	@Override
	public IProduct createProduct(int productNo) {
		// TODO Auto-generated method stub
		return new Product1();
	}

}
