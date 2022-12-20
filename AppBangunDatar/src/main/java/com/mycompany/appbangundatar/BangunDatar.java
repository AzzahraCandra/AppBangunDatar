/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appbangundatar;

/**
 *
 * @author HP
 */
abstract class BangunDatar {
    
    private String nama;

    public BangunDatar() {
    }

    public BangunDatar(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }    
    
    abstract double luas();
    abstract double keliling();
}
