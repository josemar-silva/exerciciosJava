package relacionamentoentreentreclasses;

public class RelacionamentoEntreEntreClasses {

    public static void main(String[] args) {

        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        l[3] = new Lutador("Dead code", "Australia", 28, 1.93, 81.6, 13, 0, 2);
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        l[5] = new Lutador("Nerdaart", "França", 30, 1.81, 105.7, 12, 2, 4);

        l[0].status();
        System.out.println(" ");
        l[1].status();
        System.out.println(" ");
        l[2].status();
        System.out.println(" ");
        l[3].status();
        System.out.println(" ");
        l[4].status();
        System.out.println(" ");
        l[5].status();
        System.out.println("  ");
        System.out.println(" ");

        Luta lt1 = new Luta();
        lt1.marcarLuta(l[5], l[4]);
        lt1.lutar();

    }

}
