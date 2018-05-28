package business;

import java.util.Collection;

public class Type {
    private int id;
    private String label;
    private Collection<Media> mediaById;

    public Type() {
    }

    public Type(int id, String label, Collection<Media> mediaById) {
        this.id = id;
        this.label = label;
        this.mediaById = mediaById;
    }

    public Type(int id, String label) {
        this.id = id;
        this.label = label;
    }

    public Type(String label) {
        this.label = label;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Collection<Media> getMediaById() {
        return mediaById;
    }

    public void setMediaById(Collection<Media> mediaById) {
        this.mediaById = mediaById;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", label='" + label + '\'' +
                '}';
    }
}
