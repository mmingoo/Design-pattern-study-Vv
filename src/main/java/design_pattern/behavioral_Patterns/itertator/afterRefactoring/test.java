package design_pattern.behavioral_Patterns.itertator.afterRefactoring;

import java.util.*;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("사과", "바나나", "오렌지", "포도", "딸기");

        Set<String> hashSet = new HashSet<>();
        hashSet.add("사과");
        hashSet.add("바나나");
        hashSet.add("오렌지");
        hashSet.add("사과");  // 중복 - 추가되지 않음
        hashSet.add("포도");


        ////////////////////////////////////////////////////////






        //이터레이터
        Iterator<String> listIterator = fruits.iterator();

        //다음 데이터가 있다면, 출력하는 코드
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.println("과일: " + fruit);
        }






        //이터레이터 생성
        Iterator<String> hashIter = hashSet.iterator();

        //다음 데이터가 있다면, 출력하는 코드
        while (hashIter.hasNext()) {
            String fruit = hashIter.next();
            System.out.println("과일: " + fruit);
        }
    }
}
