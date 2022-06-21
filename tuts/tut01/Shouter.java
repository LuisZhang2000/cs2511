public class Shouter {
    private String message;

    public Shouter(final String message) {
        this.message = message;
    }

    // getting the message
    public String getMessage() {
        return message;
    }

    // updating the message
    public void setMessage(final String message) {
        this.message = message;
    }

    // printing the message out in all caps
    public string toString() {
        return "Shouter message = " + message;
    }

    public void printMe() {
        System.out.println(this);
    }

    public void shout() {
        System.out.println(message.toUpperCase());
    }

    public static void main(final String []args) {
        final Shouter s = new Shouter("blah");
        s.printMe();
        System.out.println(s);

        s.shout();
    }
}