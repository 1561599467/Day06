package FengZhuang;

public class Father {
    private String name;
    private int age;
    private double money;


    public Father() {
    }

    public Father(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }


    //对main 提供一套get/set方法
    //获取名字get方法

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMoney() {
        return money;
    }

    //设置名字set方法

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
