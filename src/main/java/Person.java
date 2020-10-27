public class Person {
    public String firstname;
    public String lastname;

    // Constructor
    public Person(String a, String b) {
        firstname = a;
        lastname = b;
    }

    public void doSomething() {
        System.out.println("I'm watching Netflix.");
    }
    public String toString() {
        return this.firstname + "/" + this.lastname;
    }

    public String getFirstName() {
        return this.firstname;
    }
    public void setFirstName(String str) {
        if (str.trim().length() != 0) {
            this.firstname = str;
        }
    }
}













