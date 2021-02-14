package ru.stqa.pft.sandbox;

public class Rectangle {
  int sidea;
  int sideb;

  public Rectangle(int sidea, int sideb) {
    this.sidea = sidea;
    this.sideb = sideb;
  }
  public int area() {
    return sidea * sideb;
  }
}
