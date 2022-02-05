public class Date
{
    //Private initial variables, MM-DD-YYYY
    private String date;

    /////////Methods\\\\\\\\\

    //get the whole date from the date variable
    public String getDate()
    {
        return date;
    }

    //Set a whole date, likely object initializer
    public void setDate(String _date)
    {
        date = "MM-DD-YYYY";
    }

    //Get month value from date variable
    public String getMonth()
    {
        String _month = date.substring(0,2);
        return _month;
    }

    //Set just the month value for the date variable
    public void setMonth(int _month)
    {
        String _newMonth = "" + _month;
        String _restOfDate = date.substring(3,10);
        String _newDate = _newMonth + _restOfDate;
        date = _newDate;
    }

    //Get day value from date variable
    public String getDay()
    {
        String _day = date.substring(3,5);
        return _day;
    }

    //Set just the day value for the date variable
    public void setDay(int _day)
    {
        String _newDay = "" + _day;
        String _restOfDate1 = date.substring(0,2);
        String _restOfDate2 = date.substring(5,10);
        String _newDate = _restOfDate1 + _day + _restOfDate2;
        date = _newDate;
    }

    //Get year value from date variable
    public String getYear()
    {
        String _year = date.substring(6,10);
        return _year;
    }

    //Set just the year value for the date variable
    public void setYear(int _year)
    {
        String _newDay = "" + _year;
        String _restOfDate = date.substring(0,6);
        String _newDate = _restOfDate + _year;
        date = _newDate;
    }

    public int getDifferent(Date _date)
    {
        Date _otherDate = _date;

        //Difference Variable containers
        int _dayDifference;
        int _monthDifference;
        int _yearDifference;
        int _totalDifference = 0;

        //Global date variables
        int _gDateDay = Integer.parseInt(getDay());
        int _gDateMonth = Integer.parseInt(getMonth());
        int _gDateYear = Integer.parseInt(getYear());

        //Other date variables
        int _otherDateDay = Integer.parseInt(_otherDate.getYear());
        int _otherDateMonth = Integer.parseInt(_otherDate.getMonth());
        int _otherDateYear = Integer.parseInt(_otherDate.getYear());

        //Calculation
        _dayDifference = Math.abs(_gDateDay - _otherDateDay);
        _monthDifference = Math.abs(_gDateMonth - _otherDateMonth)*30;
        _yearDifference = Math.abs(_gDateYear - _otherDateYear)*365;

        _totalDifference = _dayDifference + _monthDifference + _yearDifference;

        //Return end results
        return _totalDifference;
    }

}
