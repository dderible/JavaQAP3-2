package java_qap2;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint tl = new MyPoint();
        MyPoint dr = new MyPoint(4,4);
        MyRectangle r1 = new MyRectangle(tl, dr);
        System.out.println();
        System.out.println(r1.toString());
        r1.setTL(dr);
        r1.setDR(9, 1);
        System.out.println();
        System.out.println(r1.toString());
        }
}
