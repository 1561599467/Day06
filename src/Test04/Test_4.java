package Test04;

public class Test_4 {
    public static void main(String[] args) {
        Circle circle = new Circle(8);
        System.out.println("半径为:"+circle.getR()+",面积为:"+circle.showArea());
        System.out.println("半径为:"+circle.getR()+",周长为:"+circle.showPerimeter());
    }
}
