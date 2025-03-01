package P5;

abstract class Bill{
    //electricity charges
    //{ 0-100 units, 101-300 units, >300 units, Fixed Charge }
    //1. Domestic Use
    final double[] domchr = {3.50,5.00,7.00,50};
    //2. Commercial Use
    final double[] comchr = {6.00,7.50,9.00,200};

    double units;
    Bill(double units){
        this.units = units;
    }
    abstract void generateBill();
}
class Domestic extends Bill{
    Domestic(double units){
        super(units);
    }
    @Override
    void generateBill(){
        double eng;
        if(units >= 0 && units <= 100){
            eng = domchr[0];
        }
        else if(units >= 101 && units <= 300){
            eng = domchr[1];
        }
        else{
            eng = domchr[2];
        }
        double totalchr = (units * eng) + domchr[3];
        System.out.println("Total Electricity Charges for Domestic Use: "+totalchr);
    }
}
class Commercial extends Bill{
    Commercial(double units){
        super(units);
    }
    @Override
    void generateBill(){
        double eng;
        if(units >= 0 && units <= 100){
            eng = comchr[0];
        }
        else if(units >= 101 && units <= 300){
            eng = comchr[1];
        }
        else{
            eng = comchr[2];
        }
        double totalchr = (units * eng) + comchr[3];
        System.out.println("Total Electricity Charges for Commercial Use: "+totalchr);
    }
}
public class Test {
    public static void main(String[] args) {
        Bill b1 = new Domestic(200);
        b1.generateBill();
        Bill b2 = new Commercial(400);
        b2.generateBill();
    }
}
