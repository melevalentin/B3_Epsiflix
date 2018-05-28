package business;

import java.util.Collection;

public class Media {
    private int id;
    private String title;
    private String subtitle;
    private String description;
    private int duration;
    private String producer;
    private String productionCountry;
    private String productionCompany;
    private int year;
    private String imgCover;
    private Collection<Episode> episodesById;
    private Collection<Favoris> favorisesById;
    private Collection<Film> filmsById;
    private Type typeByIdType;
    private Collection<Serie> seriesById;

    public Media() {
    }

    public Media(int id, String title, String subtitle, String description, int duration, String producer, String productionCountry, String productionCompany, int year, String imgCover, Type typeByIdType) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
        this.duration = duration;
        this.producer = producer;
        this.productionCountry = productionCountry;
        this.productionCompany = productionCompany;
        this.year = year;
        this.imgCover = imgCover;
        this.typeByIdType = typeByIdType;
    }

    public Media(int id, String title, String subtitle, String description, int duration, String producer, String productionCountry, String productionCompany, int year, String imgCover, Collection<Episode> episodesById, Collection<Favoris> favorisesById, Collection<Film> filmsById, Type typeByIdType, Collection<Serie> seriesById) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
        this.duration = duration;
        this.producer = producer;
        this.productionCountry = productionCountry;
        this.productionCompany = productionCompany;
        this.year = year;
        this.imgCover = imgCover;
        this.episodesById = episodesById;
        this.favorisesById = favorisesById;
        this.filmsById = filmsById;
        this.typeByIdType = typeByIdType;
        this.seriesById = seriesById;
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

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
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

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    public String getProductionCompany() {
        return productionCompany;
    }

    public void setProductionCompany(String productionCompany) {
        this.productionCompany = productionCompany;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getImgCover() {
        return imgCover;
    }

    public void setImgCover(String imgCover) {
        this.imgCover = imgCover;
    }

    public Collection<Episode> getEpisodesById() {
        return episodesById;
    }

    public void setEpisodesById(Collection<Episode> episodesById) {
        this.episodesById = episodesById;
    }

    public Collection<Favoris> getFavorisesById() {
        return favorisesById;
    }

    public void setFavorisesById(Collection<Favoris> favorisesById) {
        this.favorisesById = favorisesById;
    }

    public Collection<Film> getFilmsById() {
        return filmsById;
    }

    public void setFilmsById(Collection<Film> filmsById) {
        this.filmsById = filmsById;
    }

    public Type getTypeByIdType() {
        return typeByIdType;
    }

    public void setTypeByIdType(Type typeByIdType) {
        this.typeByIdType = typeByIdType;
    }

    public Collection<Serie> getSeriesById() {
        return seriesById;
    }

    public void setSeriesById(Collection<Serie> seriesById) {
        this.seriesById = seriesById;
    }

    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", producer='" + producer + '\'' +
                ", productionCountry='" + productionCountry + '\'' +
                ", productionCompany='" + productionCompany + '\'' +
                ", year=" + year +
                ", imgCover='" + imgCover + '\'' +
                ", typeByIdType=" + typeByIdType +
                '}';
    }
}
