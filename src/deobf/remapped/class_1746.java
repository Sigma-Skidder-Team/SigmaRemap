package remapped;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

public class class_1746 implements ActionListener {
   private static String[] field_8994;

   public class_1746(class_5680 var1, class_9084 var2, JCheckBox var3) {
      this.field_8995 = var1;
      this.field_8997 = var2;
      this.field_8996 = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.field_8997.method_41840(this.field_8996.isSelected());
   }
}
