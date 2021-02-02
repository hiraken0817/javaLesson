package local.hal.sa31.androidjava.lesson1.asgmt;

public class GirlFriend {
	  	private String name;
	    private int birthYear;
	    private int birthMonth;
	    private int birthDay;

	    public GirlFriend(String name, int birthYear, int birthMonth, int birthDay)
	    {
	        this.name = name;
	        this.birthYear = birthYear;
	        this.birthMonth = birthMonth;
	        this.birthDay = birthDay;
	    }

	    public boolean isBirthMonth(int month)
	    {
	        if (month == this.birthMonth) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public int getAge(int year)
	    {
	        return year - this.birthYear;
	    }

	    public String getName() 
	    {
	        return this.name;
	    }

	    public int getBirthYear()
	    {
	        return this.birthYear;
	    }

	    public int getBirthMonth()
	    {
	        return this.birthMonth;
	    }

	    public int getBirthDay()
	    {
	        return this.birthDay;
	    }

}
