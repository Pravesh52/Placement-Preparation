import java.util.Scanner;

public class homework {

    // ================= STUDENT CLASS =================

    public static class student {

        int id;
        String name;
        boolean bag;
        boolean bottle;
        int floor;

        student(int id, String name, boolean bag, boolean bottle, int floor) {

            this.id = id;
            this.name = name;
            this.bag = bag;
            this.bottle = bottle;
            this.floor = floor;
        }

        void display() {

            System.out.println("ID     : " + id);
            System.out.println("Name   : " + name);
            System.out.println("Bag    : " + (bag ? "Yes" : "No"));
            System.out.println("Bottle : " + (bottle ? "Yes" : "No"));
            System.out.println("Floor  : " + floor);
        }
    }


    // ================= RACK CLASS =================

    public static class rack {

        int floor;

        // 3 bag slots
        int[] bagsection = new int[3];

        // 3 bottle slots
        int[] bottlesection = new int[3];


        rack(int floor) {

            this.floor = floor;

            // Initially all slots are empty
            for (int i = 0; i < 3; i++) {

                bagsection[i] = 0;
                bottlesection[i] = 0;
            }
        }


        // ================= BAG PLACE =================

        boolean bagplace(int id) {

            // Last two digits
            int value = id % 100;

            // Only 3 slots available
            int preferredslot = value % 3;


            // First preferred slot check
            if (bagsection[preferredslot] == 0) {

                bagsection[preferredslot] = id;

                System.out.println(
                    "Bag placed at Floor " + floor +
                    ", Bag Slot " + (preferredslot + 1)
                );

                return true;
            }


            // If preferred slot is full,
            // check remaining slots
            for (int i = 0; i < 3; i++) {

                if (bagsection[i] == 0) {

                    bagsection[i] = id;

                    System.out.println(
                        "Bag placed at Floor " + floor +
                        ", Bag Slot " + (i + 1)
                    );

                    return true;
                }
            }


            // No slot available
            return false;
        }


        // ================= BOTTLE PLACE =================

        boolean bottleplace(int id) {

            // Last two digits
            int value = id % 100;

            // Only 3 slots available
            int preferredslot = value % 3;


            // First preferred slot check
            if (bottlesection[preferredslot] == 0) {

                bottlesection[preferredslot] = id;

                System.out.println(
                    "Bottle placed at Floor " + floor +
                    ", Bottle Slot " + (preferredslot + 1)
                );

                return true;
            }


            // If preferred slot is full,
            // check remaining slots
            for (int i = 0; i < 3; i++) {

                if (bottlesection[i] == 0) {

                    bottlesection[i] = id;

                    System.out.println(
                        "Bottle placed at Floor " + floor +
                        ", Bottle Slot " + (i + 1)
                    );

                    return true;
                }
            }


            // No slot available
            return false;
        }


        // ================= DISPLAY RACK =================

        void displayrack() {

            System.out.println("\n========== FLOOR " + floor + " RACK ==========");


            // Bag section
            System.out.println("\nBag Section:");

            for (int i = 0; i < 3; i++) {

                if (bagsection[i] == 0) {

                    System.out.println(
                        "Bag Slot " + (i + 1) + " : Empty"
                    );

                } else {

                    System.out.println(
                        "Bag Slot " + (i + 1) +
                        " : Student ID " + bagsection[i]
                    );
                }
            }


            // Bottle section
            System.out.println("\nBottle Section:");

            for (int i = 0; i < 3; i++) {

                if (bottlesection[i] == 0) {

                    System.out.println(
                        "Bottle Slot " + (i + 1) + " : Empty"
                    );

                } else {

                    System.out.println(
                        "Bottle Slot " + (i + 1) +
                        " : Student ID " + bottlesection[i]
                    );
                }
            }
        }
    }


    // ================= MAIN =================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // ================= CREATE TWO RACKS =================

        rack rack1 = new rack(1);
        rack rack2 = new rack(2);


        // ================= STUDENT SIZE =================

        System.out.print("Enter the size of students: ");
        int size = sc.nextInt();


        student[] students = new student[size];


