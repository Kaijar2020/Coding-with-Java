package codechef.problem;

public class FindLongestWord {

    public static void main(String[] args) {
        String s = "The quick brown fox jumped over the lazy dog";
        String words[] = s.split(" ");
        int longest =0;
        String word = "";

        for (String word0 : words) {
            if (word0.length() > longest) {
                longest = word0.length();
                word = word0;
            }
        }
        System.out.println("The length of the longest word is: " + longest+" .The longest word is: "+word);
    }
}
