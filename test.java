package trevel;

public class test {
    public static void main(String[] args){
        //국가 생성
        Country KOREA = new Country("한국", "서울");
        Country JAPAN = new Country("일본", "도쿄");
        Country GERMANY = new Country("독일", "함부루크");
        Country CHINA = new Country("중국", "베이징");
        Country ITALY = new Country("이탈리아", "파스타");
        Country BRAZIL = new Country("브라질", "브라질리언");

        //국민 생성
        Citizen A = new Citizen("동렬", "한국");
        Citizen B = new Citizen("동욱", "중국");
        Citizen C = new Citizen("정민", "독일");
        Citizen D = new Citizen("은락", "이탈리아");
        Citizen E = new Citizen("은섭", "브라질");
        Citizen F = new Citizen("뽀꿀롬", "중국");

        //국적없는 시민 생성
        Person person1 = new Person("외노자", null);
        Person person2 = new Person("외노자2", null);


    }
}
