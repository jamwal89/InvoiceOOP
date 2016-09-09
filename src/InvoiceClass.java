
public class InvoiceClass {




	private int itemNumber, itemPrice, itemQty ;
	private String description;
	
	public InvoiceClass() {
		System.out.println("This is the Invoice Application");
	}
	
	public int getitemNumber(){
		return itemNumber;
	}
	
	public void setitemNumber(int itemNumber){
		this.itemNumber=itemNumber;
	}
	
	public int getitemPrice() {
		return itemPrice;
	}
	
	public void  setitemPrice(int itemPrice) {
		this.itemPrice= itemPrice;
	}
		
	public int itemQty () {
		 return itemQty;
	}
	
	public void setItemQty(int itemQty){
		this.itemQty=itemQty;
	}
	
	public double  getTotalitemPrice (int itemQty){
	double TotalPrice= itemQty*itemPrice;
		return TotalPrice;
	}
		
	public String Description (String description){
		return itemPrice+" "+itemQty+" " +itemPrice;
		
	}
		
	}
	





	
	


