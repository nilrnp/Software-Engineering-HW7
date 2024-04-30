package Homework7.Problem1;

import java.io.*;

public class TextEditor {
    public static void main(String[] args) {
        CharacterPropertiesFactory propertiesFactory = new CharacterPropertiesFactory();

        Document document = new Document();

        document.addCharacter('H', propertiesFactory.getCharacterProperties("Arial", "Red", 12));
        document.addCharacter('e', propertiesFactory.getCharacterProperties("Arial", "Red", 12));
        document.addCharacter('l', propertiesFactory.getCharacterProperties("Calibri", "Blue", 14));
        document.addCharacter('l', propertiesFactory.getCharacterProperties("Calibri", "Blue", 14));
        document.addCharacter('o', propertiesFactory.getCharacterProperties("Verdana", "Black", 16));
        document.addCharacter(' ', propertiesFactory.getCharacterProperties("Verdana", "Black", 16));
        document.addCharacter('W', propertiesFactory.getCharacterProperties("Arial", "Red", 12));
        document.addCharacter('o', propertiesFactory.getCharacterProperties("Arial", "Red", 12));
        document.addCharacter('r', propertiesFactory.getCharacterProperties("Arial", "Red", 12));
        document.addCharacter('l', propertiesFactory.getCharacterProperties("Arial", "Red", 12));
        document.addCharacter('d', propertiesFactory.getCharacterProperties("Arial", "Red", 12));
        document.display();

        try {
            document.saveToFile("document.txt");
            System.out.println("Document saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving document: " + e.getMessage());
        }
        
        Document loadedDocument = new Document();
        try {
            loadedDocument.loadFromFile("document.txt");
            System.out.println("Document loaded successfully.");
            loadedDocument.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading document: " + e.getMessage());
        }
    }
}