package Demo;

/*
定义类:
类名字:与你描述这类事物现实中名称一样.
成员变量
成员方法
*/
public class Cat {
    //成员变量
    String name; //名字
    int age;    //年龄
    char gender;//性别
    double price;//价格
    String color;//颜色

    //成员方法
    public void catchMouse() {
        System.out.println("抓耗子");

    }

    public void shangFang() {
        System.out.println("上房");
    }

    public void eat(String food) {
        System.out.println("吃" + food);
    }
    public static void f1(){
        System.out.println("其他类");
    }
}

