/*
 * Created by JFormDesigner on Mon Feb 20 06:06:50 CST 2012
 */

package Recipe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

/**
 * @author Najim Yaqubie
 */
public class RecipeGUI extends JFrame {
    public RecipeGUI() {
        initComponents();
    }

    public JTextArea getOutputText() {
        return OutputText;
    }

    public JTextArea getRecipeDirInput() {
        return RecipeDirInput;
    }

    public JTextArea getRecipeIngInput() {
        return RecipeIngInput;
    }

    public JTextArea getRecipeMetaInput() {
        return RecipeMetaInput;
    }

    public JTextField getRecipeNameInput() {
        return RecipeNameInput;
    }

    public JButton getButtonParse() {
        return ButtonParse;
    }

    private void ButtonParseActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Najim Yaqubie
        label1 = new JLabel();
        panel1 = new JPanel();
        RecipeNameLabel = new JLabel();
        RecipeNameInput = new JTextField();
        RecipeMetaLabel = new JLabel();
        scrollPane2 = new JScrollPane();
        RecipeMetaInput = new JTextArea();
        RecipeIngLabel = new JLabel();
        scrollPane3 = new JScrollPane();
        RecipeIngInput = new JTextArea();
        RecipeDirLabel = new JLabel();
        scrollPane4 = new JScrollPane();
        RecipeDirInput = new JTextArea();
        panel2 = new JPanel();
        ButtonParse = new JButton();
        button2 = new JButton();
        OutputLabel = new JLabel();
        scrollPane5 = new JScrollPane();
        OutputText = new JTextArea();

        //======== this ========
        setTitle("Recipe Parser");
        Container contentPane = getContentPane();
        contentPane.setLayout(new FormLayout(
            "[60dlu,default], $lcgap, [150dlu,default], $lcgap, [20dlu,default], $lcgap, [60dlu,default], $lcgap, 150dlu, $lcgap, [15dlu,default]",
            "[10dlu,default], $lgap, default, $lgap, [15dlu,default], $lgap, default, $lgap, 15dlu"));

        //---- label1 ----
        label1.setText("Recipe Parser");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 12f));
        contentPane.add(label1, CC.xywh(3, 3, 7, 1, CC.CENTER, CC.DEFAULT));

        //======== panel1 ========
        {

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            panel1.setLayout(new FormLayout(
                "60dlu, $lcgap, 150dlu",
                "2*(default, $lgap), [30dlu,default], 2*($lgap, default), $lgap, [130dlu,default], 2*($lgap, default), $lgap, [130dlu,default]"));

            //---- RecipeNameLabel ----
            RecipeNameLabel.setText("Recipe Name:");
            RecipeNameLabel.setLabelFor(RecipeNameInput);
            panel1.add(RecipeNameLabel, CC.xy(1, 1, CC.CENTER, CC.DEFAULT));
            panel1.add(RecipeNameInput, CC.xy(3, 1));

            //---- RecipeMetaLabel ----
            RecipeMetaLabel.setText("Meta-Data:");
            panel1.add(RecipeMetaLabel, CC.xy(1, 3, CC.CENTER, CC.DEFAULT));

            //======== scrollPane2 ========
            {

                //---- RecipeMetaInput ----
                RecipeMetaInput.setLineWrap(true);
                scrollPane2.setViewportView(RecipeMetaInput);
            }
            panel1.add(scrollPane2, CC.xywh(3, 3, 1, 3));

            //---- RecipeIngLabel ----
            RecipeIngLabel.setText("Ingredients:");
            RecipeIngLabel.setLabelFor(RecipeIngInput);
            panel1.add(RecipeIngLabel, CC.xy(1, 9, CC.CENTER, CC.DEFAULT));

            //======== scrollPane3 ========
            {

                //---- RecipeIngInput ----
                RecipeIngInput.setLineWrap(true);
                RecipeIngInput.setWrapStyleWord(true);
                scrollPane3.setViewportView(RecipeIngInput);
            }
            panel1.add(scrollPane3, CC.xywh(3, 9, 1, 3));

            //---- RecipeDirLabel ----
            RecipeDirLabel.setText("Directions:");
            RecipeDirLabel.setLabelFor(RecipeDirInput);
            panel1.add(RecipeDirLabel, CC.xy(1, 15, CC.CENTER, CC.DEFAULT));

            //======== scrollPane4 ========
            {

                //---- RecipeDirInput ----
                RecipeDirInput.setLineWrap(true);
                RecipeDirInput.setWrapStyleWord(true);
                scrollPane4.setViewportView(RecipeDirInput);
            }
            panel1.add(scrollPane4, CC.xywh(3, 15, 1, 3));
        }
        contentPane.add(panel1, CC.xywh(1, 7, 3, 1));

        //======== panel2 ========
        {
            panel2.setLayout(new FormLayout(
                "[60dlu,default], $lcgap, [151dlu,default]",
                "4*(default, $lgap), 270dlu, $lgap, default"));

            //---- ButtonParse ----
            ButtonParse.setText("Parse!");
            ButtonParse.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    ButtonParseActionPerformed(e);
                }
            });
            panel2.add(ButtonParse, CC.xy(1, 1));

            //---- button2 ----
            button2.setText("text");
            panel2.add(button2, CC.xy(1, 3));

            //---- OutputLabel ----
            OutputLabel.setText("Output:");
            panel2.add(OutputLabel, CC.xy(1, 5));

            //======== scrollPane5 ========
            {

                //---- OutputText ----
                OutputText.setBackground(Color.lightGray);
                OutputText.setEditable(false);
                OutputText.setLineWrap(true);
                OutputText.setWrapStyleWord(true);
                scrollPane5.setViewportView(OutputText);
            }
            panel2.add(scrollPane5, CC.xywh(1, 9, 3, 3));
        }
        contentPane.add(panel2, CC.xywh(7, 7, 4, 1, CC.DEFAULT, CC.TOP));
        setSize(930, 720);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Najim Yaqubie
    private JLabel label1;
    private JPanel panel1;
    private JLabel RecipeNameLabel;
    private JTextField RecipeNameInput;
    private JLabel RecipeMetaLabel;
    private JScrollPane scrollPane2;
    private JTextArea RecipeMetaInput;
    private JLabel RecipeIngLabel;
    private JScrollPane scrollPane3;
    private JTextArea RecipeIngInput;
    private JLabel RecipeDirLabel;
    private JScrollPane scrollPane4;
    private JTextArea RecipeDirInput;
    private JPanel panel2;
    private JButton ButtonParse;
    private JButton button2;
    private JLabel OutputLabel;
    private JScrollPane scrollPane5;
    private JTextArea OutputText;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}
