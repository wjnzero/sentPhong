import java.util.ArrayList;
import java.util.List;


public class HocVien {
    private List<Observer> obs = new ArrayList<>();
    private String trangThai;

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
        thongBaoCam();
    }
    public void themObs(Observer cam){
        obs.add(cam);
    }
    public void thongBaoCam(){
        for (Observer cam: obs
             ) {
            cam.update();
        }
    }
}
