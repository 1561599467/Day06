package Test05;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void showDate() {
        System.out.println("日期:" + year + "年" + month + "月" + day + "日");
    }

    public String isBi() {
        String str;
        if (year % 4 != 0) {
            str = "不是";
        } else {
            str = "是";
        }
        return str;
    }
}
