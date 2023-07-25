package org.example;

public class StringManipulation {
    public static void main(String[] args) {
        String str= "Hai Chandru How is going on your vacation";
        String str2="Hollow Chandru";
        System.out.println(str.charAt(8));
        System.out.println(str.length());
        System.out.println(str.indexOf('H'));
        System.out.println(str.lastIndexOf('H'));
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.substring(2,9));
        System.out.println(str.toLowerCase());
        System.out.println(str.concat("the man the maith the forest"));
      String[] sp= str.split(" ");
       // System.out.println(sp);
        for (int i=0;i<sp.length;i++)
            System.out.println(sp[i]);

        String s1= "chandru";
        String s2= "chan";
        int i1=100;
        int i2=200;
        System.out.println(s1+s2);
        System.out.println(i1+i2);
        System.out.println(s1+s2+i1+i2);
        System.out.println(i1+i2+s1+s2);
        System.out.println(s1+s2+(i1+i2));
    }
}
