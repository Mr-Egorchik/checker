package functions.basic;
//гиперболический котангенс
public class Coth extends Hyper{
    @Override
    public double getValueAt(double x) {
        return 1/Math.tanh(x);
    }

    @Override
    public String toString() {
        return "cth(x)";
    }
}
