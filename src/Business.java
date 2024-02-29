public class Business  extends Contact{
    private int phoneNumber;

    public Business(String name, String email, int phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void display() {
        System.out.println("This is my phone number " + phoneNumber);
    }
}

