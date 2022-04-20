package com.example.multiview;

public class User {
    int idResource;
    String name;
    boolean isFeeatured;

    public User(int idResource, String name, boolean isFeeatured) {
        this.idResource = idResource;
        this.name = name;
        this.isFeeatured = isFeeatured;
    }

    public boolean isFeeatured() {
        return isFeeatured;
    }

    public void setFeeatured(boolean feeatured) {
        isFeeatured = feeatured;
    }



    public int getIdResource() {
        return idResource;
    }

    public void setIdResource(int idResource) {
        this.idResource = idResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
