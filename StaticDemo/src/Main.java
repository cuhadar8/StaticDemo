
public class Main {
	public static void main(String[] args) {
		
		ProductManager manager = new ProductManager();
		
		Product product = new Product();
		product.price = 50;
		product.name = "Mouse";
		
		manager.add(product);
		
		DataBaseHelper.Crud.delete();
	}

}
