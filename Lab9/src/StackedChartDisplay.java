import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class StackedChartDisplay
{
    public static void display(String name, ArrayList<String> categoryList, ArrayList<Integer> voteCountList)
    {
        // Set up new frame
        JFrame displayFrame = new JFrame(name);
        //displayFrame.setBackground(Color.darkGray);
        displayFrame.setPreferredSize(new Dimension( 600, 400));

        StackedChart stackedChart = new StackedChart(categoryList, voteCountList);
        displayFrame.setContentPane(stackedChart);
        stackedChart.setPreferredSize(new Dimension(380, 300));
        //stackedChart.setBackground(Color.white);

        // Pack and show
        displayFrame.pack();
        displayFrame.setVisible(true);
    }
}
