import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getNumberInstance();
        Staff[] staff = new Staff[5];
        staff[0] = new FulltimeStaff(
                123,
                "John",
                987654321,
                "john@mail.com",
                550,
                5,
                1200
        );
        staff[1] = new FulltimeStaff(
                456,
                "Smith",
                987654321,
                "smith@mail.com",
                350,
                15,
                2000
        );
        staff[2] = new ParttimeStaff(
                789,
                "Tommy",
                987654321,
                "tommy@mail.com",
                60
        );
        staff[3] = new ParttimeStaff(
                159,
                "Jackie",
                987654321,
                "jacky@mail.com",
                40
        );
        staff[4] = new FulltimeStaff(
                489,
                "Lanna",
                987654321,
                "lanna@mail.com",
                740,
                75,
                3500
        );
        averageSalary(staff);
        System.out.println("====================");
        fulltimeBelowAvg(staff);
        System.out.println("====================");
        parttimeSalary(staff);
        System.out.println("====================");
        sortingFulltime(staff);
    }

    private static void averageSalary(Staff[] staff) {
        int sum = 0;
        int avg = 0;
        for (Staff each : staff) {
            sum += each.realSalary();
        }
        avg = sum / staff.length;

        System.out.println("Total salary: " + sum);
        System.out.println("No. staff: " + staff.length);
        System.out.println("Average salary: " + avg);
    }
    private static void fulltimeBelowAvg(Staff[] staffArray) {
        int sum = 0;
        int avg = 0;
        for (Staff staff : staffArray) {
            sum += staff.realSalary();
        }
        avg = sum / staffArray.length;
        System.out.println("Full-time salary below average: ");
        for (Staff staff : staffArray) {
            if (staff instanceof FulltimeStaff && staff.realSalary() < avg) {
                System.out.println(staff.getName() + ": " + staff.realSalary());
            }
        }
    }
    private static void parttimeSalary(Staff[] staffArray) {
        System.out.println("Part-time salary: ");
        for (Staff each : staffArray) {
            if (each instanceof ParttimeStaff) {
                System.out.println(each.getName() + ": " + each.realSalary());
            }
        }
    }
    public static void sortingFulltime(Staff[] staffArray) {
        int n = staffArray.length;
        System.out.println("Full-time salary low-high: ");
        for (Staff staff : staffArray) {
            if (staff instanceof FulltimeStaff){
                for (int i = 0; i < n - 1; i++) {
                    int minIndex = i;
                    for (int j = i + 1; j < n; j++) {
                        if (staffArray[j].realSalary() < staffArray[minIndex].realSalary()) {
                            minIndex = j;
                        }
                    }
                    Staff temp = staffArray[minIndex];
                    staffArray[minIndex] = staffArray[i];
                    staffArray[i] = temp;
                }
                System.out.println(staff.getName() + ": " + staff.realSalary());
            }
        }
    }
}
