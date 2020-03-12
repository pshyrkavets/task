package playroom.model;

import java.math.BigDecimal;

public class ToyCar extends Toy {
  public enum ToyCarType {POLICE, RACING, RETRO};
  private ToyCarType toyCarType;

  public ToyCar(BigDecimal price, Size size,ToyCarType toyCarType) {
    this.price = price;
    this.size = size;
    this.toyCarType = toyCarType;
  }

  public ToyCarType getToyCarType() {
    return toyCarType;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public Size getSize() { return size; }
}
