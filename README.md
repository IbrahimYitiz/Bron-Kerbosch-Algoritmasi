# Bron-Kerbosch-Algoritmasi
Bron-Kerbosch algoritması, bir grafın maksimum bağımsız kümesini (MBC) bulmak için kullanılan bir geriye dönük arama algoritmasıdır.
 MBC, bir grafda herhangi iki düğüm arasında kenar olmayan en büyük düğüm kümesidir.

Bron-Kerbosch algoritması, herhangi bir başlangıç düğümü kümesiyle başlar 
ve bu kümenin alt kümeleri üzerinde bir geriye dönük arama gerçekleştirir.
Her bir adımda, bir düğüm kümesi seçilir ve bu kümenin tüm düğümleri, kümenin diğer düğümleriyle komşu olmayan düğümler olarak kabul edilir.
Bu işlem, seçilen düğüm kümesinin alt kümesi için tekrarlanır ve bu şekilde bir alt küme için MBC bulunur.

Algoritma, tüm düğüm kümeleri üzerinde geriye dönük arama gerçekleştirir 
ve en büyük MBC'yi bulmak için elde edilen tüm MBC'leri karşılaştırır. 
Bron-Kerbosch algoritması, grafik teorisi, veritabanı arama ve kimyasal yapılar gibi birçok alanda kullanılır.


Bron-Kerbosch algoritması, grafın boyutuna ve yoğunluğuna bağlı olarak çalışma süresinde değişiklik gösterir. 
En iyi durumda, grafın tamamı bir MBC'dir ve algoritma O(1) çalışır. En kötü durumda, graf tamamen bağlıdır 
ve algoritmanın çalışma zamanı O(3^(n/3)) olarak hesaplanır. Burada n, grafın düğüm sayısıdır.

Ortalama çalışma süresi, genellikle grafın yoğunluğuna bağlı olarak O(3^(n/3)) ve O(2^(n/2)) arasında değişir.
 Bu nedenle, Bron-Kerbosch algoritması, çoğu durumda n'in küçük olduğu grafiklerde kullanılması önerilir.

Bron-Kerbosch algoritmasının çalışma zamanı analizi, algoritmanın geriye dönük arama yapısına dayanır. 
Her adımda, düğümler birbirleriyle karşılaştırılır ve eşleşmeler oluşturulur. 
Bu eşleşmeler, birbirleriyle komşu olan düğümleri hariç tutmak için kullanılır.

En kötü durumda, her bir düğüm, grafın diğer tüm düğümleriyle eşleşebilir 
ve her seferinde tüm düğümler üzerinde geriye dönük bir arama yapılması gerekebilir.
 Bu durumda, algoritmanın çalışma zamanı O(3^(n/3)) olur.

Ortalama durumda, düğümler birbirleriyle rastgele eşleşir 
ve her seferinde birkaç düğüm kümesi üzerinde geriye dönük bir arama yapılır.
 Bu durumda, algoritmanın çalışma zamanı, genellikle grafın yoğunluğuna bağlı olarak O(3^(n/3)) ve O(2^(n/2)) arasında değişir.

Sonuç olarak, Bron-Kerbosch algoritması, çoğu durumda n'in küçük olduğu grafiklerde kullanılması önerilir 
ve en kötü durumda çalışma zamanı, grafın tamamının bir MBC olması durumunda hariç, n'in üçüncü dereceden bir fonksiyonudur.

YÖNERGE --->>> KODU ÇALIŞTIRMAK İÇİN UYGUN JAVA DERLEYİCİSİDE DERLEMENİZ GEREKMEKTEDİR.(İNTELLJİJ İDEA , ECLİPSE , NETBEANS)
