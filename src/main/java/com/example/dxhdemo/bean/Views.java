package com.example.dxhdemo.bean;


import javax.persistence.*;



@Entity
@Table(name= "views")
public class Views {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String view;
    private String imageUrl;
    private String content;
    private String city;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }


    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
