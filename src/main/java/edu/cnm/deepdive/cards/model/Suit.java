package edu.cnm.deepdive.cards.model;

@SuppressWarnings({"UnnecessaryUnicodeEscape", "unused"})
public enum Suit {

  CLUBS('\u2663',Color.BLACK),
  DIAMONDS('\u2662',Color.RED),
  HEARTS('\u2661',Color.RED),
  SPADES('\u2660',Color.BLACK);

  private final char symbol;
  private final Color color;

   Suit(char symbol, Color color){ //constructor by default it is private (private Suit(...))
    this.symbol = symbol; //this.symbol refer to the private final char symbol.
    this.color = color;
  }

  public char getSymbol() { //Getter
    return symbol;
  }

  public Color getColor() { //Getter
    return color;
  }

  public enum Color {
    BLACK, RED
  }
}
