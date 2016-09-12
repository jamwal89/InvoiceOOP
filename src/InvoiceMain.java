import java.util.Scanner;

public class InvoiceMain {

	public static void main(String[] args) {
				double TotalPrice=0;
		
				// TODO Auto-generated method stub
				double itemPrice[]= new double [100];
				InvoiceDB db = new InvoiceDB();
				//InvoiceClass x =	new InvoiceClass();
				
				
				Scanner sc =new Scanner (System.in);
				System.out.println("Enter the Tax code");
				double tax = sc.nextDouble();
				
				
				
				
				
			
				
				int counter=0;
				
				for(int i=0;i<=5;i++){
					
				System.out.println("Do you want to Purchase");
				String ans = sc.next();
				
				if (ans.equalsIgnoreCase("Yes")) {
				System.out.println("Enter the Sku");
				String sku= sc.next();
				
				InvoiceClass b= db.getInvoice(sku);
				
				System.out.println("Enter the Quantity");
				int qty = sc.nextInt();
				b.setItemQty(qty);
				
				double  y= b.getTotalitemPrice(qty);
				
				TotalPrice= TotalPrice + y;
				
				}
				
				else if (ans.equalsIgnoreCase("no")){
				System.out.println("the total is :" + TotalPrice);
				break;
				
		
				}

		


	}
	}
	}




