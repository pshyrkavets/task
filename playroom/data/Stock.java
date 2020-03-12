package playroom.data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import playroom.model.Ball;
import playroom.model.Cube;
import playroom.model.Doll;
import playroom.model.Toy;
import playroom.model.ToyCar;

public class Stock {
  public static List<Toy> getListOfAllToys() {
    List<Toy> allToys = new ArrayList<>();
    allToys.add(new Ball(new BigDecimal("10.00"), Toy.Size.MEDIUM, Ball.BallType.PLASTIC));
    allToys.add(new ToyCar(new BigDecimal("15.99"), Toy.Size.MEDIUM, ToyCar.ToyCarType.RETRO));
    allToys.add(new Doll(new BigDecimal("4.99"), Toy.Size.MEDIUM, Doll.DollType.RED));
    allToys.add(new ToyCar(new BigDecimal("10.00"), Toy.Size.BIG, ToyCar.ToyCarType.POLICE));
    allToys.add(new Cube(new BigDecimal("4.99"), Toy.Size.SMALL, Cube.ColorOfCube.BLUE));
    allToys.add(new Ball(new BigDecimal("9.99"), Toy.Size.BIG, Ball.BallType.LEATHER));
    allToys.add(new Ball(new BigDecimal("4.99"), Toy.Size.BIG, Ball.BallType.RUBBER));
    allToys.add(new Doll(new BigDecimal("9.99"), Toy.Size.MEDIUM, Doll.DollType.BRUNETTE));
    allToys.add(new Doll(new BigDecimal("15.99"), Toy.Size.BIG, Doll.DollType.BLOND));
    allToys.add(new Cube(new BigDecimal("10.00"), Toy.Size.MEDIUM, Cube.ColorOfCube.RED));
    allToys.add(new ToyCar(new BigDecimal("9.99"), Toy.Size.SMALL, ToyCar.ToyCarType.RETRO));
    allToys.add(new Cube(new BigDecimal("10.00"), Toy.Size.SMALL, Cube.ColorOfCube.RED));
    allToys.add(new ToyCar(new BigDecimal("15.99"), Toy.Size.SMALL, ToyCar.ToyCarType.POLICE));
    allToys.add(new Cube(new BigDecimal("10.00"), Toy.Size.SMALL, Cube.ColorOfCube.GREEN));
    allToys.add(new ToyCar(new BigDecimal("10.00"), Toy.Size.MEDIUM, ToyCar.ToyCarType.POLICE));
    allToys.add(new Cube(new BigDecimal("10.00"), Toy.Size.MEDIUM, Cube.ColorOfCube.BLUE));
    allToys.add(new Cube(new BigDecimal("3.00"), Toy.Size.BIG, Cube.ColorOfCube.RED));
    allToys.add(new Doll(new BigDecimal("16.55"), Toy.Size.SMALL, Doll.DollType.BLOND));
    allToys.add(new Doll(new BigDecimal("15.99"), Toy.Size.SMALL, Doll.DollType.BRUNETTE));
    allToys.add(new Ball(new BigDecimal("12.20"), Toy.Size.SMALL, Ball.BallType.LEATHER));
    allToys.add(new Doll(new BigDecimal("43.00"), Toy.Size.BIG, Doll.DollType.BRUNETTE));
    allToys.add(new Ball(new BigDecimal("11.50"), Toy.Size.SMALL, Ball.BallType.PLASTIC));
    allToys.add(new Ball(new BigDecimal("11.20"), Toy.Size.SMALL, Ball.BallType.RUBBER));
    allToys.add(new Ball(new BigDecimal("13.35"), Toy.Size.MEDIUM, Ball.BallType.LEATHER));
    allToys.add(new ToyCar(new BigDecimal("5.00"), Toy.Size.SMALL, ToyCar.ToyCarType.RACING));
    allToys.add(new Ball(new BigDecimal("14.00"), Toy.Size.MEDIUM, Ball.BallType.RUBBER));
    allToys.add(new Cube(new BigDecimal("2.00"), Toy.Size.MEDIUM, Cube.ColorOfCube.GREEN));
    allToys.add(new ToyCar(new BigDecimal("9.99"), Toy.Size.BIG, ToyCar.ToyCarType.RACING));
    allToys.add(new Doll(new BigDecimal("19.99"), Toy.Size.SMALL, Doll.DollType.RED));
    allToys.add(new Doll(new BigDecimal("23.50"), Toy.Size.MEDIUM, Doll.DollType.BLOND));
    allToys.add(new Ball(new BigDecimal("16.30"), Toy.Size.BIG, Ball.BallType.PLASTIC));
    allToys.add(new Cube(new BigDecimal("3.00"), Toy.Size.BIG, Cube.ColorOfCube.GREEN));
    allToys.add(new Cube(new BigDecimal("3.00"), Toy.Size.BIG, Cube.ColorOfCube.BLUE));
    allToys.add(new ToyCar(new BigDecimal("9.99"), Toy.Size.BIG, ToyCar.ToyCarType.RETRO));
    allToys.add(new Doll(new BigDecimal("33.99"), Toy.Size.BIG, Doll.DollType.RED));
    allToys.add(new ToyCar(new BigDecimal("10.00"), Toy.Size.MEDIUM, ToyCar.ToyCarType.RACING));

    return allToys;
  }
}
