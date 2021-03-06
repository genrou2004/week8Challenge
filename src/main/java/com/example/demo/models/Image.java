package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Id;

/**
 * Created by student on 7/10/17.
 */
@Entity
public class Image {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String imgsrc;
    private String caption;
    private String imgname;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getImgname() {
        return imgname;
    }

    public void setImgname(String imgname) {
        this.imgname = imgname;
    }


    /*
    cloudinary.image("smartphone.png", {
  underlay: "site_bg.jpg",
  width: 80, height: 80, effect: "brightness:100",
  transformation: {crop: 'fill', height: 80, width: 80 }
});*/

}
