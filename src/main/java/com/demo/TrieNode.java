package com.demo;

public class TrieNode {
    TrieNode[] children;
    boolean isEndOfWord;

    TrieNode() {
        this.children = new TrieNode[128];
        this.isEndOfWord = false;
    }
}