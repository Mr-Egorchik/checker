package functions.basic;

import functions.Function;
//арксинус
public class Asin implements Function {
    @Override
    public double getValueAt(double x) {
        return Math.asin(x);
    }

    @Override
    public String toString() {
        return "arcsin(x)";
    }
}
