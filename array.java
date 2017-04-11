import java.util.*;
import java.io.*;

public class array{
    public static void main(String [] args){
      ArrayList <String> myList = new ArrayList<String>();
      ArrayList<String> list1 = new ArrayList<String>();
      ArrayList<String> list2 = new ArrayList<String>();

      try{
          Scanner newfile = new Scanner(new FileInputStream("testdata"));
          Scanner myquery = new Scanner(new FileInputStream("queryfile"));
          String line = "";

          while(newfile.hasNextLine()){
            String s = newfile.nextLine();
              myList.add(s);
              String filename = s.substring((s.lastIndexOf("|"))+1);
              //list1.add(filename);
              //System.out.println(filename);
          }
          //System.out.println(myList);
          //System.out.println(myList.get(0));
          //System.out.println(list1.get(6));
          while(myquery.hasNextLine()){
            String z = myquery.nextLine();
            list2.add(z);
          }
          //System.out.println(list2.get(6));
        int a =0;
        for(int p =0; p<list2.size();p++){

          for(int i=0;i<myList.size();i++){
            if(myList.get(i).contains(list2.get(p))){
              System.out.println(myList.get(i));
              a++;
            }
          }
          if(a==0){
            System.out.println("Not found");
            a =0;
          }
          a =0;
          }
          }


      catch(IOException a){
        System.out.println(a.getLocalizedMessage());
      }

    }
}
