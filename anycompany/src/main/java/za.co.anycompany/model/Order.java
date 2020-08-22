package za.co.anycompany.model;

import java.util.List;

public class Order {

	private Customer customer;
	private int orderNumber;
	private List<Product> purchasedProducts;
	private InputStream invoice;

	public Order() {
	}

	public Order(Customer user, int orderNumber, List<Product> purchasedProducts) {
		super();
		this.customer = user;
		this.purchasedProducts = purchasedProducts;
		this.orderNumber = orderNumber;
	}

	public InputStream getInvoice() {
		return invoice;
	}

	public void setInvoice(InputStream invoice) {
		this.invoice = invoice;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public int getOrderNumber() {
		return orderNumber;
	}
	
	public List<Product> getProduct() {
		return purchasedProducts;
	}

	public void setProduct(List<Product> purchasedProducts) {
		this.purchasedProducts = purchasedProducts;
	}

	public String toEmail() {
		return "Dear " + customer.getName() + " thank you for placing order. Your order number is " + orderNumber + ". The purchase price is " + calculateTotalCost() + "R.";
	}

	private double calculateTotalCost() {
		double cost = 0.0D;

		for (Product product : purchasedProducts) {
			cost += product.getPrice();
		}

		return cost;
	}

}
