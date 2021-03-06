package com.cmcc.migutvtwo.dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table PLAY_MEMORY.
 */
public class PlayMemory {

    private String id;
    private String cid;
    private String lback;
    private Integer playtime;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public PlayMemory() {
    }

    public PlayMemory(String id) {
        this.id = id;
    }

    public PlayMemory(String id, String cid, String lback, Integer playtime) {
        this.id = id;
        this.cid = cid;
        this.lback = lback;
        this.playtime = playtime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getLback() {
        return lback;
    }

    public void setLback(String lback) {
        this.lback = lback;
    }

    public Integer getPlaytime() {
        return playtime;
    }

    public void setPlaytime(Integer playtime) {
        this.playtime = playtime;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
