package Homework7.Problem1;


class Character {
    private char ch;
    private CharacterProperties properties;

    public Character(char ch, CharacterProperties properties) {
        this.ch = ch;
        this.properties = properties;
    }

    public void display() {
        System.out.println("Character: " + ch + ", Font: " + properties.getFont() + ", Color: " + properties.getColor() + ", Size: " + properties.getSize());
    }
}
