package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Function;
import javax.annotation.Nullable;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9795 {
   public static final Class9795 field45809 = new Class9795((Float)null, (Float)null);
   public static final SimpleCommandExceptionType field45810 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.range.ints"));
   private final Float field45811;
   private final Float field45812;

   public Class9795(Float var1, Float var2) {
      this.field45811 = var1;
      this.field45812 = var2;
   }

   @Nullable
   public Float method38630() {
      return this.field45811;
   }

   @Nullable
   public Float method38631() {
      return this.field45812;
   }

   public static Class9795 method38632(StringReader var0, boolean var1, Function<Float, Float> var2) throws CommandSyntaxException {
      if (!var0.canRead()) {
         throw Class8839.field39931.createWithContext(var0);
      } else {
         int var5 = var0.getCursor();
         Float var6 = method38635(method38633(var0, var1), var2);
         Float var7;
         if (var0.canRead(2) && var0.peek() == '.' && var0.peek(1) == '.') {
            var0.skip();
            var0.skip();
            var7 = method38635(method38633(var0, var1), var2);
            if (var6 == null && var7 == null) {
               var0.setCursor(var5);
               throw Class8839.field39931.createWithContext(var0);
            }
         } else {
            if (!var1 && var0.canRead() && var0.peek() == '.') {
               var0.setCursor(var5);
               throw field45810.createWithContext(var0);
            }

            var7 = var6;
         }

         if (var6 == null && var7 == null) {
            var0.setCursor(var5);
            throw Class8839.field39931.createWithContext(var0);
         } else {
            return new Class9795(var6, var7);
         }
      }
   }

   @Nullable
   private static Float method38633(StringReader var0, boolean var1) throws CommandSyntaxException {
      int var4 = var0.getCursor();

      while (var0.canRead() && method38634(var0, var1)) {
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

   private static boolean method38634(StringReader var0, boolean var1) {
      char var4 = var0.peek();
      if ((var4 < '0' || var4 > '9') && var4 != '-') {
         return var1 && var4 == '.' ? !var0.canRead(2) || var0.peek(1) != '.' : false;
      } else {
         return true;
      }
   }

   @Nullable
   private static Float method38635(Float var0, Function<Float, Float> var1) {
      return var0 != null ? (Float)var1.apply(var0) : null;
   }
}
