import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BlackHistoryMonthGenerations {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Black History Month Generations");
    frame.setSize(300, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();
    frame.add(panel);

    JLabel labelGeneration = new JLabel("Enter a generation (1-5):");
    panel.add(labelGeneration);

    JTextField generationField = new JTextField(10);
    panel.add(generationField);

    JButton button = new JButton("Submit");
    panel.add(button);

    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        int generation = Integer.parseInt(generationField.getText());
        String resultText;
        switch (generation) {
          case 1:
            resultText = "First generation,W. E. B. Du Bois (1868-1963): was an American sociologist, historian, and civil rights activist who co-founded the National Association for the Advancement of Colored People (NAACP). ";
            break;
          case 2:
            resultText = "Second generation Martin Luther King Jr. (1929-1968): was an American Baptist minister and activist who became the most visible spokesperson and leader in the Civil Rights Movement. ";
            break;
          case 3:
            resultText = "Third generation Barack Obama (born 1961): is an American politician and attorney who served as the 44th President of the United States, the first African American to hold the office.";
            break;
          case 4:
            resultText = "Fourth generation  Colin Kaepernick (born 1987): is a former American football quarterback who is known for his activism, including kneeling during the national anthem to protest police brutality and racial inequality. ";
            break;
          case 5:
            resultText = "Fifth generation Ken Carson (born 2000): Ken Carson whose real name is Kenyatta L Frazier Jr,is an American recording artist and producer. Although he's only 19, he's already emerging as a leading figure in a new generation of “underground” rappers.";
            break;
          default:
            resultText = "Invalid generation";
            break;
        }
        
        JFrame resultFrame = new JFrame();
        resultFrame.setSize(1500, 100);
        JPanel resultPanel = new JPanel();
        resultFrame.add(resultPanel);
        JLabel resultLabel = new JLabel(resultText);
        resultPanel.add(resultLabel);
        resultFrame.setVisible(true);
      }
    });

    frame.setVisible(true);
  }
}
