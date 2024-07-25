package remapped;

import io.socket.utf8.UTF8Exception;
import java.util.ArrayList;
import java.util.List;

public final class class_8799 {
   private static final String field_45016 = "Invalid continuation byte";
   private static int[] field_45015;
   private static int field_45014;
   private static int field_45018;

   private class_8799() {
   }

   public static String method_40453(String var0) throws UTF8Exception {
      return method_40454(var0, new class_7922());
   }

   public static String method_40454(String var0, class_7922 var1) throws UTF8Exception {
      boolean var4 = var1.field_40540;
      int[] var5 = method_40447(var0);
      int var6 = var5.length;
      int var7 = -1;
      StringBuilder var8 = new StringBuilder();

      while (++var7 < var6) {
         int var9 = var5[var7];
         var8.append(method_40445(var9, var4));
      }

      return var8.toString();
   }

   public static String method_40448(String var0) throws UTF8Exception {
      return method_40449(var0, new class_7922());
   }

   public static String method_40449(String var0, class_7922 var1) throws UTF8Exception {
      boolean var4 = var1.field_40540;
      field_45015 = method_40447(var0);
      field_45014 = field_45015.length;
      field_45018 = 0;
      ArrayList var5 = new ArrayList();

      int var6;
      while ((var6 = method_40443(var4)) != -1) {
         var5.add(var6);
      }

      return method_40452(method_40446(var5));
   }

   private static int[] method_40447(String var0) {
      int var3 = var0.length();
      int[] var4 = new int[var0.codePointCount(0, var3)];
      int var5 = 0;
      int var6 = 0;

      while (var6 < var3) {
         int var7 = var0.codePointAt(var6);
         var4[var5++] = var7;
         var6 += Character.charCount(var7);
      }

      return var4;
   }

   private static String method_40445(int var0, boolean var1) throws UTF8Exception {
      int var2 = -664194759;
      StringBuilder var4 = new StringBuilder();
      return var4.append(Character.toChars(var0)).toString();
   }

   private static char[] method_40455(int var0, int var1) {
      return Character.toChars(var0 >> var1 & 63 | 128);
   }

   private static int method_40443(boolean var0) throws UTF8Exception {
      if (field_45018 <= field_45014) {
         if (field_45018 != field_45014) {
            int var3 = field_45015[field_45018] & 0xFF;
            field_45018++;
            if ((var3 & 128) != 0) {
               if ((var3 & 224) != 192) {
                  if ((var3 & 240) != 224) {
                     if ((var3 & 248) == 240) {
                        int var9 = method_40444();
                        int var12 = method_40444();
                        int var7 = method_40444();
                        int var11 = (var3 & 15) << 18 | var9 << 12 | var12 << 6 | var7;
                        if (var11 >= 65536 && var11 <= 1114111) {
                           return var11;
                        }
                     }

                     throw new class_4819("Invalid continuation byte");
                  } else {
                     int var8 = method_40444();
                     int var6 = method_40444();
                     int var10 = (var3 & 15) << 12 | var8 << 6 | var6;
                     if (var10 < 2048) {
                        throw new class_4819("Invalid continuation byte");
                     } else {
                        return !method_40451(var10, var0) ? 65533 : var10;
                     }
                  }
               } else {
                  int var4 = method_40444();
                  int var5 = (var3 & 31) << 6 | var4;
                  if (var5 < 128) {
                     throw new class_4819("Invalid continuation byte");
                  } else {
                     return var5;
                  }
               }
            } else {
               return var3;
            }
         } else {
            return -1;
         }
      } else {
         throw new class_4819("Invalid byte index");
      }
   }

   private static int method_40444() throws UTF8Exception {
      if (field_45018 < field_45014) {
         int var2 = field_45015[field_45018] & 0xFF;
         field_45018++;
         if ((var2 & 192) != 128) {
            throw new class_4819("Invalid continuation byte");
         } else {
            return var2 & 63;
         }
      } else {
         throw new class_4819("Invalid byte index");
      }
   }

   private static String method_40452(int[] var0) {
      StringBuilder var3 = new StringBuilder();

      for (int var7 : var0) {
         var3.appendCodePoint(var7);
      }

      return var3.toString();
   }

   private static boolean method_40451(int var0, boolean var1) throws UTF8Exception {
      if (var0 < 55296 || var0 > 57343) {
         return true;
      } else if (!var1) {
         return false;
      } else {
         throw new class_4819("Lone surrogate U+" + Integer.toHexString(var0).toUpperCase() + " is not a scalar value");
      }
   }

   private static int[] method_40446(List<Integer> var0) {
      int var3 = var0.size();
      int[] var4 = new int[var3];

      for (int var5 = 0; var5 < var3; var5++) {
         var4[var5] = (Integer)var0.get(var5);
      }

      return var4;
   }
}
