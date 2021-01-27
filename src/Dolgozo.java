public class Dolgozo {
    private String vezetekn;
    private String keresztn;
    private String nem;
    private int eletkor;
    private int fizetes;

    public String getNem() {
        return nem;
    }

    public void setNem(String nem) {
        this.nem = nem;
    }

    public Dolgozo(String vezetekn, String keresztn, String nem, int eletkor, int fizetes) {
        this.vezetekn = vezetekn;
        this.keresztn = keresztn;
        this.nem = nem;
        this.eletkor = eletkor;
        this.fizetes = fizetes;
    }

    public String getVezetekn() {
        return vezetekn;
    }

    public void setVezetekn(String vezetekn) {
        this.vezetekn = vezetekn;
    }

    public String getKeresztn() {
        return keresztn;
    }

    public void setKeresztn(String keresztn) {
        this.keresztn = keresztn;
    }



    public int getEletkor() {
        return eletkor;
    }

    public void setEletkor(int eletkor) {
        this.eletkor = eletkor;
    }

    public int getFizetes() {
        return fizetes;
    }

    public void setFizetes(int fizetes) {
        this.fizetes = fizetes;
    }
}
