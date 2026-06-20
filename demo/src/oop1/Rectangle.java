package oop1;

public class Rectangle {
    private int length, width;
    
    // Constructor 
    public Rectangle(int l, int w) {
    	length = l;
    	width = w;
    }
    
    public int getArea() {
    	return  length * width;
    }
    
    public int getCircumference() {
    	return  2 * (length  + width);
    }
    
}
