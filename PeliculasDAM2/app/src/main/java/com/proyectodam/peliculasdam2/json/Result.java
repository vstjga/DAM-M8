package com.proyectodam.peliculasdam2.json;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// import javax.annotation.Generated;

// @Generated("org.jsonschema2pojo")
public class Result implements Parcelable {

    private Boolean adult;
    private String backdrop_path;
    private List<Integer> genre_ids = new ArrayList<Integer>();
    private Integer id;
    private String original_language;
    private String original_title;
    private String overview;
    private String release_date;
    private String poster_path;
    private Double popularity;
    private String title;
    private Boolean video;
    private Double vote_average;
    private Integer vote_count;
    private Map<String, Object> additional_properties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Result() {
    }

    /**
     *
     * @param id
     * @param genre_ids
     * @param title
     * @param release_date
     * @param overview
     * @param poster_path
     * @param original_title
     * @param vote_average
     * @param original_language
     * @param adult
     * @param backdrop_path
     * @param vote_count
     * @param video
     * @param popularity
     */
    public Result(Boolean adult, String backdrop_path, List<Integer> genre_ids, Integer id, String original_language, String original_title, String overview, String release_date, String poster_path, Double popularity, String title, Boolean video, Double vote_average, Integer vote_count) {
        this.adult = adult;
        this.backdrop_path = backdrop_path;
        this.genre_ids = genre_ids;
        this.id = id;
        this.original_language = original_language;
        this.original_title = original_title;
        this.overview = overview;
        this.release_date = release_date;
        this.poster_path = poster_path;
        this.popularity = popularity;
        this.title = title;
        this.video = video;
        this.vote_average = vote_average;
        this.vote_count = vote_count;
    }

    /**
     *
     * @return
     *     The adult
     */
    public Boolean getAdult() {
        return adult;
    }

    /**
     *
     * @param adult
     *     The adult
     */
    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    /**
     *
     * @return
     *     The backdrop_path
     */
    public String getbackdrop_path() {
        return backdrop_path;
    }

    /**
     *
     * @param backdrop_path
     *     The backdrop_path
     */
    public void setbackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    /**
     *
     * @return
     *     The genre_ids
     */
    public List<Integer> getgenre_ids() {
        return genre_ids;
    }

    /**
     *
     * @param genre_ids
     *     The genre_ids
     */
    public void setgenre_ids(List<Integer> genre_ids) {
        this.genre_ids = genre_ids;
    }

    /**
     *
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     *     The original_language
     */
    public String getoriginal_language() {
        return original_language;
    }

    /**
     *
     * @param original_language
     *     The original_language
     */
    public void setoriginal_language(String original_language) {
        this.original_language = original_language;
    }

    /**
     *
     * @return
     *     The original_title
     */
    public String getoriginal_title() {
        return original_title;
    }

    /**
     *
     * @param original_title
     *     The original_title
     */
    public void setoriginal_title(String original_title) {
        this.original_title = original_title;
    }

    /**
     *
     * @return
     *     The overview
     */
    public String getOverview() {
        return overview;
    }

    /**
     *
     * @param overview
     *     The overview
     */
    public void setOverview(String overview) {
        this.overview = overview;
    }

    /**
     *
     * @return
     *     The release_date
     */
    public String getrelease_date() {
        return release_date;
    }

    /**
     *
     * @param release_date
     *     The release_date
     */
    public void setrelease_date(String release_date) {
        this.release_date = release_date;
    }

    /**
     *
     * @return
     *     The poster_path
     */
    public String getposter_path() {
        return poster_path;
    }

    /**
     *
     * @param poster_path
     *     The poster_path
     */
    public void setposter_path(String poster_path) {
        this.poster_path = poster_path;
    }

    /**
     *
     * @return
     *     The popularity
     */
    public Double getPopularity() {
        return popularity;
    }

    /**
     *
     * @param popularity
     *     The popularity
     */
    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    /**
     *
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     *     The video
     */
    public Boolean getVideo() {
        return video;
    }

    /**
     *
     * @param video
     *     The video
     */
    public void setVideo(Boolean video) {
        this.video = video;
    }

    /**
     *
     * @return
     *     The vote_average
     */
    public Double getvote_average() {
        return vote_average;
    }

    /**
     *
     * @param vote_average
     *     The vote_average
     */
    public void setvote_average(Double vote_average) {
        this.vote_average = vote_average;
    }

    /**
     *
     * @return
     *     The vote_count
     */
    public Integer getvote_count() {
        return vote_count;
    }

    /**
     *
     * @param vote_count
     *     The vote_count
     */
    public void setvote_count(Integer vote_count) {
        this.vote_count = vote_count;
    }

    public Map<String, Object> getadditional_properties() {
        return this.additional_properties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additional_properties.put(name, value);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.adult);
        dest.writeString(this.backdrop_path);
        dest.writeList(this.genre_ids);
        dest.writeValue(this.id);
        dest.writeString(this.original_language);
        dest.writeString(this.original_title);
        dest.writeString(this.overview);
        dest.writeString(this.release_date);
        dest.writeString(this.poster_path);
        dest.writeValue(this.popularity);
        dest.writeString(this.title);
        dest.writeValue(this.video);
        dest.writeValue(this.vote_average);
        dest.writeValue(this.vote_count);
  //      dest.writeParcelable((Parcelable) this.additional_properties, flags);
    }

    protected Result(Parcel in) {
        this.adult = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.backdrop_path = in.readString();
        this.genre_ids = new ArrayList<Integer>();
        in.readList(this.genre_ids, List.class.getClassLoader());
        this.id = (Integer) in.readValue(Integer.class.getClassLoader());
        this.original_language = in.readString();
        this.original_title = in.readString();
        this.overview = in.readString();
        this.release_date = in.readString();
        this.poster_path = in.readString();
        this.popularity = (Double) in.readValue(Double.class.getClassLoader());
        this.title = in.readString();
        this.video = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.vote_average = (Double) in.readValue(Double.class.getClassLoader());
        this.vote_count = (Integer) in.readValue(Integer.class.getClassLoader());
//        this.additional_properties = in.readParcelable(Map<String, Object>.class.getClassLoader());
    }

    public static final Parcelable.Creator<Result> CREATOR = new Parcelable.Creator<Result>() {
        public Result createFromParcel(Parcel source) {
            return new Result(source);
        }

        public Result[] newArray(int size) {
            return new Result[size];
        }
    };
}
