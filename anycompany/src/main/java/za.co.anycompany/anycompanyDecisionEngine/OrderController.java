package za.co.anycompany;

public class OrderController {
	
	private Customer customer = new Customer();
	private Order order = new Order();
	private Product product = new Product();
	private List<Product> purchasedProducts = new ArrayList();
	private OrderService orderService = new OrderService();
	
	/**
	 * cleint details
	 */
	customer.setName("Eric");
	customer.setCountry("South Africa");
	customer.setDateOfBirth(new Date());
	order.setCustomer(customer);
	order.setOrderNumber(600000220734);
	
	/**
	 * product description
	 */
	product.setProductName("SPCC");
	product.setProductDescription("SPCC-Jean");
	purchasedProducts.add(product);
	order.setProduct(purchasedProducts);
	
	/**
	 * placing an order
	 */
	orderService.placeOrder(order,order.getOrderNumber());
}
