package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1v2 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1995,0,17);
        
        Person miPerson = new Person("Kevin",date);
        System.out.println(miPerson.getName() + " tiene " + miPerson.GetAge() + " años");
        
}
}
