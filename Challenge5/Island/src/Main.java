import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pil,jarak;
        Scanner myscan = new Scanner(System.in);
        Player K1 = new Player (5,'F');
        do{

            System.out.println("MENU");
            System.out.println("Koordinat Sekarang : "+K1.showKoordinat());
            System.out.println("1. Move");
            System.out.println("2. Pull Over");
            System.out.println("3. Restart");
            System.out.println(">> ");
            pil = myscan.nextInt();

            switch(pil){
                case 1:
                    System.out.println("1. N");
                    System.out.println("2. W");
                    System.out.println("3. E");
                    System.out.println("4. S");
                    pil = myscan.nextInt();

                    System.out.println("Jarak : ");
                    jarak = myscan.nextInt();
                    K1.move(pil, jarak);
                    break;
                case 2:
                    System.out.println("1. N");
                    System.out.println("2. W");
                    System.out.println("3. E");
                    System.out.println("4. S");
                    pil = myscan.nextInt();
                    K1.PullOver(pil);
                    break;

                case 3:
                    K1.restart();
                    break;
            }
        }while(pil!=0);
    }

}