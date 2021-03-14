package functions.meta;

import functions.Function;
//сумма функций
public class Sum implements Function {
    private final Function f, g;
    public Sum(Function f1, Function g1) {
        f = f1;
        g = g1;
    }
    @Override
    public double getValueAt(double x) {
        return f.getValueAt(x) + g.getValueAt(x);
    }

    @Override
    public String toString() {
        return f.toString() + " + " + g.toString();
    }

}
