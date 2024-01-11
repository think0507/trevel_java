package trevel;

public class Europe extends Continent implements IContinent{
    public Europe(){
        super("Europe");
    }

    public String explane(){
        return "아시아 설명";
    }

    public String famousNation(){
        return "프랑스, 스페인, 이탈리아";
    }
}
