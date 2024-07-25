package remapped;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.IntStream.Builder;
import us.myles.ViaVersion.api.minecraft.nbt.StringTagParseException;

public final class class_8794 {
   private static final Field field_44991 = method_40405();
   private final class_7910 field_44992;

   private static Field method_40405() {
      try {
         return class_5287.class.getDeclaredField("name");
      } catch (NoSuchFieldException var3) {
         var3.printStackTrace();
         throw new IllegalArgumentException(var3);
      }
   }

   public class_8794(class_7910 var1) {
      this.field_44992 = var1;
   }

   public class_5531 method_40395() throws StringTagParseException {
      this.field_44992.method_35784('{');
      class_5531 var3 = new class_5531("");
      if (this.field_44992.method_35789() == '}') {
         this.field_44992.method_35785();
         return var3;
      } else {
         while (this.field_44992.method_35782()) {
            String var4 = this.method_40393();
            class_5287 var5 = this.method_40394();

            try {
               if (!field_44991.isAccessible()) {
                  field_44991.setAccessible(true);
               }

               field_44991.set(var5, var4);
            } catch (IllegalAccessException var7) {
               throw new IllegalArgumentException(var7);
            }

            var3.<class_5287>method_25122(var5);
            if (this.method_40401('}')) {
               return var3;
            }
         }

         throw this.field_44992.method_35781("Unterminated compound tag!");
      }
   }

   public class_913 method_40399() throws StringTagParseException {
      class_913 var3 = new class_913("");
      this.field_44992.method_35784('[');
      boolean var4 = this.field_44992.method_35789() == '0' && this.field_44992.method_35790(1) == ':';

      while (this.field_44992.method_35782()) {
         if (var4) {
            this.field_44992.method_35787(':');
         }

         class_5287 var5 = this.method_40394();
         var3.method_3919(var5);
         if (this.method_40401(']')) {
            return var3;
         }
      }

      throw this.field_44992.method_35781("Reached end of file without end of list tag!");
   }

   public class_5287 method_40400(char var1) throws StringTagParseException {
      this.field_44992.method_35784('[').method_35784(var1).method_35784(';');
      if (var1 != 'B') {
         if (var1 != 'I') {
            if (var1 != 'L') {
               throw this.field_44992.method_35781("Type " + var1 + " is not a valid element type in an array!");
            } else {
               return new class_6674("", this.method_40404());
            }
         } else {
            return new class_7356("", this.method_40402());
         }
      } else {
         return new class_1070("", this.method_40398());
      }
   }

   private byte[] method_40398() throws StringTagParseException {
      ArrayList var3 = new ArrayList();

      while (this.field_44992.method_35782()) {
         CharSequence var4 = this.field_44992.method_35783().method_35787('B');

         try {
            var3.add(Byte.valueOf(var4.toString()));
         } catch (NumberFormatException var7) {
            throw this.field_44992.method_35781("All elements of a byte array must be bytes!");
         }

         if (this.method_40401(']')) {
            byte[] var5 = new byte[var3.size()];

            for (int var6 = 0; var6 < var3.size(); var6++) {
               var5[var6] = (Byte)var3.get(var6);
            }

            return var5;
         }
      }

      throw this.field_44992.method_35781("Reached end of document without array close");
   }

   private int[] method_40402() throws StringTagParseException {
      Builder var3 = IntStream.builder();

      while (this.field_44992.method_35782()) {
         class_5287 var4 = this.method_40394();
         if (!(var4 instanceof class_5232)) {
            throw this.field_44992.method_35781("All elements of an int array must be ints!");
         }

         var3.add(((class_5232)var4).method_23973());
         if (this.method_40401(']')) {
            return var3.build().toArray();
         }
      }

      throw this.field_44992.method_35781("Reached end of document without array close");
   }

