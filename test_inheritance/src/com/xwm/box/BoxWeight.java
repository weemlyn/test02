package com.xwm.box;

public class BoxWeight extends Box {
	private int weight;

	public BoxWeight(int width, int height, int depth, int weight) {
		super(width, height, depth);
		this.weight = weight;
	}

	public BoxWeight(int weight) {
		super();
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void print() {
		
		System.out.println(getWidth()+" "+getHeight()+" "+getDepth()+" "+getWeight());
	}

}
