package functions.basic;
// гиперболический косинус
public class Cosh extends Hyper {
    @Override
    public double getValueAt(double x) {
        return Math.cosh(x);
    }

    @Override
    public String toString() {
        return "ch(x)";
    }
}
