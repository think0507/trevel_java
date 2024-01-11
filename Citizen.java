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
    public String toString(String name, String nationality, String whereIAm){
        return "이름은"+name+"국적은"+nationality+" 입니다";
    }
}
