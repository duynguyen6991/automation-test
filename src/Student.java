public class Student {
    public String Ten;
    public int Tuoi;


    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public void showInfo(){
        System.out.println("tui ten là" + Ten + " " + Tuoi + "tuoi");
    }

}
