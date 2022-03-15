package com.company;

public class removeAllVowels {
    public removeAllVowels(String str) {
        String finalWord = "";
        String v = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            boolean isVowel = false;
            for (int j = 0; j < v.length(); j++) {
                if (str.charAt(i) == v.charAt(j)) {
                    isVowel = true;
                    break;
                }
            }
            if (!isVowel) {
                finalWord += str.charAt(i);
            }
        }
            System.out.println(finalWord);
    }
}
