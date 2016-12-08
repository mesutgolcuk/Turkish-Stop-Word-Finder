# Turkish-Stop-Word-Finder

For a given word this finder tells it is stop word in Turkish or not.

## Usage
Jar file can be downloaded from here : 

[Download](https://drive.google.com/open?id=0B8NOqXJ764gpWlNvVGtNbTZwYlU)

In order to use it 
```
import com.mesutgolcuk.turkishStopWords.TRStopWordFinder
```
create object
```
TRStopWordFinder stopWordFinder = new TRStopWordFinder();
```
if you want to check a word
```
stopWordFinder.isStopWord("acaba")
```

or if you want to remove all stop words from a sentence 
```
stopWordFinder.removeStopWords("Uslu bir çocuk olursanız şirinleri görebilirsiniz")
```
