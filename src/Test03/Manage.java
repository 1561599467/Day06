package Test03;

public class Manage {
    private String name;
    private String num;
    private int money1;
    private int money;

    public Manage() {
    }

    public Manage(String name, String num,int money1 ,int money) {
        this.name = name;
        this.num = num;
        this.money1 = money1;
        this.money=money;
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

    public int getMoney1() {
        return money1;
    }

    public void setMoney1(int money1) {
        this.money1 = money1;
    }
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void intro(){
        System.out.println("经理姓名:"+name);
        System.out.println("工号:"+num);
    }
    public void showSalary(){
        System.out.println("基本工资为"+money1+",奖金为"+money);
    }
    public void work(){
        System.out.println("正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }
}
