public abstract class Client {
    protected String username;
    protected String password;
    protected int instancesNumber;

    public Client(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getInstancesNumber() {
        return instancesNumber;
    }

    public void setInstancesNumber(int instancesNumber) {
        this.instancesNumber = instancesNumber;
    }

    public abstract int grantInstances();
}

