package com.company;

import Operations.Integral;
import functions.Function;
import functions.basic.*;
import functions.meta.*;

public class Main {

    public static void main(String[] args) {
		Function f = new Tan();
		double res = Integral.integrate(f, 0, 1);
		if (Double.isFinite(res))
			System.out.println("integrate " + f + " from 0 to 1: " + res);
		res = Integral.integrate(f, 0, Math.PI);
		if (Double.isFinite(res))
			System.out.println("integrate " + f + " from 0 to pi: " + res);
		res = Integral.integrate(f, -5, 20.3456789);
		if (Double.isFinite(res))
			System.out.println("integrate " + f + " from -5 to 20.3456789: " + res);

		double [] c = {1,0};
		double [] c1 = {-1,0};
		Function k = new Polynomial (c);
		Function k1 = new Polynomial (c1);
		Function g = new Div(new Const(1), new Sum (new Pow(new Const(Math.E), k), new Pow (new Const(Math.E), k1)));
		res = Integral.integrate(g, 0, 1);
		if (Double.isFinite(res))
			System.out.println("integrate " + g + " from 0 to 1: " + res);
		res = Integral.integrate(g, 0, Math.PI);
		if (Double.isFinite(res))
			System.out.println("integrate " + g + " from 0 to pi: " + res);
		res = Integral.integrate(g, -5, 20.3456789);
		if (Double.isFinite(res))
			System.out.println("integrate " + g + " from -5 to 20.3456789: " + res);
    }
}