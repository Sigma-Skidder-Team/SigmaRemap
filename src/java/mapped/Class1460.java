package mapped;

import javax.swing.*;
import javax.swing.JSpinner.DefaultEditor;

public class Class1460 implements Runnable {
   private static String[] field7850;
   public final JComponent field7851;
   public final Class5436 field7852;

   public Class1460(Class5436 var1, JComponent var2) {
      this.field7852 = var1;
      this.field7851 = var2;
   }

   @Override
   public void run() {
      JComponent var3 = this.field7851;
      if (var3 instanceof JSpinner) {
         var3 = ((DefaultEditor)((JSpinner)this.field7851).getEditor()).getTextField();
      }

      var3.requestFocusInWindow();
   }
}
