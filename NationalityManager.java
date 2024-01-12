package trevel;

public class NationalityManager implements INationalityManage{
    @Override
    public void changeNationality(String name, String nationality) {
        for (Object citizen : AddArray.citizenObjects) {
            if (((Citizen)citizen).name.equals(name)) {
                ((Citizen)citizen).nationality = nationality;
                break;
            }
        }
    }
}
