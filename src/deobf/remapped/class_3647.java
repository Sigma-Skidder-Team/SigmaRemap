package remapped;

import javax.swing.JComponent;
import javax.swing.JSpinner;
import javax.swing.JSpinner.DefaultEditor;

public class class_3647 implements Runnable {
   private static String[] field_17783;

   public class_3647(class_8064 var1, JComponent var2) {
      this.field_17784 = var1;
      this.field_17782 = var2;
   }

   @Override
   public void run() {
      Object var3 = this.field_17782;
      if (var3 instanceof JSpinner) {
         var3 = ((DefaultEditor)((JSpinner)this.field_17782).getEditor()).getTextField();
      }

      var3.requestFocusInWindow();
   }
}
