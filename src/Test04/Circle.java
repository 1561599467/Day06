package Test04;

public class Circle {
    int r;

    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    public double showArea(){
        double b=3.14*r*r;
        return b;
    }
    public double showPerimeter(){
        double b1=3.14*2*r;
        return b1;
    }
}
