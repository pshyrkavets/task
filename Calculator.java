import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {
  public static void main(String args[]) {
    BigDecimal result;

    switch(args[1].charAt(0)) {
      case 'a': result = new BigDecimal(args[0]).add(new BigDecimal(args[2])); System.out.println(result); break;
      case 's': result = new BigDecimal(args[0]).subtract(new BigDecimal(args[2])); System.out.println(result); break;
      case 'm': result = new BigDecimal(args[0]).multiply(new BigDecimal(args[2])); System.out.println(result); break;
      case 'd': result = new BigDecimal(args[0]).divide(new BigDecimal(args[2]), 10, RoundingMode.CEILING);
                System.out.println(result);
                break;
      default: System.out.println("Four operations are available: a (addition), s (subtraction), m " +
          "(multiplication), d (division).\nInput arguments in format: 1operand operation 2operand. For example: 2 a 3");
    }
  }
}
