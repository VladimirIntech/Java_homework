package ru.javahomework.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.ws.Action;

public class SquareTest {
  @Test
  public void testArea() {
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25.0);
  }
}
