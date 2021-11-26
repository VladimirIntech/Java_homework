package TestPoint;

import homeWork2.Point;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPoint {
  @Test
  public void testP() {
    Point p = new Point(1,3,22,11);
    Assert.assertEquals(p.distance(), 		22.47220505424423);


  }
  @Test
  public void testP2() {
    Point p = new Point(1,3,22,11);
    Assert.assertNotEquals(p.distance(), 25);

  }
  @Test
  public void testP3() {
    Point p = new Point(10,333,22,11);
    Assert.assertEquals(p.distance(), 322.2235249015813);

  }
  @Test
  public void testP4() {
    Point p = new Point(10,333,22,111);
    Assert.assertEquals(p.distance(), 322.2235249015813);

  }
}
