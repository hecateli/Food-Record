package com.hecate.foodrecord.entity;

import lombok.Data;

@Data
public class Subs {

    private String label;

    private String value;

    private String unit;

    private String comment;

    private String type;

    private Integer serving;

    public Integer getServing() {
        return serving;
    }

    public void setServing(Integer serving) {
        this.serving = serving;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    @Override
    public String toString() {
        return "Subs{" +
                "label='" + label + '\'' +
                ", value='" + value + '\'' +
                ", unit='" + unit + '\'' +
                ", comment='" + comment + '\'' +
                ", type='" + type + '\'' +
                ", serving=" + serving +
                '}';
    }
}
