package algorithm;

class People {//����
	static String peopleName = "people";//���ྲ̬����
	String peopleNoneStaticName = "people";//���ྲ̬����
}
class Persong extends People//����
{
	private static String msg = "GeeksForGeeks";//���ྲ̬����
	void tell()//�Ǿ�̬����
    {
    Student s=new Student();//�������洴���ڲ���̬��ʵ��
    System.out.println(s.name1);//ʵ�����þ�̬���������־��棺Ӧ���þ�̬��������
    System.out.println(s.name2);//ʵ�����÷Ǿ�̬����
    System.out.println(s.name3);//ʵ�����þ�̬���������־��棺Ӧ���þ�̬��������
    System.out.println(s.name4);//ʵ�����ø��ྲ̬����
    Student2 s1=new Student2();//�������洴���ڲ��Ǿ�̬��ʵ��
    System.out.println(s1.name1);//ʵ�����÷Ǿ�̬����
    System.out.println(s1.name2);//ʵ�����ø��ྲ̬����
    System.out.println(peopleNoneStaticName);//���ⲿ�������ã�����Ǿ�̬����
    }
 static class Student//��̬�ڲ���
{
 static String name1="dafdafd";//���ڲ���̬���ж��徲̬����
  String name2="dafdafd";//���ڲ���̬���ж���Ǿ�̬����
  static String name3 = peopleName;//���ڲ���̬�������ø��ྲ̬����
  String name4 = peopleName;//���ڲ���̬�������ø��ྲ̬����
  void test(){
	  System.out.println(msg);//���ڲ���̬�������ã��ⲿ�ྲ̬����
	  //System.out.println(peopleNoneStaticName);//���ڲ���̬�������ã�����Ǿ�̬���ݣ�����
	  //���ڲ���̬���У������ⲿ�Ǿ�̬�����������ִ��󣺲����ھ�̬�����У��漰���Ǿ�̬������
  }
  
}
  class Student2//�Ǿ�̬�ڲ���
 {
	 String  name1 = "addds";//���ڲ��Ǿ�̬���У�����Ǿ�̬����
	 String name2=peopleName;//���ڲ��Ǿ�̬���У����ø��ྲ̬����
	 //���ڲ��Ǿ�̬���У����ܹ�����ʹ�þ�̬�������﷨����ɾ���־λstatic
	 void test(){
		  System.out.println(msg);//���ڲ��Ǿ�̬�������ã��ⲿ�ྲ̬������
		  							//��Ǿ�̬��������
		  System.out.println(peopleNoneStaticName);//���ڲ��Ǿ�̬�������ã�����Ǿ�̬����
	  }
 }
}
 class ExerciseOuterAndInnerClass
{
 public static void main(String args[])
 {
 
 Persong p=new Persong();//�����ⲿ��ʵ��
 p.tell();//ʵ������
 
 System.out.println("**************");
 //���ⲿ�����洴����̬�ڲ���ʵ��������Ҫָ���ⲿ������á�
 Persong.Student s=new Persong.Student();
 System.out.println(s.name1);//ʵ������
 System.out.println(s.name2);//ʵ������
 
 System.out.println("**************");
 Persong st1=new Persong();//���ⲿ�����洴���Ǿ�̬�ڲ���ʵ����
 Persong.Student2 s1= st1.new Student2();//��Ҫ���ⲿ�������
 //����һ�֣����ⲿ������,�����Ǿ�̬�ڲ���ʵ���ķ���
 Persong.Student2 s3 =new Persong().new Student2();
 
 s1.test();//ʵ������
 System.out.println(s1.name1);//ʵ������
 System.out.println(s3.name2);//ʵ������
 
 
 }
}
