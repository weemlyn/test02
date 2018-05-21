package com.xwm.plural;

public class Test {
	public static void main(String[] args) {
		Plural m1 = new Math(2, 2);
		Plural m2 = new Math();
		m2.setA(3);
		m2.setB(3);
		((Math) m1).add(m1.getA(), m1.getB(), m2.getA(), m2.getB());
		((Math) m1).sub(m1.getA(), m1.getB(), m2.getA(), m2.getB());
		((Math) m1).multi(m1.getA(), m1.getB(), m2.getA(), m2.getB());
		((Math) m1).div(m1.getA(), m1.getB(), m2.getA(), m2.getB());

	}

}
