import java.util.Stack;

public class DaoNguocChuoi {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        String mWord = "HelloWord";
        String[] words = mWord.split("");
        String newWords = "";

        for (int i = 0; i < words.length; i++) {
            wStack.push(words[i]);
        }
        for (int i = 0; i < words.length; i++) {
            newWords = wStack.pop();
            System.out.print(newWords);
        }
    }
}
