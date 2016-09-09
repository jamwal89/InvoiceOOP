
public class InvoiceDB {
	
	public InvoiceClass getInvoice(String sku){
		
		InvoiceClass ab = new InvoiceClass();
		
	if(sku.equalsIgnoreCase("JAVA1001")){
		ab.setitemNumber(102364);
		ab.setitemPrice(75);
					
		}
		else if(sku.equalsIgnoreCase("JAVA1002")) {
			ab.setitemNumber(102569);
			ab.setitemPrice(85);
			
		}
		else if(sku.equalsIgnoreCase("JAVA1003")) {
			ab.setitemNumber(102580);
			ab.setitemPrice(105);
			
		}
		return ab;
	}
}


