package trevel;

public class Citizen {

    public String name;
    public String nationality;
    public String whereIAm;
    public Citizen(String name, String nationality, String whereIAm){
        this.name = name;
        this.nationality = nationality;
        this.whereIAm = whereIAm;
    }

    @Override
    public String toString(){
        return "이름은"+name+", 국적은 "+nationality+", 위치는 "+whereIAm+"입니다"+"\n-------------------------------------";
    }
}
