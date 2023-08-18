import java.time.LocalDate;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

Company nam = new Company("INTEL","USA",1992,101);
Group nam1 = new Group("ASUS", LocalDate.of(2000,12,30),"Neizvestno");
Person nam2 = new Person("NameGamer","Gamerov",LocalDate.of(2020,2,23));


        System.out.println(nam);
        System.out.println(nam1);
        System.out.println(nam2);






    }

}




