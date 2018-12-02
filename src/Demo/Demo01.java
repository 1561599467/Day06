package Demo;
/*
面向过程:就是强调步骤,一步一步做事情.
面向对象:就是强调什么事物可以帮你完成事情.
================================================
  类  与  对象
  类:表示一类事物,描述某类事物,是通过事物的属性和行为来描述的
      属性:通常是名词性的描述.
      行为:通常是动词性的描述.
  对象:就是一类事物中具体的一个体现,实例(instance).

  类是对象的合集,对象是类的具体体现.
==================================================
定义类:
      属性:分析该事物的名词性信息.
      行为:分析事物的动词性功能.
格式:
     public class  类名{
          属性: 成员变量 ;
          行为: 成员方法 ;
     }
     成员变量:与你之前定义的变量 几乎是 一样 的,只不过可以不用赋值;
     成员方法:与你之前定义的方法 几乎是 一样 的,只不过不用编写static关键字;
====================================================
创建对象格式:
       数据类型   对象名    =    new   数据类型();

       数据类型:刚刚定义class的名称.
       对象名:变量名.
       new:创建,在堆中开辟空间.
       数据类型():()注意,不能丢.
 对象的使用:
        成员变量:保存一些数据
        成员方法:执行一些功能

 对象的访问:
        对象名.成员变量
        对象名.成员方法()
*/
public class Demo01 {
    public static void main(String[] args) {
        //创建对象
        Cat cat =new Cat();
        System.out.println("名字"+cat.name);
        System.out.println("年龄"+cat.age);
        System.out.println("价格"+cat.price);
        System.out.println("颜色"+cat.color);
        System.out.println("性别"+cat.gender);
        cat.name="Tom";
        cat.age=2;
        cat.price=2000;
        cat.color="灰蓝色";
        cat.gender='公';
        System.out.println("名字:"+cat.name);
        System.out.println("年龄:"+cat.age);
        System.out.println("价格:"+cat.price);
        System.out.println("颜色:"+cat.color);
        System.out.println("性别:"+cat.gender);
        cat.catchMouse();
        cat.shangFang();
        cat.eat("猫粮");
        Cat.f1();
        cat.f1();
    }
}
