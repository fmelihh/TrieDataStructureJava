import java.util.HashMap;

/*
* Each trie has an empty root node, with links (or references) to other nodes,
* one for each possible alphabetic value.
*
*The size of trie is directly correlated to the size of all the possible values that
* the trie could represent.
*
*
* */
public class Trie {
    private class TrieNode {
        private HashMap<Character, TrieNode> children;
        private boolean endOfKey;

        public TrieNode() {
            children = new HashMap<>();
            endOfKey = false;
        }
    }

    private TrieNode root;
    public Trie() {
        root = new TrieNode();
    }

    public void insert(String key) {
        TrieNode current = root;
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            TrieNode node = current.children.get(c);
            if (node == null) {
                node = new TrieNode();
                current.children.put(c, node);
            }
            current = node;
        }
        current.endOfKey = true;
    }
}
