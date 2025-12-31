package problems;
import java.util.Scanner;

class Robust{
static int wordCount(String sentence) {
	
    int words = 0;
    boolean inWord = false;
    boolean hasLetter = false;

    for (int i = 0; i < sentence.length(); i++) {
        char ch = sentence.charAt(i);

        if (Character.isLetter(ch)) {
            inWord = true;
            hasLetter = true;
        } 
        else if (Character.isDigit(ch)) {
            inWord = true;   
        } 
        else {
            if (inWord && hasLetter) {
                words++;
            }
            inWord = false;
            hasLetter = false;
        }
    }

  
    if (inWord && hasLetter) {
        words++;
    }

    return words;
}


static int countSentence(String sentence) {
	int sent = 0;
	
	for(int i = 0; i < sentence.length(); i++) {
		char ch = sentence.charAt(i);
		
		if(ch == '.' || ch == '!' || ch == '?') {
			sent++;
		}
		
	}
	
	return sent;
	
}

static int countdigits(String sentence) {
	int digit = 0;
	
	  for (int i = 0; i < sentence.length(); i++) {
	        char ch = sentence.charAt(i);
	 if(Character.isDigit(ch)) {
		 digit++;
		 
	 }
}
	  return digit;
}

static int countLetters(String sentence) {
	int letters = 0;
	for (int i = 0; i < sentence.length(); i++) {
        char ch = sentence.charAt(i);
    if(Character.isLetter(ch)) {
	 letters++;
	 
 }
}
	return letters;
}

static String longword(String sentence) {
	 String longest = "";
     String current = "";

     for (int i = 0; i < sentence.length(); i++) {
         char ch = sentence.charAt(i);

         if (Character.isLetter(ch)) {
             current += ch;
         } else {
             if (current.length() > longest.length()) {
                 longest = current;
             }
             current = "";
         }
     }

    
     if (current.length() > longest.length()) {
         longest = current;
     }

     return longest;



}

static int[] countVowels(String sentence) {
    int[] v = new int[5]; 

    for (int i = 0; i < sentence.length(); i++) {
        char ch = Character.toLowerCase(sentence.charAt(i));

        switch (ch) {
            case 'a': v[0]++; break;
            case 'e': v[1]++; break;
            case 'i': v[2]++; break;
            case 'o': v[3]++; break;
            case 'u': v[4]++; break;
        }
    }
    return v;
}
}


public class Qn3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String sentence ;
		
		
		 do {
	            System.out.println("Enter a sentence:");
	            sentence = sc.nextLine();
	        } while (sentence.isEmpty());
		 
		 
		 int words = Robust.wordCount(sentence);
		 int sentences = Robust.countSentence(sentence);
		 int digits = Robust.countdigits(sentence);
		 int Letters = Robust.countLetters(sentence);
		 String Longest = Robust.longword(sentence);
		 int vowels[] = Robust.countVowels(sentence);
		 
		 System.out.println("Words: " + words);
	        System.out.println("Sentences: " + sentences);
	        System.out.println("Digits: " + digits + ", Letters: " + Letters);
	        System.out.println("Longest word: \"" + Longest + "\"");
	        System.out.println(
	            "Vowel freq: a=" + vowels[0] +
	            " e=" + vowels[1] +
	            " i=" + vowels[2] +
	            " o=" + vowels[3] +
	            " u=" + vowels[4]
	        );
		 

		
		sc.close();
	

	}

}

