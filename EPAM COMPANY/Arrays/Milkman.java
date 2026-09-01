// one a story first ki ek milkman hai jo 30 din milk deta hai
// usko me register me 0 and 1 se likhta hu 0 us din likhta hu
// jis din o nahi aata aur jis din o aata hai usko me 1 se
//  indicates karta hu likhta hu condition ye hai ki usko 2
// din he gap kar sakta hai agar 2 din se jyada gap kiya tho uske pahle ka hisaab nahi dena hai pura cancel kar dena hai 
// as a example 11100111000 11111001110011 tho isme output aana 
// chahiye ki 11111001110011 isko count karo kitna din hua jaise ki 14


import java.util.Scanner;

public class Milkman {

    public static int calculateDays(String record, int allowedGap) {

        int count = 0;
        int gap = 0;

        for (int i = 0; i < record.length(); i++) {

            char day = record.charAt(i);

            if (day == '1') {
                count++;
                gap = 0;
            }

            else if (day == '0') {
                gap++;
                count++;

                // Allowed gap se jyada gap
                if (gap > allowedGap) {
                    count = 0;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Total days: ");
        int totalDays = sc.nextInt();

        System.out.print("Allowed consecutive gap: ");
        int allowedGap = sc.nextInt();

        System.out.print("Enter 0/1 record: ");
        String record = sc.next();

        if (record.length() != totalDays) {
            System.out.println("Invalid record! Total days aur record length same honi chahiye.");
            return;
        }

        int answer = calculateDays(record, allowedGap);

        System.out.println("Final count=" + answer);
    }
}