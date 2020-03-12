package playroom.runner;

import java.math.BigDecimal;
import java.util.List;
import playroom.data.Stock;
import playroom.model.Ball;
import playroom.model.Cube;
import playroom.model.Doll;
import playroom.model.Toy;
import playroom.model.ToyCar;
import playroom.playroomfiller.ToysInPlayroom;
import playroom.sorting.Sorting;

public class Playroom {
  public static void main(String[] args) {
    String MESSAGE = "Input the amount of money for toys as the only argument for this program. For example: 135.95";

    if(args.length != 1) {
      System.out.println(MESSAGE);
      System.exit(1);
    }

    try {
      Double.valueOf(args[0]);
    } catch(NumberFormatException numberFormatException) {
        System.out.println(MESSAGE);
        System.exit(1);
    }

    List<Toy> listOfAllToys = Stock.getListOfAllToys();
    List<Toy> toysInPlayroom = ToysInPlayroom.getToysInPlayroom(new BigDecimal(args[0]), listOfAllToys);

    System.out.println("It is provided " + toysInPlayroom.size() + " toys:");

    Sorting.sortByPrice(toysInPlayroom);
    List<Toy> sortedListBySizeAndPrice = Sorting.sortBySizeAndPrice(toysInPlayroom);

    for(Toy toy : sortedListBySizeAndPrice) {
      if (toy instanceof Ball) {
        System.out.println(toy.getPrice().toString() + " " + toy.getSize().toString() + " " +
            ((Ball) toy).getBallType().toString() + " BALL");
      } else if (toy instanceof Cube) {
        System.out.println(toy.getPrice().toString() + " " + toy.getSize().toString() + " " +
            ((Cube) toy).getColorOfCube().toString() + " CUBE");
      } else if (toy instanceof Doll) {
        System.out.println(toy.getPrice().toString() + " " + toy.getSize().toString() + " " +
            ((Doll) toy).getDollType().toString() + " DOLL");
      } else if (toy instanceof ToyCar) {
        System.out.println(toy.getPrice().toString() + " " + toy.getSize().toString() + " " +
            ((ToyCar) toy).getToyCarType().toString() + " TOY CAR");
      }
    }
  }
}