        // ================= INPUT STUDENTS =================

        for (int i = 0; i < size; i++) {

            System.out.println(
                "\n========== STUDENT " + (i + 1) + " =========="
            );


            // ID automatically generate
            int id = 100 + (i + 1);

            System.out.println("Generated ID : " + id);

            System.out.println(
                "ID % 100     : " + (id % 100)
            );


            // Name
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();


            // Bottle
            System.out.print("Enter Bottle (true/false): ");
            boolean bottle = sc.nextBoolean();


            // Bag
            System.out.print("Enter Bag (true/false): ");
            boolean bag = sc.nextBoolean();


            // Floor
            System.out.print("Enter Floor (1/2): ");
            int floor = sc.nextInt();


            // Create student object
            students[i] = new student(
                id,
                name,
                bag,
                bottle,
                floor
            );


            // =================================================
            // RACK PLACEMENT
            // =================================================


            // ================= FLOOR 1 =================

            if (floor == 1) {


                // -------- BAG --------

                if (bag) {

                    boolean placed = rack1.bagplace(id);


                    // Floor 1 full
                    if (!placed) {

                        System.out.println(
                            "Floor 1 Bag Rack is Full!"
                        );

                        System.out.println(
                            "Checking Floor 2..."
                        );


                        // Check Floor 2
                        placed = rack2.bagplace(id);


                        if (!placed) {

                            System.out.println(
                                "Both Floor Bag Racks are Full!"
                            );
                        }
                    }
                }


                // -------- BOTTLE --------

                if (bottle) {

                    boolean placed = rack1.bottleplace(id);


                    // Floor 1 full
                    if (!placed) {

                        System.out.println(
                            "Floor 1 Bottle Rack is Full!"
                        );

                        System.out.println(
                            "Checking Floor 2..."
                        );


                        // Check Floor 2
                        placed = rack2.bottleplace(id);


                        if (!placed) {

                            System.out.println(
                                "Both Floor Bottle Racks are Full!"
                            );
                        }
                    }
                }
            }


            // ================= FLOOR 2 =================

            else if (floor == 2) {


                // -------- BAG --------

                if (bag) {

                    boolean placed = rack2.bagplace(id);


                    // Floor 2 full
                    if (!placed) {

                        System.out.println(
                            "Floor 2 Bag Rack is Full!"
                        );

                        System.out.println(
                            "Checking Floor 1..."
                        );


                        // Check Floor 1
                        placed = rack1.bagplace(id);


                        if (!placed) {

                            System.out.println(
                                "Both Floor Bag Racks are Full!"
                            );
                        }
                    }
                }


                // -------- BOTTLE --------

                if (bottle) {

                    boolean placed = rack2.bottleplace(id);


                    // Floor 2 full
                    if (!placed) {

                        System.out.println(
                            "Floor 2 Bottle Rack is Full!"
                        );

                        System.out.println(
                            "Checking Floor 1..."
                        );


                        // Check Floor 1
                        placed = rack1.bottleplace(id);


                        if (!placed) {

                            System.out.println(
                                "Both Floor Bottle Racks are Full!"
                            );
                        }
                    }
                }
            }


            // Invalid floor
            else {

                System.out.println(
                    "Invalid Floor! Enter only 1 or 2."
                );
            }
        }


        // =================================================
        // DISPLAY BOTH RACKS
        // =================================================

        System.out.println("\n\n================================");
        System.out.println("        FINAL RACK DETAILS");
        System.out.println("================================");


        rack1.displayrack();

        rack2.displayrack();


        // =================================================
        // SEARCH STUDENT
        // =================================================

        System.out.print(
            "\nEnter Student ID to search: "
        );

        int searchid = sc.nextInt();

        boolean found = false;


        for (int i = 0; i < size; i++) {

            if (students[i].id == searchid) {

                System.out.println(
                    "\n========== STUDENT FOUND =========="
                );

                students[i].display();

                found = true;

                break;
            }
        }


        if (!found) {

            System.out.println(
                "\nStudent Not Found."
            );
        }


        sc.close();
    }
}