package com.example.firebase;

public class Post {
    private String fullname;
    private String urlprofile;
    private String urlofimage;
    private String date;
    private String time;
    private String uid;
    private String aboutpost;

    public Post(){

    }
    public Post(String uid,String date,String time,String urlofimage,String urlprofile,String aboutpost,String fullname){
this.fullname=fullname;
this.uid=uid;
this.aboutpost=aboutpost;
this.urlofimage=urlofimage;
this.urlprofile=urlprofile;
this.date=date;
this.time=time;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUrlprofile() {
        return urlprofile;
    }

    public void setUrlprofile(String urlprofile) {
        this.urlprofile = urlprofile;
    }

    public String getUrlofimage() {
        return urlofimage;
    }

    public void setUrlofimage(String urlofimage) {
        this.urlofimage = urlofimage;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getAboutpost() {
        return aboutpost;
    }

    public void setAboutpost(String aboutpost) {
        this.aboutpost = aboutpost;
    }
}
