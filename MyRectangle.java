package java_qap2;

public class MyRectangle {
    private MyPoint tl;
    private MyPoint dr;

    public MyRectangle(MyPoint tl, MyPoint dr) {
        this.tl = tl;
        this.dr = dr;
    }

    public MyPoint getTL() {
        return this.tl;
    }

    public MyPoint getDR() {
        return this.dr;
    }

    public void setTL(MyPoint tl) {
        this.tl = tl;
    }

    public void setTL(int x, int y) {
        this.tl = new MyPoint(x,y);
    }

    public void  setDR(int x,int y) {
        this.dr = new MyPoint(x,y);
    }

    public void setDR(MyPoint dr) {
        this.dr = dr;
    }

    public int getWidth() {
        return Math.abs(this.dr.getY() - this.tl.getY());
    }

    public int getHeight() {
        return Math.abs(this.dr.getX() - this.tl.getX());
    }

    public int getPerimeter() {
        return ((2*getWidth()) + (2*getHeight()));
    }

    public int getArea() {
        return (getWidth() * getHeight());
    }

    public MyPoint getTR() {
        return new MyPoint(this.dr.getX(), this.tl.getY());
    }

    public MyPoint getDL() {
        return new MyPoint(this.tl.getX(), this.dr.getY());
    }

    public String toString() {
        return "MyRectangle[topLeft = " + this.getTL() + ", topRight = " + this.getTR() + ", bottomRight = " + this.getDR() + ", bottomLeft = " + this.getDL() + "]\n"
                + "Width = " + this.getWidth() + "\n"
                + "Length = " + this.getHeight() + "\n"
                + "Area = " + this.getArea() + "\n"
                + "Perimeter = " + this.getPerimeter();
    }
}
