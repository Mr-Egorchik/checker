package functions.basic;
//логарифм
import functions.Function;

public class Log implements Function {
    private Const base;
    public Log(double a) {
        if (a>0 && a!=1)
            base = new Const(a);
        else
            throw new IllegalArgumentException("Недопустимое основание! (Wrong base!)");
    }

    @Override
    public double getValueAt(double x) {
        return Math.log(x)/Math.log(base.getValue());
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("");
        if (base.getValue() == Math.E)
            res.append("ln");
        else
            res.append("log_" + base.toString());
        res.append("(x)");
        return res.toString();
    }
}
