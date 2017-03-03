package DateDifference;

public class SwiftDate {

    short year;
    short month;
    byte day;

    boolean isLeapYear(short year) {
        boolean leap = false;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            leap = true;
        }
        return leap;
    }

    int getCentury(int year) {
        int century;
        century = year / 100 + 1;
        return century;
    }

    int daysInYear(int month) {
        int days = 0;
        switch (month) {
            case 1:
                days += 0;
                break;
            case 2:
                days += 31;
                break;
            case 3:
                days += 59;
                break;
            case 4:
                days += 90;
                break;
            case 5:
                days += 120;
                break;
            case 6:
                days += 151;
                break;
            case 7:
                days += 181;
                break;
            case 8:
                days += 212;
                break;
            case 9:
                days += 243;
                break;
            case 10:
                days += 273;
                break;
            case 11:
                days += 304;
                break;
            case 12:
                days += 334;
                break;

        }
        return days;
    }

    int getDaysDifference(byte day, short month, short year) {
        int diff = 0;
        int days = this.day;
        short months = this.month;
        int tempDays = 0;
        

        if (this.year == year) {
            tempDays = days + daysInYear(months);
            diff = day + daysInYear(month);
            diff-=tempDays;
            if (isLeapYear(year) && (tempDays <= 60) && (diff > 60)) {
                diff += 1;
            }
        }

        if (year - this.year == 1) {
            tempDays = 365 - (days + daysInYear(months));
            diff = day + daysInYear(month);
            diff += tempDays;
            if (((isLeapYear(this.year)) && (tempDays <= 60)) || ((isLeapYear(year)) && (diff > 60))) {
                diff += 1;
            }
        }

        if (year - this.year > 1) {
            short yearsCount = this.year;
            int daysInYear = 0;
            for (int i = 1; i <= year - (yearsCount + 1); i++) {
                yearsCount += i;
                if ((isLeapYear(yearsCount))) {
                    daysInYear += 366;
                }
                daysInYear += 365;

            }
            tempDays = 365 - (days + daysInYear(months));
            diff = day + daysInYear(month);
            diff += tempDays;
            if (((isLeapYear(this.year)) && (tempDays <= 60)) || ((isLeapYear(year)) && (diff > 60))) {
                diff += 1;
            }
            diff += daysInYear;

        }
        return diff;
    }

    short test(short year)
    {
        
        //short a = this.year;
        short t = year;
        
        return t;
    }
    
     public void printInfo() {
        if (isLeapYear(this.year) == true) {
            System.out.printf("%d , %d, %d - %d century. [It is a leap year]", this.year, this.month, this.day, getCentury(this.year));
        } else {
            System.out.printf("%d , %d, %d - %d century", this.year, this.month, this.day, getCentury(this.year));
        }
    }
}