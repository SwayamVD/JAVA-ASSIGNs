package P4;
abstract class Shape {
    float d1;
    float d2;

    Shape(float var1, float var2) {
        this.d1 = var1;
        this.d2 = var2;
    }

    abstract void calarea();
}

class Rec extends Shape {
    Rec(float var1, float var2) {
        super(var1, var2);
    }

    void calarea() {
        double var1 = (double) (this.d1 * this.d2);
        System.out.println("Area of Rectangle: " + var1);
    }
}

public class Test {
    public Test() {
    }

    public static void main(String[] var0) {
        Rec var1 = new Rec(10.0F, 4.0F);
        var1.calarea();
    }
}
