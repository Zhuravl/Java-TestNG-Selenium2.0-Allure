package helpers;

import java.util.Random;

/**
 * Class contains help methods for creating random test data
 */
public class TestDataHelper {

    private static final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String digits = "0123456789";
    private static final String specials = "/*-+.,~!@#$%^&()_=";
    private static final String allCharacters = letters + letters.toLowerCase() + digits;
    private static final String allCharactersIncludeSpecials = allCharacters + specials;

    /**
     * Returns array with random-generated sets of e-mail and password
     * @param size Expected array size
     */
    public static String[][] getLoginData(int size) {
        if (size > 0) {
            String[][] result = new String[size][2];
            for (int i = 0; i < size; i++) {
                result[i][0] = getRandomEmail();
                result[i][1] = getRandomPassword();
            }
            return result;
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Returns random generated email
     */
    private static String getRandomEmail(){
        StringBuilder sb = new StringBuilder();

        sb.append(getRandomString(allCharacters, new Random().nextInt(10) + 1));
        sb.append("@");
        sb.append(getRandomString(allCharacters, new Random().nextInt(5) + 1).toLowerCase());
        sb.append(".");
        sb.append(getRandomString(letters, new Random().nextInt(2) + 2).toLowerCase());

        return sb.toString();
    }

    /**
     * Returns random generated password
     */
    private static String getRandomPassword() {
        return getRandomString(allCharactersIncludeSpecials, new Random().nextInt(4) + 8);
    }

    /**
     * Returns random generated string
     * @param symbols Initial symbols set
     * @param length Number of symbols in generated string
     */
    private static String getRandomString(String symbols, int length){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(symbols.charAt(new Random().nextInt(symbols.length())));
        }
        return sb.toString();
    }
}
