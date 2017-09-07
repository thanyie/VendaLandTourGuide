package com.example.thanyani.vendalandtourguide;

import java.io.Serializable;

/**
 * Created by THANYANI on 2017/08/17.
 */

public class VendaTour implements Serializable {

    private String topic;
    private int image;
    private String text;

    public VendaTour(String topic, int image, String text) {
        this.topic = topic;
        this.image = image;
        this.text = text;
    }

    public VendaTour() {


    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
