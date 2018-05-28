package business;

public class Film {
    private int id;
    private String url;
    private Media mediaByIdMedia;

    public Film() {
    }

    public Film(int id, String url, Media mediaByIdMedia) {
        this.id = id;
        this.url = url;
        this.mediaByIdMedia = mediaByIdMedia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
