package ru.job4j.converter;

public class Converter {

  public static int rubleToEuro(int value) {
    return value / 70;
  }

  public static int euroToRuble(int value) {
    return value * 70;
  }

  public static int rubleToDollar(int value) {
    return value / 60;
  }

  public static int dollarToRuble(int value) {
    return value * 60;
  }

  public static void main(String[] args) {
    int euro = rubleToEuro(140),
        dollar = rubleToDollar(180),
        rubleE = euroToRuble(1),
        rubleD = dollarToRuble(2);

    System.out.println("140 rubles are " + euro + " euro");
    System.out.println("180 rubles are " + dollar + " dollars");
    System.out.println("1 euro is " + rubleE + " rubles");
    System.out.println("2 dollars are " + rubleD + " rubles");

//    Test
    int in = 140,
        expected = 2,
        out = rubleToEuro(in);
    boolean passed = expected == out;

    System.out.println();
    System.out.println("Test:");
    System.out.println("140 rubles are " + euro + " euro. Test result: " + passed);
  }
}
