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
				
				String myArray[]= new String [10];
				int myItem[]= new int [10];
				int myQty[] = new int [10];
				
				
			
				
				int counter=0;
				
				for(int i=0;i<=5;i++){
					
				System.out.println("Do you want to Purchase");
				String ans = sc.next();
				
				if (ans.equalsIgnoreCase("Yes")) {
				System.out.println("Enter the Sku");
				String sku= sc.next();
				myArray[i]=sku;
				
				InvoiceClass b= db.getInvoice(sku);
				System.out.println("Enter the Quantity");
				int qty = sc.nextInt();
				b.setItemQty(qty);
				System.out.println("The sku " + "The itemnumber  " +"The quantity");
				System.out.println(sku + "       "+b.getitemNumber()+ "      "+  b.itemQty());				
				
				myArray[i]=sku;
				myItem[i]=b.getitemNumber();
				myQty[i]=b.itemQty();
				
				
				
				double  y= b.getTotalitemPrice(qty);
				
				TotalPrice= TotalPrice + y;
				
				counter++;
				}
				
				else if (ans.equalsIgnoreCase("no")){
					System.out.println("sku " + " itemnumber  " +" quantity");
					for(int j=0; j<counter;j++) {
						
						System.out.println(myArray[j]+"\t" + myItem[j]+"\t" + myQty[j]);
					}
				
				System.out.println("the total is :" + TotalPrice);
				System.out.println("The tax code is: " + tax);
				System.out.println("The Grandtotal is: " + (TotalPrice+TotalPrice*tax));
				break;
				
		
				}

		


	}
	}
	}




