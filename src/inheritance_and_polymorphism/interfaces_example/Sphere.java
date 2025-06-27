package inheritance_and_polymorphism.interfaces_example;

public class Sphere extends Figure3D implements Figure {
    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getSurfaceSquare() {
        return 0;
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
