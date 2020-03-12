package playroom.model;

import java.math.BigDecimal;

public abstract class Toy {
  public enum Size {SMALL, MEDIUM, BIG};
  Size size;
  BigDecimal price;

  public abstract BigDecimal getPrice();

  public abstract Size getSize();
}
