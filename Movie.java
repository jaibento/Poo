public class Movie implements INetflixMedia {
    private String title;
    private int durationInMinutes;
    private String synopsis;

    public Movie(String title, int durationInMinutes, String synopsis) {
        this.title = title;
        this.durationInMinutes = durationInMinutes;
        this.synopsis = synopsis;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
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

    @Override
    public void play() {
        System.out.println("Playing the Movie");
    }

    @Override
    public void pause() {
        System.out.println("The Movie Paused");
    }

    @Override
    public void stop() {
        System.out.println("The Movie Stopped");
    }
}

