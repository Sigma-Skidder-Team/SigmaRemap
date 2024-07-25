package remapped;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

public class class_1036 implements ActionListener {
   private static String[] field_5721;

   public class_1036(class_5680 var1, class_9084 var2, JCheckBox var3) {
      this.field_5718 = var1;
      this.field_5720 = var2;
      this.field_5719 = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.field_5720.method_41846(this.field_5719.isSelected());
   }
}
