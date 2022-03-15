package com.company;

 public class countInstancesOfChar {

     //public void run(){ charCount('b', "bubble");}

     public static char c;
        public static String str;

     public countInstancesOfChar(char c, String str) {
            int count = 0;
            for(int i = 0; i < str.length(); i++ ){
                if( c == str.charAt(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
}
