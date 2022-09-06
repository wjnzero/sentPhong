public class ChiKieuAnh extends Observer {
    public ChiKieuAnh(HocVien hocVien) {
        this.hocVien = hocVien;
        this.hocVien.themObs(this);
    }

    @Override
    public void update() {
        if (this.hocVien.getTrangThai().equalsIgnoreCase("Chơi game")){
            System.out.println("KA said: Học lại module nhé em");
        }
        else {
            System.out.println("KA said: null!");
        }
    }
}
