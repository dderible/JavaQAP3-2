package java_qap2;

import java.util.Arrays;

public class TestMyLine {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(10,5);
        MyPoint p2 = new MyPoint();
        MyLine l1 = new MyLine(p1,p2);
        System.out.println(l1.toString());
        l1 = new MyLine(10,5,3,3);
        System.out.println(l1.toString());
        System.out.println(l1.getBegin());
        System.out.println(l1.getBeginX());
        System.out.println(l1.getBeginY());
        l1.setBeginX(12);
        l1.setBeginY(12);
        System.out.println(Arrays.toString(l1.getBeginXY()));
        l1.setEndXY(1,1);
        System.out.println(l1.getEnd());
        System.out.println(l1.getEndX());
        System.out.println(l1.getEndY());
        System.out.println(Arrays.toString(l1.getEndXY()));
        System.out.println(l1.getLength());
        System.out.println(l1.getGradient());
        }
}
