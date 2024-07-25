package remapped;

import java.util.logging.Level;

public final class class_5547 implements class_9009 {
   public class_8022 field_28256 = null;
   private class_2330 field_28258;

   @Override
   public void method_41336(String var1) {
      class_3872 var4 = method_25224(var1);
      if (5 == var4.field_18858 || 6 == var4.field_18858) {
         this.field_28256 = new class_8022(var4);
         if (this.field_28256.field_41075.field_18857 == 0 && this.field_28258 != null) {
            this.field_28258.method_10679(var4);
         }
      } else if (this.field_28258 != null) {
         this.field_28258.method_10679(var4);
      }
   }

   @Override
   public void method_41337(byte[] var1) {
      if (this.field_28256 != null) {
         class_3872 var4 = this.field_28256.method_36448(var1);
         if (var4 != null) {
            this.field_28256 = null;
            if (this.field_28258 != null) {
               this.field_28258.method_10679(var4);
            }
         }
      } else {
         throw new RuntimeException("got binary data when not reconstructing a packet");
      }
   }

   private static class_3872 method_25224(String var0) {
      int var3 = 0;
      int var4 = var0.length();
      class_3872 var5 = new class_3872(Character.getNumericValue(var0.charAt(0)));
      if (var5.field_18858 >= 0 && var5.field_18858 <= class_2258.field_11235.length - 1) {
         if (5 == var5.field_18858 || 6 == var5.field_18858) {
            if (!var0.contains("-") || var4 <= var3 + 1) {
               return class_3983.method_18375();
            }

            StringBuilder var6 = new StringBuilder();

            while (var0.charAt(++var3) != '-') {
               var6.append(var0.charAt(var3));
            }

            var5.field_18857 = Integer.parseInt(var6.toString());
         }

         if (var4 > var3 + 1 && '/' == var0.charAt(var3 + 1)) {
            StringBuilder var12 = new StringBuilder();

            do {
               char var7 = var0.charAt(++var3);
               if (',' == var7) {
                  break;
               }

               var12.append(var7);
            } while (var3 + 1 != var4);

            var5.field_18859 = var12.toString();
         } else {
            var5.field_18859 = "/";
         }

         if (var4 > var3 + 1) {
            Character var13 = var0.charAt(var3 + 1);
            if (Character.getNumericValue(var13) > -1) {
               StringBuilder var14 = new StringBuilder();

               do {
                  char var8 = var0.charAt(++var3);
                  if (Character.getNumericValue(var8) < 0) {
                     var3--;
                     break;
                  }

                  var14.append(var8);
               } while (var3 + 1 != var4);

               try {
                  var5.field_18861 = Integer.parseInt(var14.toString());
               } catch (NumberFormatException var10) {
                  return class_3983.method_18375();
               }
            }
         }

         if (var4 > var3 + 1) {
            try {
               var0.charAt(++var3);
               var5.field_18855 = (T)new class_3734(var0.substring(var3)).method_17288();
            } catch (class_7584 var9) {
               class_3983.method_18374().log(Level.WARNING, "An error occured while retrieving data from JSONTokener", (Throwable)var9);
               return class_3983.method_18375();
            }
         }

         if (class_3983.method_18374().isLoggable(Level.FINE)) {
            class_3983.method_18374().fine(String.format("decoded %s as %s", var0, var5));
         }

         return var5;
      } else {
         return class_3983.method_18375();
      }
   }

   @Override
   public void method_41335() {
      if (this.field_28256 != null) {
         this.field_28256.method_36447();
      }

      this.field_28258 = null;
   }

   @Override
   public void method_41334(class_2330 var1) {
      this.field_28258 = var1;
   }
}
