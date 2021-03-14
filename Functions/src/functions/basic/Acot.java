package functions.basic;

import functions.Function;
//арккотангенс
public class Acot implements Function {
    @Override
    public double getValueAt(double x) {
        return Math.PI - Math.atan(x);
    }

    @Override
    public String toString() {
        return "arcctg(x)";
    }
}
