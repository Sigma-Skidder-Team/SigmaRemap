package remapped;

import com.google.common.collect.Lists;
import com.mojang.util.QueueLogAppender;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7990 extends JComponent {
   private static final Font field_40942 = new Font("Monospaced", 0, 12);
   private static final Logger field_40944 = LogManager.getLogger();
   private final class_4497 field_40945;
   private Thread field_40946;
   private final Collection<Runnable> field_40943 = Lists.newArrayList();
   private final AtomicBoolean field_40948 = new AtomicBoolean();

   public static class_7990 method_36255(class_4497 var0) {
      try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      } catch (Exception var5) {
      }

      JFrame var3 = new JFrame("Minecraft server");
      class_7990 var4 = new class_7990(var0);
      var3.setDefaultCloseOperation(2);
      var3.add(var4);
      var3.pack();
      var3.setLocationRelativeTo((Component)null);
      var3.setVisible(true);
      var3.addWindowListener(new class_5701(var4, var3, var0));
      var4.method_36262(var3::dispose);
      var4.method_36263();
      return var4;
   }

   private class_7990(class_4497 var1) {
      this.field_40945 = var1;
      this.setPreferredSize(new Dimension(854, 480));
      this.setLayout(new BorderLayout());

      try {
         this.add(this.method_36256(), "Center");
         this.add(this.method_36259(), "West");
      } catch (Exception var5) {
         field_40944.error("Couldn't build server GUI", var5);
      }
   }

   public void method_36262(Runnable var1) {
      this.field_40943.add(var1);
   }

   private JComponent method_36259() {
      JPanel var3 = new JPanel(new BorderLayout());
      class_4276 var4 = new class_4276(this.field_40945);
      this.field_40943.add(var4::method_19880);
      var3.add(var4, "North");
      var3.add(this.method_36258(), "Center");
      var3.setBorder(new TitledBorder(new EtchedBorder(), "Stats"));
      return var3;
   }

   private JComponent method_36258() {
      class_3657 var3 = new class_3657(this.field_40945);
      JScrollPane var4 = new JScrollPane(var3, 22, 30);
      var4.setBorder(new TitledBorder(new EtchedBorder(), "Players"));
      return var4;
   }

   private JComponent method_36256() {
      JPanel var3 = new JPanel(new BorderLayout());
      JTextArea var4 = new JTextArea();
      JScrollPane var5 = new JScrollPane(var4, 22, 30);
      var4.setEditable(false);
      var4.setFont(field_40942);
      JTextField var6 = new JTextField();
      var6.addActionListener(var2 -> {
         String var5x = var6.getText().trim();
         if (!var5x.isEmpty()) {
            this.field_40945.method_20898(var5x, this.field_40945.method_1730());
         }

         var6.setText("");
      });
      var4.addFocusListener(new class_7806(this));
      var3.add(var5, "Center");
      var3.add(var6, "South");
      var3.setBorder(new TitledBorder(new EtchedBorder(), "Log and chat"));
      this.field_40946 = new Thread(() -> {
         String var5x;
         while ((var5x = QueueLogAppender.getNextLogEvent("ServerGuiConsole")) != null) {
            this.method_36264(var4, var5, var5x);
         }
      });
      this.field_40946.setUncaughtExceptionHandler(new class_447(field_40944));
      this.field_40946.setDaemon(true);
      return var3;
   }

   public void method_36263() {
      this.field_40946.start();
   }

   public void method_36257() {
      if (!this.field_40948.getAndSet(true)) {
         this.method_36261();
      }
   }

   private void method_36261() {
      this.field_40943.forEach(Runnable::run);
   }

   public void method_36264(JTextArea var1, JScrollPane var2, String var3) {
      if (!SwingUtilities.isEventDispatchThread()) {
         SwingUtilities.invokeLater(() -> this.method_36264(var1, var2, var3));
      } else {
         Document var6 = var1.getDocument();
         JScrollBar var7 = var2.getVerticalScrollBar();
         boolean var8 = false;
         if (var2.getViewport().getView() == var1) {
            var8 = (double)var7.getValue() + var7.getSize().getHeight() + (double)(field_40942.getSize() * 4) > (double)var7.getMaximum();
         }

         try {
            var6.insertString(var6.getLength(), var3, (AttributeSet)null);
         } catch (BadLocationException var10) {
         }

         if (var8) {
            var7.setValue(Integer.MAX_VALUE);
         }
      }
   }
}
