package functions.basic;
//котангенс
public class Cot extends Trig{
    @Override
    public double getValueAt(double x) {
        return 1/Math.tan(x);
    }

    @Override
    public String toString() {
        return "ctg(x)";
    }
}
