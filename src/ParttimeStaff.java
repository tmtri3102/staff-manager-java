public class ParttimeStaff extends Staff {
    private int hours;
    public ParttimeStaff() {}
    public ParttimeStaff(int code, String name, int phone, String email, int hours) {
        super(code, name, phone, email);
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    @Override
    public int realSalary() {
        return hours * 100;
    }
}
