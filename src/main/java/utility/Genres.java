package utility;

public enum Genres {
    ACTION("action"),
    COMEDY("comedy"),
    DRAMA("drama"),
    FAMILY("family"),
    FANTASY("fantasy"),
    HORROR("horror"),
    MYSTERY("mystery"),
    SCIFI("sci-fi"),
    WAR("war"),
    ADVENTURE("adventure"),
    CRIME("crime"),
    ROMANCE("romance"),
    THRILLER("thriller"),
    WESTERN("western");

    public final String label;

    Genres(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }
}
