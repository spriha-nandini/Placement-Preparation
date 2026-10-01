package s6day2;

public class tries2 {
    class TrieNode{
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord;
    }
    Class Trie{
        private TrieNode root;
        public Trie(){
            root=new TrieNode();
        }
        public void insert(String word){
            TrieNode current = root;
            for(char c : word.toCharArray()){
                int index=c-'a';
                if(current.children[index]==null){
                    current.children[index]=new TrieNode();
                }
                current=current.children[index];
            }
            current.isEndOfWord=true;
        }
        public boolean search(String word){
            TrieNode node=findNode(word);
            return node != null&&node.isEndOfWord;
        }
        public boolean startsWith(String prefix){
            return findNode(prefix)!=null;
        }
        
    }
}
