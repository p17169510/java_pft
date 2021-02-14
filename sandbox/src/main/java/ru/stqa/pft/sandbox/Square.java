package ru.stqa.pft.sandbox;

public class Square {
  int side;

  public Square(int side) {
    this.side = side;
  }
  public int area() {
    return side*side;
  }
}
