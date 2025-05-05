package Auto;

public class Auto {
    private String znacka;
    private String model;
    private int rokVyroby;


/* Setter */
    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRokVyroby(int rokVyroby) {
        this.rokVyroby = rokVyroby;
    }


/* Getter */
    public String getZnacka() {
        return znacka;
    }

    public String getModel() {
        return model;
    }

    public int getRokVyroby() {
        return rokVyroby;
    }
}


