package trevel;

public class ImmigrationManager implements IImmigrationManage{
    @Override
    public void changeWhereIAm(String name, String whereIAm) {
        for (Object citizen : AddArray.citizenObjects) {
            if (((Citizen)citizen).name.equals(name)) {
                ((Citizen)citizen).whereIAm = whereIAm;
                break;
            }
        }
    }
}
