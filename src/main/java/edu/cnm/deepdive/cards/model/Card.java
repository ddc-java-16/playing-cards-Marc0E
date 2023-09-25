package edu.cnm.deepdive.cards.model;

import java.util.Objects;

public class Card {

  private final Rank rank;
  private final Suit suit;
  private final int hash;
  private final String representation;

  private  boolean faceUp;

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
    hash = Objects.hash(rank, suit);
    representation = rank.getSymbol() + suit.getSymbol();
  }

  public Rank getRank() {
    return rank;
  }

  public Suit getSuit() {
    return suit;
  }
  public boolean isFaceUp(){
    return faceUp;
  }
  public void setFaceUp(boolean faceUp) {
    this.faceUp = faceUp;
  }

  @Override // control + o to get the menu that created this. We are overriding something we inherited from super class
  public String toString() {
    //return super.toString(); changed to the line below.
    //return rank.getSymbol() + suit.getSymbol();
    return representation; //same as line 38
  }

  @Override
  public int hashCode() {
    //return super.hashCode();
   // return Objects.hash(rank, suit);
    //return (31 + rank.hashCode()) * 31 + suit.hashCode(); other way to represent what we have line 45
    return  hash; // same has line 45
  }

  @Override
  public boolean equals(Object obj) {
    //return super.equals(obj);
    boolean result;
    if (this == obj){
      result = true;
    } else if (obj instanceof Card other){
      /*else if (obj instanceof Card){ This is other way to say what we have at the top
        Card other = (Card) obj;*/
      result = (rank == other.rank && suit.equals(other.suit)); //any of these ways to compare works
    } else {
      result = false;
    }
    return result;
  }
}
