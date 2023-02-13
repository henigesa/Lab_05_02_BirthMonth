//class birthMonth
//	main ()
//		num birthNumber
//		String birthMonth
//			output “Please enter your birth month N in terms of 1-12.”
//			input birthNumber
//			if [birthNumber == 1] then
//				birthMonth = January
//			else if [birthNumber == 2] then
//				birthMonth = February
//			else if [birthNumber == 3] then
//				birthMonth = March
//			else if [birthNumber == 4] then
//				birthMonth = April
//			else if [birthNumber == 5] then
//birthMonth = May
//			else if [birthNumber == 6] then
//				birthMonth = June
//			else if [birthNumber == 7] then
//				birthMonth = July
//			else if [birthNumber == 8] then
//				birthMonth = August
//			else if [birthNumber == 9] then
//				birthMonth = September
//			else if [birthNumber == 10] then
//				birthMonth = October
//			else if [birthNumber == 11] then
//				birthMonth = November
//			else if [birthNumber == 12] then
//				birthMonth = December
//			else
//				birthMonth = null
//			end if
//			if [birthMonth == null] then
//				output “You entered an incorrect month value N.”
//			else
//				output “Your birth month is” + birthMonth + “!”
//			end if
//	return
//end class

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declare variables
        int birthNumber ;
        String birthMonth = new String ("birthMonth");
        //prompt user to enter the number
        System.out.println("Please enter your birth month number:");
        //take the user input
        birthNumber = input.nextInt() ;
        //if then

        	if (birthNumber == 1) {
                birthMonth = ("January");
            }
			else if (birthNumber == 2) {
                birthMonth = ("February");
            }
			else if (birthNumber == 3) {
                birthMonth = ("March");
            }
			else if (birthNumber == 4) {
                birthMonth = ("April");
            }
			else if (birthNumber == 5) {
                birthMonth = ("May");
            }
			else if (birthNumber == 6) {
                birthMonth = ("June");
            }
			else if (birthNumber == 7) {
                birthMonth = ("July");
            }
			else if (birthNumber == 8) {
                birthMonth = ("August");
            }
			else if (birthNumber == 9) {
                birthMonth = ("September");
            }
			else if (birthNumber == 10) {
                birthMonth = ("October");
            }
			else if (birthNumber == 11) {
                birthMonth = ("November");
        }
			else if (birthNumber == 12) {
            birthMonth = ("December");
        }
			else {
            birthMonth = null;
        }
            if (birthMonth == null) {
                System.out.println("You entered an incorrect value");
            }
                else
                System.out.println("Your birth month is " + birthMonth + "!");
    }
}