// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import javax.swing.JComponent;
import javax.swing.JDialog;

public class Class2417 extends JDialog
{
    public boolean field14305;
    
    public Class2417(final JComponent comp, final String str, final String text) {
        this.field14305 = false;
        this.setDefaultCloseOperation(2);
        this.setLayout(new GridBagLayout());
        this.setModal(true);
        if (comp instanceof JSpinner) {
            ((JSpinner.DefaultEditor)((JSpinner)comp).getEditor()).getTextField().setColumns(4);
        }
        final JPanel comp2 = new JPanel();
        comp2.setLayout(new GridBagLayout());
        this.getContentPane().add(comp2, new GridBagConstraints(0, 0, 2, 1, 1.0, 0.0, 10, 1, new Insets(0, 0, 0, 0), 0, 0));
        comp2.setBackground(Color.white);
        comp2.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        final JTextArea comp3 = new JTextArea(text);
        comp2.add(comp3, new GridBagConstraints(0, 0, 1, 1, 1.0, 0.0, 10, 1, new Insets(5, 5, 5, 5), 0, 0));
        comp3.setWrapStyleWord(true);
        comp3.setLineWrap(true);
        comp3.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        comp3.setEditable(false);
        final JPanel comp4 = new JPanel();
        this.getContentPane().add(comp4, new GridBagConstraints(0, 1, 1, 1, 1.0, 1.0, 10, 0, new Insets(5, 5, 0, 5), 0, 0));
        comp4.add(new JLabel(str + ":"));
        comp4.add(comp);
        final JPanel comp5 = new JPanel();
        this.getContentPane().add(comp5, new GridBagConstraints(0, 2, 2, 1, 0.0, 0.0, 13, 0, new Insets(0, 0, 0, 0), 0, 0));
        final JButton comp6 = new JButton("OK");
        comp5.add(comp6);
        comp6.addActionListener(new Class7053(this));
        final JButton comp7 = new JButton("Cancel");
        comp5.add(comp7);
        comp7.addActionListener(new Class7047(this));
        this.setSize(new Dimension(320, 175));
    }
}
