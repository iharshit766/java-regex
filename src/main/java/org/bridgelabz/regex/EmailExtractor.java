package org.bridgelabz.regex;

import java.util.regex.*;

public class EmailExtractor {
   public static void isValidEmail(String email) {
       Pattern pattern= Pattern.compile("[a-zA-Z0-9._%-+]+@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,}");
       Matcher matcher= pattern.matcher(email);

       while(matcher.find()){
           System.out.println(matcher.group());
       }
   }
   public static void main(String args[]){
       String email="My email is Harshit988@gmail.com and jwehdkwe308@yahoo.org";
       isValidEmail(email);

   }
}
