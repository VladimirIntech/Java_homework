package homeWork2;

public class RunClass {
  public static void main(String[] args) {
    Point p = new Point(2, 2);
    Point p2 = new Point(10, 8);
    System.out.println("Расстояние между точками (" + p.x + " , " + p.y + " ) и ( " + p2.x + " , " + p2.y + ") = " + p.distance(p2));

  }
}


