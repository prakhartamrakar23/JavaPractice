package JavaPractice;
class Add{

void sum(int x,int y){
System.out.println(x+y);
}

void sum(int a ,int b,int c){
System.out.println(a+b+c);
}

void sum(double a, int b){
System.out.println(a+b);
}

void sum(int a,double b)
{
System.out.println(a+b);
}
}

class Demo12{

public static void main(String args[]){
Add obj1=new Add();
obj1.sum(10,20);
obj1.sum(10.2,20);
obj1.sum(2,3);
}
}