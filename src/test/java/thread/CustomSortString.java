package thread;

import java.util.HashMap;
import java.util.Map;

public class CustomSortString {

    public void test(){

    }

    public String SortT(String s, String t){
        if(s == null || t ==null || s.length() == 0 || t.length() == 0){
            return t;
        }
        Map<String, Integer> unSortedMap = new HashMap<>();
        for(char i : t.toCharArray()){
            Integer c = unSortedMap.get(String.valueOf(i));
            Integer count = c == null ? 1 : c+1;
            unSortedMap.put(String.valueOf(i), count);
        }
        StringBuilder res = new StringBuilder();
        for(char j : s.toCharArray()){
            Integer cc = unSortedMap.get(String.valueOf(j));
            if( cc == null){
                continue;
            }else{
                while(cc > 0){
                    res.append(String.valueOf(j));
                    cc--;
                }
                unSortedMap.put(String.valueOf(j), 0);
            }
        }
        for(char i : t.toCharArray()){
            Integer count = unSortedMap.get(String.valueOf(i));
            if(count == null || count == 0){
                continue;
            }else{
                while(count > 0){
                    res.append(String.valueOf(i));
                    count--;
                }
                unSortedMap.put(String.valueOf(i), 0);
            }
        }
        return res.toString();
    }

}
