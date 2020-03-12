package playroom.model;

import java.math.BigDecimal;

public class Cube extends Toy {
  public enum ColorOfCube {RED, BLUE, GREEN};
  private ColorOfCube colorOfCube;

  public Cube(BigDecimal price, Size size, ColorOfCube colorOfCube) {
    this.price = price;
    this.size = size;
    this.colorOfCube = colorOfCube;
  }

  public ColorOfCube getColorOfCube() { return colorOfCube; }

  public BigDecimal getPrice() {
    return price;
  }

  public Size getSize() {
    return size;
  }
}
