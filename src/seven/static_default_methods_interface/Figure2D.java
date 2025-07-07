package seven.static_default_methods_interface;

public interface Figure2D {
    // дефолтные методы интерфейса которые можно переопределять
    default Double getSquare(){
        return 0.0;
    }
    // статические методы интерфейса которые нельзя переопределять
    static Figure2D createFigure(Object data){
        return null;
    }
}
