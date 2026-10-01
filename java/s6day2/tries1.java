package s6day2;

public class tries1 {
    class TrieNode {
        boolean isEndOfWord;       // true if a word ends at this node
        TrieNode[] children;       // array of 26 pointers (a-z)

        public TrieNode() {
            isEndOfWord = false;   // initially, no word ends here
            children = new TrieNode[26]; // all 26 children are null initially
        }
    }

    TrieNode root;  // the root node (empty start)

    // ---------------------- TRIE CONSTRUCTOR ----------------------
    public tries() {
        // create an empty root node when Trie object is created
        root = new TrieNode();
    }

    // ---------------------- INSERT WORD ---------------------------
    public void insert(String word) {

        TrieNode node = root;  // start from the root

        // traverse every character in the word
        for (char c : word.toCharArray()) {

            int index = c - 'a'; // convert char to index (0-25)

            // If the path does not exist → create new TrieNode
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }

            // Move to the next node (child)
            node = node.children[index];
        }

        // After inserting all characters, mark the end of the word
        node.isEndOfWord = true;
    }

    // ---------------------- SEARCH WORD ---------------------------
    public boolean search(String word) {
        return isMatch(word, root, 0, true);  // full word match
    }

    // ---------------------- SEARCH PREFIX -------------------------
    public boolean startsWith(String prefix) {
        return isMatch(prefix, root, 0, false);  // only prefix match
    }

    // ---------------------- COMMON MATCH FUNCTION -----------------
    public boolean isMatch(String text, TrieNode node, int index, boolean isFullMatch) {

        // If node is null, this path doesn't exist → fail
        if (node == null) {
            return false;
        }

        // If we have checked all characters
        if (index == text.length()) {

            // Full match → must end exactly at a completed word
            if (isFullMatch) {
                return node.isEndOfWord;
            }

            // Prefix match → no need to be end of word
            return true;
        }

        // Get current character
        char c = text.charAt(index);
        int childIndex = c - 'a';

        // Move to the next child
        TrieNode next = node.children[childIndex];

        // Continue matching the rest
        return isMatch(text, next, index + 1, isFullMatch);
    }

    // ---------------------- MAIN FUNCTION -------------------------
    public static void main(String[] args) {

        tries trie = new tries();  // create trie object

        // Insert words
        trie.insert("apple");
        boolean isPresent = trie.search("apple");
        System.out.println(isPresent);
        isPresent = trie.search("app");
        System.out.println(isPresent);
        System.out.println(trie.startsWith("app"));
        trie.insert("app");
        isPresent = trie.search("app");
        System.out.println(isPresent);

        

        // Check prefix
        

    }
}

