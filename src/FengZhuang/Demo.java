package FengZhuang;
/*
面向对象三大特征:FengZhuang,继承,多态

封装的原则:
    1.将属性隐藏起来.
    2.若要访问某个属性,提供公共方法对其访问

步骤:
    1.将想要保护的变量,用private修饰变量,外界其他类,无法访问
      通常会先把所有的成员变量,都私有起来.
    2.提供公共方法对其访问
       get xxx/setxxx
======================================
this 关键字:表示当前对象
this.name:就是对象的name
=======================================
通过  构造方法  优化
      构造方法:
             每个类都默认的有一个构造方法,也可以有重载的构造方法
      格式:
           类名(){}    ----无参构造
           类名(参数){}----有参构造
      调用构造方法
            new 类名(){};
      作用:
          无参构造方法,给对象的成员变量,进行默认的初始化赋值
          有参构造方法,给对象的成员变量,进行指定的初始化赋值
*/
public class Demo {
    public static void main(String[] args) {
        Father father = new Father();
        father.setName("马云");
        System.out.println(father.getName());
    }

}
