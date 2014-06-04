package util;


public class WNode {
	
	private char s;
	private int xcoord;
	private int ycoord;
	private WNode p1;
	private WNode p2;
	private WNode p3;
	private WNode p4;
	private WNode p5;
	private WNode p6;
	private WNode p7;
	private WNode p8;
	
	public WNode(char r, int x, int y,WNode q1,WNode q2,WNode q3,WNode q4,WNode q5,WNode q6,WNode q7,WNode q8 ){
		s=r;
		xcoord = x;
		ycoord = y;
		p1=q1;
		p2=q2;
		p3=q3;
		p4=q4;
		p5=q5;
		p6=q6;
		p7=q7;
		p8=q8;
	}
	public int Rxcoord(){
		return xcoord ;

	}
	public int Rycoord(){
		return ycoord  ;
	}
	public char LWnode(){
	
		return s;
	}
	public void SetPosition1(WNode res){
		p1=res;
	}
	public void SetPosition2(WNode res){
		p2=res;
	}
	public void SetPosition3(WNode res){
		p3=res;
	}
	public void SetPosition4(WNode res){
		p4=res;
	}
	public void SetPosition5(WNode res){
		p5=res;
	}
	public void SetPosition6(WNode res){
		p6=res;
	}
	public void SetPosition7(WNode res){
		p7=res;
	}
	public void SetPosition8(WNode res){
		p8=res;
	}
	
	public boolean has1(){
		return p1!=null;
	}
	public boolean has2(){
		return p2!=null;
	}
	public boolean has3(){
		return p3!=null;
	}
	public boolean has4(){
		
		return p4!=null;
	}
	public boolean has5(){
		return p5!=null;
	}
	public boolean has6(){
		return p6!=null;
	}
	public boolean has7(){
		return p7!=null;
	}
	public boolean has8(){
		return p8!=null;
	}
	public WNode p1(){
		return p1;
	}
	public WNode p2(){
		return p2;
	}
	public WNode p3(){
		return p3;
	}
	public WNode p4(){
		return p4;
	}
	public WNode p5(){
		return p5;
	}
	public WNode p6(){
		return p6;
	}
	public WNode p7(){
		return p7;
	}
	public WNode p8(){
		return p8;
	}
	
	public String toString(){
		String res = "WNode("+s+","+xcoord+","+ycoord+"," + ")";
		
		return res;
		
	}
	
	public static void main(String[] args) {
		
	}

}
