package JavaSrc;
public class Impiegato extends Persona {
    private double stipendio;

    Impiegato(String n, String s, double stip) {
        super(n, s);
        this.stipendio = stip;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "stipendio:" + this.stipendio;
    }
}
