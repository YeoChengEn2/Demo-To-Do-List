package sg.edu.rp.c346.id22022416.demotodolist;

import java.util.Calendar;

public class ToDoItem {
    private String title;
    private Calendar date;

    public ToDoItem(String title, Calendar date, String day) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        String str = date.get(Calendar.DAY_OF_MONTH) + "/" + date.get(Calendar.MONTH) + "/" + date.get(Calendar.YEAR) + " (" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";

        return str;
    }

    public String getDay(int day) {
        String dayStr = "";

        if (day == Calendar.SUNDAY) {
            dayStr = "Sunday";
        }
        else if (day == Calendar.MONDAY) {
            dayStr = "Monday";
        }
        else if (day == Calendar.TUESDAY) {
            dayStr = "Tuesday";
        }
        else if (day == Calendar.WEDNESDAY) {
            dayStr = "Wednesday";
        }
        else if (day == Calendar.THURSDAY) {
            dayStr = "Thursday";
        }
        else if (day == Calendar.FRIDAY) {
            dayStr = "Friday";
        }
        else if (day == Calendar.SATURDAY) {
            dayStr = "Saturday";
        }

        return dayStr;
    }
}