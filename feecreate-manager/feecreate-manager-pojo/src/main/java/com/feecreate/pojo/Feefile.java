package com.feecreate.pojo;

public class Feefile {
    private Integer filleid;

    private String filepath;

    private String filename;

    private String filetype;

    public Integer getFilleid() {
        return filleid;
    }

    public void setFilleid(Integer filleid) {
        this.filleid = filleid;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }
}