package ss19_string_and_regex.exercise.validate_phone_number;

import java.util.Scanner;

public class PhoneNumberTest {
    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter phone number (ex: (84)-(0978489648)): ");
        String numberPhone = scanner.nextLine();

        if (phoneNumber.validatePhoneNumber(numberPhone)) {
            System.out.println("Phone number valid.");
        } else {
            System.out.println("Phone number not valid.");
        }
    }
}
