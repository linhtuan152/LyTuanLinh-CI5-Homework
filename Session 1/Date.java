public class Date {
    public static void main(String[] args) {
        String day;
        int date;
        String month;
        int year;

        // Câu 2:
        day = "Monday";
        date = 2;
        month = "April";
        year = 2018;

        // Câu 3:
        System.out.println(day);
        System.out.println(date);
        System.out.println(month);
        System.out.println(year);

        // Câu 4
        System.out.println(day +", " + date + " " + month+ ", " + year);

        // Câu 5
        System.out.println("American format:");
        System.out.println(day +", " + month + " " + date + ", " + year);
        System.out.println("European format:");
        System.out.println(day +", " + date + " " + month+ ", " + year);


    }
}
