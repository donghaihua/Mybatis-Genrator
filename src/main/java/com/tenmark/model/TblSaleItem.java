package com.tenmark.model;

import java.util.Date;

public class TblSaleItem {
    private Long id;

    private Long shopId;

    private String brand;

    private Long seriesId;

    private String itemName;

    private String avatar;

    private String sellingPoints;

    private Double minOriginalprice;

    private Double maxOriginalprice;

    private Double minDiscountprice;

    private Double maxDiscountprice;

    private Double minVolume;

    private Double maxVolume;

    private String rawMaterial;

    private String packing;

    private String technology;

    private String inventory;

    private Date releaseDate;

    private Date registerDate;

    private Short type;

    private Short state;

    private String seoTitle;

    private String seoDescription;

    private String seoKeywords;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public Long getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Long seriesId) {
        this.seriesId = seriesId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getSellingPoints() {
        return sellingPoints;
    }

    public void setSellingPoints(String sellingPoints) {
        this.sellingPoints = sellingPoints == null ? null : sellingPoints.trim();
    }

    public Double getMinOriginalprice() {
        return minOriginalprice;
    }

    public void setMinOriginalprice(Double minOriginalprice) {
        this.minOriginalprice = minOriginalprice;
    }

    public Double getMaxOriginalprice() {
        return maxOriginalprice;
    }

    public void setMaxOriginalprice(Double maxOriginalprice) {
        this.maxOriginalprice = maxOriginalprice;
    }

    public Double getMinDiscountprice() {
        return minDiscountprice;
    }

    public void setMinDiscountprice(Double minDiscountprice) {
        this.minDiscountprice = minDiscountprice;
    }

    public Double getMaxDiscountprice() {
        return maxDiscountprice;
    }

    public void setMaxDiscountprice(Double maxDiscountprice) {
        this.maxDiscountprice = maxDiscountprice;
    }

    public Double getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(Double minVolume) {
        this.minVolume = minVolume;
    }

    public Double getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(Double maxVolume) {
        this.maxVolume = maxVolume;
    }

    public String getRawMaterial() {
        return rawMaterial;
    }

    public void setRawMaterial(String rawMaterial) {
        this.rawMaterial = rawMaterial == null ? null : rawMaterial.trim();
    }

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing == null ? null : packing.trim();
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology == null ? null : technology.trim();
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory == null ? null : inventory.trim();
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle == null ? null : seoTitle.trim();
    }

    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription == null ? null : seoDescription.trim();
    }

    public String getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords == null ? null : seoKeywords.trim();
    }
}