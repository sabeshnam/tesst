
public class ItemsOnBill {
	public Item item;
	public int quantity;
	
	public ItemsOnBill(Item item, int quantity, GenerateBill bill){
		try{
			this.item=item;
			this.quantity=quantity;
			bill.addItem(this);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
