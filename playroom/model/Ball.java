package playroom.model;

import java.math.BigDecimal;

public class Ball extends Toy {
  public enum BallType {LEATHER, PLASTIC, RUBBER};
  private BallType ballType;

  public Ball(BigDecimal price, Size size, BallType ballType) {
    this.price = price;
    this.size = size;
    this.ballType = ballType;
  }

  public BallType getBallType() { return ballType; }

  public BigDecimal getPrice() { return price; }

  public Size getSize() { return size; }
}
