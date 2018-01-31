package OOPs;

public class Demo {
   int x;
   int a;
   public Demo() {
	   System.out.println("Default Constructor:" +x);
   }
   public Demo(int x1) {
	   x=x1;
	   System.out.println("Default Constructor:"+x);
   }
   public Demo(int x,int a) {
	   this.a=a;
   }
   public void show() {
	   System.out.println("x="+x);
	   System.out.println("a="+a);
   }
   public void Add() {
     int res=a+x;
     System.out.println("res= "+res);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Demo obj;
     obj=new Demo();
     obj.show();
     obj=new Demo(4,99);
     obj.show();
     obj.Add();
	}

}
