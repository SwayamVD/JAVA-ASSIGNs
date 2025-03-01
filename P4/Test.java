package P4;
class Shape {
    float d1;
    float d2;

    Shape(float d1, float d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    void calarea(){};
}

class Rec extends Shape {
    Rec(float h, float w) {
        super(h, w);
    }
    @Override
    void calarea() {
        double area = d1 * d2;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Tri extends Shape{
    Tri(float base,float hei){
        super(base,hei);
    }
    @Override
    void calarea(){
        double area = (d1*d2)/2;
        System.out.println("Area of Triangle: "+area);
    }
}

public class Test {
    public Test() {
    }

    public static void main(String[] var0) {
        Shape s1 = new Rec(10.0F, 4.0F);
        s1.calarea();
        Shape s2 = new Tri(10,3);
        s2.calarea();
    }
}
