public class SwitchStatements {
    public static void main(String[] args) {
        int month = 8;
        String monthString = null;
        switch(month) {
            case 1: 
                monthString = "January";
                break;
            case 2: 
                monthString = "February";
                break;
            case 3: 
                monthString = "March";
                break;
            case 4: 
                monthString = "April";
                break;
            default: 
                monthString = "No month matches";
                break;
        }
        System.out.println(monthString);
    }
}