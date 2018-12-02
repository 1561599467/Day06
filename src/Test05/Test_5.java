package Test05;

public class Test_5 {
    public static void main(String[] args) {
        MyDate myDate = new MyDate(1990, 1, 1);
        myDate.showDate();
        System.out.println(myDate.getYear() + "年" + myDate.isBi() + "闰年");
    }
}
