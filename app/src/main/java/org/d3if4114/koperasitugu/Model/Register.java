package org.d3if4114.koperasitugu.Model;

public class Register {
    String Nama;
    String Ttl;
    String nik;
    String alamat;
    String NoHP;
    String Simpanan;

    public Register(String nama, String ttl, String nik, String alamat, String noHP, String simpanan) {
        Nama = nama;
        Ttl = ttl;
        this.nik = nik;
        this.alamat = alamat;
        NoHP = noHP;
        Simpanan = simpanan;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getTtl() {
        return Ttl;
    }

    public void setTtl(String ttl) {
        Ttl = ttl;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoHP() {
        return NoHP;
    }

    public void setNoHP(String noHP) {
        NoHP = noHP;
    }

    public String getSimpanan() {
        return Simpanan;
    }

    public void setSimpanan(String simpanan) {
        Simpanan = simpanan;
    }
}
