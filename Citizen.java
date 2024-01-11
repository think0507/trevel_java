package trevel;

public class Citizen {
    public String name;
    public String nationality;
    public Citizen(String name, String nationality){
        this.name = name;
        this.nationality = nationality;
    }
    public String toString(String name, String nationality){
        return "이름은"+name+"국적은"+nationality+" 입니다";
    }
}
