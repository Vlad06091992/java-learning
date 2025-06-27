package inheritance_and_polymorphism.interfaces_example;

import java.awt.*;


public abstract class Figure2D implements Figure {
   private Color color;

   public void setColor(Color color) {
      this.color = color;
   }

   public Color getColor() {
      return this.color;
   }

   public abstract double getSquare();
}