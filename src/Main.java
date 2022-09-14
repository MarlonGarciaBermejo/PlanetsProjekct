import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Välkommen, här finns 10 val, du kan välja en av följande planeter för att veta mer om den, tryck F för att fortsätta!");

        sc1.nextLine();

        while (true){
            Planetval();
            String val = sc1.nextLine();
            if (val.equals("1")) {
                System.out.println("Du valde att få mer information om Solen");
                Solen(sc1);
            }  else if (val.equals("2")) {
                System.out.println("Du valde att få mer information om Merkurius");
                Merkurius(sc1);
            } else if (val.equals("3")) {
                System.out.println("Du valde att får mer information om Venus");
                Venus(sc1);
            } else if (val.equals("4")) {
                System.out.println("Du valde att få mer information om Jorden");
                Jorden(sc1);
            }  else if (val.equals("5")) {
                System.out.println("Du valde att få mer information om Mars");
                Mars(sc1);
            } else if (val.equals("6")) {
                System.out.println("Du valde att få mer information om Jupiter");
                Jupiter(sc1);
            } else if (val.equals("7")) {
                System.out.println("Du valde att får mer information om Saturnus");
                Saturnus(sc1);
            } else if (val.equals("8")) {
                System.out.println("Du valde att få mer information om Uranus");
                Uranus(sc1);
            } else if (val.equals("9")) {
                System.out.println("Du valde att få mer information om Neptunus");
                Neptunus(sc1);
            } else if (val.equals("10")) {
                System.out.println("Du valde att få mer information om Pluto");
                Pluto(sc1);
            } else if (val.equals("Y")) {
                System.out.println("Du valde ramsan!");
                Ramsa(sc1);
            } else if (val.equals("E")) {
                System.out.println("Tack så mycket!");
                break;
            }

            }
    }

            private static void Planetval() {
                System.out.println("Välj ett av nedstående alternativ!");
                System.out.println("1. Solen");
                System.out.println("2. Merkurius");
                System.out.println("3. Venus");
                System.out.println("4. Jorden");
                System.out.println("5. Mars");
                System.out.println("6. Jupiter");
                System.out.println("7. Saturnus");
                System.out.println("8. Uranus");
                System.out.println("9. Neptunus");
                System.out.println("10. Pluto");
                System.out.println("Y. Ramsan");
                System.out.println("E. Avsluta");
            }

            static void Solen(Scanner sc1) {
                System.out.println("Tryck 1 igen för att fortsätta");
                sc1.nextLine();

                System.out.println("Solen är en stjärna av en relativt vanlig typ som befinner sig i centrum" +
                        " av vårt solsystem och som bildades för ungefär 4,6 miljarder år" +
                        " sedan när ett moln av gas och stoft i Vintergatan drogs samman.");
            }

            static void Merkurius(Scanner sc1) {
                System.out.println("Tryck 2 igen för att fortsätta");
                sc1.nextLine();

                System.out.println("Merkurius är den innersta och minsta planeten i solsystemet, med en omloppstid runt solen på ungefär 88 dygn." +
                        " På grund av sin närhet till solen är den svår att observera från jorden och kan bara ses i gryningen eller skymningen för blotta ögat eller med en fältkikare.");
            }

            static void Venus(Scanner sc1) {
                System.out.println("Tryck 3 igen för att första");
                sc1.nextLine();
                System.out.println("Venus  är den andra planeten i solsystemet från solen räknat och den är nästan lika stor som jorden." +
                        " Då Venus rör sig runt sin egen axel i motsatt riktning mot rörelsen runt solen så kan man säga att den roterar baklänges, vilket endast Venus och Uranus gör.");
            }
            static void Jorden(Scanner sc1) {
                System.out.println("Tryck 4 igen för att fortsätta");
                sc1.nextLine();

                System.out.println("Jorden är den tredje planeten från solen och den största av de så kallade stenplaneterna i solsystemet. Jorden är hemvist för alla kända levande varelser, inklusive människan.");
            }
            static void Mars(Scanner sc1) {
                System.out.println("Tryck 5 igen för att fortsätta");
                 sc1.nextLine();

                 System.out.println("Mars är den fjärde planeten från solen och solsystemets näst minsta planet. " +
                         "Den har fått sitt namn efter den romerska krigsguden Mars och kallas ibland för den röda planeten på grund av sitt rödaktiga utseende. " +
                         "Den röda färgen beror på stora mängder järnoxid (rost) som finns fördelat över ytan och i atmosfären.");
            }
            static void Jupiter(Scanner sc1) {
                System.out.println("Tryck 6 igen för att fortsätta");
                 sc1.nextLine();

                 System.out.println("Jupiter är den femte planeten från solen och är med stor marginal solsystemets största planet. " +
                         "Dess massa är 2,5 gånger så stor som alla de andra planeternas sammanlagda massa. Planeten är en så kallad gasjätte och man är inte säker på om planeten ens har en fast kärna. ");
            }
            static void Saturnus(Scanner sc1) {
                System.out.println("Tryck 7 igen för att fortsätta");
                sc1.nextLine();

                System.out.println("Saturnus är den sjätte planeten från solen och den näst största i solsystemet. Den är en gasjätte, känd sedan förhistorisk tid. " +
                        "Galileo Galilei var den första att observera den genom ett teleskop år 1610. Han såg planeten när ringarnas läge fick planeten att se ut som tre planeter i en klump, " +
                        "vilket gjorde dåtidens forskare mycket förbryllade.");

            }
            static void Uranus(Scanner sc1) {
                System.out.println("Tryck 8 igen för att fortsätta");
                sc1.nextLine();
                System.out.println("Uranus är den sjunde planeten från solen. Uranus är en av solsystemets fyra jätteplaneter - Jupiter, Saturnus, Uranus och Neptunus - och är av ungefär samma storlek som Neptunus." +
                        " Planetens diameter är ungefär 50 000 km (ca 4 gånger så stor som jordens) och massan cirka 14,5 jordmassor. Planetens rotationsaxel har en lutning på hela 98 grader," +
                        " vilket innebär att planeten snarast ”rullar” genom rymden på sin bana runt solen. Det tar 84 år för Uranus att fullborda ett varv runt solen.");
            }
            static void Neptunus(Scanner sc1) {
                System.out.println("Tryck 9 igen för att fortsätta");
                sc1.nextLine();
                System.out.println("Neptunus  är den åttonde planeten från solen. Neptunus är en så kallad gasjätte, och har fått sitt namn efter havsguden Neptunus i romersk mytologi." +
                        " Den 24 augusti 2006, då Internationella astronomiska unionen beslutade att Pluto inte längre var en planet, blev Neptunus den yttersta planeten i solsystemet. " +
                        "Neptunus var dock den yttersta planeten i solsystemet även mellan åren 1979 och 1999, eftersom Pluto då låg närmare solen än Neptunus.");
            }
            static void Pluto(Scanner sc1) {
                System.out.println("Tryck 10 igen för att fortsätta");
                sc1.nextLine();
                System.out.println("Pluto är en dvärgplanet av typen plutoid i de yttre delarna av solsystemet. Den upptäcktes av astronomen Clyde Tombaugh den 23 januari 1930. " +
                        "Ursprungligen antogs Pluto vara ungefär lika stor som jorden och den klassificerades som den nionde planeten från solen. I augusti 2006 blev Pluto omklassificerad till en dvärgplanet." +
                        "Skälet till detta var insikten att Pluto bara är en av många liknande himlakroppar i Kuiperbältet. Den är också relativt liten." +
                        " Enligt aktuella värden är Plutos volym bara 0,6 % och dess massa 0,2 % av jordens.");

            }
            static void Ramsa(Scanner sc1) {
                System.out.println("Du valde att lära dig ramsan som kommer från 1950 - talet, den användes för att lära sig planeternas namn och ordning från solen, kul! Tryck Y igen för att fortsätta!");
                sc1.nextLine();
                System.out.println("Solen måste värma jorden med jämna strålar utan någon paus.");
            }
}