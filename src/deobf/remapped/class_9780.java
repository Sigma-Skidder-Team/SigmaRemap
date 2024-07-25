package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_9780 extends class_7651 {
   private static String[] field_49640;

   private class_9780(class_7039 var1) {
      super(var1, null);
      this.field_49641 = var1;
   }

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.method_45148(var1, var2, var4, var3, var7, var8);
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      class_7039.method_32281(this.field_49641, true);
      return true;
   }

   private void method_45148(class_7966 var1, int var2, int var3, int var4, int var5, int var6) {
      int var9 = var4 + 8;
      byte var10 = 0;
      boolean var11 = false;
      if (var3 <= var5 && var5 <= (int)class_7039.method_32293(this.field_49641).method_36228() && var4 <= var6 && var6 <= var4 + 32) {
         var11 = true;
      }

      int var12 = 8388479;
      if (var11 && !this.field_49641.method_32211()) {
         var12 = 6077788;
      }

      for (ITextComponent var14 : class_7039.method_32263()) {
         class_2089.method_9788(var1, class_7039.method_32233(this.field_49641), var14, this.field_49641.field_941 / 2, var9 + var10, var12);
         var10 += 10;
      }
   }
}
