public class FamilyClient extends Client {

    public FamilyClient(String username, String password) {
        super(username, password);
        this.instancesNumber = grantInstances();
    }

    @Override
    public int grantInstances() {
        return 7;
    }
}
