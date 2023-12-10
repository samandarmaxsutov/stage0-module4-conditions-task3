package school.mjc.stage0.conditions.task3;



public class AlphabeticCharacters {
    private boolean isAlpha(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
    public void vowelDeterminer(char character) {
        if (isAlpha(character)){
        String a = switch (character){
            case 'a','e','i','o','u','A','E','I','O','U' -> "Vowel";
            default -> "Consonant";
        };
        System.out.println(a);
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
