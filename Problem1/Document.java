package Homework7.Problem1;

import java.io.*;
import java.util.*;

class Document {
    private List<Homework7.Problem1.Character> characters = new ArrayList<>();

    public void addCharacter(char ch, CharacterProperties properties) {
        characters.add(new Homework7.Problem1.Character(ch, properties));
    }

    public void display() {
        for (Homework7.Problem1.Character character : characters) {
            character.display();
        }
    }

    public void saveToFile(String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(characters);
        }
    }

    public void loadFromFile(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            characters = (List<Homework7.Problem1.Character>) ois.readObject();
        }
    }
}

