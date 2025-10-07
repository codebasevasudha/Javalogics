import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepCharInString {

    /*
     * First non repeative charachter in string
     * String str = vasudha
     *
     * */
    public static void main(String[] args) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap();
        String str = "vasudha";
        for(char ch: str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                System.out.println("First non repeative "+entry.getKey());
                break;
            }
        }

    }
}
