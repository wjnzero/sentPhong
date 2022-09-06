public class Luong extends Observer {
    public Luong(HocVien hocVien){
        this.hocVien = hocVien;
        this.hocVien.themObs(this);
    }

    @Override
    public void update() {
        if (this.hocVien.getTrangThai().equalsIgnoreCase("Chơi game")){
            System.out.println("Luong said: chơi với");
        }
        else {
            System.out.println("Luong said: trà đá đê");
        }

    }
}
