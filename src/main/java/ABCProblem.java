import java.util.ArrayList;
import java.util.Locale;

/**
 * ABCProblem contains blocks of characters of size 2 (for example {{B,O},{X,K}})
 * and it checks if any given string can be spelled using this blocks
 * the rules are that any block can only be used once, and it should be case-insensitive
 */
public class ABCProblem {
    private ArrayList<char[]> listOfBlocks;

    public ABCProblem() {
        this.listOfBlocks = new ArrayList<char[]>();
        this.listOfBlocks.add(new char[]{'B', 'O'});
        this.listOfBlocks.add(new char[]{'X', 'K'});
        this.listOfBlocks.add(new char[]{'D', 'Q'});
        this.listOfBlocks.add(new char[]{'C', 'P'});
        this.listOfBlocks.add(new char[]{'N', 'A'});
        this.listOfBlocks.add(new char[]{'G', 'T'});
        this.listOfBlocks.add(new char[]{'R', 'E'});
        this.listOfBlocks.add(new char[]{'T', 'G'});
        this.listOfBlocks.add(new char[]{'Q', 'D'});
        this.listOfBlocks.add(new char[]{'F', 'S'});
        this.listOfBlocks.add(new char[]{'J', 'W'});
        this.listOfBlocks.add(new char[]{'H', 'U'});
        this.listOfBlocks.add(new char[]{'V', 'I'});
        this.listOfBlocks.add(new char[]{'A', 'N'});
        this.listOfBlocks.add(new char[]{'O', 'B'});
        this.listOfBlocks.add(new char[]{'E', 'R'});
        this.listOfBlocks.add(new char[]{'F', 'S'});
        this.listOfBlocks.add(new char[]{'L', 'Y'});
        this.listOfBlocks.add(new char[]{'P', 'C'});
        this.listOfBlocks.add(new char[]{'Z', 'M'});
    }

    /**
     * this function checks if the given word can be spelled using the blocks
     * first step is to creat an array of boolean with only false values with the same size as the list of blocks
     * this allows the function to know if a block has been used if it has true at its index
     * then through two nested for loops the listOfBlocks is searched for each char in the word
     * if all of them are found true is returned, but if a char is not found in the remaining blocks false is returned
     *
     * @param word
     * @return boolean
     */
    public Boolean canMakeWord(String word) {

        boolean[] flags = new boolean[this.listOfBlocks.size()];
        word = word.toUpperCase(Locale.ROOT);

        for (char c : word.toCharArray()) {
            boolean characterFound = false;
            for (int i = 0; i < this.listOfBlocks.size(); i++) {
                if (!flags[i]) {
                    if (contains(c, this.listOfBlocks.get(i))) {
                        flags[i] = true;
                        characterFound = true;
                        break;
                    }
                }
            }
            if (!characterFound) return false;
        }
        return true;
    }

    /**
     * this function looks through char[] arr and returns true if char c is in the array
     * this is a help function for canMakeWord()
     *
     * @param c
     * @param arr
     * @return boolean
     */
    private boolean contains(char c, char[] arr) {
        for (char x : arr) {
            if (x == c) return true;
        }
        return false;
    }
}
