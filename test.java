package trevel;

import java.util.ArrayList;
import java.util.Scanner;

import static trevel.AddArray.loading;

public class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //초기데이터 추가
        loading();

        //ArrayList 선언
        ArrayList<Object> citizenObjects = AddArray.citizenObjects;


        //선택지 [1. 시민 생성][2. 시민 여행][3. 시민 이주]
        boolean flag = true;
        while(flag){

            //동작이 끝날때마다 현재 배열 목록 보여주기
            for (Object citizen : citizenObjects) {
                if (citizen instanceof Citizen) {
                    System.out.println(((Citizen) citizen).name + ", " + ((Citizen) citizen).nationality);
                }
            }

            //선택지 출력
            System.out.println("[1. 시민 생성 //구현중]  [2. 시민 여행]  [3. 시민 이주] [4. 종료]");

            int n = sc.nextInt();
            switch (n){
                //1. 생성일경우
                case 1 :
//                    String name = sc.next();
//                    String nationality = sc.next();
//                    String whereIAm = sc.next();
//                    Citizen citizen = new Citizen(name, nationality,whereIAm);
//                    citizenObjects.add(citizen);
                    System.out.println("추후 구현예정. 실패");
                    break;

                //2. 시민여행일경우 changeWhereIAm();     // - 개인, 단체일경우를 오버로딩해서 매개변수 수에따라 다르게 입국
                case 2 :

                    break;
                //3. 시민이주일경우 changeNationality();    // - 특정 국적 제외/
                case 3 :
                    System.out.println("3");
                    break;

                //4. 종료
                case 4 :
                    flag = false;
                    break;

            }
        }
    }
}