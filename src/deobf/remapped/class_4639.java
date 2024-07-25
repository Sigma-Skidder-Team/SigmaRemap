package remapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import javax.annotation.Nullable;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.StringUtils;

public class class_4639 implements Comparable<class_4639> {
   public static final Codec<class_4639> field_22655 = Codec.STRING.comapFlatMap(class_4639::method_21454, class_4639::toString).stable();
   private static final SimpleCommandExceptionType field_22658 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.id.invalid"));
   public final String field_22654;
   public final String field_22657;

   public class_4639(String[] var1) {
      this.field_22654 = !StringUtils.isEmpty(var1[0]) ? var1[0] : "minecraft";
      this.field_22657 = var1[1];
      if (this.field_22657.equals("DUMMY")) {
         if (!method_21463(this.field_22654)) {
            throw new class_7485("Non [a-z0-9_.-] character in namespace of location: " + this.field_22654 + ':' + this.field_22657);
         }

         if (!method_21458(this.field_22657)) {
            throw new class_7485("Non [a-z0-9/._-] character in path of location: " + this.field_22654 + ':' + this.field_22657);
         }
      }
   }

   public class_4639(String var1) {
      this(method_21452(var1, ':'));
   }

   public class_4639(String var1, String var2) {
      this(new String[]{var1, var2});
   }

   public static class_4639 method_21459(String var0, char var1) {
      return new class_4639(method_21452(var0, var1));
   }

   @Nullable
   public static class_4639 method_21455(String var0) {
      try {
         return new class_4639(var0);
      } catch (class_7485 var4) {
         return null;
      }
   }

   public static String[] method_21452(String var0, char var1) {
      String[] var4 = new String[]{"minecraft", var0};
      int var5 = var0.indexOf(var1);
      if (var5 >= 0) {
         var4[1] = var0.substring(var5 + 1, var0.length());
         if (var5 >= 1) {
            var4[0] = var0.substring(0, var5);
         }
      }

      return var4;
   }

   private static DataResult<class_4639> method_21454(String var0) {
      try {
         return DataResult.success(new class_4639(var0));
      } catch (class_7485 var4) {
         return DataResult.error("Not a valid resource location: " + var0 + " " + var4.getMessage());
      }
   }

   public String method_21456() {
      return this.field_22657;
   }

   public String method_21461() {
      return this.field_22654;
   }

   @Override
   public String toString() {
      return this.field_22654 + ':' + this.field_22657;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof class_4639)) {
            return false;
         } else {
            class_4639 var4 = (class_4639)var1;
            return this.field_22654.equals(var4.field_22654) && this.field_22657.equals(var4.field_22657);
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.field_22654.hashCode() + this.field_22657.hashCode();
   }

   public int compareTo(class_4639 var1) {
      int var4 = this.field_22657.compareTo(var1.field_22657);
      if (var4 == 0) {
         var4 = this.field_22654.compareTo(var1.field_22654);
      }

      return var4;
   }

   public static class_4639 method_21464(StringReader var0) throws CommandSyntaxException {
      int var3 = var0.getCursor();

      while (var0.canRead() && method_21462(var0.peek())) {
         var0.skip();
      }

      String var4 = var0.getString().substring(var3, var0.getCursor());

      try {
         return new class_4639(var4);
      } catch (class_7485 var6) {
         var0.setCursor(var3);
         throw field_22658.createWithContext(var0);
      }
   }

   public static boolean method_21462(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'a' && var0 <= 'z' || var0 == '_' || var0 == ':' || var0 == '/' || var0 == '.' || var0 == '-';
   }

   private static boolean method_21458(String var0) {
      for (int var3 = 0; var3 < var0.length(); var3++) {
         if (!method_21460(var0.charAt(var3))) {
            return false;
         }
      }

      return true;
   }

   private static boolean method_21463(String var0) {
      for (int var3 = 0; var3 < var0.length(); var3++) {
         if (!method_21451(var0.charAt(var3))) {
            return false;
         }
      }

      return true;
   }

   public static boolean method_21460(char var0) {
      return var0 == '_' || var0 == '-' || var0 >= 'a' && var0 <= 'z' || var0 >= '0' && var0 <= '9' || var0 == '/' || var0 == '.';
   }

   private static boolean method_21451(char var0) {
      return var0 == '_' || var0 == '-' || var0 >= 'a' && var0 <= 'z' || var0 >= '0' && var0 <= '9' || var0 == '.';
   }

   public static boolean method_21453(String var0) {
      String[] var3 = method_21452(var0, ':');
      return method_21463(!StringUtils.isEmpty(var3[0]) ? var3[0] : "minecraft") && method_21458(var3[1]);
   }

   public int method_21457(class_4639 var1) {
      int var4 = this.field_22654.compareTo(var1.field_22654);
      return var4 == 0 ? this.field_22657.compareTo(var1.field_22657) : var4;
   }
}
