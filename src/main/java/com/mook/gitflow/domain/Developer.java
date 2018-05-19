package com.mook.gitflow.domain;

import java.io.Serializable;

public class Developer implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -568493323570726674L;

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Developer [id=" + id + ", name=" + name + "]";
    }

}
