public class EsempioAmbito {
    private int i = 1;

    public void primoMetodo() {
        int i = 4, j = 5;
        this.i = i + j;
        secondoMetodo(7);
    }

    public void secondoMetodo(int i) {
        int j = 8;
        this.i = i + j;
    }

    public static void main(String[] args) {
        EsempioAmbito e = new EsempioAmbito();
        e.primoMetodo();
        System.out.println(e.i); //output: 15
    }
}
