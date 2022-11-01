/**
 * Student Name: Daksh Sharma
 * Student Number: 041055714
 * Section: 304
 * Lab professor: Hesham Saadhvi
 * Due date: 23/09/2022
 * Description: Generating Javadoc Lab 2
 * Purpose: We have to output the result according to the lab2 instruction.
 *          In which we have to use the nested for loop to output the 2d arrays.
 *          After that we  have to find sum, of the recovered patients as given to us.
 *       
 * @author Daksh Sharma
 * @see CovidStatistics
 * @version JDK 1.8
 * @since 11.0.15
 */
public class CovidStatistics{
	/**
	 * This main method contains two fields that are Rows andColumn. 
	 * It is providing the output using the loop, by fetching the array and 2d array.
	 * @param args a ray of string that fetch data from the terminal
	 */
	public static void main(String[] args){
		final int ROWS = 7;
		final int COLUMNS = 8;
		//2D arrays
		int[][] patients = 
			{ 
					{  2200, 1100, 1200, 1000, 1015, 2000, 1092, 2204 },
					{  5020, 6105, 2009, 9047, 1016, 2014, 2708, 2308 }, 
					{  1720, 2406, 3054, 1018, 1023, 3100, 1406, 1502 }, 
					{  1490, 2002, 2016, 5008, 2044, 1055, 1607, 2201 },
					{  1520, 1007, 1092, 2065, 1023, 1010, 1046, 1502 },
					{  1670, 1201, 2008, 2001, 1086, 1009, 1041, 1706 },
					{  1870, 2001, 2078, 1006, 1053, 1702, 1009, 1406 }

			};

		String[] provinces = 
			{ 
					"Ontario", 
					"Quebec", 
					"Nova Scotia",
					"New Brunswick", 
					"Manitoba", 
					"British Columbia",
					"Prince Edward Island"         
			};

		System.out.println("              Month     Feb     March   April    May    June    July    Aug     Sept");
		System.out.println();

		/*
		 * this loop will fetch the data from the String array and 2d array.
		 * In the 2d array it will  retrieve data horizontally. Here i have use
		 * .lenght  as it is doing the same thing as ROWS and COLUMN, going
		 * through each and every index of the two arrays.
		 */
		for (int i = 0; i< provinces.length; i++) {
			//this formatting is used for string
			System.out.printf("%20s",provinces[i]);  
			for (int j=0; j<patients.length;j++) {
				//this formatting is for the numbers
				System.out.printf("%8d",patients[i][j]);
			}     System.out.println(" ");
		}

		System.out.println();
		System.out.print("  Recovered Patients");

		//this initialization will save the process time.
		int sum;				

		/*
		 * Here the nested for loop will fetch the data vertically
		 * to calculate the recovered patients.
		 */
		for (int i = 0; i< COLUMNS; i++) {
			sum =0;
			for (int j=0; j<ROWS;j++) {
				sum += patients[j][i];
			} 
			System.out.printf("%8d",sum);

		}

		System.out.println(); 
		System.out.println(); 
		System.out.println("               Vaccinate and maintain good health practices!" );
	}

}














