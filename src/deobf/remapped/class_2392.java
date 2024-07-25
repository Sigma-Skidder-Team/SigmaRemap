package remapped;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2392 {
   public static final SimpleCommandExceptionType field_11942 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.nbt.trailing"));
   public static final SimpleCommandExceptionType field_11939 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.nbt.expected.key"));
   public static final SimpleCommandExceptionType field_11945 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.nbt.expected.value"));
   public static final Dynamic2CommandExceptionType field_11944 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.nbt.list.mixed", var0, var1)
   );
   public static final Dynamic2CommandExceptionType field_11934 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("argument.nbt.array.mixed", var0, var1)
   );
   public static final DynamicCommandExceptionType field_11946 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.nbt.array.invalid", var0)
   );
   private static final Pattern field_11933 = Pattern.compile("[-+]?(?:[0-9]+[.]|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?", 2);
   private static final Pattern field_11941 = Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?d", 2);
   private static final Pattern field_11935 = Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?f", 2);
   private static final Pattern field_11938 = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)b", 2);
   private static final Pattern field_11937 = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)l", 2);
   private static final Pattern field_11932 = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)s", 2);
   private static final Pattern field_11940 = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)");
   private final StringReader field_11943;

   public static CompoundNBT method_10916(String var0) throws CommandSyntaxException {
      return new class_2392(new StringReader(var0)).method_10906();
   }

   @VisibleForTesting
   public CompoundNBT method_10906() throws CommandSyntaxException {
      CompoundNBT var3 = this.method_10905();
      this.field_11943.skipWhitespace();
      if (!this.field_11943.canRead()) {
         return var3;
      } else {
         throw field_11942.createWithContext(this.field_11943);
      }
   }

   public class_2392(StringReader var1) {
      this.field_11943 = var1;
   }

   public String method_10918() throws CommandSyntaxException {
      this.field_11943.skipWhitespace();
      if (this.field_11943.canRead()) {
         return this.field_11943.readString();
      } else {
         throw field_11939.createWithContext(this.field_11943);
      }
   }

   public class_8406 method_10907() throws CommandSyntaxException {
      this.field_11943.skipWhitespace();
      int var3 = this.field_11943.getCursor();
      if (!StringReader.isQuotedStringStart(this.field_11943.peek())) {
         String var4 = this.field_11943.readUnquotedString();
         if (!var4.isEmpty()) {
            return this.method_10913(var4);
         } else {
            this.field_11943.setCursor(var3);
            throw field_11945.createWithContext(this.field_11943);
         }
      } else {
         return class_473.method_2261(this.field_11943.readQuotedString());
      }
   }

   private class_8406 method_10913(String var1) {
      try {
         if (field_11935.matcher(var1).matches()) {
            return class_5718.method_25854(Float.parseFloat(var1.substring(0, var1.length() - 1)));
         }

         if (field_11938.matcher(var1).matches()) {
            return class_5284.method_24120(Byte.parseByte(var1.substring(0, var1.length() - 1)));
         }

         if (field_11937.matcher(var1).matches()) {
            return class_3388.method_15658(Long.parseLong(var1.substring(0, var1.length() - 1)));
         }

         if (field_11932.matcher(var1).matches()) {
            return class_7745.method_35070(Short.parseShort(var1.substring(0, var1.length() - 1)));
         }

         if (field_11940.matcher(var1).matches()) {
            return class_9413.method_43597(Integer.parseInt(var1));
         }

         if (field_11941.matcher(var1).matches()) {
            return class_9708.method_44846(Double.parseDouble(var1.substring(0, var1.length() - 1)));
         }

         if (field_11933.matcher(var1).matches()) {
            return class_9708.method_44846(Double.parseDouble(var1));
         }

         if ("true".equalsIgnoreCase(var1)) {
            return class_5284.field_27026;
         }

         if ("false".equalsIgnoreCase(var1)) {
            return class_5284.field_27023;
         }
      } catch (NumberFormatException var5) {
      }

      return class_473.method_2261(var1);
   }

   public class_8406 method_10917() throws CommandSyntaxException {
      this.field_11943.skipWhitespace();
      if (this.field_11943.canRead()) {
         char var3 = this.field_11943.peek();
         if (var3 != '{') {
            return var3 != '[' ? this.method_10907() : this.method_10911();
         } else {
            return this.method_10905();
         }
      } else {
         throw field_11945.createWithContext(this.field_11943);
      }
   }

   public class_8406 method_10911() throws CommandSyntaxException {
      return this.field_11943.canRead(3) && !StringReader.isQuotedStringStart(this.field_11943.peek(1)) && this.field_11943.peek(2) == ';'
         ? this.method_10915()
         : this.method_10910();
   }

   public CompoundNBT method_10905() throws CommandSyntaxException {
      this.method_10912('{');
      CompoundNBT var3 = new CompoundNBT();
      this.field_11943.skipWhitespace();

      while (this.field_11943.canRead() && this.field_11943.peek() != '}') {
         int var4 = this.field_11943.getCursor();
         String var5 = this.method_10918();
         if (var5.isEmpty()) {
            this.field_11943.setCursor(var4);
            throw field_11939.createWithContext(this.field_11943);
         }

         this.method_10912(':');
         var3.method_25946(var5, this.method_10917());
         if (!this.method_10908()) {
            break;
         }

         if (!this.field_11943.canRead()) {
            throw field_11939.createWithContext(this.field_11943);
         }
      }

      this.method_10912('}');
      return var3;
   }

   private class_8406 method_10910() throws CommandSyntaxException {
      this.method_10912('[');
      this.field_11943.skipWhitespace();
      if (!this.field_11943.canRead()) {
         throw field_11945.createWithContext(this.field_11943);
      } else {
         class_3416 var3 = new class_3416();
         class_3265 var4 = null;

         while (this.field_11943.peek() != ']') {
            int var5 = this.field_11943.getCursor();
            class_8406 var6 = this.method_10917();
            class_3265 var7 = var6.method_38709();
            if (var4 != null) {
               if (var7 != var4) {
                  this.field_11943.setCursor(var5);
                  throw field_11944.createWithContext(this.field_11943, var7.method_14888(), var4.method_14888());
               }
            } else {
               var4 = var7;
            }

            var3.add(var6);
            if (!this.method_10908()) {
               break;
            }

            if (!this.field_11943.canRead()) {
               throw field_11945.createWithContext(this.field_11943);
            }
         }

         this.method_10912(']');
         return var3;
      }
   }

   private class_8406 method_10915() throws CommandSyntaxException {
      this.method_10912('[');
      int var3 = this.field_11943.getCursor();
      char var4 = this.field_11943.read();
      this.field_11943.read();
      this.field_11943.skipWhitespace();
      if (this.field_11943.canRead()) {
         if (var4 != 'B') {
            if (var4 != 'L') {
               if (var4 != 'I') {
                  this.field_11943.setCursor(var3);
                  throw field_11946.createWithContext(this.field_11943, String.valueOf(var4));
               } else {
                  return new class_6222(this.<Integer>method_10909(class_6222.field_31787, class_9413.field_48134));
               }
            } else {
               return new class_1129(this.<Long>method_10909(class_1129.field_6440, class_3388.field_16694));
            }
         } else {
            return new class_5064(this.<Byte>method_10909(class_5064.field_26180, class_5284.field_27025));
         }
      } else {
         throw field_11945.createWithContext(this.field_11943);
      }
   }

   private <T extends Number> List<T> method_10909(class_3265<?> var1, class_3265<?> var2) throws CommandSyntaxException {
      ArrayList var5 = Lists.newArrayList();

      while (this.field_11943.peek() != ']') {
         int var6 = this.field_11943.getCursor();
         class_8406 var7 = this.method_10917();
         class_3265 var8 = var7.method_38709();
         if (var8 != var2) {
            this.field_11943.setCursor(var6);
            throw field_11934.createWithContext(this.field_11943, var8.method_14888(), var1.method_14888());
         }

         if (var2 != class_5284.field_27025) {
            if (var2 != class_3388.field_16694) {
               var5.add(((class_5841)var7).method_26636());
            } else {
               var5.add(((class_5841)var7).method_26635());
            }
         } else {
            var5.add(((class_5841)var7).method_26641());
         }

         if (!this.method_10908()) {
            break;
         }

         if (!this.field_11943.canRead()) {
            throw field_11945.createWithContext(this.field_11943);
         }
      }

      this.method_10912(']');
      return var5;
   }

   private boolean method_10908() {
      this.field_11943.skipWhitespace();
      if (this.field_11943.canRead() && this.field_11943.peek() == ',') {
         this.field_11943.skip();
         this.field_11943.skipWhitespace();
         return true;
      } else {
         return false;
      }
   }

   private void method_10912(char var1) throws CommandSyntaxException {
      this.field_11943.skipWhitespace();
      this.field_11943.expect(var1);
   }
}
