# SisOft

# Trie Veri Yapısı Kullanarak Kelime Öneri Uygulaması
Bu proje, Trie veri yapısını kullanarak bir kelime öneri uygulaması sağlar. Kullanıcı, belirli bir kelimeyi girdi olarak verdiğinde, uygulama bu kelimeye en yakın eşleşmeleri bulur ve kullanıcıya sunar.

# Kurulum
Projeyi çalıştırmak için Java'nın yüklü olması gerekmektedir.

Projeyi bilgisayarınıza klonlayın veya zip dosyası olarak indirin.
Bir Java IDE'si (Integrated Development Environment) kullanarak proje dosyalarını açın.
Main.java dosyasını açın ve main metodu içindeki dosya yolu değişkenini uygun şekilde güncelleyin (filePath değişkeni).
Projeyi çalıştırın.
# Nasıl Kullanılır
Programı çalıştırdıktan sonra, konsola bir kelime yazın ve Enter tuşuna basın.
Program, girilen kelimenin önerilerini ekrana yazdıracaktır.
Eğer çıkmak isterseniz büyük harflerle 'EXIT' yazarak programdan çıkabilirsiniz.
Örnek Dosya Formatı
Projede kullanılan örnek dosya, kelime listesini içeren bir metin dosyasıdır. Her satır bir kelime içermelidir. Örnek dosya yolu Algoritma Ödev 2024.txt olarak belirtilmiştir.

# Metot Açıklamaları
insert(String word): Trie'ye yeni bir kelime ekler.
getSuggestions(String prefix): Verilen önek için olası tamamlamaları döndürür.
getAllWordsFromNode(String prefix, TrieNode node, List<String> suggestions): Verilen düğümden başlayarak tüm kelimeleri bulan yardımcı metottur.
main(String[] args): Programın ana metodu. Dosyadan kelime okur ve kullanıcı girdilerini alır.
