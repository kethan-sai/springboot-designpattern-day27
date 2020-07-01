package com.shapes.adapter;

import com.shapes.Parallelogram;
import com.shapes.Shape;

public class ParallelogramAdapter implements Shape{

	private Parallelogram parallelogram;
	
	public ParallelogramAdapter(Parallelogram parallelogram) {
		this.parallelogram= parallelogram;
	}
	@Override
	public void draw(int x1, int y1, int width, int height) {
		
		parallelogram.draw(x1, y1, width, height);
		
	}

	
}
