public class Time {
    public static void main(String[] args) {
        int hour;
        int minute;
        int second;

        // Câu 2:
        hour = 10;
        minute = 4;
        second = 15;

        // Câu 3:
        int nightpass = (hour*3600 + minute*60 + second);
        System.out.println("Night have passed: " + nightpass +"s");


        // Câu 4:
        int dayremain = (24*3600 - nightpass);
        System.out.println("Day remain: " + dayremain + "s");

        // Câu 5:
        System.out.println("Percent of the day have passed: "+ hour +"/24 %");

        // Câu 6:
        hour = 10;
        minute = 24;
        second = 35;
        System.out.println(nightpass);
        System.out.println(dayremain);
        System.out.println("Percent of the day have passed: "+ hour +"/24 %");
    }
}
