package com.shapes.main;

import com.shapes.Line;
import com.shapes.Parallelogram;
import com.shapes.Rectangle;
import com.shapes.Shape;
import com.shapes.adapter.LineAdapter;
import com.shapes.adapter.ParallelogramAdapter;
import com.shapes.adapter.RectangleAdapter;

public class Main {

	public static void main(String[] args) {
		Shape[] shapes = { new RectangleAdapter(new Rectangle()), new LineAdapter(new Line()),
				new ParallelogramAdapter(new Parallelogram()) };

		int x1 = 10, y1 = 20;
		int x2 = 30, y2 = 60;

		for (Shape shape : shapes) {
			shape.draw(x1, y1, x2, y2);
		}
	}

}
