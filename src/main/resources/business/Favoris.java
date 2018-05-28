package business;

public class Favoris {
    private int id;
    private Users usersByIdUser;
    private Media mediaByIdMedia;

    public Favoris() {
    }

    public Favoris(int id, Users usersByIdUser, Media mediaByIdMedia) {
        this.id = id;
        this.usersByIdUser = usersByIdUser;
        this.mediaByIdMedia = mediaByIdMedia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUsersByIdUser() {
        return usersByIdUser;
    }

    public void setUsersByIdUser(Users usersByIdUser) {
        this.usersByIdUser = usersByIdUser;
    }

    public Media getMediaByIdMedia() {
        return mediaByIdMedia;
    }

    public void setMediaByIdMedia(Media mediaByIdMedia) {
        this.mediaByIdMedia = mediaByIdMedia;
    }
}
