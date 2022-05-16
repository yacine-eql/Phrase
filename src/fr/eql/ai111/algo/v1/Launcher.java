package fr.eql.ai111.algo.v1;

public class Launcher {
    public static void main(String[] args) {
        String phrase = "HWDKVIIYYYYQ";
        String result = tri(phrase);

        System.out.println("Votre phrase : " + phrase);
        System.out.println("Resultat : " + result);
    }

        public static String tri(String phrase) {

            if (phrase.equals(""))
                return "";

            String  sentence = "";
            int i = 0;
            while (i < phrase.length()) {
                sentence += (phrase.charAt(i));
                int j = i + 1;
                      while (j < phrase.length() && phrase.charAt(j) == phrase.charAt(i)) {
                          ++j;
                      }
                            sentence += ((j - i));
                            i = j;
            }
            return sentence;
        }

    }