package oop1;

class Product {
	protected String name;
	protected int price, qoh;

	public Product(String name, int price, int qoh) {
		super();
		this.name = name;
		this.price = price;
		this.qoh = qoh;
	}

	public int getQoh() {
		return qoh;
	}

	public void setQoh(int qoh) {
		this.qoh = qoh;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getNetPrice() {
		return this.price;
	}
	
    public void print() {
    	System.out.println(this.name);
    	System.out.println(this.price);
    	System.out.println(this.qoh);
    }
}

class DiscountProduct extends Product  {
	protected int disRate;

	public DiscountProduct(String name, int price, int qoh, int disRate) {
		super(name, price, qoh);
		this.disRate = disRate;
	}
	
	public int getNetPrice() {
		return  this.price -  (this.price * this.disRate / 100);
	}
	
	@Override
	public void print() {
    	super.print();
    	System.out.println(this.disRate);
    }
}

class TaxProduct extends Product  {
	protected int taxRate;

	public TaxProduct(String name, int price, int qoh, int taxRate) {
		super(name, price, qoh);
		this.taxRate = taxRate;
	}
	
	public int getNetPrice() {
		return  this.price +  (this.price * this.taxRate / 100);
	}
	
	@Override
	public void print() {
    	super.print();
    	System.out.println(this.taxRate);
    }
}


public class TestProducts {
	public static void main(String[] args) {
		Product p;
		
		p = new DiscountProduct("iPad Air", 50000, 10, 20); // upcasting
		p.print();   // Runtime Polymorphism
		System.out.println(p.getNetPrice()); // Runtime Polymorphism
		
		
		p = new TaxProduct("Bose Speakers", 20000, 5, 12); // upcasting 
		p.print();// Runtime Polymorphism
		System.out.println(p.getNetPrice());
	}
}
