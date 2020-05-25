import GLOOP.*;

public class Sonnensystem {
    GLLicht licht;
    GLKamera kamera;
    Erde erde;
    public Sonnensystem() {
        kamera = new GLSchwenkkamera();
        licht = new GLLicht();
        erde = new Erde();
    }
}
