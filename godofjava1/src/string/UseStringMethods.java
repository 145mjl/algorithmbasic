package string;

public class UseStringMethods {
    public static void main(String[] args){
        UseStringMethods practice = new UseStringMethods();
        String text="The String class represents character strings.";
        practice.printWords(text);
        practice.findString(text,"string");
        practice.findAnyCaseString(text,"string");
        practice.countChar(text,'s');
        practice.printContainWords(text,"ss");
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

    public void countChar(String str,char c){
        int cnt=0;
        char[] charArray = str.toCharArray();
        for(char temp:charArray){
            if(temp==c){
                cnt++;
            }
        }
        System.out.println(str+"에서 "+"\'"+c+"\'와 동일한 char의 개수 : "+cnt);
    }

    public void printContainWords(String str,String findStr){
        String[] splitResults=str.split(" ");
        for(String temp:splitResults){
            if(temp.contains(findStr)){
                System.out.println(temp);
            }
        }
    }
}
