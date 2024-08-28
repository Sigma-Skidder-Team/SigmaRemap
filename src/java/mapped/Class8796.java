package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8796 {
   public static final SimpleCommandExceptionType field39619 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.pos.missing.double"));
   public static final SimpleCommandExceptionType field39620 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.pos.missing.int"));
   private final boolean field39621;
   private final double field39622;

   public Class8796(boolean var1, double var2) {
      this.field39621 = var1;
      this.field39622 = var2;
   }

   public double method31754(double var1) {
      return !this.field39621 ? this.field39622 : this.field39622 + var1;
   }

   public static Class8796 method31755(StringReader var0, boolean var1) throws CommandSyntaxException {
      if (var0.canRead() && var0.peek() == '^') {
         throw Class6851.field29767.createWithContext(var0);
      } else if (!var0.canRead()) {
         throw field39619.createWithContext(var0);
      } else {
         boolean var4 = method31757(var0);
         int var5 = var0.getCursor();
         double var6 = var0.canRead() && var0.peek() != ' ' ? var0.readDouble() : 0.0;
         String var8 = var0.getString().substring(var5, var0.getCursor());
         if (var4 && var8.isEmpty()) {
            return new Class8796(true, 0.0);
         } else {
            if (!var8.contains(".") && !var4 && var1) {
               var6 += 0.5;
            }

            return new Class8796(var4, var6);
         }
      }
   }

   public static Class8796 method31756(StringReader var0) throws CommandSyntaxException {
      if (var0.canRead() && var0.peek() == '^') {
         throw Class6851.field29767.createWithContext(var0);
      } else if (!var0.canRead()) {
         throw field39620.createWithContext(var0);
      } else {
         boolean var3 = method31757(var0);
         double var4;
         if (var0.canRead() && var0.peek() != ' ') {
            var4 = !var3 ? (double)var0.readInt() : var0.readDouble();
         } else {
            var4 = 0.0;
         }

         return new Class8796(var3, var4);
      }
   }

   public static boolean method31757(StringReader var0) {
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
         if (var1 instanceof Class8796) {
            Class8796 var4 = (Class8796)var1;
            return this.field39621 == var4.field39621 ? Double.compare(var4.field39622, this.field39622) == 0 : false;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = !this.field39621 ? 0 : 1;
      long var4 = Double.doubleToLongBits(this.field39622);
      return 31 * var3 + (int)(var4 ^ var4 >>> 32);
   }

   public boolean method31758() {
      return this.field39621;
   }
}
