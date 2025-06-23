package inheritance_and_polymorphism.access_modifiers;

public class RectangleExample {

    //недоступны из внешнего кода в другом пакете
    //доступны в наследниках и из внешнего кода в одном пакете
    protected int width;
    protected int height;

    //доступны только внутри данного класса
    private boolean isPrivate = true;

    public RectangleExample(int width, int height) {
        this.width = width;
        this.height = height;
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
}
