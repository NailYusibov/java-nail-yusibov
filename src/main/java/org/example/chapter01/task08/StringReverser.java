package org.example.chapter01.task08;

public class StringReverser {
    public String reverse(String word) {
        if (word == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            builder.append(word.charAt(i));
        }
        return builder.toString();
    }
}
