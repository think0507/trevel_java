package trevel;

public class Asia extends Continent implements IContinent{
    public Asia(){
        super("Asia");
    }

    public String explane(){
        return "아시아 설명";
    }
    public String famousNation(){
        return "한국, 일본, 북한";
    }
}

