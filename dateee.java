import java.util.*;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
public class NumberOfDays{
    public static void main(String args[]){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        LocalDate a1 = LocalDate.parse(a,formatter);
        LocalDate b1 = LocalDate.parse(b,formatter);
        long daku = ChronoUnit.Days.between(a1,b1);
        System.out.println(daku);
    }
}
