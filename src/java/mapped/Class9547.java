package mapped;

import java.util.ArrayList;
import java.util.List;

public final class Class9547 {
   private static final String field44454 = "Invalid continuation byte";
   private static int[] field44455;
   private static int field44456;
   private static int field44457;

   private Class9547() {
   }

   public static String method36972(String var0) throws Class2463 {
      return method36973(var0, new Class9315());
   }

   public static String method36973(String var0, Class9315 var1) throws Class2463 {
      boolean var4 = var1.field43254;
      int[] var5 = method36976(var0);
      int var6 = var5.length;
      int var7 = -1;
      StringBuilder var8 = new StringBuilder();

      while (++var7 < var6) {
         int var9 = var5[var7];
         var8.append(method36977(var9, var4));
      }

      return var8.toString();
   }

   public static String method36974(String var0) throws Class2463 {
      return method36975(var0, new Class9315());
   }

   public static String method36975(String var0, Class9315 var1) throws Class2463 {
      boolean var4 = var1.field43254;
      field44455 = method36976(var0);
      field44456 = field44455.length;
      field44457 = 0;
      ArrayList var5 = new ArrayList();

      int var6;
      while ((var6 = method36979(var4)) != -1) {
         var5.add(var6);
      }

      return method36981(method36983(var5));
   }

   private static int[] method36976(String var0) {
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

   private static String method36977(int var0, boolean var1) throws Class2463 {
      int var2 = -664194759;
      StringBuilder var4 = new StringBuilder();
      return var4.append(Character.toChars(var0)).toString();
   }

   private static char[] method36978(int var0, int var1) {
      return Character.toChars(var0 >> var1 & 63 | 128);
   }

   private static int method36979(boolean var0) throws Class2463 {
      if (field44457 <= field44456) {
         if (field44457 != field44456) {
            int var3 = field44455[field44457] & 0xFF;
            field44457++;
            if ((var3 & 128) != 0) {
               if ((var3 & 224) != 192) {
                  if ((var3 & 240) != 224) {
                     if ((var3 & 248) == 240) {
                        int var9 = method36980();
                        int var12 = method36980();
                        int var7 = method36980();
                        int var11 = (var3 & 15) << 18 | var9 << 12 | var12 << 6 | var7;
                        if (var11 >= 65536 && var11 <= 1114111) {
                           return var11;
                        }
                     }

                     throw new Class2463("Invalid continuation byte");
                  } else {
                     int var8 = method36980();
                     int var6 = method36980();
                     int var10 = (var3 & 15) << 12 | var8 << 6 | var6;
                     if (var10 < 2048) {
                        throw new Class2463("Invalid continuation byte");
                     } else {
                        return !method36982(var10, var0) ? 65533 : var10;
                     }
                  }
               } else {
                  int var4 = method36980();
                  int var5 = (var3 & 31) << 6 | var4;
                  if (var5 < 128) {
                     throw new Class2463("Invalid continuation byte");
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
         throw new Class2463("Invalid byte index");
      }
   }

   private static int method36980() throws Class2463 {
      if (field44457 < field44456) {
         int var2 = field44455[field44457] & 0xFF;
         field44457++;
         if ((var2 & 192) != 128) {
            throw new Class2463("Invalid continuation byte");
         } else {
            return var2 & 63;
         }
      } else {
         throw new Class2463("Invalid byte index");
      }
   }

   private static String method36981(int[] var0) {
      StringBuilder var3 = new StringBuilder();

      for (int var7 : var0) {
         var3.appendCodePoint(var7);
      }

      return var3.toString();
   }

   private static boolean method36982(int var0, boolean var1) throws Class2463 {
      if (var0 < 55296 || var0 > 57343) {
         return true;
      } else if (!var1) {
         return false;
      } else {
         throw new Class2463("Lone surrogate U+" + Integer.toHexString(var0).toUpperCase() + " is not a scalar value");
      }
   }

   private static int[] method36983(List<Integer> var0) {
      int var3 = var0.size();
      int[] var4 = new int[var3];

      for (int var5 = 0; var5 < var3; var5++) {
         var4[var5] = (Integer)var0.get(var5);
      }

      return var4;
   }
}
