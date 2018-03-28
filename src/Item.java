
public class Item {
	private String ptype;
	private String name;
	private float price;
	
	public Item(String ptype,String name, float price){
		this.ptype=ptype;
		this.name=name;
		this.price=price;
	}
	
	public float getPrice(){
		return this.price;
	}
	
	public String getPtype() {
		return ptype;
	}

	public String getName(){
		return this.name;
	}
}
