package playroom.model;

import java.math.BigDecimal;

public class Doll extends Toy {
  public enum DollType {BLOND, BRUNETTE, RED};
  private DollType dollType;

  public Doll(BigDecimal price, Size size, DollType dollType) {
    this.price = price;
    this.size = size;
    this.dollType = dollType;
  }

  public DollType getDollType() { return dollType; }

  public BigDecimal getPrice() {
    return price;
  }

  public Size getSize() {
    return size;
  }
}
