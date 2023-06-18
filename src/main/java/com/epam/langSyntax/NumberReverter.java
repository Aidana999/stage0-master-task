package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
         int rev_num = 0;
        while (number > 0) {
            rev_num = rev_num * 10 + number % 10;
            number = number / 10;
        }
         System.out.println(rev_num);
    }
}
