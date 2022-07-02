public class Putout {
    public static void main(String[] args){
        System.out.println("glonek jest alkusem");
        Glonek glonek1 = new Glonek("niepijacy",15);
        glonek1.masa=77.0;
        Glonek glonek2 = new Glonek("pijacy",29);
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
    }
}
