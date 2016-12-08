package com.mesutgolcuk.turkishStopWords;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TRStopWordFinder {
	private List<String> stopWordList; // list that holds stop words
	private final static String FILE_NAME = "stop_words.txt";
	
	public TRStopWordFinder() {
		stopWordList = new ArrayList<>();
		readStopWords();
	}
	/**
	 * reads stop words from txt file
	 */
	private void readStopWords(){
		
		BufferedReader reader = null;
        try {
        	InputStream in = getClass().getResourceAsStream(FILE_NAME); 
            reader = new BufferedReader(new InputStreamReader(in));
            
            String line;
            while ((line = reader.readLine()) != null) {
                stopWordList.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
               reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
	}
	/**
	 * is given parameter stop word in Turkish or not
	 * @param word 
	 * @return stop word or not
	 */
	public boolean isStopWord(String word){
		word = word.toLowerCase();
		if( stopWordList.contains(word) ){
			return true;
		}
		return false;
	}
	/**
	 * Removes Turkish stop words from a sentence
	 * @param sentence words are separated by space
	 * @return sentence without stop words
	 */
	public String removeStopWords(String sentence){
		String []parts = sentence.split(" ");
		String sentenceWithoutStopWords = "";
		
		for( String each : parts){
			if( !isStopWord(each) ){
				sentenceWithoutStopWords += each +" ";
			}
		}
		
		return sentenceWithoutStopWords;
		
	}
	
}
