package string;

public class UseStringMethods {
    public static void main(String[] args){
        UseStringMethods practice = new UseStringMethods();
        String text="The String class represents character strings.";
        practice.printWords(text);
        practice.findString(text,"string");
        practice.findAnyCaseString(text,"string");
    }

    public void printWords(String str){
        String[] strings=str.split(" ");
        for(String temp:strings){
            System.out.println(temp);
        }
    }

    public void findString(String str,String findStr){
        int pos=str.indexOf(findStr);
        System.out.println(pos);
    }

    public void findAnyCaseString(String str,String findStr){
        String tempStr = str.toLowerCase();
        String tempFindStr = findStr.toLowerCase();
        System.out.println(tempStr.indexOf(findStr));
    }
}
