package remapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Objects;

public class class_3188 implements class_1808 {
   private static String[] field_15921;
   private final double field_15920;
   private final double field_15919;
   private final double field_15922;

   public class_3188(double var1, double var3, double var5) {
      this.field_15920 = var1;
      this.field_15919 = var3;
      this.field_15922 = var5;
   }

   @Override
   public class_1343 method_8027(class_9155 var1) {
      class_4895 var4 = var1.method_42174();
      class_1343 var5 = var1.method_42181().method_28188(var1);
      float var6 = class_9299.method_42840((var4.field_24329 + 90.0F) * (float) (Math.PI / 180.0));
      float var7 = class_9299.method_42818((var4.field_24329 + 90.0F) * (float) (Math.PI / 180.0));
      float var8 = class_9299.method_42840(-var4.field_24326 * (float) (Math.PI / 180.0));
      float var9 = class_9299.method_42818(-var4.field_24326 * (float) (Math.PI / 180.0));
      float var10 = class_9299.method_42840((-var4.field_24326 + 90.0F) * (float) (Math.PI / 180.0));
      float var11 = class_9299.method_42818((-var4.field_24326 + 90.0F) * (float) (Math.PI / 180.0));
      class_1343 var12 = new class_1343((double)(var6 * var8), (double)var9, (double)(var7 * var8));
      class_1343 var13 = new class_1343((double)(var6 * var10), (double)var11, (double)(var7 * var10));
      class_1343 var14 = var12.method_6196(var13).method_6209(-1.0);
      double var15 = var12.field_7336 * this.field_15922 + var13.field_7336 * this.field_15919 + var14.field_7336 * this.field_15920;
      double var17 = var12.field_7333 * this.field_15922 + var13.field_7333 * this.field_15919 + var14.field_7333 * this.field_15920;
      double var19 = var12.field_7334 * this.field_15922 + var13.field_7334 * this.field_15919 + var14.field_7334 * this.field_15920;
      return new class_1343(var5.field_7336 + var15, var5.field_7333 + var17, var5.field_7334 + var19);
   }

   @Override
   public class_4895 method_8025(class_9155 var1) {
      return class_4895.field_24322;
   }

   @Override
   public boolean method_8028() {
      return true;
   }

   @Override
   public boolean method_8026() {
      return true;
   }

   @Override
   public boolean method_8029() {
      return true;
   }

   public static class_3188 method_14679(StringReader var0) throws CommandSyntaxException {
      int var3 = var0.getCursor();
      double var4 = method_14678(var0, var3);
      if (var0.canRead() && var0.peek() == ' ') {
         var0.skip();
         double var6 = method_14678(var0, var3);
         if (var0.canRead() && var0.peek() == ' ') {
            var0.skip();
            double var8 = method_14678(var0, var3);
            return new class_3188(var4, var6, var8);
         } else {
            var0.setCursor(var3);
            throw class_1029.field_5708.createWithContext(var0);
         }
      } else {
         var0.setCursor(var3);
         throw class_1029.field_5708.createWithContext(var0);
      }
   }

   private static double method_14678(StringReader var0, int var1) throws CommandSyntaxException {
      if (var0.canRead()) {
         if (var0.peek() != '^') {
            var0.setCursor(var1);
            throw class_1029.field_5707.createWithContext(var0);
         } else {
            var0.skip();
            return var0.canRead() && var0.peek() != ' ' ? var0.readDouble() : 0.0;
         }
      } else {
         throw class_5941.field_30299.createWithContext(var0);
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof class_3188)) {
            return false;
         } else {
            class_3188 var4 = (class_3188)var1;
            return this.field_15920 == var4.field_15920 && this.field_15919 == var4.field_15919 && this.field_15922 == var4.field_15922;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field_15920, this.field_15919, this.field_15922);
   }
}
