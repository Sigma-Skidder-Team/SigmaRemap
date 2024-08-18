package remapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class class_5095 implements class_1808 {
   private static String[] field_26287;
   private final class_5941 field_26286;
   private final class_5941 field_26285;
   private final class_5941 field_26288;

   public class_5095(class_5941 var1, class_5941 var2, class_5941 var3) {
      this.field_26286 = var1;
      this.field_26285 = var2;
      this.field_26288 = var3;
   }

   @Override
   public Vector3d method_8027(class_9155 var1) {
      Vector3d var4 = var1.method_42192();
      return new Vector3d(
         this.field_26286.method_27167(var4.field_7336), this.field_26285.method_27167(var4.field_7333), this.field_26288.method_27167(var4.field_7334)
      );
   }

   @Override
   public class_4895 method_8025(class_9155 var1) {
      class_4895 var4 = var1.method_42174();
      return new class_4895((float)this.field_26286.method_27167((double)var4.field_24326), (float)this.field_26285.method_27167((double)var4.field_24329));
   }

   @Override
   public boolean method_8028() {
      return this.field_26286.method_27168();
   }

   @Override
   public boolean method_8026() {
      return this.field_26285.method_27168();
   }

   @Override
   public boolean method_8029() {
      return this.field_26288.method_27168();
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof class_5095) {
            class_5095 var4 = (class_5095)var1;
            if (this.field_26286.equals(var4.field_26286)) {
               return this.field_26285.equals(var4.field_26285) ? this.field_26288.equals(var4.field_26288) : false;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public static class_5095 method_23411(StringReader var0) throws CommandSyntaxException {
      int var3 = var0.getCursor();
      class_5941 var4 = class_5941.method_27172(var0);
      if (var0.canRead() && var0.peek() == ' ') {
         var0.skip();
         class_5941 var5 = class_5941.method_27172(var0);
         if (var0.canRead() && var0.peek() == ' ') {
            var0.skip();
            class_5941 var6 = class_5941.method_27172(var0);
            return new class_5095(var4, var5, var6);
         } else {
            var0.setCursor(var3);
            throw class_1029.field_5708.createWithContext(var0);
         }
      } else {
         var0.setCursor(var3);
         throw class_1029.field_5708.createWithContext(var0);
      }
   }

   public static class_5095 method_23409(StringReader var0, boolean var1) throws CommandSyntaxException {
      int var4 = var0.getCursor();
      class_5941 var5 = class_5941.method_27171(var0, var1);
      if (var0.canRead() && var0.peek() == ' ') {
         var0.skip();
         class_5941 var6 = class_5941.method_27171(var0, false);
         if (var0.canRead() && var0.peek() == ' ') {
            var0.skip();
            class_5941 var7 = class_5941.method_27171(var0, var1);
            return new class_5095(var5, var6, var7);
         } else {
            var0.setCursor(var4);
            throw class_1029.field_5708.createWithContext(var0);
         }
      } else {
         var0.setCursor(var4);
         throw class_1029.field_5708.createWithContext(var0);
      }
   }

   public static class_5095 method_23408() {
      return new class_5095(new class_5941(true, 0.0), new class_5941(true, 0.0), new class_5941(true, 0.0));
   }

   @Override
   public int hashCode() {
      int var3 = this.field_26286.hashCode();
      var3 = 31 * var3 + this.field_26285.hashCode();
      return 31 * var3 + this.field_26288.hashCode();
   }
}
