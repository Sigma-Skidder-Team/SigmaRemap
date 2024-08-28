package mapped;

import javax.swing.*;
import javax.swing.JSpinner.DefaultEditor;
import java.awt.Color;
import java.awt.*;

public class Class2516 extends JDialog {
   public boolean field16650 = false;

   public Class2516(JComponent var1, String var2, String var3) {
      this.setDefaultCloseOperation(2);
      this.setLayout(new GridBagLayout());
      this.setModal(true);
      if (var1 instanceof JSpinner) {
         ((DefaultEditor)((JSpinner)var1).getEditor()).getTextField().setColumns(4);
      }

      JPanel var6 = new JPanel();
      var6.setLayout(new GridBagLayout());
      this.getContentPane().add(var6, new GridBagConstraints(0, 0, 2, 1, 1.0, 0.0, 10, 1, new Insets(0, 0, 0, 0), 0, 0));
      var6.setBackground(Color.white);
      var6.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
      JTextArea var7 = new JTextArea(var3);
      var6.add(var7, new GridBagConstraints(0, 0, 1, 1, 1.0, 0.0, 10, 1, new Insets(5, 5, 5, 5), 0, 0));
      var7.setWrapStyleWord(true);
      var7.setLineWrap(true);
      var7.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      var7.setEditable(false);
      JPanel var10 = new JPanel();
      this.getContentPane().add(var10, new GridBagConstraints(0, 1, 1, 1, 1.0, 1.0, 10, 0, new Insets(5, 5, 0, 5), 0, 0));
      var10.add(new JLabel(var2 + ":"));
      var10.add(var1);
      JPanel var8 = new JPanel();
      this.getContentPane().add(var8, new GridBagConstraints(0, 2, 2, 1, 0.0, 0.0, 13, 0, new Insets(0, 0, 0, 0), 0, 0));
      JButton var9 = new JButton("OK");
      var8.add(var9);
      var9.addActionListener(new Class6304(this));
      var9 = new JButton("Cancel");
      var8.add(var9);
      var9.addActionListener(new Class6306(this));
      this.setSize(new Dimension(320, 175));
   }
}
