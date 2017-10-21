package ch02.abstractfactory;

/**
 * 客户真正调用的工厂接口
 * @author Aaron
 * 2017年10月15日
 */
public class ProductFactory implements IFactory {

	public IProduct createProduct(int productNo) {
		// TODO Auto-generated method stub
		IFactory factory = null;
		if(productNo==1){
			factory=new Product1Factory();
			System.out.println("生产了一个product1");
		}else if(productNo==2){
			factory=new Product2Factory();
			System.out.println("生产了一个product2");
		}else{
			System.err.println("没有该类型的产品");
		}
		
		
		if(factory!=null){
			return factory.createProduct(productNo);
		}
		
		return null;
	}
	//test方法
	public static void main(String[] args) {
		IFactory factory = new ProductFactory();
		factory.createProduct(1);
		factory.createProduct(2);
		
	}

}
