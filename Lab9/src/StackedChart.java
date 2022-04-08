import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class StackedChart extends JComponent
{
    // Instance Variables
    ArrayList<Integer> voteList;
    ArrayList<String> categories;

    int axisOffset = 20;

    // Constructor
    public StackedChart(ArrayList<String> categoryList, ArrayList<Integer> countList)
    {
        voteList = countList;
        categories = categoryList;
    }

    // Paint Component
    @Override
    protected void paintComponent(Graphics g)
    {
        // Draw Bound Box
        super.paintComponent(g);
        g.setColor(Color.darkGray);
        g.fillRect(110, 18, 360, 5);
        g.drawString("100", 87, 23);

        super.paintComponent(g);
        g.fillRect(110, 48, 360, 5);
        g.drawString("90", 90, 53);

        super.paintComponent(g);
        g.fillRect(110, 78, 360, 5);
        g.drawString("80", 90, 83);

        super.paintComponent(g);
        g.fillRect(110, 108, 360, 5);
        g.drawString("70", 90, 113);

        super.paintComponent(g);
        g.fillRect(110, 138, 360, 5);
        g.drawString("60", 90, 143);

        super.paintComponent(g);
        g.fillRect(110, 168, 360, 5);
        g.drawString("50", 90, 173);

        super.paintComponent(g);
        g.fillRect(110, 198, 360, 5);
        g.drawString("40", 90, 203);

        super.paintComponent(g);
        g.fillRect(110, 228, 360, 5);
        g.drawString("30", 90, 233);

        super.paintComponent(g);
        g.fillRect(110, 258, 360, 5);
        g.drawString("20", 90, 263);

        super.paintComponent(g);
        g.fillRect(110, 288, 360, 5);
        g.drawString("10", 90, 293);

        super.paintComponent(g);
        g.fillRect(110, 318, 360, 5);
        g.drawString("0", 95, 323);

        // Now draw categories
        if (categories.size() == 2) {
            // Draw Category 1
            super.paintComponent(g);
            g.setColor(Color.blue);
            int box1 = 300 * voteList.get(0) / totalTally();
            g.fillRect(140, 170 - box1, 300, 300 * voteList.get(0) / totalTally());
            g.setColor(Color.black);
            g.drawString(categories.get(0), 460, 170 - box1);

            // Draw Category 2
            super.paintComponent(g);
            g.setColor(Color.yellow);
            int box2 = 300 * voteList.get(1) / totalTally();
            g.fillRect(140, 320 - box2, 300, 300 * voteList.get(1) / totalTally());
            g.setColor(Color.black);
            g.drawString(categories.get(1), 460, 320 - box2);
        } else if (categories.size() == 3) {
            // Draw Category 1

            // Draw Category 2

            // Draw Category 3


        } else if (categories.size() == 4) {
            // Draw Category 1

            // Draw Category 2

            // Draw Category 3

            // Draw Category 4

        } else if (categories.size() == 5) {
            // Draw Category 1

            // Draw Category 2

            // Draw Category 3

            // Draw Category 4

            // Draw Category 5

        } else if (categories.size() == 6) {
            // Draw Category 1

            // Draw Category 2

            // Draw Category 3

            // Draw Category 4

            // Draw Category 5

            // Draw Category 6
        }

    }

    private int totalTally()
    {
        int tally = 0;
        for (int i = 0; i < voteList.size(); i++)
        {
            tally += voteList.get(i);
        }
        System.out.println(tally + "");
        return tally;
    }
}
