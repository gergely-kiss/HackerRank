//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,String> dictionary =new HashMap<String,String>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            dictionary.put(name, phone+"");
        }
        while(in.hasNext()){
            String s = in.next();
            if(dictionary.containsKey(s)){
                System.out.println(s + "=" + dictionary.get(s));
            }
            else{
                System.out.println("Not found");
            }

        }
        in.close();
    }
}
