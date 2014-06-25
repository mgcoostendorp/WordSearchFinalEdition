package util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Woordveld{


	public static char[][] res;										//use 2-dim array to create a field to store chars
	public static String[] geh;										//use to store the row of the text file


	public static  void readFile(int row, int col) throws IOException{
		FileReader x = new FileReader("C:\\Users\\Marc\\Desktop\\Eclipse\\eclipse\\Algoritme en Datastructuren\\src\\util\\w.txt"); // import the location of the file were the wordfield is located
		LeesFile(x,row,col);
	}
	public static void LeesFile(FileReader x,int row, int col) throws IOException{	//use to read the file
		Scanner input = new Scanner(System.in);										//create a scanner for reading the file


		geh = new String[row];														//create a String array to store the strings with lenght the numnber of rows
		Scanner scan = new Scanner(x);												 //scanner object that locates the file
		scan.useDelimiter("\\n");													// splitting the strings in the file on enters
		for(int i=0; i<geh.length; i++){											// fill the String array

			geh[i] = (scan.nextLine());

		} 										


		VulVeld(row,col);															//
	}






	public static void VulVeld(int row , int col){


		res = new char[row][col];													// create an field with the gives sizes

		Vul(row,col, 0);


	}
	public static void Vul(int row, int col, int p){
		if( p == row ){															// when you have filled all the rows print out the field
			Print(row,col);
		}
		else{
			int j=0;															// read the first place in the array and fill the first row of the field char by char
			while(j< col  ){
				res[p][j] = geh[p].charAt(j);
				j++;}			
			Vul(row,col,p+1);													// when the first row has been filled go to the next row of the field
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
	public static char[][] getArray(){
		return res;
	}
	


	public static void main(String[] args) throws IOException  {




	}
}
