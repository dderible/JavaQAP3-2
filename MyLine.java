package java_qap2;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return this.begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return this.end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return this.begin.getX();
    }

    public void setBeginX(int x1) {
        this.begin.setX(x1);
    }

    public int getBeginY() {
        return this.begin.getY();
    }

    public void setBeginY(int y1) {
        this.begin.setY(y1);
    }

    public int getEndX() {
        return this.end.getX();
    }

    public void setEndX(int x2) {
        this.end.setX(x2);
    }

    public int getEndY() {
        return this.end.getY();
    }

    public void setEndY(int y2) {
        this.end.setY(y2);
    }

    public int[] getBeginXY() {
        int[] xy = new int[2];
        xy[0] = this.begin.getX();
        xy[1] = this.begin.getY();
        return xy;
    }

    public void setBeginXY(int x1, int y1) {
        this.begin.setX(x1);
        this.begin.setY(y1);
    }

    public int[] getEndXY() {
        int[] xy = new int[2];
        xy[0] = this.end.getX();
        xy[1] = this.end.getY();
        return xy;
    }

    public void setEndXY(int x2, int y2) {
        this.end.setX(x2);
        this.end.setY(y2);
    }

    public double getLength() {
        return this.begin.distance(end);
    }

    public double getGradient() {
        int xDiff = this.begin.getX() - this.end.getX();
        int yDiff = this.begin.getY() - this.end.getY();
        return Math.atan2(yDiff, xDiff);
    }

    public String toString() {
        return "MyLine[begin=" + this.begin.toString() + ",end=" + this.end.toString() + "]";
    }   
}
