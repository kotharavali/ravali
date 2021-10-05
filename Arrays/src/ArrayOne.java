
public class ArrayOne {
	int a;
	int b;
	int c;
	
	 ArrayOne() {
		
	}
 ArrayOne(int a) {
	 this.a=a;
		
	}
 ArrayOne(int b , int c) {
	 this.b=b;
	 this.c=c;
	
}
ArrayOne(ArrayOne[] obj){
	for(int i=0;i<2;i++) {
	ArrayOne ArrayOne;
	ArrayOne=obj[i];
	System.out.println("print" +ArrayOne);
}
	
}



/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "ArrayOne [a=" + a + ", b=" + b + ", c=" + c + "]";
}
public static void main(String[] args) {
	ArrayOne obj[]=new ArrayOne[2];
	ArrayOne ob=new ArrayOne(20);
	ArrayOne obb=new ArrayOne(10,30);
	obj[0]=ob;
	obj[1]=obb;
	System.out.println(obj[0]);
	new ArrayOne(obj);
}
}

