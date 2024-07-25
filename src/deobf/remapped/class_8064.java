package remapped;

import java.awt.EventQueue;
import javax.swing.JComponent;

public abstract class class_8064 implements class_2278 {
   public String field_41269;
   public String field_41268;

   public class_8064(String var1, String var2) {
      this.field_41269 = var2;
      this.field_41268 = var1;
   }

   @Override
   public void method_10497(String var1) {
      this.field_41269 = var1;
   }

   @Override
   public String method_10498() {
      return this.field_41269;
   }

   @Override
   public String method_10496() {
      return this.field_41268;
   }

   @Override
   public String toString() {
      return this.field_41269 != null ? this.field_41269.toString() : "";
   }

   public boolean method_36570(JComponent var1, String var2) {
      class_4300 var5 = new class_4300(var1, this.field_41268, var2);
      var5.setTitle(this.field_41268);
      var5.setLocationRelativeTo(null);
      EventQueue.invokeLater(new class_3647(this, var1));
      var5.setVisible(true);
      return var5.field_20874;
   }
}
