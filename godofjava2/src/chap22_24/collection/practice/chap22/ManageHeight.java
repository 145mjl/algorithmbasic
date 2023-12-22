package chap22_24.collection.practice.chap22;

import java.util.ArrayList;

public class ManageHeight {


    ArrayList<ArrayList<Integer>> gradeHeight;

    public ManageHeight(){
        gradeHeight= new ArrayList<>();
    }

    public static void main(String[] args) {
        ManageHeight manageHeight = new ManageHeight();
        manageHeight.setData();
        for(int i=1;i<=5;i++){
            manageHeight.printHeight(i);
        }
        manageHeight.printAverage();
    }

    public void setData(){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(170);list1.add(180);list1.add(173);list1.add(175);list1.add(177);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(160);list2.add(165);list2.add(167);list2.add(186);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(158);list3.add(177);list3.add(187);list3.add(176);
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(173);list4.add(182);list4.add(181);
        ArrayList<Integer> list5 = new ArrayList<>();
        list5.add(170);list5.add(180);list5.add(165);list5.add(177);list5.add(172);

        this.gradeHeight.add(list1);
        this.gradeHeight.add(list2);
        this.gradeHeight.add(list3);
        this.gradeHeight.add(list4);
        this.gradeHeight.add(list5);
    }

    public void printHeight(int classNo){
        ArrayList<Integer> list = this.gradeHeight.get(classNo-1);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    public void printAverage(){//indexOutOfBounds 주의
        int i=0;
        while(i<this.gradeHeight.size()){
            ArrayList<Integer> list = this.gradeHeight.get(i);
            double sum=0;
            for(int j=0;j<list.size();j++){
                sum+=list.get(j);
            }
            System.out.println("Class No.:"+(i+1));
            System.out.println("Height Average :"+sum/list.size());
            i++;
        }
    }
}
