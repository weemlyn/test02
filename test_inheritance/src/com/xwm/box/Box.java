package com.xwm.box;

public class Box {
	private int width;
	private int height;
	private int depth;

	public Box() {
		width = 1;
		height = 1;
		depth = 1;
		System.out.println("I am aBox.");
	}

	public Box(int width, int height, int depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public void print() {

		System.out.println(getWidth() + " " + getHeight() + " " + getDepth() );
	}

}
