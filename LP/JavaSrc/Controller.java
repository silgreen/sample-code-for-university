package JavaSrc;
public final class Controller {
    public static void main(String[] args) {
        Persona [] listaInvitati;
        listaInvitati = new Persona[3];

        for(int i = 0; i < listaInvitati.length; i++) {
            listaInvitati[i] = new Impiegato("lallo", "pallo", 23.45);
        }

        for(int i = 0; i < listaInvitati.length; i++) {
            System.out.println(listaInvitati[i].toString());
        }
        System.out.println("la lista degli invitati è lunga " + Persona.getVisite());
    }
}