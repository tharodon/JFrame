import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class App extends JFrame {
    private int voron = 0;
    private JLabel countLabel;
    private JButton addCrow;
    private JButton removeCrow;

    public App() {
        super("Crow calculator");
        //Подготавливаем компоненты объекта
        countLabel = new JLabel("Crows:" + voron);
        addCrow = new JButton("Add Crow");
        removeCrow = new JButton("Remove Crow");

        //Подготавливаем временные компоненты
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        //Расставляем компоненты по местам
        buttonsPanel.add(countLabel, BorderLayout.NORTH); //О размещении компонент поговорим позже

        buttonsPanel.add(addCrow);
        buttonsPanel.add(removeCrow);

        add(buttonsPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addCrow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame = new JFrame();
                String name = JOptionPane.showInputDialog(jFrame, "enter name of employee");
                countLabel.setText(name);
            }
        });
    }

    public static void main(String[] args) {
        App app = new App();
        app.setVisible(true);
        app.setBackground(Color.GREEN);
        app.pack(); //Эта команда подбирает оптимальный размер в зависимости от содержимого окна
    }
}