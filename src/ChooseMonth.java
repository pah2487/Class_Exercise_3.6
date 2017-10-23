import javax.swing.*;

/**
 * creates JOptionPane choice dialog and response for different selected months until cancelled
 * @author Patrick H.
 * @since 2017-10-22
 * @version 1.0
 */
public class ChooseMonth{
    public enum AllMonths {
        January, February, March, April, May, June, July, August, September, October, November, December
    }
    public static void main(String [] args){
        while (true) {
            String[] months = { AllMonths.January.name(),AllMonths.February.name(),AllMonths.March.name(), AllMonths.April.name(), AllMonths.May.name(), AllMonths.June.name(), AllMonths.July.name(), AllMonths.August.name(), AllMonths.September.name(), AllMonths.October.name(), AllMonths.November.name(), AllMonths.December.name() };
            String input = (String) JOptionPane.showInputDialog(null, "Please Choose a Month:",
                    "Month Response", JOptionPane.QUESTION_MESSAGE, null, months, months[0]);
            switch (input){
                case "December":
                case "January":
                case "February":
                    JOptionPane.showMessageDialog(null,"Do you want to build a snowman?");
                    break;
                case "March":
                case "April":
                case "May":
                    JOptionPane.showMessageDialog(null,"Happy spring days!");
                    break;
                case "June":
                case "July":
                case "August":
                    JOptionPane.showMessageDialog(null,"It's summer time.");
                    break;
                case "September":
                case "October":
                case "November":
                    JOptionPane.showMessageDialog(null,"Welcome to the foliage season!");
                    break;
            }
        }


    }
}
