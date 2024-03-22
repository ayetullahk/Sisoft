package com.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Trie trie = new Trie();
        String filePath = "C:\\Users\\DELL\\Downloads\\Algoritma Ödev 2024.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                trie.insert(line.trim().toUpperCase());
            }
            System.out.println("Sözlük Yüklendi.");
        } catch (IOException e) {
            System.err.println("Dosya okuma hatası: " + e.getMessage());
            return;
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nBir Kelime Yazıp Enter Tuşuna Basınız (Çıkmak için Büyük harflerle 'EXIT' yazabilirsiniz)");
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.equals("EXIT")) {
                break;
            }
            List<String> suggestions = trie.getSuggestions(input);
            if (suggestions.isEmpty()) {
                System.out.println("Olası Kelimeler Bulunamadı");
            } else {
                System.out.println("Olası Kelimeler:");
                for (String suggestion : suggestions) {
                    System.out.println(suggestion);
                }
            }
        }
    }
}
