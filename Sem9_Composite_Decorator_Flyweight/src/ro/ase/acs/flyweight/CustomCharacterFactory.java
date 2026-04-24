package ro.ase.acs.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CustomCharacterFactory {
    private Map<Character, CustomCharacter> characters=new HashMap<>();

    public CustomCharacter getCharacter(char asciiCode)
    {
        if(characters.containsKey(asciiCode))
        {
            System.out.println("Character reused");
            return characters.get(asciiCode);
        }
        else {
            CustomCharacter character=character = new CustomCharacter(
                    new byte[]{100, 110}, asciiCode
            );
            characters.put(asciiCode,character);
            System.out.println("Character created");
            return character;
        }
    };
}
