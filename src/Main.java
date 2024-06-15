//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Trie trie = new Trie();
       trie.insert("cat");
       trie.insert("car");
       trie.insert("cart");

       System.out.println(trie.contains("cat"));
       System.out.println(trie.contains("dog"));
       System.out.println(trie.startsWith("ca"));
    }
}