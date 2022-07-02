import java.util.LinkedList;
import java.util.List;

public class Putout {
    public static void main(String[] args){
        System.out.println("glonek jest alkusem");
        Glonek glonek1 = new Glonek();
        glonek1.setMasa(49);
        Glonek glonek2 = new Glonek();
        System.out.println(glonek1);
        glonek1.wypijPiwo(2.1);
        glonek1.wypijPiwo();
        glonek1.wypijWode();
        glonek1.wypijWode();
        glonek1.wypijWode();
        glonek1.wypijWode();
        glonek1.wypijWode();
        glonek1.jedzWiejska(1);
        glonek1.spij(3);

        System.out.println(glonek1.iloscAlkoholu());

        Czlowiek agrawka = new Czlowiek("Agrawka",29,21.37);
        agrawka.setImie("agrawka");

        agrawka.wypijPiwo();
        agrawka.wypijWode();
        agrawka.wypijWode();
        agrawka.spij(1);
        agrawka.jedzWiejska(2);
        List<Czlowiek> osobyNaIprezie1 = new LinkedList<>();
        osobyNaIprezie1.add(glonek1);
        osobyNaIprezie1.add(glonek2);
        osobyNaIprezie1.add(agrawka);
        Impreza popijawa = new Impreza("zajazd",osobyNaIprezie1);
        popijawa.start();
    }
}
