/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_03_16_book_club_points;

import javax.swing.JOptionPane;
/**
 *
 * @author bluebackdev
 * Serendipity Booksellers has a book club that awards points to its customers
 * based on the number of books purchased each month. The points are awarded
 * as follows:
 * 
 *      - If a customer purchases 0 books, he or she earns 0 points.
 *      - If a customer purchases 1 books, he or she earns 5 points.
 *      - If a customer purchases 2 books, he or she earns 15 points.
 *      - If a customer purchases 3 books, he or she earns 30 points.
 *      - If a customer purchases 4 books, he or she earns 60 points.
 * 
 * Write a program that asks the user to enter the number of books that he or
 * she has purchased this month and then displays the number of points awarded.
 */
public class JAVA_PRG_03_16_Book_Club_Points {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare constant ints for award levels
        final int INT_LEVEL_1 = 0;
        final int INT_LEVEL_2 = 1;
        final int INT_LEVEL_3 = 2;
        final int INT_LEVEL_4 = 3;
        final int INT_LEVEL_5 = 4;
        
        // Declare constant int for point rewards
        final int INT_REWARD_1 = 0;
        final int INT_REWARD_2 = 5;
        final int INT_REWARD_3 = 15;
        final int INT_REWARD_4 = 30;
        final int INT_REWARD_5 = 60;
        
        // Declare int to hold parsed user input and points awarded
        int intUserInput;
        int intUserRewardPoints;
        
        // Declare string to hold user input
        String strUserInput;
        
        // Loop to get user input, makes sure data is valid:
        // Not negative and not overly large
        do
        {
            strUserInput = JOptionPane.showInputDialog("Please enter the number "
                    + "of books\nyou purchased this month.");
            intUserInput = Integer.parseInt(strUserInput);
        }while(intUserInput < 0 || intUserInput > 10);
        
        // Compare validated data against reward levels
        if(intUserInput == INT_LEVEL_1)
        {
            intUserRewardPoints = INT_REWARD_1;
        }
        else if(intUserInput == INT_LEVEL_2)
        {
            intUserRewardPoints = INT_REWARD_2;
        }
        else if(intUserInput == INT_LEVEL_3)
        {
            intUserRewardPoints = INT_REWARD_3;
        }
        else if(intUserInput == INT_LEVEL_4)
        {
            intUserRewardPoints = INT_REWARD_4;
        }
        else if(intUserInput >= INT_LEVEL_5)
        {
            intUserRewardPoints = INT_REWARD_5;
        }
        else // Error-checking
        {
            JOptionPane.showMessageDialog(null, "ERROR CALCULATING "
                + "REWARD POINTS");
            intUserRewardPoints = 0; // Initialize to ensure program runs
            System.exit(0);
        }
        
        // Output dialog for user to read
        JOptionPane.showMessageDialog(null, "For purchasing " + intUserInput
            + " books this month,\nyou have earned " + intUserRewardPoints
            + " reward points");
    }
    
}
