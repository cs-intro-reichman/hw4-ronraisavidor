public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        // Replace this comment with your code


        for (int j=0; j<sentences.length; j++) {
            for (int i=0; i<keywords.length; i++) {
                String lowerSentnce = lowerCase(sentences[j]);
                String lowerKeyweord = lowerCase(keywords[i]);
                if (contains(lowerSentnce, lowerKeyweord)) {
                    System.out.println(sentences[j]);
                    break;
                }
            }
        }
    }

    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        
        if (str2.length() > str1.length()) {
            return false;
        }
        
            
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            int j;
                for (j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i + j) != str2.charAt(j)) {
                        break; 
                    }
                }

                if (j == str2.length()) {
                    return true;
                }
            }
        
            return false;
    }

    public static String lowerCase(String str) {
        // Replace the following statement with your code
        String newStr = "";
        for (int i=0; i<str.length(); i++) {
            if ((str.charAt(i) <= 90) && (str.charAt(i) >= 65)) {
                newStr += (char)(str.charAt(i) + 32);
            } else {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }

        

}
