package util;


public class WNode {
	
	private char s;
	private int xcoord;
	private int ycoord;

	private WNode p4;
	private WNode p6;
	
	
	public WNode(char r, int x, int y, WNode q4,WNode q6){
		s=r;															//create a Node for the tree
		xcoord = x;														// xcooordinate from the char
		ycoord = y;														// ycoordinate from the char
	
		p4=q4;															//what is right from the char
		p6=q6;															// what is below from the char
		
	}
	public int Rxcoord(){
		return xcoord ;													// return x coordinate

	}
	public int Rycoord(){
		return ycoord  ;												//return y coordinate
	}
	public char LWnode(){
	
		return s;														// return the char of the Node
	}	
	
	public void SetPosition4(WNode res){	
		p4=res;															// set Node at position 4
	}
	
	public void SetPosition6(WNode res){
		p6=res;															// set Node at position 6
	}
	
	
	
	public boolean has4(){
		
		return p4!=null;
	}
	
	public boolean has6(){
		return p6!=null;
	}
	
	public WNode p4(){
		return p4;
	}

	public WNode p6(){
		return p6;
	}
	
	
	public String toString(){
		String res = "WNode("+s+","+xcoord+","+ycoord+"," + ")";
		
		return res;
		
	}
	
	public static void main(String[] args) {
		
	}

}
