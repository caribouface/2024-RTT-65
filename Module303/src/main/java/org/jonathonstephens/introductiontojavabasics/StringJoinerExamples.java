package org.jonathonstephens.introductiontojavabasics;

import java.util.StringJoiner;

public class StringJoinerExamples {
    public static void main(String[] args) {
        StringJoiner joinNames = new StringJoiner(", ");
        joinNames.add("Java");
        joinNames.add("Python");
        joinNames.add("C Sharp");
        joinNames.add("Javascript");
        System.out.println(joinNames);

    }
}
