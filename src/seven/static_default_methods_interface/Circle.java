package seven.static_default_methods_interface;

public class Circle implements Figure2D {
    @Override
    public Double getSquare() {
        return Figure2D.super.getSquare();
    }
}
