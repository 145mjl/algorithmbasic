package chap22_24.collection.list.arraylist;

import java.util.ArrayList;

public class ListSample {
    public static void main(String[] args) {
        ListSample sample=new ListSample();
        sample.checkArrayList8();
    }

    private void checkArrayList8() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
//        System.out.println("Removed "+list.remove(0));
        System.out.println("Removed "+list.remove("A"));
        ArrayList<String> temp = new ArrayList<>();
        temp.add("A");
        list.removeAll(temp);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get("+i+") : "+list.get(i));
        }
    }

    private void checkArrayList7() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        String[] strList=list.toArray(new String[5]);
        for (String s : strList) {
            System.out.println("s = " + s);
        }
    }

    private void checkArrayList6() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        String[] strList=list.toArray(new String[0]);
        System.out.println("strList[0] = " + strList[0]);
    }


    private void checkArrayList4() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");

        ArrayList<String> list2=list;
        list.add("Ooops");

        for (String s : list2) {
            System.out.println("List2 = " + s);
        }
    }

    private void checkArrayList2() {
        ArrayList<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1,"A1");

        for (String s : list) {
            System.out.println("list = " + s);
        }

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("0 ");
        list2.addAll(list);
        for (String s : list2) {
            System.out.println("list2 = " + s);
        }
    }

    private void checkArrayList1() {
        ArrayList<String> list1 = new ArrayList<>(100);
        list1.add("ArrayListSample");
    }




}
