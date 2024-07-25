package remapped;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public final class class_283 extends class_8064 {
   private static String[] field_1007;

   public class_283(String var1, String var2, int var3, String var4) {
      super(var1, var2);
      this.field_1005 = var3;
      this.field_1006 = var4;
   }

   @Override
   public void method_10499() {
      JSpinner var3 = new JSpinner(new SpinnerNumberModel(this.field_1005, -32768, 32767, 1));
      if (this.method_36570(var3, this.field_1006)) {
         this.field_41269 = String.valueOf(var3.getValue());
      }
   }

   @Override
   public Object method_10500() {
      return Integer.valueOf(this.field_41269);
   }
}
