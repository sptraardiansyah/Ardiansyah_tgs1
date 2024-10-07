public class kembalian {
    public static void main(String[] args) {
        double jumlahTelur = 2.5;
        double hargaPerKg = 28000;
        double totalBayar = jumlahTelur * hargaPerKg;
        double uangYangDiberikan = 100000;
        double uangKembalian = uangYangDiberikan - totalBayar;
        System.out.println("Jumlah Telur =" + jumlahTelur);
        System.out.println("Total bayar = " + totalBayar);
        System.out.println("harga per kg = "+ hargaPerKg);
        System.out.println("Uang yang diberikan = " + uangYangDiberikan);
        System.out.println("Uang kembalian = " + uangKembalian);
    }
}
