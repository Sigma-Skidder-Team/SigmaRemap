package remapped;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public final class class_8561 extends class_8064 {
   private static String[] field_43793;

   public class_8561(String var1, String var2, float var3, float var4, float var5, String var6) {
      super(var1, var2);
      this.field_43791 = var3;
      this.field_43790 = var4;
      this.field_43792 = var5;
      this.field_43789 = var6;
   }

   @Override
   public void method_10499() {
      JSpinner var3 = new JSpinner(new SpinnerNumberModel((double)this.field_43791, (double)this.field_43790, (double)this.field_43792, 0.1F));
      if (this.method_36570(var3, this.field_43789)) {
         this.field_41269 = String.valueOf(((Double)var3.getValue()).floatValue());
      }
   }

   @Override
   public Object method_10500() {
      return Float.valueOf(this.field_41269);
   }
}
