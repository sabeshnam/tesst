
public class BillCli {
	public static void main(String args[]){
		
		GenerateBill g=new GenerateBill();
		Item mgw=new Item("VEG","MEXICAN GREEN WAVE", 200);
		Item cnc=new Item("VEG","CHEESE N CORN    ", 150);
		Item cd = new Item("NON VEG","CHICKEN DOMINATOR", 250);
		Item ppc= new Item("NON VEG","PERI-PERI CHICKEN", 300);
		new ItemsOnBill(mgw, 2, g);
		new ItemsOnBill(cnc, 2, g);
		new ItemsOnBill(cd, 5, g);
		new ItemsOnBill(ppc,1, g);
		g.printBill();


		   }
			
		
		
		
	}

