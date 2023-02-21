package com.deckofcards;

public class SortedDeckOFCards {
 public void shuffleDeck(String[][] card){
     String temp;
     for (int i = 0; i < 4; i++ ){
         for (int j = 0; j < 13; j++){
             int row = (int)Math.floor(Math.random() * 3);
             int column = (int)Math.floor(Math.random() * 12);
             temp = card[i][j];
             card[i][j] = card[row][column];
             card[row][column] = temp;
         }
     }
 }
    public void displayCards(String[][] card) {
        for (int i = 0; i < 4; i++) {
            System.out.print("Player1: " + (i + 1) + ":");
            for (int j = 0; j < 13; j++) {
                System.out.print(card[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
            SortedDeckOFCards sortedDeckOFCards = new SortedDeckOFCards();
            String[][] cards = {{"2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "Jack(C)", "Queen(C)", "King(C)", "Ace(C)"},
                    {"2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "10D", "Jack(D)", "Queen(D)", "King(D)", "Ace(D)"},
                    {"2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H", "Jack(H)", "Queen(H)", "King(H)", "Ace(H)"},
                    {"2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "10S", "Jack(S)", "Queen(S)", "King(S)", "Ace(S)"}};

        System.out.println();
        sortedDeckOFCards.shuffleDeck(cards);
        sortedDeckOFCards.displayCards(cards);
        }
}

