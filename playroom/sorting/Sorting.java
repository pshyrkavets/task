package playroom.sorting;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import playroom.model.Toy;

public class Sorting {
  public static void sortByPrice(List<Toy> toys) {
    toys.sort(Comparator.comparing(Toy::getPrice));
  }

  public static List<Toy> sortBySizeAndPrice(List<Toy> toys) {
    return toys.stream()
        .sorted(Comparator.comparing(Toy::getSize))
        .sorted(Comparator.comparing(Toy::getPrice)).collect(Collectors.toList());
  }
}
