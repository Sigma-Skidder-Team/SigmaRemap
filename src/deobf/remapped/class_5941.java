package remapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5941 {
   public static final SimpleCommandExceptionType field_30299 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.pos.missing.double"));
   public static final SimpleCommandExceptionType field_30301 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.pos.missing.int"));
   private final boolean field_30302;
   private final double field_30303;

   public class_5941(boolean var1, double var2) {
      this.field_30302 = var1;
      this.field_30303 = var2;
   }

   public double method_27167(double var1) {
      return !this.field_30302 ? this.field_30303 : this.field_30303 + var1;
   }

   public static class_5941 method_27171(StringReader var0, boolean var1) throws CommandSyntaxException {
      if (var0.canRead() && var0.peek() == '^') {
         throw class_1029.field_5707.createWithContext(var0);
      } else if (!var0.canRead()) {
         throw field_30299.createWithContext(var0);
      } else {
         boolean var4 = method_27169(var0);
         int var5 = var0.getCursor();
         double var6 = var0.canRead() && var0.peek() != ' ' ? var0.readDouble() : 0.0;
         String var8 = var0.getString().substring(var5, var0.getCursor());
         if (var4 && var8.isEmpty()) {
            return new class_5941(true, 0.0);
         } else {
            if (!var8.contains(".") && !var4 && var1) {
               var6 += 0.5;
            }

            return new class_5941(var4, var6);
         }
      }
   }

   public static class_5941 method_27172(StringReader var0) throws CommandSyntaxException {
      if (var0.canRead() && var0.peek() == '^') {
         throw class_1029.field_5707.createWithContext(var0);
      } else if (!var0.canRead()) {
         throw field_30301.createWithContext(var0);
      } else {
         boolean var3 = method_27169(var0);
         double var4;
         if (var0.canRead() && var0.peek() != ' ') {
            var4 = !var3 ? (double)var0.readInt() : var0.readDouble();
         } else {
            var4 = 0.0;
         }

         return new class_5941(var3, var4);
      }
   }

   public static boolean method_27169(StringReader var0) {
      boolean var3;
      if (var0.peek() != '~') {
         var3 = false;
      } else {
         var3 = true;
         var0.skip();
      }

      return var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof class_5941) {
            class_5941 var4 = (class_5941)var1;
            return this.field_30302 == var4.field_30302 ? Double.compare(var4.field_30303, this.field_30303) == 0 : false;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = !this.field_30302 ? 0 : 1;
      long var4 = Double.doubleToLongBits(this.field_30303);
      return 31 * var3 + (int)(var4 ^ var4 >>> 32);
   }

   public boolean method_27168() {
      return this.field_30302;
   }
}
