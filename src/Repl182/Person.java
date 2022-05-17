package Repl182;

class Person {
    private String firstname;
    private String lastname;
    private String ssn;
    private int birthday;
    private int birthmonth;
    private int birthyear;

    Person(String firstname, String lastname, String ssn, int birthmonth, int birthday, int birthyear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.birthday = birthday;
        this.birthmonth = birthmonth;
        this.birthyear = birthyear;
    }

    public String getFirstName() {
        return this.firstname;
    }

    public String getLastName() {
        return this.lastname;
    }

    public String getSSN() {
        return this.ssn;
    }

    public int getBirthDay() {
        return this.birthday;
    }

    public int getBirthMonth() {
        return this.birthmonth;
    }

    public int getBirthYear() {
        return this.birthyear;
    }

    public String FormatBirthday() {
        return getBirthMonth() + "/" + getBirthDay() + "/" + getBirthYear();
    }


}