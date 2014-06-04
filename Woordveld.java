package util;


import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Woordveld{


	public static char[][] res;
	public static String[] geh;

	
	public static  void readFile(int row, int col) throws IOException{
		FileReader x = new FileReader("C:\\Users\\Marc\\Desktop\\Eclipse\\eclipse\\Algoritme en Datastructuren\\src\\util\\w.txt");
		LeesFile(x,row,col);
	}
	public static void LeesFile(FileReader x,int row, int col) throws IOException{
		Scanner input = new Scanner(System.in);
		ArrayList<String> fileList = new ArrayList<String>();

		geh = new String[row];
		Scanner scan = new Scanner(x); //scanner object that locates the file
		scan.useDelimiter("\\n");
		for(int i=0; i<geh.length; i++){

			geh[i] = (scan.nextLine());

		} 										// while loop that adds the contents so the arraylist


		VulVeld(row,col);
	}






	public static void VulVeld(int row , int col){


		res = new char[row][col];

		Vul(row,col, 0);


	}
	public static void Vul(int row, int col, int p){
		if( p == row ){
			Print(row,col);
		}
		else{
			int j=0;
			while(j< col  ){
				res[p][j] = geh[p].charAt(j);
				j++;}			
			Vul(row,col,p+1);
		}



	}
	public static void Print(int row, int col) {
		String ress = "";

		for( int i=0; i < row; i++){
			for( int j=0; j < col; j++)  
				ress = ress + "   " + String.valueOf(res[i][j]);

			ress = ress + "\n";                              // we gebruiken \n om er een matrix van te maken (enter).

		}
		System.out.println(ress);


	}
	public static void Woordmaat() throws IOException{
	//	Scanner sc = new Scanner(System.in);
		//System.out.println("aantal rijen");
		//int row = sc.nextInt();
		//Scanner cs = new Scanner(System.in);
		//System.out.println("aantal kolommen");
		//int col = cs.nextInt();
		readFile(19,15);
		
	}



	public static void main(String[] args) throws IOException  {
	Woordmaat();
		
	
	
	
	
	}
}
