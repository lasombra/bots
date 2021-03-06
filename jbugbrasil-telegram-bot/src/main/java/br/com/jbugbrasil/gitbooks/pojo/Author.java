package br.com.jbugbrasil.gitbooks.pojo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "id",
        "type",
        "username",
        "name",
        "location",
        "website",
        "bio",
        "urls",
        "permissions",
        "dates",
        "counts"
})
public class Author {

    @JsonProperty("id")
    private String id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("username")
    private String username;
    @JsonProperty("name")
    private String name;
    @JsonProperty("location")
    private String location;
    @JsonProperty("website")
    private String website;
    @JsonProperty("bio")
    private String bio;
    @JsonProperty("urls")
    private Urls_ urls;
    @JsonProperty("permissions")
    private Permissions_ permissions;
    @JsonProperty("dates")
    private Dates_ dates;
    @JsonProperty("counts")
    private Counts_ counts;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The username
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     * The username
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     * The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The location
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * The location
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return
     * The website
     */
    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    /**
     *
     * @param website
     * The website
     */
    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     *
     * @return
     * The bio
     */
    @JsonProperty("bio")
    public String getBio() {
        return bio;
    }

    /**
     *
     * @param bio
     * The bio
     */
    @JsonProperty("bio")
    public void setBio(String bio) {
        this.bio = bio;
    }

    /**
     *
     * @return
     * The urls
     */
    @JsonProperty("urls")
    public Urls_ getUrls() {
        return urls;
    }

    /**
     *
     * @param urls
     * The urls
     */
    @JsonProperty("urls")
    public void setUrls(Urls_ urls) {
        this.urls = urls;
    }

    /**
     *
     * @return
     * The permissions
     */
    @JsonProperty("permissions")
    public Permissions_ getPermissions() {
        return permissions;
    }

    /**
     *
     * @param permissions
     * The permissions
     */
    @JsonProperty("permissions")
    public void setPermissions(Permissions_ permissions) {
        this.permissions = permissions;
    }

    /**
     *
     * @return
     * The dates
     */
    @JsonProperty("dates")
    public Dates_ getDates() {
        return dates;
    }

    /**
     *
     * @param dates
     * The dates
     */
    @JsonProperty("dates")
    public void setDates(Dates_ dates) {
        this.dates = dates;
    }

    /**
     *
     * @return
     * The counts
     */
    @JsonProperty("counts")
    public Counts_ getCounts() {
        return counts;
    }

    /**
     *
     * @param counts
     * The counts
     */
    @JsonProperty("counts")
    public void setCounts(Counts_ counts) {
        this.counts = counts;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}