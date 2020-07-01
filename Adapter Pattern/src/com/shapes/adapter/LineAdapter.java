package com.shapes.adapter;

import com.shapes.Line;
import com.shapes.Shape;

public class LineAdapter implements Shape{

	private Line line;
	
	
	public LineAdapter(Line line) {
		this.line = line;
	}


	@Override
	public void draw(int x, int y, int z, int i) {
		line.draw(x, y, z, i);
		
	}

	
}
