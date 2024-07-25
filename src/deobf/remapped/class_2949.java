package remapped;

import java.util.function.BooleanSupplier;

public class class_2949 extends class_5916 {
   private static String[] field_14419;
   private final BooleanSupplier field_14418;

   public class_2949(String var1, int var2, String var3, BooleanSupplier var4) {
      super(var1, class_8863.field_45319, var2, var3);
      this.field_14418 = var4;
   }

   @Override
   public void setPressed(boolean var1) {
      if (!this.field_14418.getAsBoolean()) {
         super.setPressed(var1);
      } else if (var1) {
         super.setPressed(!this.isKeyDown());
      }
   }
}
