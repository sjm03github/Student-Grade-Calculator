import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentGradeCalculator {
    private JTextField textStname;
    private JButton calculateButton;
    private JTextField txtDCmarks;
    private JTextField txtADSmarks;
    private JTextField txtSMAmarks;
    private JTextField txtCGmarks;
    private JTextField txtEMmarks;
    private JTextField txtTotal;
    private JTextField txtAvgPer;
    private JTextField txtGrade;
    private JPanel Main;
    private JButton quitButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("StudentGradeCalculator");
        frame.setContentPane(new StudentGradeCalculator().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public StudentGradeCalculator() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                int m1,m2,m3,m4,m5,total;
                double avgPer;

                m1 = Integer.parseInt(txtDCmarks.getText());
                m2 = Integer.parseInt(txtADSmarks.getText());
                m3 = Integer.parseInt(txtSMAmarks.getText());
                m4 = Integer.parseInt(txtCGmarks.getText());
                m5 = Integer.parseInt(txtEMmarks.getText());


                total = m1+2+m3+m4+m5;

                txtTotal.setText(String.valueOf(total));

                 avgPer = total/5;
                txtAvgPer.setText(String.valueOf(avgPer));

                if(avgPer >=90){
                    txtGrade.setText("O");
                }
                else if (avgPer >=80 && avgPer <90) {
                    txtGrade.setText("A");
                } else if (avgPer >=70 && avgPer <80) {
                    txtGrade.setText("B");
                } else if (avgPer >=60 && avgPer <70) {
                    txtGrade.setText("C");
                } else if (avgPer >=50 && avgPer <60) {
                    txtGrade.setText("D");
                } else if (avgPer >=40 && avgPer <50) {
                    txtGrade.setText("E");
                } else if (avgPer >=34 && avgPer <40) {
                    txtGrade.setText("F");
                }
                else {
                    txtGrade.setText("Fail");
                }


            }
        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    System.exit(0);                     // Quit the application
                }
//            }
        });
    }
}
