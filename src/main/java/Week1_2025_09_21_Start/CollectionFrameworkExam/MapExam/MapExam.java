package Week1_2025_09_21_Start.CollectionFrameworkExam.MapExam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("001","koo");
        map.put("002","kim");
        map.put("003","kang");

        map.put("001","uer"); //기존 키에 대한 값이 덮어씌워짐

        System.out.println(map.size());

        System.out.println(map.get("001")); //같은키로 값이 또 들어오면 기존 값이 새 값으로 교체
        System.out.println(map.get("002"));

        Set<String> key = map.keySet(); //Map의 모든 키를 Set 형태로 반환

        Iterator<String> iter = key.iterator(); // Set에 저장된 키들을 순회할 Iterator 생성
        while(iter.hasNext()){ //값이 없을때까지 반복
            String keys = iter.next(); //키값을 keys에 담기
            String values = map.get(keys); //벨류값을 하나씩 value에 담기
            System.out.println(keys +" : "+values); // key와 value 출력
        }
    }
}
