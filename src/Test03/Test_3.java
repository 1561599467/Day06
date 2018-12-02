package Test03;

public class Test_3 {
    public static void main(String[] args) {
        Manage james = new Manage("James", "9527", 15000, 3000);
        james.intro();
        james.showSalary();
        james.work();
        System.out.println("=================");
        Coder kobe = new Coder("Kobe", "0025", 10000);
        kobe.intro();
        kobe.showSalary();
        kobe.work();

    }
}
