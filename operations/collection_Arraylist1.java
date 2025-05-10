import java.util.ArrayList;

public class collection_Arraylist1 {
    public static void main(String[] args) {
        // <anythink> mention this type of data its store the one type of data
        // without this <> store any kind of data you can store 
        ArrayList a = new ArrayList<>();
        a.add("Hello");
        a.add("World");
        //adding elements
        System.out.println("list:"+a);
        // add the specific lkcation in the list
        a.add(1,"java");
        a.add(1);
        System.out.println("list:"+a);
        // removing elements
        a.remove(0);
        System.out.println("list:"+a);



    
    }
    
}
