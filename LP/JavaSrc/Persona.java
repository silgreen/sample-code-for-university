package JavaSrc;
public class Persona {
    private String nome;
    private String cognome;
    private static int visite = 0;

    Persona(String n, String s) {
        this.nome = n;
        this.cognome = s;
        visite++;
    }

    @Override
    public String toString() {
        return nome + " " + cognome;
    }

    public static int getVisite() {
        return visite;
    }
}
