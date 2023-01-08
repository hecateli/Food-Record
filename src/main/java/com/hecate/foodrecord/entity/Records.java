package com.hecate.foodrecord.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Records {

    private Long id;

    private String meal;

    private String food;

    private String amount;

    private String category;

    private String sub;

    private String date;

    private Integer unit;

    private Double serving;

    public Double getServing() {
        return serving;
    }

    public void setServing(Double serving) {
        this.serving = serving;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Records{" +
                "id=" + id +
                ", meal='" + meal + '\'' +
                ", food='" + food + '\'' +
                ", amount='" + amount + '\'' +
                ", category='" + category + '\'' +
                ", sub='" + sub + '\'' +
                ", date='" + date + '\'' +
                ", unit=" + unit +
                ", serving=" + serving +
                '}';
    }
}
