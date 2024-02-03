package string;

public class StringCheck {
    public static void main(String[] args){
        StringCheck sample = new StringCheck();

        String[] addresses=new String[]{
          "서울시 구로구 신도림동",
          "경기도 성남시 분당구 정자동 XX로",
          "서울시 구로구 개봉동",
        };
        sample.checkAddress(addresses);
        sample.containsAddress(addresses);
        sample.checkMatch();
        sample.checkIndexOf();
        sample.checkLastIndexOf();
        sample.checkSubString();
        sample.checkSplit();
        sample.checkTrim();
        sample.checkBlank();
        sample.checkReplace();
        sample.checkFormat();
        sample.checkToXXCase();
        sample.checkValueOf();
        sample.internCheck();
    }


    public void checkAddress(String[] addresses) {
        System.out.println("StringCheck.checkAddress");
        int startCount=0,endCount=0;
        String startText="서울시";
        String endText="동";
        for(String address:addresses){
            if(address.startsWith(startText)){
                startCount++;
            }
            if(address.endsWith(endText)){
                endCount++;
            }
        }
        System.out.println("Starts with "+startText+" count is "+startCount);
        System.out.println("Ends with "+endText+" count is "+endCount);
    }

    public void containsAddress(String[] addresses){
        System.out.println("StringCheck.containsAddress");
        int containCount=0;
        String containText="구로구";
        for(String address:addresses){
            if(address.contains(containText)){
                containCount++;
            }
        }
        System.out.println("Contains "+containText+" count is "+containCount);
    }

    public void checkMatch(){
        System.out.println("StringCheck.checkMatch");
        String text="This is a text";
        String compare1="is";
        String compare2="this";
        System.out.println(text.regionMatches(2,compare1,0,1));
        System.out.println(text.regionMatches(5,compare1,0,2));
        System.out.println(text.regionMatches(true,0,compare2,0,4));
    }

    public void checkIndexOf(){
        System.out.println("StringCheck.checkIndexOf");
        String text="Java Technology is both a programming language and a platform";
        System.out.println(text.indexOf('a'));
        System.out.println(text.indexOf("a "));
        System.out.println(text.indexOf('a',20));
        System.out.println(text.indexOf("a ",20));
        System.out.println(text.indexOf('z'));
    }

    public void checkLastIndexOf(){
        System.out.println("StringCheck.checkLastIndexOf");
        String text="Java Technology is both a programming language and a platform";
        System.out.println(text.lastIndexOf('a'));
        System.out.println(text.lastIndexOf("a "));
        System.out.println(text.lastIndexOf('a',20));
        System.out.println(text.lastIndexOf("a ",20));
        System.out.println(text.lastIndexOf('z'));
    }

    public void checkSubString(){
        System.out.println("StringCheck.checkSubString");
        String text="Java technology";
        String technology=text.substring(5);
        System.out.println(technology);
        String tech=text.substring(5,9);
        System.out.println(tech);
    }

    public void checkSplit(){
        System.out.println("StringCheck.checkSplit");
        //split : 특정 알파벳 또는 기호 하나로 문자열을 나눌 때 권장됨
        //StringTokenizer : 특정 문자열로 문자열을 나눌 때 권장됨
        String text="Java Technology is both a programming language and a platform";
        String[] splitArray=text.split(" ");
        for(String temp:splitArray){
            System.out.println(temp);
        }
    }

    public void checkTrim(){
        System.out.println("StringCheck.checkTrim");
        String[] strings=new String[]{
                " a"," b ","    c","d    ","e   f","   "
        };
        for(String string:strings){
            System.out.println("["+string+"]");
            System.out.println("["+string.trim()+"]");
        }
    }

    public void checkBlank(){
        System.out.println("StringCheck.checkBlank");
        String text=" a ";
        if(text!=null && text.trim().length()>0){
            System.out.println("OK");
        }
    }

    public void checkReplace(){
        System.out.println("StringCheck.checkReplace");
        String text="The String class represents character strings.";
        System.out.println(text.replace('s','z'));
        System.out.println(text);
        System.out.println(text.replace("tring","trike"));
        System.out.println(text.replaceAll(" ","|"));
        System.out.println(text.replaceFirst(" ","|"));
    }

    public void checkFormat(){
        System.out.println("StringCheck.checkFormat");
        String text="제 이름은 %s입니다. 지금까지 %d권의 책을 썼고, 하루의 %f %%시간을 운동을 하는 데 할애하고 있습니다.";
        String realText=String.format(text,"이세화",5,10.5);
//        String realText=String.format(text,"이세화",5);
        System.out.println(realText);
    }

    public void checkToXXCase(){
        System.out.println("StringCheck.checkToCase");
        String text="The Sorcerer's Stone";
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
    }

    public void checkValueOf(){
        System.out.println("StringCheck.checkValueOf");
        byte b=1;
        String byte1=String.valueOf(b);
        String byte2=b+"";
        System.out.println(byte1);
        System.out.println(byte2);
    }

    public void internCheck(){
        System.out.println("사용해서는 안 되는 메소드 - intern()");
        String text1="Java Basic";
        String text2="Java Basic";
        String text3=new String("Java Basic");
        text3=text3.intern();
        System.out.println(text1==text2);
        System.out.println(text1==text3);
        System.out.println(text1.equals(text3));
    }
}
