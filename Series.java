public class Series implements INetflixMedia {
    private String title;
    protected int durationInMinutes;
    private String synopsis;
    private int seasonsNumber;

    public Series(String title, int durationInMinutes, String synopsis, int seasonsNumber) {
        this.title = title;
        this.durationInMinutes = durationInMinutes;
        this.synopsis = synopsis;
        this.seasonsNumber = seasonsNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getSeasonsNumber() {
        return seasonsNumber;
    }

    public void setSeasonsNumber(int seasonsNumber) {
        this.seasonsNumber = seasonsNumber;
    }

    @Override
    public void play() {
        System.out.println("Playing the Series");
    }

    @Override
    public void pause() {
        System.out.println("The Series Paused");
    }

    @Override
    public void stop() {
        System.out.println("The Series Stopped");
    }
}
