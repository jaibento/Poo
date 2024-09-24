public class SingleClient extends Client {

    public SingleClient(String username, String password) {
        super(username, password);
        this.instancesNumber = grantInstances();
    }

    @Override
    public int grantInstances() {
        return 1;
    }
}
