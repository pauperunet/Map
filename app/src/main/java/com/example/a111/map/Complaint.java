package com.example.a111.map;

/**
 * Created by 111 on 27.04.2017.
 */

class Complaint {
    private float shyrota;
    private float dolgota;
    private String message;
    private boolean status;

    public Complaint() {
    }

    public void setShyrota(float shyrota) {
        this.shyrota = shyrota;
    }

    public float getShyrota() {
        return shyrota;
    }

    public void setDolgota(float dolgota) {
        this.dolgota = dolgota;
    }

    public float getDolgota() {
        return dolgota;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }
}
