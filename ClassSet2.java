package practice;
import java.util.*;
import java.text.*;
public class ClassSet2 {
    public static String getDay(Date d1)
    {
        String s1;
        SimpleDateFormat sdf=new SimpleDateFormat("EEEEE");
        s1=sdf.format(d1);
        return s1;
           // SimpleDateFormat s=new SimpleDateFormat('eeeeeeeeee');
    }
    public static void main(String[] args)
    {
        Date d1=new Date(2012/12/27);
        System.out.println("day is:"+getDay(d1));}
}

