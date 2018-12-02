package Test03;

public class Coder {
    private String name;
    private String num;
    private int money;

    public Coder() {
    }

    public Coder(String name, String num, int money1) {
        this.name = name;
        this.num = num;
        this.money = money1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public void intro(){
        System.out.println("程序员姓名:"+name);
        System.out.println("工号:"+num);
    }
    public void showSalary(){
        System.out.println("基本工资为"+money+",奖金无");
    }
    public void work(){
        System.out.println("正在努力写代码.....");
    }
}
