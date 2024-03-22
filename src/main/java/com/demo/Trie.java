package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Trie {
    private TrieNode root;

    Trie() {
        this.root = new TrieNode();
    }

    void insert(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index;
            if (Character.isLowerCase(c)) {
                index = c - 'a';
            } else if (Character.isUpperCase(c)) {
                index = c - 'A';
            } else {
                continue;
            }
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }

    List<String> getSuggestions(String prefix) {
        List<String> suggestions = new ArrayList<>();
        TrieNode current = root;
        for (char c : prefix.toCharArray()) {
            int index = c - 'A';
            if (index < 0 || index >= 26 || current.children[index] == null) {
                return suggestions;
            }
            current = current.children[index];
        }
        getAllWordsFromNode(prefix, current, suggestions);
        return suggestions;
    }

    private void getAllWordsFromNode(String prefix, TrieNode node, List<String> suggestions) {
        if (node.isEndOfWord) {
            suggestions.add(prefix);
        }
        for (char c = 'a'; c <= 'z'; c++) {
            TrieNode child = node.children[c - 'a'];
            if (child != null) {
                getAllWordsFromNode(prefix + c, child, suggestions);
            }
        }
    }
}
