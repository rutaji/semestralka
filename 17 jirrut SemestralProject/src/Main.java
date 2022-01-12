import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    /** 17 Program vytvoří šachovnici podle zadaných parametrů
     * @author Jiří Růta
     *
     *
     */

    public static void main(String[] args) {

        int x, y, velikost_bloku;
        while (true) {
            //vstup
            System.out.println("Pocet radku");
            y = vstup();
            if (y < 0) {
                break;
            }
            System.out.println("Pocet sloupcu");
            x = vstup();
            if (x < 0) {
                break;
            }
            System.out.println("velikost bloku");
            velikost_bloku = vstup();
            if (velikost_bloku < 0) {
                break;
            }

            //logika
            boolean zacina_nulou = true; //proměná určuje zdali řádek začíná nulou
            boolean nula = true;  //priměná určuje co bude vypsáno
            int Zbývající_velikost_bloku_y = velikost_bloku; //počítá řádky bloku
            int Zbývající_velikost_bloku_x = velikost_bloku; //počítá sloupce bloku


            System.out.println("vysledna matice");

            for (int yi = 0; yi < y; yi++) {

                for (int xi = 0; xi < x; xi++) {
                    //po každém symbolu
                    if (nula) {
                        System.out.print("0");
                    } else {
                        System.out.print("1");
                    }
                    //po určitém počtu cyklů se změní hodnota v proměnné nula a tím se změní co se vypisuje
                    Zbývající_velikost_bloku_x--;
                    if (Zbývající_velikost_bloku_x == 0) {
                        Zbývající_velikost_bloku_x = velikost_bloku;
                        nula = !nula;
                    }
                }


                //po každém řádku
                //po určitém počtu cyklů se změní hodnota v proměné zacina_nulou a tím se změní kterou hodnotou začíná řádek
                Zbývající_velikost_bloku_y--;
                if (Zbývající_velikost_bloku_y == 0) {
                    Zbývající_velikost_bloku_y = velikost_bloku;
                    zacina_nulou = !zacina_nulou;
                }
                nula = zacina_nulou;
                System.out.println();
                Zbývající_velikost_bloku_x = velikost_bloku;

            }

        }
    }
    //metoda přijme a zkontroluje vstup od uživatele
    public  static int vstup(){
        int i;
        while (true) {
                if(sc.hasNextInt()) {
                    i = sc.nextInt();
                    break;
                }
                else{
                    System.out.println("Toto není validní číslo");
                    sc.next();
                }
        }
        return i;

    }

}
