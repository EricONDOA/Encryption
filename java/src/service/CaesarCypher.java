package service;

/**
 * Created by Eondoa on 15/06/2016.
 */
public class CaesarCypher {

	public String encryptedWord(String input, int key) {

		StringBuilder encrypted = new StringBuilder(input);
		String alphabet = "ABCDEFGHIJKLMNOPQRSTVWXYZ";
		String shiftedAlphabet = input.substring(key) + input.substring(0, key);
		String result = "";

		for (int i = 0; i < encrypted.length(); i++) {
			char charAtTheWord = encrypted.charAt(i);
			int indexInTheAlphabet = alphabet.indexOf(charAtTheWord);

			if(indexInTheAlphabet != -1) {
				result = result + shiftedAlphabet.charAt(indexInTheAlphabet + key);
			}
		}

		return result;
	}

}
