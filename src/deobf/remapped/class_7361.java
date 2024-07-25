package remapped;

import javax.swing.JCheckBox;

public final class class_7361 extends class_8064 {
   private static String[] field_37622;

   public class_7361(String var1, String var2, boolean var3, String var4) {
      super(var1, var2);
      this.field_37623 = var3;
      this.field_37621 = var4;
   }

   @Override
   public void method_10499() {
      JCheckBox var3 = new JCheckBox();
      var3.setSelected(this.field_37623);
      if (this.method_36570(var3, this.field_37621)) {
         this.field_41269 = String.valueOf(var3.isSelected());
      }
   }

   @Override
   public Object method_10500() {
      return Boolean.valueOf(this.field_41269);
   }
}
