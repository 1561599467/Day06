package phone;

public class Demo {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.pingpai="三星";
        phone.price=2000;
        phone.size=4.9;
        System.out.println("品牌:"+phone.pingpai);
        System.out.println("价格:"+phone.price);
        System.out.println("尺寸:"+phone.size);
        phone.playGame();
        phone.sendMessage();
        phone.call();
        phone.playApp();
    }
}
