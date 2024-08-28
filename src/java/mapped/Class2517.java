package mapped;

import com.google.common.collect.Lists;
import com.mojang.util.QueueLogAppender;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import java.awt.*;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;

public class Class2517 extends JComponent {
   private static final Font field16651 = new Font("Monospaced", 0, 12);
   private static final Logger field16652 = LogManager.getLogger();
   private final Class1645 field16653;
   private Thread field16654;
   private final Collection<Runnable> field16655 = Lists.newArrayList();
   private final AtomicBoolean field16656 = new AtomicBoolean();

   public static Class2517 method10550(Class1645 var0) {
      try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      } catch (Exception var5) {
      }

      JFrame var3 = new JFrame("Minecraft server");
      Class2517 var4 = new Class2517(var0);
      var3.setDefaultCloseOperation(2);
      var3.add(var4);
      var3.pack();
      var3.setLocationRelativeTo((Component)null);
      var3.setVisible(true);
      var3.addWindowListener(new Class6307(var4, var3, var0));
      var4.method10551(var3::dispose);
      var4.method10555();
      return var4;
   }

   private Class2517(Class1645 var1) {
      this.field16653 = var1;
      this.setPreferredSize(new Dimension(854, 480));
      this.setLayout(new BorderLayout());

      try {
         this.add(this.method10554(), "Center");
         this.add(this.method10552(), "West");
      } catch (Exception var5) {
         field16652.error("Couldn't build server GUI", var5);
      }
   }

   public void method10551(Runnable var1) {
      this.field16655.add(var1);
   }

   private JComponent method10552() {
      JPanel var3 = new JPanel(new BorderLayout());
      Class2518 var4 = new Class2518(this.field16653);
      this.field16655.add(var4::method10564);
      var3.add(var4, "North");
      var3.add(this.method10553(), "Center");
      var3.setBorder(new TitledBorder(new EtchedBorder(), "Stats"));
      return var3;
   }

   private JComponent method10553() {
      Class2514 var3 = new Class2514(this.field16653);
      JScrollPane var4 = new JScrollPane(var3, 22, 30);
      var4.setBorder(new TitledBorder(new EtchedBorder(), "Players"));
      return var4;
   }

   private JComponent method10554() {
      JPanel var3 = new JPanel(new BorderLayout());
      JTextArea var4 = new JTextArea();
      JScrollPane var5 = new JScrollPane(var4, 22, 30);
      var4.setEditable(false);
      var4.setFont(field16651);
      JTextField var6 = new JTextField();
      var6.addActionListener(var2 -> {
         String var5x = var6.getText().trim();
         if (!var5x.isEmpty()) {
            this.field16653.method6499(var5x, this.field16653.method1404());
         }

         var6.setText("");
      });
      var4.addFocusListener(new Class6309(this));
      var3.add(var5, "Center");
      var3.add(var6, "South");
      var3.setBorder(new TitledBorder(new EtchedBorder(), "Log and chat"));
      this.field16654 = new Thread(() -> {
         String var5x;
         while ((var5x = QueueLogAppender.getNextLogEvent("ServerGuiConsole")) != null) {
            this.method10558(var4, var5, var5x);
         }
      });
      this.field16654.setUncaughtExceptionHandler(new Class6030(field16652));
      this.field16654.setDaemon(true);
      return var3;
   }

   public void method10555() {
      this.field16654.start();
   }

   public void method10556() {
      if (!this.field16656.getAndSet(true)) {
         this.method10557();
      }
   }

   private void method10557() {
      this.field16655.forEach(Runnable::run);
   }

   public void method10558(JTextArea var1, JScrollPane var2, String var3) {
      if (!SwingUtilities.isEventDispatchThread()) {
         SwingUtilities.invokeLater(() -> this.method10558(var1, var2, var3));
      } else {
         Document var6 = var1.getDocument();
         JScrollBar var7 = var2.getVerticalScrollBar();
         boolean var8 = false;
         if (var2.getViewport().getView() == var1) {
            var8 = (double)var7.getValue() + var7.getSize().getHeight() + (double)(field16651.getSize() * 4) > (double)var7.getMaximum();
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

   // $VF: synthetic method
   public static AtomicBoolean access$000(Class2517 var0) {
      return var0.field16656;
   }

   // $VF: synthetic method
   public static void access$100(Class2517 var0) {
      var0.method10557();
   }
}
