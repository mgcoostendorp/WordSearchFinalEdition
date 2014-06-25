package util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Zoeken extends Woordboom {
	public static WNode pl1;
	public static WNode pl2;
	public static Set<WNode> Al;
	public static int[] xcoord;
	public static int[] ycoord;
	public static ArrayList<WNode> listp1 ;
	public static ArrayList<WNode> totaal  ;

	public static void Start(String L) throws IOException{

		listp1 = new ArrayList<WNode>();
		totaal = new ArrayList<WNode>();

		Woordboom s = new Woordboom();
		Al = new HashSet<WNode>();

		for(int x=0; x<L.length(); x++){
			if(root.has6())
				Zoekp6(root,x,L);

		}
		for(int h=0; h<L.length(); h++){
			if(root.has4())
				Zoekp4(root,h,L);
		}
		Location(L);
	}

	public static void Zoekp4(WNode R, int x,String L){
		if(R.Rxcoord() <= res[0].length){
			if(R.LWnode() == L.charAt(x)){

				Al.add(R);
			}
			if(R.has4())
				Zoekp4(R.p4(),x,L);
		}
	}
	public static void Zoekp6(WNode R, int x,String L){
		if(R.Rycoord() <= res.length){
			if(R.LWnode() == L.charAt(x)){

				Al.add(R);
			}
			if(R.has6())
				Zoekp6(R.p6(),x,L);
			if(R.has4())
				Zoekp4(R.p4(),x,L);
		}
	}
	public static void Location(String L){
		totaal = new ArrayList<WNode>(Al);
		for(int i=0; i<totaal.size(); i++){
			if(totaal.get(i).LWnode() == L.charAt(0)){

				listp1.add(totaal.get(i));

			}


		}
		ArrayList<WNode> p2 = new ArrayList<WNode>();
		p2.add(listp1.get(0));
		VindCombinatie(L,1,p2);

	}
	public static void Zoek1(String L, int x, ArrayList<WNode> p2){
		int g=0;
		for(int j=1; j<L.length(); j++){


			for(int i=0; i<totaal.size(); i++){
				if(totaal.get(i).LWnode() == L.charAt(j)){
					if(p2.get(g).Rxcoord()-1 == totaal.get(i).Rxcoord() && p2.get(g).Rycoord()+1 == totaal.get(i).Rycoord() ){ // p1
						p2.add(totaal.get(i));
						g++;
					}
				}
			}
		}
		if(p2.size() != L.length() && x<listp1.size()){

			p2 = new ArrayList<WNode>();
			p2.add(listp1.get(x));
			Zoek1(L,x+1,p2);


		}
		else if(p2.size() == L.length()){
			Check(p2,L);


		}
	}
	public static void Zoek2(String L, int x, ArrayList<WNode> p2){
		int d=0;
		for(int j=1; j<L.length(); j++){
			for(int i=0; i<totaal.size(); i++){
				if(totaal.get(i).LWnode() == L.charAt(j)){
					if(p2.get(d).Rxcoord() == totaal.get(i).Rxcoord()  && p2.get(d).Rycoord()+1 == totaal.get(i).Rycoord() ){ //p2
						p2.add(totaal.get(i));
						d++;
					}
				}
			}
		}
		if(p2.size() != L.length() && x<listp1.size()){

			p2 = new ArrayList<WNode>();
			p2.add(listp1.get(x));
			Zoek2(L,x+1,p2);


		}
		else if(p2.size() == L.length()){
			Check(p2,L);

		}
	}
	public static void Zoek3(String L, int x, ArrayList<WNode> p2){
		int h=0;
		for(int j=1; j<L.length(); j++){
			for(int i=0; i<totaal.size(); i++){
				if(totaal.get(i).LWnode() == L.charAt(j)){
					if(p2.get(h).Rxcoord()+1 == totaal.get(i).Rxcoord() && p2.get(h).Rycoord()+1 == totaal.get(i).Rycoord() ){ // 3
						p2.add(totaal.get(i));
						h++;
					}
				}
			}
		}
		if(p2.size() != L.length() && x<listp1.size()){

			p2 = new ArrayList<WNode>();
			p2.add(listp1.get(x));
			Zoek3(L,x+1,p2);


		}
		else if(p2.size() == L.length()){
			Check(p2,L);

		}
	}
	public static void Zoek4(String L, int x, ArrayList<WNode> p2){
		int a=0;
		for(int j=1; j<L.length(); j++){
			for(int i=0; i<totaal.size(); i++){
				if(totaal.get(i).LWnode() == L.charAt(j)){
					if(p2.get(a).Rxcoord()+1 == totaal.get(i).Rxcoord() && p2.get(a).Rycoord() == totaal.get(i).Rycoord()  ){ // p4
						p2.add(totaal.get(i));
						a++;
					}
				}
			}
		}
		if(p2.size() != L.length() && x<listp1.size()){

			p2 = new ArrayList<WNode>();
			p2.add(listp1.get(x));
			Zoek4(L,x+1,p2);


		}
		else if(p2.size() == L.length()){
			Check(p2,L);

		}
	}

	public static void Zoek5(String L, int x, ArrayList<WNode> p2){
		int e=0;
		for(int j=1; j<L.length(); j++){
			for(int i=0; i<totaal.size(); i++){
				if(totaal.get(i).LWnode() == L.charAt(j)){
					if(p2.get(e).Rxcoord() == totaal.get(i).Rxcoord()+1 && p2.get(e).Rycoord() == totaal.get(i).Rycoord()+1 ){ //p5
						p2.add(totaal.get(i));
						e++;
					}
				}
			}
		}

		if(p2.size() != L.length() && x<listp1.size()){

			p2 = new ArrayList<WNode>();
			p2.add(listp1.get(x));
			Zoek5(L,x+1,p2);


		}
		else if(p2.size() == L.length()){
			Check(p2,L);

		}
	}
	public static void Zoek6(String L, int x, ArrayList<WNode> p2){
		int c=0;
		for(int j=1; j<L.length(); j++){
			for(int i=0; i<totaal.size(); i++){
				if(totaal.get(i).LWnode() == L.charAt(j)){
					if(p2.get(c).Rxcoord() == totaal.get(i).Rxcoord() && p2.get(c).Rycoord() == totaal.get(i).Rycoord()+1 ){ // p6
						p2.add(totaal.get(i));
						c++;
					}
				}
			}
		}
		if(p2.size() != L.length() && x<listp1.size()){

			p2 = new ArrayList<WNode>();
			p2.add(listp1.get(x));
			Zoek6(L,x+1,p2);


		}
		else if(p2.size() == L.length()){
			Check(p2,L);

		}
	}
	public static void Zoek7(String L, int x, ArrayList<WNode> p2){
		int f=0;
		for(int j=1; j<L.length(); j++){
			for(int i=0; i<totaal.size(); i++){
				if(totaal.get(i).LWnode() == L.charAt(j)){
					if(p2.get(f).Rxcoord()+1 == totaal.get(i).Rxcoord() && p2.get(f).Rycoord()-1 == totaal.get(i).Rycoord() ){ // p7
						p2.add(totaal.get(i));
						f++;
					}
				}
			}
		}
		if(p2.size() != L.length() && x<listp1.size()){

			p2 = new ArrayList<WNode>();
			p2.add(listp1.get(x));
			Zoek7(L,x+1,p2);


		}
		else if(p2.size() == L.length()){
			Check(p2,L);

		}
	}
	public static void Zoek8(String L, int x, ArrayList<WNode> p2){
		int b=0;
		for(int j=1; j<L.length(); j++){
			for(int i=0; i<totaal.size(); i++){
				if(totaal.get(i).LWnode() == L.charAt(j)){
					if(p2.get(b).Rxcoord()-1 == totaal.get(i).Rxcoord() && p2.get(b).Rycoord() == totaal.get(i).Rycoord() ){ // p8
						p2.add(totaal.get(i));
						b++;
					}
				}
			}
		}
		if(p2.size() != L.length() && x<listp1.size()){

			p2 = new ArrayList<WNode>();
			p2.add(listp1.get(x));
			Zoek8(L,x+1,p2);


		}
		else if(p2.size() == L.length()){
			Check(p2,L);

		}
	}
	public static void VindCombinatie(String L, int x, ArrayList<WNode> p2){
		//System.out.println(p2.toString());
		if(L.length() == 1)
			Coordinaat(listp1);
		else{

			Zoek1(L,x,p2);
			Zoek2(L,x,p2);
			Zoek3(L,x,p2);
			Zoek4(L,x,p2);
			Zoek5(L,x,p2);
			Zoek6(L,x,p2);
			Zoek7(L,x,p2);
			Zoek8(L,x,p2);
		}

	}

	public static void Coordinaat(ArrayList<WNode> s){
		if(s.size()>=0){
			String string = "";
			ycoord = new int[s.size()];
			xcoord = new int[s.size()];
			for(int i=0; i<s.size(); i++){
				xcoord[i] = s.get(i).Rxcoord();
				ycoord[i] = s.get(i).Rycoord();
				string  += "(" + s.get(i).Rxcoord() + ","+ s.get(i).Rycoord() + ")";
			}
			System.out.println(string);
		}
	}

	public static void Check(ArrayList<WNode> p2, String L){
		//	int x=0;
		ArrayList<WNode> current = new ArrayList<WNode>();
		for(int x=0; x<p2.size(); x++){
			if(p2.get(x).LWnode() == L.charAt(x))
				current.add(p2.get(x));
		}

                if(current.size()==p2.size()){
		System.out.println(current.toString());
		Coordinaat(current);
		}
	}


	public static void main(String[] args) throws IOException {

	}

}
