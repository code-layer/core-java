package wm.session16.cf;

import java.util.List;
import java.util.Date;
import java.util.ArrayList;

public class GenericsDemo
{
    public static void main(final String[] args) {
        final List<String> textList = new ArrayList<String>();
        textList.add("New Delhi");
        textList.add("123.50");
        textList.add("Ad Tag: I Love You Rasna");
        System.out.println(" **** TEXT LIST details *** ");
        System.out.println(textList);
        final List<Object> dataList = new ArrayList<Object>();
        dataList.add("Delhi");
        dataList.add(100);
        dataList.add(new Date());
        System.out.println(" **** DATA LIST details *** ");
        System.out.println(dataList);
        System.out.println();
    }
}