package inheritance_and_polymorphism;

import inheritance_and_polymorphism.interfaces_example.Figure;

import java.util.Date;

public class Rectangle implements Figure {
    public int width;
    public int height;

    private Date dateCreation;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        this.setCreationtime();
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }


    public void setHeight(int height) {
        this.height = height;
    }


    public void setWidth(int width) {
        this.width = width;
    }

    public int getSquare() {
        return this.width * this.height;
    }

    private void setCreationtime() {
        this.dateCreation = new Date();
    }

    public void showCreationTime(){
        System.out.println(this.dateCreation);
    }

    @Override
    public double getVisibleHeight() {
        return 0;
    }

    @Override
    public double getVisibleWidth() {
        return 0;
    }
}
