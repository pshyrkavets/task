import java.util.Arrays;

public class SortArrayByStringLength {
  public static void main(String[] args) {
    String[] array = {"thirteen", "three", "one", "four", "eleven"};
    int i;
    boolean flag = true;
    String temp;

    while (flag) {
      flag = false;
      for (i = 0; i < array.length - 1; i++) {
        if (array[i].length() < array[i + 1].length()) {
          temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
          flag = true;
        }
      }
    }

    System.out.println(Arrays.toString(array));
  }
}
