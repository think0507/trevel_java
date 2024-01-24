package trevel;

import java.util.function.Predicate;

public class NationalityManager implements INationalityManage{
    public void changeNationality(String name, String nationality) {



        for (Citizen citizen : AddArray.citizenObjects) {
            if (citizen.name.equals(name)) {
                citizen.nationality = nationality;
                break;
            }
        }
    }
}
