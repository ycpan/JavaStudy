package algorithm;

class People {//父类
	static String peopleName = "people";//父类静态变量
	String peopleNoneStaticName = "people";//父类静态变量
}
class Persong extends People//子类
{
	private static String msg = "GeeksForGeeks";//子类静态变量
	void tell()//非静态方法
    {
    Student s=new Student();//在类里面创建内部静态类实例
    System.out.println(s.name1);//实例引用静态变量，出现警告：应该用静态方法引用
    System.out.println(s.name2);//实例引用非静态变量
    System.out.println(s.name3);//实例引用静态变量，出现警告：应该用静态方法引用
    System.out.println(s.name4);//实例引用父类静态变量
    Student2 s1=new Student2();//在类里面创建内部非静态类实例
    System.out.println(s1.name1);//实例引用非静态变量
    System.out.println(s1.name2);//实例引用父类静态变量
    System.out.println(peopleNoneStaticName);//在外部类中引用，父类非静态变量
    }
 static class Student//静态内部类
{
 static String name1="dafdafd";//在内部静态类中定义静态变量
  String name2="dafdafd";//在内部静态类中定义非静态变量
  static String name3 = peopleName;//在内部静态类中引用父类静态变量
  String name4 = peopleName;//在内部静态类中引用父类静态变量
  void test(){
	  System.out.println(msg);//在内部静态类中引用，外部类静态变量
	  //System.out.println(peopleNoneStaticName);//在内部静态类中引用，父类非静态数据，错误
	  //在内部静态类中，引用外部非静态类变量，会出现错误：不能在静态参数中，涉及到非静态变量。
  }
  
}
  class Student2//非静态内部类
 {
	 String  name1 = "addds";//在内部非静态类中，定义非静态变量
	 String name2=peopleName;//在内部非静态类中，引用父类静态变量
	 //在内部非静态类中，不能够定义使用静态变量：语法错误，删错标志位static
	 void test(){
		  System.out.println(msg);//在内部非静态类中引用，外部类静态变量，
		  							//或非静态变量均可
		  System.out.println(peopleNoneStaticName);//在内部非静态类中引用，父类非静态数据
	  }
 }
}
 class ExerciseOuterAndInnerClass
{
 public static void main(String args[])
 {
 
 Persong p=new Persong();//创建外部类实例
 p.tell();//实例引用
 
 System.out.println("**************");
 //在外部类外面创建静态内部类实例，不需要指向外部类的引用。
 Persong.Student s=new Persong.Student();
 System.out.println(s.name1);//实例引用
 System.out.println(s.name2);//实例引用
 
 System.out.println("**************");
 Persong st1=new Persong();//在外部类外面创建非静态内部类实例，
 Persong.Student2 s1= st1.new Student2();//需要对外部类的引用
 //另外一种，在外部类外面,创建非静态内部类实例的方法
 Persong.Student2 s3 =new Persong().new Student2();
 
 s1.test();//实例引用
 System.out.println(s1.name1);//实例引用
 System.out.println(s3.name2);//实例引用
 
 
 }
}
