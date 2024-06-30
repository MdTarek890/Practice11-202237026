import java.awt.*;
import javax.swing.*;

public class ComponentInWindow extends JFrame {

    JTextField text;
    JButton button;
    JCheckBox checkBox1, checkBox2, checkBox3;
    JRadioButton radio1, radio2;
    ButtonGroup group;
    JComboBox<String> comboBox;
    JTextArea area;

    public ComponentInWindow() {
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        checkBox1 = new JCheckBox("Likes music");
        checkBox2 = new JCheckBox("Likes traveling");
        checkBox3 = new JCheckBox("Likes basketball");

        radio1 = new JRadioButton("male");
        radio2 = new JRadioButton("female");
        group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);

        comboBox = new JComboBox<String>();
        comboBox.addItem("Music World");
        comboBox.addItem("Martial Arts World");
        comboBox.addItem("Chess Paradise");

        text = new JTextField(10);
        button = new JButton("Confirm");
        area = new JTextArea(6, 12);

        setLayout(new FlowLayout());
        add(new JLabel("Text box:"));
        add(text);
        add(new JLabel("Button:"));
        add(button);
        add(new JLabel("Checkboxes:"));
        add(checkBox1);
        add(checkBox2);
        add(checkBox3);
        add(new JLabel("Radio buttons:"));
        add(radio1);
        add(radio2);
        add(new JLabel("Dropdown list:"));
        add(comboBox);
        add(new JLabel("Text area:"));
        add(new JScrollPane(area));
    }
}
