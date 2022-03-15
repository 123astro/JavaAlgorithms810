package com.company;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


//public class countVowels {
//    public countVowels(String str) {
//        int vowelsCount = 0;
//        // Your code here
//        String v = "aeiou";
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = 0; j < v.length(); j++) {
//                if (v.charAt(j) == str.charAt(i)) {
//                    vowelsCount++;
//                    break; // used to break out of loop after one match
//                }
//            }
//        }
//        System.out.println(vowelsCount);
//    }
//}

//public class countVowels {
//    public countVowels(String str) {
//        int vowelsCount = 0;
//        // Your code here
//        String v = "aeiou";
//        for (int i = 0; i < str.length(); i++) {
//            if ('a' == str.charAt(i) || 'e' == str.charAt(i) ||
//                    'i' == str.charAt(i) || 'o' == str.charAt(i) ||
//                    'u' == str.charAt(i))
//                vowelsCount++;
//        }
//        System.out.println(vowelsCount);
//    }
//}


public class countVowels {
    public countVowels(String str) {
        int vowelsCount = 0;
        // Your code here
        Pattern compile = Pattern.compile("[aeiou]");
        Matcher matcher = compile.matcher(str);
        while(matcher.find()) {
         vowelsCount++;
       }
        System.out.println(vowelsCount);
    }
}



