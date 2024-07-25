package remapped;

import java.util.EnumSet;
import java.util.Random;

public class class_9287 extends class_3599 {
   private static String[] field_47369;
   private final class_4206 field_47370;

   public class_9287(class_4206 var1) {
      this.field_47370 = var1;
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE));
   }

   @Override
   public boolean method_16795() {
      class_2833 var3 = this.field_47370.method_26905();
      if (!var3.method_12877()) {
         return true;
      } else {
         double var4 = var3.method_12887() - this.field_47370.getPosX();
         double var6 = var3.method_12881() - this.field_47370.method_37309();
         double var8 = var3.method_12886() - this.field_47370.getPosZ();
         double var10 = var4 * var4 + var6 * var6 + var8 * var8;
         return var10 < 1.0 || var10 > 3600.0;
      }
   }

   @Override
   public boolean method_16799() {
      return false;
   }

   @Override
   public void method_16796() {
      Random var3 = this.field_47370.method_26594();
      double var4 = this.field_47370.getPosX() + (double)((var3.nextFloat() * 2.0F - 1.0F) * 16.0F);
      double var6 = this.field_47370.method_37309() + (double)((var3.nextFloat() * 2.0F - 1.0F) * 16.0F);
      double var8 = this.field_47370.getPosZ() + (double)((var3.nextFloat() * 2.0F - 1.0F) * 16.0F);
      this.field_47370.method_26905().method_12879(var4, var6, var8, 1.0);
   }
}
