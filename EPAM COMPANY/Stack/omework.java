import java.util.Scanner;

public class omework {

    // ================= STUDENT CLASS =================
    static class Student {

        int id;
        String name;
        boolean bag;
        boolean bottle;
        int floor;

        Student(int id, String name, boolean bag, boolean bottle, int floor) {

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
    static class Rack {

        int floor;

        // 3 bag slots
        int[] bagSlots = new int[3];

        // 3 bottle slots
        int[] bottleSlots = new int[3];


        Rack(int floor) {

            this.floor = floor;

            // Empty slot = 0
            for (int i = 0; i < 3; i++) {

                bagSlots[i] = 0;
                bottleSlots[i] = 0;
            }
        }


        // ================= BAG PLACE =================
        boolean placeBag(int id) {

            int value = id % 100;

            // ID ke last 2 digit se slot
            int preferredSlot = value % 3;

            // Pehle preferred slot check karo
            if (bagSlots[preferredSlot] == 0) {

                bagSlots[preferredSlot] = id;

                System.out.println(
                    "Bag placed at Floor " + floor +
                    ", Bag Slot " + (preferredSlot + 1)
                );

                return true;
            }


            // Agar preferred slot full hai
            // to baaki slots check karo
            for (int i = 0; i < 3; i++) {

                if (bagSlots[i] == 0) {

                    bagSlots[i] = id;

                    System.out.println(
                        "Bag placed at Floor " + floor +
                        ", Bag Slot " + (i + 1)
                    );

                    return true;
                }
            }

            return false;
        }


        // ================= BOTTLE PLACE =================
        boolean placeBottle(int id) {

            int value = id % 100;

            int preferredSlot = value % 3;


            if (bottleSlots[preferredSlot] == 0) {

                bottleSlots[preferredSlot] = id;

                System.out.println(
                    "Bottle placed at Floor " + floor +
                    ", Bottle Slot " + (preferredSlot + 1)
                );

                return true;
            }


            for (int i = 0; i < 3; i++) {

                if (bottleSlots[i] == 0) {

                    bottleSlots[i] = id;

                    System.out.println(
                        "Bottle placed at Floor " + floor +
                        ", Bottle Slot " + (i + 1)
                    );

                    return true;
                }
            }

            return false;
        }


        // ================= DISPLAY RACK =================
        void displayRack() {

            System.out.println("\n===== FLOOR " + floor + " RACK =====");

            System.out.println("Bag Section:");

            for (int i = 0; i < 3; i++) {

                if (bagSlots[i] == 0) {
                    System.out.println(
                        "Bag Slot " + (i + 1) + " : Empty"
                    );
                }
                else {
                    System.out.println(
                        "Bag Slot " + (i + 1) +
                        " : Student ID " + bagSlots[i]
                    );
                }
            }


            System.out.println("\nBottle Section:");

            for (int i = 0; i < 3; i++) {

                if (bottleSlots[i] == 0) {
                    System.out.println(
                        "Bottle Slot " + (i + 1) + " : Empty"
                    );
                }
                else {
                    System.out.println(
                        "Bottle Slot " + (i + 1) +
                        " : Student ID " + bottleSlots[i]
                    );
                }
            }
        }
    }


    // ================= MAIN =================
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // Student size
        System.out.print("Enter number of students: ");
        int size = sc.nextInt();


        Student[] students = new Student[size];


        // 2 Floors
        Rack floor1 = new Rack(1);
        Rack floor2 = new Rack(2);


        // ================= INPUT =================

        for (int i = 0; i < size; i++) {

            System.out.println(
                "\n===== Student " + (i + 1) + " ====="
            );


            // ID automatically generate
            int id = 100 + (i + 1);

            System.out.println("Generated ID: " + id);

            System.out.println(
                "ID % 100 = " + (id % 100)
            );


            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();


            System.out.print("Enter Bag (yes/no): ");
            String bagInput = sc.next();

            boolean bag =
                bagInput.equalsIgnoreCase("yes");


            System.out.print("Enter Bottle (yes/no): ");
            String bottleInput = sc.next();

            boolean bottle =
                bottleInput.equalsIgnoreCase("yes");


            System.out.print("Enter Current Floor (1/2): ");
            int floor = sc.nextInt();


            // Student object
            students[i] = new Student(
                id,
                name,
                bag,
                bottle,
                floor
            );


            // ================= RACK PLACEMENT =================

            if (floor == 1) {

                // Bag
                if (bag) {

                    boolean placed =
                        floor1.placeBag(id);

                    if (!placed) {

                        System.out.println(
                            "Floor 1 Bag Rack Full!"
                        );

                        System.out.println(
                            "Checking Floor 2..."
                        );

                        if (!floor2.placeBag(id)) {

                            System.out.println(
                                "Both floors Bag Rack Full!"
                            );
                        }
                    }
                }


                // Bottle
                if (bottle) {

                    boolean placed =
                        floor1.placeBottle(id);

                    if (!placed) {

                        System.out.println(
                            "Floor 1 Bottle Rack Full!"
                        );

                        System.out.println(
                            "Checking Floor 2..."
                        );

                        if (!floor2.placeBottle(id)) {

                            System.out.println(
                                "Both floors Bottle Rack Full!"
                            );
                        }
                    }
                }
            }


            else if (floor == 2) {

                // Bag
                if (bag) {

                    boolean placed =
                        floor2.placeBag(id);

                    if (!placed) {

                        System.out.println(
                            "Floor 2 Bag Rack Full!"
                        );

                        System.out.println(
                            "Checking Floor 1..."
                        );

                        if (!floor1.placeBag(id)) {

                            System.out.println(
                                "Both floors Bag Rack Full!"
                            );
                        }
                    }
                }


                // Bottle
                if (bottle) {

                    boolean placed =
                        floor2.placeBottle(id);

                    if (!placed) {

                        System.out.println(
                            "Floor 2 Bottle Rack Full!"
                        );

                        System.out.println(
                            "Checking Floor 1..."
                        );

                        if (!floor1.placeBottle(id)) {

                            System.out.println(
                                "Both floors Bottle Rack Full!"
                            );
                        }
                    }
                }
            }
        }


        // ================= DISPLAY ALL RACKS =================

        System.out.println("\n\n******** RACK DETAILS ********");

        floor1.displayRack();

        floor2.displayRack();


        // ================= SEARCH STUDENT =================

        System.out.print(
            "\nEnter Student ID to search: "
        );

        int searchId = sc.nextInt();

        boolean found = false;


        for (int i = 0; i < size; i++) {

            if (students[i].id == searchId) {

                System.out.println(
                    "\n===== STUDENT FOUND ====="
                );

                students[i].display();

                found = true;

                break;
            }
        }


        if (!found) {

            System.out.println(
                "Student Not Found"
            );
        }


        sc.close();
    }
}