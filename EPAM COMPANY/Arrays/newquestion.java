// student store day by attendance

import java.util.Scanner;

class Student {

    int id;
    String name;

    String[] date;
    String[] attendance;

    Student(int id, String name, int days) {

        this.id = id;
        this.name = name;

        date = new String[days];
        attendance = new String[days];
    }
}

public class newquestion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter id: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            students[i] = new Student(id, name, days);

            for (int j=0; j < days; j++) {

                System.out.println("\nDay " + (j + 1));

                System.out.print("Enter Date (yyyy-mm-dd): ");
                String date = sc.nextLine();

                boolean validDate = true;

                if (date.length() != 10) {
                    validDate = false;
                }

                if (validDate) {

                    if (date.charAt(4) != '-' ||
                        date.charAt(7) != '-') {

                        validDate = false;
                    }
                }

                int year = 0,month=0,day=0;

                if (validDate) {

                    year =
                        (date.charAt(0) - '0') * 1000 +
                        (date.charAt(1) - '0') * 100 +
                        (date.charAt(2) - '0') * 10 +
                        (date.charAt(3) - '0');

                    month =
                        (date.charAt(5) - '0') * 10 +
                        (date.charAt(6) - '0');

                    day =
                        (date.charAt(8) - '0') * 10 +
                        (date.charAt(9) - '0');
                }

                int maxDays = 0;

                if (month == 1 ||
                    month == 3 ||
                    month == 5 ||
                    month == 7 ||
                    month == 8 ||
                    month == 10 ||
                    month == 12) {

                    maxDays = 31;
                }

                else if (month == 4 ||
                         month == 6 ||
                         month == 9 ||
                         month == 11) {

                    maxDays = 30;
                }

                else if (month == 2) {
                    // Leap year
                    if (year % 400 == 0 ||
                        (year % 4 == 0 && year % 100 != 0)) {

                        maxDays = 29;
                    }

                    else {

                        maxDays = 28;
                    }
                }

                else {

                    validDate = false;
                }

                if (day < 1 || day > maxDays) {

                    validDate = false;
                }

                if (!validDate) {

                    System.out.println("Invalid Date!");

                    j--;
                    continue;
                }

                System.out.println("Valid Date");

                System.out.print("Enter Attendance (0 = Absent, 1 = Present): ");
                String attendance = sc.nextLine();

                if (attendance.equals("0") ||
                    attendance.equals("1")) {

                    students[i].date[j] = date;
                    students[i].attendance[j] = attendance;
                }

                else {
                    System.out.println("invalid attendance");
                    j--;
                    continue;
                }
            }
        }

        // Search Student

        System.out.print("\nEnter Student ID to search: ");
        int searchId = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {

            if (students[i].id == searchId) {

                found = true;

                System.out.println("\nStudent Found");

                System.out.println("ID: " + students[i].id);
                System.out.println("Name: " + students[i].name);

                int present = 0;
                int absent = 0;

                System.out.println("\nAttendance:");

                for (int j = 0; j < days; j++) {

                    System.out.println(students[i].date[j]
                        + " -> "+ students[i].attendance[j]
                    );

                    if (students[i].attendance[j].equals("1")) {

                        present++;
                    }

                    else {

                        absent++;
                    }
                }

                System.out.println("\nPresent: " + present);
                System.out.println("Absent: " + absent);

                break;
            }
        }

        if (!found) {

            System.out.println("Student Not Found");
        }

        
    }
}