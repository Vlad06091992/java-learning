package inheritance_and_polymorphism;

public class Square extends Rectangle {

    Square(int width, int height) {
        super(width, height);
        if (width != height) {
            System.out.println("Ширина не равна высоте");
        }
    }

    public Square(int width) {
        super(width, width);
    }

    public void setHeight(int height) {
        this.height = height;
        this.width = height;
    }


    public void setWidth(int width) {
        this.height = width;
        this.width = width;
    }
}