   private long[] method_40404() throws StringTagParseException {
      ArrayList var3 = new ArrayList();

      while (this.field_44992.method_35782()) {
         CharSequence var4 = this.field_44992.method_35783().method_35787('L');

         try {
            var3.add(Long.valueOf(var4.toString()));
         } catch (NumberFormatException var7) {
            throw this.field_44992.method_35781("All elements of a long array must be longs!");
         }

         if (this.method_40401(']')) {
            long[] var5 = new long[var3.size()];

            for (int var6 = 0; var6 < var3.size(); var6++) {
               var5[var6] = (Long)var3.get(var6);
            }

            return var5;
         }
      }

      throw this.field_44992.method_35781("Reached end of document without array close");
   }

   public String method_40393() throws StringTagParseException {
      this.field_44992.method_35783();
      char var3 = this.field_44992.method_35789();

      String var5;
      try {
         if (var3 == '\'' || var3 == '"') {
            return method_40397(this.field_44992.method_35787(this.field_44992.method_35785()).toString());
         }

         StringBuilder var4 = new StringBuilder();

         while (this.field_44992.method_35789() != ':') {
            var4.append(this.field_44992.method_35785());
         }

         var5 = var4.toString();
      } finally {
         this.field_44992.method_35784(':');
      }

      return var5;
   }

   public class_5287 method_40394() throws StringTagParseException {
      char var3 = this.field_44992.method_35783().method_35789();
      switch (var3) {
         case '"':
         case '\'':
            this.field_44992.method_35786();
            return new class_887("", method_40397(this.field_44992.method_35787(var3).toString()));
         case '[':
            if (this.field_44992.method_35790(2) == ';') {
               return this.method_40400(this.field_44992.method_35790(1));
            }

            return this.method_40399();
         case '{':
            return this.method_40395();
         default:
            return this.method_40396();
      }
   }

   private class_5287 method_40396() {
      StringBuilder var3 = new StringBuilder();
      boolean var4 = true;

      while (this.field_44992.method_35782()) {
         char var5 = this.field_44992.method_35789();
         if (var4 && !class_7580.method_34446(var5) && var3.length() != 0) {
            Object var6 = null;

            try {
               switch (Character.toUpperCase(var5)) {
                  case 'B':
                     var6 = new class_1456("", Byte.parseByte(var3.toString()));
                     break;
                  case 'D':
                     var6 = new class_7948("", Double.parseDouble(var3.toString()));
                     break;
                  case 'F':
                     var6 = new class_520("", Float.parseFloat(var3.toString()));
                     break;
                  case 'L':
                     var6 = new class_8735("", Long.parseLong(var3.toString()));
                     break;
                  case 'S':
                     var6 = new class_6733("", Short.parseShort(var3.toString()));
               }
            } catch (NumberFormatException var8) {
               var4 = false;
            }

            if (var6 != null) {
               this.field_44992.method_35785();
               return (class_5287)var6;
            }
         }

         if (var5 == '\\') {
            this.field_44992.method_35786();
            var3.append(this.field_44992.method_35785());
         } else {
            if (!class_7580.method_34445(var5)) {
               break;
            }

            var3.append(this.field_44992.method_35785());
         }
      }

      String var10 = var3.toString();
      if (var4) {
         try {
            return new class_5232("", Integer.parseInt(var10));
         } catch (NumberFormatException var9) {
         }
      }

      return new class_887("", var10);
   }

   private boolean method_40401(char var1) throws StringTagParseException {
      if (this.field_44992.method_35783().method_35789() != var1) {
         this.field_44992.method_35784(',');
         return false;
      } else {
         this.field_44992.method_35785();
         return true;
      }
   }

   private static String method_40397(String var0) {
      int var3 = var0.indexOf(92);
      if (var3 == -1) {
         return var0;
      } else {
         int var4 = 0;
         StringBuilder var5 = new StringBuilder(var0.length());

         do {
            var5.append(var0, var4, var3);
            var4 = var3 + 1;
         } while ((var3 = var0.indexOf(92, var4 + 1)) != -1);

         var5.append(var0.substring(var4));
         return var5.toString();
      }
   }
}
