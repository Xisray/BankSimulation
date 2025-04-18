package me.vlad.banksimulation.visual.base;

public class Rectangle {
    private double x;
    private double y;
    private double width;
    private double height;
    public Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void moveByX(double xOffset) {
        setY(getX()+xOffset);
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void moveByY(double yOffset) {
        setY(getY()+yOffset);
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}
