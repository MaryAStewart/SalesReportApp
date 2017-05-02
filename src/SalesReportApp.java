/*Console
Welcome to the Sales Report Application.

Region  Q1              Q2              Q3              Q4
1       $1,540.00       $2,010.00       $2,450.00       $1,845.00
2       $1,130.00       $1,168.00       $1,847.00       $1,491.00
3       $1,580.00       $2,305.00       $2,710.00       $1,284.00
4       $1,105.00       $4,102.00       $2,391.00       $1,576.00

Sales by region:
Region 1: $7,845.00
Region 2: $5,636.00
Region 3: $7,879.00
Region 4: $9,174.00

Sales by quarter:
Q1: $5,355.00
Q2: $9,585.00
Q3: $9,398.00
Q4: $6,196.00

Total annual sales, all regions: $30,534.00

Operation
•	This application displays a four-section report of sales by quarter for a company with four sales regions (Region 1, Region 2, Region 3, and Region 4).
•	The first section of the report lists the sales by quarter for each region.
•	The second section summarizes the total annual sales by region.
•	The third section summarizes the total annual sales by quarter for all regions.
•	The fourth section prints the total annual sales for all sales regions.
Specifications
•	The quarterly sales for each region should be hard coded into the program using the numbers shown in the console output above. The sales numbers should be stored in a rectangular array.
•	The first section of the report should use nested for loops to display the sales by quarter for each region. Use tabs to line up the columns for this section of the report.
•	The second section of the report should use nested for loops to calculate the sales by region by adding up the quarterly sales for each region.
•	The third section of the report should use nested for loops to calculate the sales by quarter by adding up the individual region sales for each quarter.
•	The fourth section of the report should used nested for loops to calculate the total annual sales for the entire company.
•	Use the NumberFormat class to format the sales numbers using the currency format.
 */
import java.util.Arrays;
import java.text.NumberFormat;

public class SalesReportApp {

	public static void main(String[] args) {
		
		int totalAnnualSales = 0;
		int row = 0;
		int column = 0;
		double sumRow = 0.0;
		double sumColumn = 0.0;
		
		System.out.println("Welcome to the Sales Report App");
		System.out.println();
		
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		double [][] sales = {{1540.00,2010.00,2450.00,1845.00}, {1130.00,1168.00,1847.00,1491.00},
				             {1580.00,2305.00,2710.00,1284.00}, {1105.00,4102.00,2391.00,1576.00}};
		
		System.out.println("Region" + "\t"  + "Q1" +"\t" + "\t" + "Q2" + "\t" + "\t" + "Q3" + "\t" + "\t" + "Q4");
		
		for (int i = 0; i <sales.length; i ++){
			for (int j = 0; j < sales[i].length; j++){
				
				System.out.print((i +1)+"\t" + currency.format(sales [i][j]));//prints all sales by region & quarter
			}
			System.out.println();			
			
		}
		System.out.println();
		System.out.println("Sales by Region:");
		
		
		for(row=0;row< 4;row ++)  {
		    for( column = 0; column<4; column++)  {
		      sumRow +=  sales[row][column];
		    }
		    System.out.println("Region " + (row + 1)+ ": " + currency.format(sumRow) );//(row +1) assigns 1,2,3,4 after "Region"
		    sumRow=0;  
		}
		System.out.println();
		System.out.println("Sales by Quater:");
		
		for(column = 0; column < 4; column++){
			for(row = 0; row<4; row++){
				sumColumn += sales[row][column];
			}
			System.out.println("Q " + (column + 1) + ": " + currency.format(sumColumn));
			sumColumn =0;
		}
		
		System.out.println();
		
		for(column = 0; column < 4; column++)//by leaving the brackets off it added all the numbers together for final total
			for(row = 0; row<4; row++){
				totalAnnualSales += sales[row][column];
			}
			System.out.println("Total Annual Sales, All Regions: "   + currency.format(totalAnnualSales));
			
		

	}

}
