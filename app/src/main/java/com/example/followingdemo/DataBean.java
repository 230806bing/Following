package com.example.followingdemo;

public class DataBean {
    private Integer  banner_imageRes;
    private String banner_imageUri;
    private String title;
    private String article;
    private Integer goods_imageRes;
    private String goods_imageUri;
    private String goods_name;
    private String goods_describe;
    private String goods_price;
    private Integer goods_starRes;
    private String goods_starUri;
    private Integer imageRes;
    private String imageUri;
    private String KOL_name;
    private String likes;
    private String stars;
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public DataBean(int type,Integer banner_imageRes, String title, String article, Integer imageRes, String KOL_name, String likes, String stars) {
        this.type = type;
        this.banner_imageRes = banner_imageRes;
        this.title = title;
        this.article = article;
        this.imageRes = imageRes;
        this.KOL_name = KOL_name;
        this.likes = likes;
        this.stars = stars;
    }

    public DataBean(int type,Integer banner_imageRes, String title, String article, Integer goods_imageRes, String goods_name, String goods_describe, String goods_price, Integer goods_starRes,Integer imageRes, String KOL_name, String likes, String stars) {
        this.type = type;
        this.banner_imageRes = banner_imageRes;
        this.title = title;
        this.article = article;
        this.goods_imageRes = goods_imageRes;
        this.goods_name = goods_name;
        this.goods_describe = goods_describe;
        this.goods_price = goods_price;
        this.goods_starRes = goods_starRes;
        this.imageRes = imageRes;
        this.KOL_name = KOL_name;
        this.likes = likes;
        this.stars = stars;
    }

    public Integer getGoods_starRes() {
        return goods_starRes;
    }

    public void setGoods_starRes(Integer goods_starRes) {
        this.goods_starRes = goods_starRes;
    }

    public String getGoods_starUri() {
        return goods_starUri;
    }

    public void setGoods_starUri(String goods_starUri) {
        this.goods_starUri = goods_starUri;
    }

    public DataBean(int type, String banner_imageUri, String title, String article, String imageUri, String KOL_name, String likes, String stars) {
        this.type = type;
        this.banner_imageUri = banner_imageUri;
        this.title = title;
        this.article = article;
        this.imageUri = imageUri;
        this.KOL_name = KOL_name;
        this.likes = likes;
        this.stars = stars;
    }

    public DataBean(int type,String banner_imageUri, String title, String article, String goods_imageUri, String goods_name, String goods_describe, String goods_price, String goods_starUri,String imageUri, String KOL_name, String likes, String stars) {
        this.type = type;
        this.banner_imageUri = banner_imageUri;
        this.title = title;
        this.article = article;
        this.goods_imageUri = goods_imageUri;
        this.goods_name = goods_name;
        this.goods_describe = goods_describe;
        this.goods_price = goods_price;
        this.goods_starUri = goods_starUri;
        this.imageUri = imageUri;
        this.KOL_name = KOL_name;
        this.likes = likes;
        this.stars = stars;
    }

    public Integer getGoods_imageRes() {
        return goods_imageRes;
    }

    public void setGoods_imageRes(Integer goods_imageRes) {
        this.goods_imageRes = goods_imageRes;
    }

    public String getGoods_imageUri() {
        return goods_imageUri;
    }

    public void setGoods_imageUri(String goods_imageUri) {
        this.goods_imageUri = goods_imageUri;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getGoods_describe() {
        return goods_describe;
    }

    public void setGoods_describe(String goods_describe) {
        this.goods_describe = goods_describe;
    }

    public String getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(String goods_price) {
        this.goods_price = goods_price;
    }

    public Integer getBanner_imageRes() {
        return banner_imageRes;
    }

    public void setBanner_imageRes(Integer banner_imageRes) {
        this.banner_imageRes = banner_imageRes;
    }

    public String getBanner_imageUri() {
        return banner_imageUri;
    }

    public void setBanner_imageUri(String banner_imageUri) {
        this.banner_imageUri = banner_imageUri;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public Integer getImageRes() {
        return imageRes;
    }

    public void setImageRes(Integer imageRes) {
        this.imageRes = imageRes;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public String getKOL_name() {
        return KOL_name;
    }

    public void setKOL_name(String KOL_name) {
        this.KOL_name = KOL_name;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }


}
