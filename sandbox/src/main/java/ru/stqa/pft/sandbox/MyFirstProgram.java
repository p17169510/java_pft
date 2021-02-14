package ru.stqa.pft.sandbox;

class MyFirstProgram {
  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Aleks");

    Square s = new Square(5);
    System.out.printf("Площадь квадрата со стороной %d = %d \n", s.side, s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.printf("Площадь прямоугольника со сторонами %d и %d = %d \n", r.sidea, r.sideb, r.area());

  }

  public static void hello(String name) {
    System.out.printf("Hello,%s \n", name);
  }
  
}