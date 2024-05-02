package responsi;

public class Student extends Person {
    private String nim;
    private int spp;
    private int sks;
    private int modul;

    public Student(String name, String address, String nim) {
        super(name, address);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getSpp() {
        return spp;
    }

    public void setSpp(int spp) {
        this.spp = spp;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public int getModul() {
        return modul;
    }

    public void setModul(int modul) {
        this.modul = modul;
    }

    public int hitungTagihan() {
        return getSpp() + getSks() + getModul();
    }
}
