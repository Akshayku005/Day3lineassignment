package l_C_P;
public class LineComp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Line Comparsion program");

		System.out.println("Welcome to Line Comparsion program");

		int x1,x2,y1,y2,x3,y3;
		int  l1,l2;
		x1=5; y1=6;
		x2=8; y2=4;
		x3=7; y3=3;
		l1=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		l2=(int)Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
		System.out.println(l1);
		System.out.println(l2);

		Integer a=new Integer(l1);
		Integer b=new Integer(l2);
	    int compare=a.compareTo(b);

	    if(compare>0) {
	    	System.out.println("l1 is greater than y");
	    }else if(compare<0) {
	  	  System.out.println("l1 is less than y");
	    }else {
	  	  System.out.println("l1 is equal to l2");
	    }
	}
}
