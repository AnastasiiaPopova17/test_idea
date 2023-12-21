package enumerations;

public class Main {

    //ENUM

    public static void main(String[] args) {
        Week dayOfWeek = Week.MONDAY;
        System.out.println(dayOfWeek);

        switch (dayOfWeek){
            case MONDAY:
                System.out.println("This is Monday");
                break;
            case TUESDAY:
                System.out.println("This is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("This is Wednesday");
                break;
            case THURSDAY:
                System.out.println("This is Thursday");
                break;
            case FRIDAY:
                System.out.println("This is Friday");
                break;
            case SATURDAY:
                System.out.println("This is Saturday");
                break;
            case SUNDAY:
                System.out.println("This is Sunday");
                break;
            default:
                System.out.println("This is not a valid day of the week");

        }

        // metodi ENUM values() and valueOf()
        // values() - vozvr spisok vseh konstant ENUMA
        // valueOf() - vozvr konstantu ENUMA, sootv znacheniyu


        Week[] allDays = Week.values();
        for (Week day : allDays){
            //for (Week day : Week.values())
            System.out.println(day);
        }

        Week day = Week.valueOf("MONDAY");
        System.out.println(day);

        Transport transport;
        System.out.println(Transport.CAR.getSpeed());
        System.out.println(Transport.TRAIN);


    }
}
