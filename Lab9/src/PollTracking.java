import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Locale;

public class PollTracking
{
    // Array Lists
    public static ArrayList<String> categoryList = new ArrayList<String>();
    public static ArrayList<Integer> voteCountList = new ArrayList<Integer>();

    public static void main(String[] args)
    {
        // Add my 3 integers
        voteCountList.add(0, 0);
        voteCountList.add(1, 0);

        // Add hot dog and hamburger to category list as default
        categoryList.add(0, "Hot Dog");
        categoryList.add(1, "Hamburger");

        // Create the main frame
        JFrame mainFrame = new JFrame("Poll: Hot dogs or Hamburgers, or more?");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the dimensions
        mainFrame.setPreferredSize(new Dimension(800, 100));

        // main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.orange);
        mainPanel.setBorder(new EmptyBorder(8, 8, 8, 8));

        // The three other panels
        JPanel votingPanel = new JPanel();
        JPanel labelPanel = new JPanel();
        JPanel createGraphPanel = new JPanel();

        // Add to panels to frame
        mainFrame.setContentPane(mainPanel);
        mainFrame.getContentPane().add(votingPanel);
        mainFrame.getContentPane().add(labelPanel);
        mainFrame.getContentPane().add(createGraphPanel);

        // Text field
        JTextField textField = new JTextField();
        votingPanel.add(textField);
        textField.setPreferredSize(new Dimension(50,25));

        // Labels
        JLabel pollOption1Label = new JLabel("Hot Dogs: " + voteCountList.get(0));
        JLabel pollOption2Label = new JLabel("Hamburgers:" + voteCountList.get(1));
        JLabel pollOtherLabel = new JLabel("Other: 0");

        // Buttons
        JButton button1 = new JButton("Hot Dog");
        JButton button2 = new JButton("Hamburger");
        JButton submitButton = new JButton("Submit Text");
        JButton createGraphButton = new JButton("Create Graph");

        // Set up buttons
        button1.addActionListener(new Option1ButtonListener(pollOption1Label));
        button2.addActionListener(new Option2ButtonListener(pollOption2Label));
        submitButton.addActionListener(new OptionOtherButtonListener(textField, pollOtherLabel));
        createGraphButton.addActionListener(new CreateGraphButtonListener(button1, button2, submitButton, createGraphButton, textField, mainFrame));

        // Adding them to Voting Panel
        votingPanel.add(button1);
        votingPanel.add(button2);
        votingPanel.add(submitButton);

        // Add Button to Graph Panel
        createGraphPanel.add(createGraphButton);

        // Add labels to panel
        labelPanel.add(pollOption1Label);
        labelPanel.add(pollOption2Label);
        labelPanel.add(pollOtherLabel);

        // Pack and show
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    // Hot dog
    public static class Option1ButtonListener implements ActionListener
    {
        JLabel mainLabel;

        public Option1ButtonListener(JLabel selfLabel)
        {
            mainLabel = selfLabel;
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            // Increment counts
            int currentCount = voteCountList.get(0);
            currentCount += 1;
            voteCountList.set(0, currentCount);

            updateLabel();
        }

        // Helper Function
        private void updateLabel()
        {
            mainLabel.setText("Hot Dogs: " + voteCountList.get(0));
        }
    }


    // Hamburger
    public static class Option2ButtonListener implements ActionListener
    {
        JLabel mainLabel;

        public Option2ButtonListener(JLabel selfLabel)
        {
            mainLabel = selfLabel;
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            // Increment counts
            int currentCount = voteCountList.get(1);
            currentCount += 1;
            voteCountList.set(1, currentCount);

            updateLabel();
        }

        // Helper Function
        private void updateLabel()
        {
            mainLabel.setText("Hamburgers: " + voteCountList.get(1));
        }
    }

    // Other Option
    public static class OptionOtherButtonListener implements ActionListener
    {
        // Variables for Array List
        JTextField buttonTextField;
        String content;

        // Label Variables
        JLabel mainLabel;

        public OptionOtherButtonListener(JTextField mainTextField, JLabel otherLabel)
        {
            buttonTextField = mainTextField;
            content = buttonTextField.getText();
            mainLabel = otherLabel;
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            // Increment counts
            if(CheckForDuplicate())
            {
                // Clear Text Field
                buttonTextField.setText("");
            }
            else
            {
                // Set count
                int currentSize = voteCountList.size();
                voteCountList.add(currentSize, 1);

                // Add category to list
                categoryList.add(currentSize, content);

                // Clear Text Field
                buttonTextField.setText("");
            }

            updateLabel();
        }

        // Helper Function
        private boolean CheckForDuplicate()
        {
            int duplicateIndex = 0;
            int permDuplicateIndex = 0;
            boolean foundDuplicate = false;
            for (int i = 0; i < voteCountList.size(); i++)
            {
                if(content.equalsIgnoreCase(categoryList.get(i)))
                {
                    foundDuplicate = true;
                    permDuplicateIndex = duplicateIndex;
                }
                else
                {
                    duplicateIndex += 1;
                }
            }

            // Increase count for duplicate
            int currentCount = voteCountList.get(permDuplicateIndex);
            currentCount += 1;
            voteCountList.set(permDuplicateIndex, currentCount);

            return foundDuplicate;
        }

        // Helper function lump all other counts together
        private int tallyOther()
        {
            int tally = 0;
            for (int i = 2; i < voteCountList.size(); i++)
            {
                tally += voteCountList.get(i);
            }
            return tally;
        }

        // Helper function for the label, adjusted for other
        private void updateLabel()
        {
            mainLabel.setText("Other: " + tallyOther());
        }

    }

    // Pause Everything, create a graph
    public static class CreateGraphButtonListener implements ActionListener
    {
        // Instance Variables
        JButton button1;
        JButton button2;
        JButton submitButton;
        JButton selfButton;
        JTextField textField;

        // Display needed variable
        String name;

        public CreateGraphButtonListener(JButton mainButton1, JButton mainButton2, JButton mainSubmitButton, JButton createGraphButton, JTextField mainTextField, JFrame mainFrame)
        {
            // Set instance variables
            button1 = mainButton1;
            button2 = mainButton2;
            submitButton = mainSubmitButton;
            selfButton = createGraphButton;
            textField = mainTextField;

            name = mainFrame.getTitle();
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            StackedChartDisplay.display(name, categoryList, voteCountList);

            disableFrameFunctionality();
        }

        // Helper function to turn off frame components
        private void disableFrameFunctionality()
        {
            button1.setEnabled(false);
            button2.setEnabled(false);
            submitButton.setEnabled(false);
            selfButton.setEnabled(false);
            textField.setEnabled(false);
        }
    }
}
