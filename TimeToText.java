public class TimeToText {
    public static void main(String[] args){
        Out.println("Enter hour: ");
        int hour = In.readInt();

        if (hour < 0 || hour > 23){
            Out.println("Invalid hour!");
            return;
        }

        Out.println("Enter minute: ");
        int minute = In.readInt();

        if (minute < 0 || minute > 59){
            Out.println("Invalid minutes!");
            return;
        }

        String minutes;
        switch (minute){
            case 0: minutes = ""; break;
            case 15: minutes = "quarter past"; break;
            case 30: minutes = "half past"; break;
            case 45: minutes = "quarter to"; break;
            default: minutes = String.format("%d minutes past", minute); break;
        }

        String hours;
        switch (hour){
            case 0: hours = "midnight"; break;
            case 12: hours = "noon"; break;
            default:
                switch (hour % 12){
                    case 1: hours = "one"; break;
                    case 2: hours = "two"; break;
                    case 3: hours = "three"; break;
                    case 4: hours = "four"; break;
                    case 5: hours = "five"; break;
                    case 6: hours = "six"; break;
                    case 7: hours = "seven"; break;
                    case 8: hours = "eight"; break;
                    case 9: hours = "nine"; break;
                    case 10: hours = "ten"; break;
                    case 11: hours = "eleven"; break;
                    default: hours = "error"; break;
                }
        }

        String o_clock = "o'clock";

         if (minute == 0){
             if (hour != 0 && hour != 12){
                 Out.println(hours + " " + o_clock);
             } else {
                 Out.println(hours);
             }
        } else {
             Out.println(minutes + " " + hours);
         }

    }



}
