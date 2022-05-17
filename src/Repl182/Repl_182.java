package Repl182;

class Main
{
    public static void main(String[] args){
        Person person=new Person("John", "Doe", "123-45-6789", 10, 25, 1900);
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.FormatBirthday());
        System.out.println(person.getSSN());

    }
}