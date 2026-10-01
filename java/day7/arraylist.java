package day7;
import java.util.*;
class arraylist {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("Ravi");//adding objects in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        //traversing through the list through iterator
        Iterator<String> itr0 = list.iterator();
        while(itr0.hasNext()){
        System.out.println(itr0.next());
    }
        list.add(0,"priya");
        list.remove(2);
        list.add(2,"nikhil");
        Collections.sort(list);
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            Collections.swap(list,0,2);
        }}
    }
    

