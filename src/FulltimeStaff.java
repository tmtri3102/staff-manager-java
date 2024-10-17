public class FulltimeStaff extends Staff {
    private int bonus;
    private int fine;
    private int salary;

    public FulltimeStaff() {}
    public FulltimeStaff(int code, String name, int phone, String email, int bonus, int fine, int salary) {
        super(code, name, phone, email);
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public int getFine() {
        return fine;
    }
    public void setFine(int fine) {
        this.fine = fine;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public int realSalary (){
        return salary + bonus - fine;
    }

}
