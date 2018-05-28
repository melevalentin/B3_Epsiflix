package business;

public class Episode {
    private int id;
    private String title;
    private String description;
    private int duration;
    private String url;
    private Media mediaByIdMedia;

    public Episode() {
    }

    public Episode(int id, String title, String description, int duration, String url, Media mediaByIdMedia) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.url = url;
        this.mediaByIdMedia = mediaByIdMedia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Media getMediaByIdMedia() {
        return mediaByIdMedia;
    }

    public void setMediaByIdMedia(Media mediaByIdMedia) {
        this.mediaByIdMedia = mediaByIdMedia;
    }
}
