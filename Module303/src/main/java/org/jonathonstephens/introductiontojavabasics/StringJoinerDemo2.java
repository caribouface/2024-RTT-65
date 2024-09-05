package org.jonathonstephens.introductiontojavabasics;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        StringJoiner joinNames = new StringJoiner(",", "[", "]");

        joinNames.add("New York");
        joinNames.add("New Jersey");
        System.out.println(joinNames.toString());


        StringJoiner joinNames2 = new StringJoiner(":", "[", "]");
        joinNames.add("Dallas");
        joinNames2.add("Chicago");

        StringJoiner merge = joinNames.merge(joinNames2);
        System.out.println(merge);

    }

}
