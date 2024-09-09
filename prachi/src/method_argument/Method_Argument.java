package method_argument;

public class Method_Argument {
int a;
String b;
float c;
int d;
int e;
public void number(int u) {
 a=u;
	System.out.println(u);
}
public void value(int v,int w) {
	d=v;
	e=w;
	System.out.println(v*w);
	System.out.println(v+w);
	System.out.println(v);
	System.out.println(w);
}
public void data(String x,Float y) {
	b=x;
	c=y;
	System.out.println(x);
	System.out.println(y);
			
}
	public static void main(String[] args) {
		Method_Argument ag=new Method_Argument ();
		ag.number(5);
		ag.value(5, 4);
		ag.data("Stp", 27.87f);

	}

}
