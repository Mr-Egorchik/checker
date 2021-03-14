package functions.basic;

import functions.Function;
//арккосинус
public class Acos implements Function {
    @Override
    public double getValueAt(double x) {
        return Math.acos(x);
    }

    @Override
    public String toString() {
        return "arccos(x)";
    }
}
