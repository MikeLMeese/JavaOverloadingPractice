public class TvShow {

    private String name;
    private int episodes;
    private String genre;

    // Start of overloaded constructors
    public TvShow () {
        this.name = "";
        this.episodes = 0;
        this.genre = "";
    }

    public TvShow (String name) {
        this.name = name;
        this.episodes = 0;
        this.genre = "";
    }

    public TvShow (String name, int episodes) {
        this.name = name;
        this.episodes = episodes;
        this.genre = "";
    }

    public TvShow (int episodes, String genre) {
        this.name = "";
        this.episodes = episodes;
        this.genre = genre;
    }

    public TvShow (String name, String genre) {
        this.name = name;
        this.episodes = 0;
        this.genre = genre;
    }
    // End of overloaded constructors

    public TvShow(String name, int episodes, String genre) {
        this.name = name;
        this.episodes = episodes;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getEpisodes() {
        return episodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "The show's name is " + getName() + " with " + getEpisodes() + " episodes. The genre of the show is " + getGenre() + ".";
    }
}