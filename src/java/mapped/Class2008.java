package mapped;

import java.util.function.BooleanSupplier;

public class Class2008 extends KeyBinding {
   private static String[] field13073;
   private final BooleanSupplier field13074;

   public Class2008(String var1, int var2, String var3, BooleanSupplier var4) {
      super(var1, InputMappingsType.KEYSYM, var2, var3);
      this.field13074 = var4;
   }

   @Override
   public void setPressed(boolean var1) {
      if (!this.field13074.getAsBoolean()) {
         super.setPressed(var1);
      } else if (var1) {
         super.setPressed(!this.isKeyDown());
      }
   }
}
