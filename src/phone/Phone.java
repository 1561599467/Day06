package phone;
/*
分析手机类:
        属性:品牌,价格,尺寸
        行为:打游戏,发信息,打视频电话,刷app
*/
public class Phone {
    String pingpai;
    int price;
    double size;
    public void playGame(){
        System.out.println("打游戏");
    }
    public void sendMessage(){
        System.out.println("发信息");
    }
    public void call(){
        System.out.println("打电话");
    }
    public void playApp(){
        System.out.println("刷app");
    }
}
