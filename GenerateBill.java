
import java.util.LinkedList;
public class GenerateBill {
	LinkedList<ItemsOnBill> items = new LinkedList<ItemsOnBill>();
	//private final float GST=12/100;
	private float total;
	//private float fianlTotal;
	public void addItem(ItemsOnBill item) throws NullPointerException {
		try{
			this.items.add(item);
		}catch (NullPointerException e) {
			throw e;
		}
	}
	public void removeItem(ItemsOnBill item){
		this.items.remove(item);
	}
	public void printBill(){
		try{
			System.out.println("\t\t\t\tHUTT     PIZZA");
			System.out.println("\t\t\t   *************************\n");
			System.out.println("\n");
			System.out.println("Type		Name				Price		quatity		total");
			System.out.println("**********************************************************");
			for(int i=0; i<items.size();i++){
				System.out.println(this.items.get(i).item.getPtype()+"	 	"+this.items.get(i).item.getName()+"		"+this.items.get(i).item.getPrice()+"		"+this.items.get(i).quantity+"		"+this.items.get(i).quantity*this.items.get(i).item.getPrice());
				this.total+=this.items.get(i).quantity*this.items.get(i).item.getPrice();
				
			}
			System.out.println("**********************************************************");
			
			System.out.println("\t\t\t\t\t\tTotal Price: "+this.total+"  Rps");
			System.out.println("\t\t\t\t\t\tTotal Price including GST(8%): "+(total+(total*8/100))+"  Rps");
			System.out.println("\n\n\t\t\t\t Thank You");

		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error While Printing bill");
		}
		
	}
	
}
