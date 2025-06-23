package inheritance_and_polymorphism;

import java.util.Date;

public class Rectangle {
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
}
