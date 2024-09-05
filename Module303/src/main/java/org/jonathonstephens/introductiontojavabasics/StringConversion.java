package org.jonathonstephens.introductiontojavabasics;

public class StringConversion {
    public static void main(String[] args) {
        String intString = "1";
        int intValue = Integer.parseInt(intString); //parseInt method convert string into primitive data
        System.out.println(intValue);
        Integer IntWrapper = Integer.valueOf(intValue); //valueOf(): convert string into non primitive
        System.out.println(IntWrapper);
        String doubleString = "1.0";
        double doubleValue = Double.parseDouble(doubleString);
        System.out.println(doubleValue);
        Float wrapper = Float.valueOf(doubleString);
        System.out.println(wrapper);


    }
}
