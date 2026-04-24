package ro.ase.acs.flyweight;

public class CustomCharacter {
    private byte[] image;
    private char asciiCode;

    public CustomCharacter(byte[] image, char asciiCode) {
        this.image = image;
        this.asciiCode = asciiCode;
    }
    public void display(CharacterPosition position)
    {
        System.out.println(asciiCode + " " + position.getLine() + ":"+ position.getColumn());
    }
}
