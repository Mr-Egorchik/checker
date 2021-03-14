package functions.basic;
//показательная функция
import functions.Function;

public class Exp implements Function {
    private Const base;

    public Exp(double a) {
        if (a>0 && a!=1)
            base = new Const(a);
        else
            throw new IllegalArgumentException("Недопустимое основание! (Wrong base!)");
    }
    @Override
    public double getValueAt(double x) {
        if (x == 0)
            return 1;
        if (x == 1)
            return base.getValue();
        return Math.pow(base.getValue(), x);
    }
    public String toString() {
        StringBuilder res = new StringBuilder("");
        res.append(base.toString() + "^(x)");
        return res.toString();
    }
}
