/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NotaMakanan;

/**
 *
 * @author TezzaFazar
 */
public class NotaDetailProduk {

    private String namaProduk;
    private String satuan;
    private double harga;

    public NotaDetailProduk(String namaProduk, String satuan, double harga) {
        this.namaProduk = namaProduk;
        this.satuan = satuan;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return this.namaProduk;
    }

    /**
     * @return the namaBarang
     */
    public String getnamaProduk() {
        return namaProduk;
    }

    /**
     * @param namaBarang the namaBarang to set
     */
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    /**
     * @return the satuan
     */
    public String getSatuan() {
        return satuan;
    }

    /**
     * @param satuan the satuan to set
     */
    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    /**
     * @return the harga
     */
    public double getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(double harga) {
        this.harga = harga;
    }
}
