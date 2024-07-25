package remapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Function;
import javax.annotation.Nullable;
import net.minecraft.util.text.TranslationTextComponent;

public class class_9721 {
   public static final class_9721 field_49421 = new class_9721((Float)null, (Float)null);
   public static final SimpleCommandExceptionType field_49422 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.range.ints"));
   private final Float field_49420;
   private final Float field_49419;

   public class_9721(Float var1, Float var2) {
      this.field_49420 = var1;
      this.field_49419 = var2;
   }

   @Nullable
   public Float method_44916() {
      return this.field_49420;
   }

   @Nullable
   public Float method_44921() {
      return this.field_49419;
   }

   public static class_9721 method_44918(StringReader var0, boolean var1, Function<Float, Float> var2) throws CommandSyntaxException {
      if (!var0.canRead()) {
         throw class_6083.field_31131.createWithContext(var0);
      } else {
         int var5 = var0.getCursor();
         Float var6 = method_44915(method_44917(var0, var1), var2);
         Float var7;
         if (var0.canRead(2) && var0.peek() == '.' && var0.peek(1) == '.') {
            var0.skip();
            var0.skip();
            var7 = method_44915(method_44917(var0, var1), var2);
            if (var6 == null && var7 == null) {
               var0.setCursor(var5);
               throw class_6083.field_31131.createWithContext(var0);
            }
         } else {
            if (!var1 && var0.canRead() && var0.peek() == '.') {
               var0.setCursor(var5);
               throw field_49422.createWithContext(var0);
            }

            var7 = var6;
         }

         if (var6 == null && var7 == null) {
            var0.setCursor(var5);
            throw class_6083.field_31131.createWithContext(var0);
         } else {
            return new class_9721(var6, var7);
         }
      }
   }

   @Nullable
   private static Float method_44917(StringReader var0, boolean var1) throws CommandSyntaxException {
      int var4 = var0.getCursor();

      while (var0.canRead() && method_44920(var0, var1)) {
         var0.skip();
      }

      String var5 = var0.getString().substring(var4, var0.getCursor());
      if (var5.isEmpty()) {
         return null;
      } else {
         try {
            return Float.parseFloat(var5);
         } catch (NumberFormatException var7) {
            if (var1) {
               throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerInvalidDouble().createWithContext(var0, var5);
            } else {
               throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerInvalidInt().createWithContext(var0, var5);
            }
         }
      }
   }

   private static boolean method_44920(StringReader var0, boolean var1) {
      char var4 = var0.peek();
      if ((var4 < '0' || var4 > '9') && var4 != '-') {
         return var1 && var4 == '.' ? !var0.canRead(2) || var0.peek(1) != '.' : false;
      } else {
         return true;
      }
   }

   @Nullable
   private static Float method_44915(Float var0, Function<Float, Float> var1) {
      return var0 != null ? (Float)var1.apply(var0) : null;
   }
}
