package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

  @Test
  public void rubleToEuro() {
    int in = 140,
        expected = 2,
        out = Converter.rubleToEuro(in);

    Assert.assertEquals(expected, out);
  }

  @Test
  public void euroToRuble() {
    int in = 1,
        expected = 70,
        out = Converter.euroToRuble(in);

    Assert.assertEquals(expected, out);
  }

  @Test
  public void rubleToDollar() {
    int in = 180,
        expected = 3,
        out = Converter.rubleToDollar(in);

    Assert.assertEquals(expected, out);
  }

  @Test
  public void dollarToRuble() {
    int in = 2,
        expected = 120,
        out = Converter.dollarToRuble(in);

    Assert.assertEquals(expected, out);
  }
}
