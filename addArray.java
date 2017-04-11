import java.util.*;
import java.io.*;

public class addArray{
  public static void main(String [] args){

  ArrayList<String> lastList = new ArrayList<String>();
  ArrayList<String> lastList2 = new ArrayList<String>();
  String text = "Hello world";
  BufferedWriter output = null;
  String line = "";
    try{
        Scanner newfile = new Scanner(new FileInputStream("testdata"));
        String n="";
        int m = 0;
        for(int i=0;i<51;i++){
          while(newfile.hasNextLine()){
            //lastList.add(newfile.nextLine());
            //String fullname = line.substring((line.lastIndexOf("|"))+1);
            String fullname = newfile.nextLine().substring((newfile.nextLine().lastIndexOf("|"))+1);
            lastList2.add(fullname);
            System.out.println(lastList2);

          }
        }
            FileOutputStream is = new FileOutputStream("file50");
            OutputStreamWriter osw = new OutputStreamWriter(is);
            Writer w = new BufferedWriter(osw);
            //w.write("POTATO!!!");
            //w.close();
            if(m<51){
            for(int k=0;k<51;k++){
            w.write(lastList2.get(m));
            m++;
            w.close();
          }
          }
        }
  catch(IOException e){
    System.out.println(e.getLocalizedMessage());
  }


}
}
