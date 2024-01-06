package wm.session16.cf;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class GenericWildcardDemo
{
    static List<String> textList;
    static List<Object> dataList;
    static List<Number> numberList;
    static List<Integer> intList;
    
    static {
        GenericWildcardDemo.textList = new ArrayList<String>();
        GenericWildcardDemo.dataList = new ArrayList<Object>();
        GenericWildcardDemo.numberList = new ArrayList<Number>();
        GenericWildcardDemo.intList = new ArrayList<Integer>();
    }
    
    public static void main(final String[] args) {
        initializeTextList();
        initializeDataList();
        initializeNumberList();
        initializeIntList();
        System.out.println(" **** TEXT LIST details *** ");
        displayData(GenericWildcardDemo.textList);
        System.out.println("\n **** DATA LIST details *** ");
        displayData(GenericWildcardDemo.dataList);
        System.out.println("\n **** NUMBER LIST details *** ");
        displayNumberData(GenericWildcardDemo.numberList);
        System.out.println("\n **** INT LIST details *** ");
        displayNumberData(GenericWildcardDemo.intList);
    }
    
    private static void initializeIntList() {
        GenericWildcardDemo.intList.add(new Integer(120));
        GenericWildcardDemo.intList.add(new Integer(354));
    }
    
    private static void initializeNumberList() {
        GenericWildcardDemo.numberList.add(new Integer(100));
        GenericWildcardDemo.numberList.add(new Double(145.78));
    }
    
    public static void displayNumberData(final List<? extends Number> data) {
        for (final Object o : data) {
            System.out.println(o);
        }
    }
    
    public static void displayData(final List<?> data) {
        for (final Object o : data) {
            System.out.println(o);
        }
    }
    
    private static void initializeDataList() {
        GenericWildcardDemo.dataList.add("Delhi");
        GenericWildcardDemo.dataList.add(100);
        GenericWildcardDemo.dataList.add(new Date());
    }
    
    private static void initializeTextList() {
        GenericWildcardDemo.textList.add("New Delhi");
        GenericWildcardDemo.textList.add("123.50");
        GenericWildcardDemo.textList.add("Ad Tag: I Love You Rasna");
    }
}