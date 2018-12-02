package Test06;

public class Test_6 {
    public static void main(String[] args) {
        Cat cat1 = new Cat(5, '黑');
        cat1.showMsg();
        Cat cat2 = new Cat(5, '白');
        cat2.showMsg();
        boolean b1=biJiao(cat1,cat2);
        System.out.println("属性相同?"+b1);
        System.out.println("*******************");
        Cat cat3 = new Cat(3, '黄');
        cat3.showMsg();
        Cat cat4 = new Cat(3, '黄');
        cat4.showMsg();
        boolean b2=biJiao(cat3,cat4);
        System.out.println("属性相同?"+b2);

    }
    public static boolean biJiao(Cat cat1,Cat cat2){
        if (cat1.getAge()!=cat2.getAge()) {
            return false;
        } else if (cat1.getColor()!=cat2.getColor()) {
            return false;
        }else{
            return true;
        }
    }
}
