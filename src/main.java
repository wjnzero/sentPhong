public class main {
    public static void main(String[] args) {
        HocVien huy = new HocVien();
        new Luong(huy);
        new ChiKieuAnh(huy);

        huy.setTrangThai("Chơi Game");
//        huy.setTrangThai("Học bài");
    }



}
