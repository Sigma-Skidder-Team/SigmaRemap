package remapped;

import java.util.Arrays;

public class class_1690 {
   private static String[] field_8748;
   public static final int field_8749 = 64;
   private static final byte[] field_8746 = new byte[2048];
   public static int field_8745;
   public static int field_8744;
   public static int field_8747;

   public static void method_7608(class_5988 var0) {
      class_8710 var3 = new class_8710(var0, null);
      var0.method_19015(class_7810.field_39564, new class_9601());
      var0.method_19015(class_7810.field_39581, new class_5247());
      var0.method_19015(class_7810.field_39579, new class_7073(var0));
      var0.method_19015(class_7810.field_39605, new class_5854(var0));
      var0.method_19015(class_7810.field_39540, new class_6706());
      var3.method_40040(class_7810.field_39547);
      var0.method_19015(class_7810.field_39559, new class_5240());
      var0.method_19015(class_7810.field_39615, new class_8186(var0));
      var0.method_19015(class_7810.field_39549, new class_5497(var0));
      var0.method_19015(class_7810.field_39554, new class_1676(var0));
      var0.method_19015(class_7810.field_39550, new class_6779());
      var0.method_19015(class_7810.field_39612, new class_9026(var0));
      var0.method_19015(class_7810.field_39543, new class_992());
   }

   private static long[] method_7607(int[] var0) {
      return class_4847.method_22287(9, var0.length, var1 -> (long)var0[var1]);
   }

   private static void method_7614(class_6545 var0, class_3929 var1, int var2, int var3, int var4, int var5) {
      int var8 = 0;
      int var9 = 0;

      for (class_2391 var13 : class_2391.values()) {
         class_2962 var14 = var1.method_18166();
         class_2962 var15 = var1.method_18179();
         int var16 = var3 + var13.method_10896();
         int var17 = var4 + var13.method_10898();
         int var18 = var5 + var13.method_10899();
         if (var13.method_10896() == 0) {
            if (var13.method_10898() == 0) {
               if (var13.method_10899() != 0 && (var18 == 16 || var18 == -1)) {
                  continue;
               }
            } else if (var17 == 16 || var17 == -1) {
               if (var17 != 16) {
                  var2--;
                  var17 = 15;
               } else {
                  var2++;
                  var17 = 0;
               }

               if (var2 == 16 || var2 == -1) {
                  continue;
               }

               class_3929 var19 = var0.method_29869()[var2];
               if (var19 == null) {
                  continue;
               }

               var14 = var19.method_18166();
               var15 = var19.method_18179();
            }
         } else if (var16 == 16 || var16 == -1) {
            continue;
         }

         if (var15 != null && var9 != 15) {
            byte var21 = var15.method_13550(var16, var17, var18);
            if (var21 != 15) {
               if (var21 > var9) {
                  var9 = var21 - 1;
               }
            } else {
               var9 = 14;
            }
         }

         if (var14 != null && var8 != 15) {
            byte var22 = var14.method_13550(var16, var17, var18);
            if (var22 != 15) {
               if (var22 > var8) {
                  var8 = var22 - 1;
               }
            } else if (var13.method_10898() != 1) {
               var8 = 14;
            } else {
               var8 = 15;
            }
         }
      }

      if (var8 != 0) {
         if (!var1.method_18178()) {
            byte[] var20 = new byte[2028];
            var1.method_18173(var20);
         }

         var1.method_18166().method_13548(var3, var4, var5, var8);
      }

      if (var9 != 0) {
         var1.method_18179().method_13548(var3, var4, var5, var9);
      }
   }

   private static long method_7612(int var0, int var1) {
      return ((long)var0 & 67108863L) << 38 | (long)var1 & 67108863L;
   }

   static {
      Arrays.fill(field_8746, (byte)-1);
   }
}
