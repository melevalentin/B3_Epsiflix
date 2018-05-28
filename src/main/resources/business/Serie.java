package business;

public class Serie {
    private int id;
    private int episodeNumber;
    private int seasonNumber;
    private Media mediaByIdMedia;

    public Serie() {
    }

    public Serie(int id, int episodeNumber, int seasonNumber, Media mediaByIdMedia) {
        this.id = id;
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
        this.mediaByIdMedia = mediaByIdMedia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public Media getMediaByIdMedia() {
        return mediaByIdMedia;
    }

    public void setMediaByIdMedia(Media mediaByIdMedia) {
        this.mediaByIdMedia = mediaByIdMedia;
    }
}
