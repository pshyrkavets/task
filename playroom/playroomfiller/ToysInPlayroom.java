package playroom.playroomfiller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import playroom.model.Toy;

public class ToysInPlayroom {
  public static List<Toy> getToysInPlayroom(BigDecimal money, List<Toy> listOfAllToys) {
    List<Toy> paidToys = new ArrayList<>();
    BigDecimal toyPrice;
    BigDecimal moneyForToys = new BigDecimal(money.toString());

    for(Toy toy : listOfAllToys) {
      toyPrice = new BigDecimal(toy.getPrice().toString());

      if(Double.parseDouble(moneyForToys.toString()) >= Double.parseDouble(toyPrice.toString())) {
        moneyForToys = new BigDecimal(moneyForToys.subtract(toyPrice).toString());
        paidToys.add(toy);
      }
    }

    System.out.println("It is given " + money.toString() + " for toys. The remainder is " + moneyForToys + ".");

    return paidToys;
 }
}
