package remapped;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class class_5161 {
   private static String[] field_26581;
   public static final int field_26580 = 63;
   public static final Direction[][] field_26577 = method_23655(false);
   public static final Direction[][] field_26579 = method_23655(true);
   private static int field_26582 = 0;
   private static int field_26578 = -1;
   private static int field_26573 = 16;
   private static World field_26575 = null;
   private static int field_26576 = Integer.MIN_VALUE;
   private static int field_26574 = Integer.MIN_VALUE;

   public static int method_23653(World var0, Entity var1, int var2) {
      int var5 = class_9299.method_42847(var1.getPosX()) >> 4;
      int var6 = class_9299.method_42847(var1.method_37309()) >> 4;
      int var7 = class_9299.method_42847(var1.getPosZ()) >> 4;
      var6 = Config.method_14263(var6, 0, 15);
      class_2654 var8 = var0.method_29554(var5, var7);
      int var9 = var5 - var2;
      int var10 = var5 + var2;
      int var11 = var7 - var2;
      int var12 = var7 + var2;
      if (var0 != field_26575 || var5 != field_26576 || var7 != field_26574) {
         field_26582 = 0;
         field_26573 = 16;
         field_26575 = var0;
         field_26576 = var5;
         field_26574 = var7;
      }

      if (field_26582 == 0) {
         field_26578 = -1;
      }

      int var13 = field_26578;
      switch (field_26582) {
         case 0:
            var10 = var5;
            var12 = var7;
            break;
         case 1:
            var9 = var5;
            var12 = var7;
            break;
         case 2:
            var10 = var5;
            var11 = var7;
            break;
         case 3:
            var9 = var5;
            var11 = var7;
      }

      for (int var14 = var9; var14 < var10; var14++) {
         for (int var15 = var11; var15 < var12; var15++) {
            class_2654 var16 = var0.method_29554(var14, var15);
            if (!var16.method_12003()) {
               class_1315[] var17 = var16.method_27349();

               for (int var18 = var17.length - 1; var18 > var13; var18--) {
                  class_1315 var19 = var17[var18];
                  if (var19 != null && !var19.method_6002()) {
                     if (var18 > var13) {
                        var13 = var18;
                     }
                     break;
                  }
               }

               try {
                  Map var24 = var16.method_12004();
                  if (!var24.isEmpty()) {
                     for (BlockPos var20 : var24.keySet()) {
                        int var21 = var20.method_12165() >> 4;
                        if (var21 > var13) {
                           var13 = var21;
                        }
                     }
                  }
               } catch (ConcurrentModificationException var22) {
               }

               class_4722[] var25 = var16.method_11979();

               for (int var27 = var25.length - 1; var27 > var13; var27--) {
                  class_4722 var28 = var25[var27];
                  if (!var28.isEmpty() && (var16 != var8 || var27 != var6 || var28.size() != 1)) {
                     if (var27 > var13) {
                        var13 = var27;
                     }
                     break;
                  }
               }
            }
         }
      }

      if (field_26582 < 3) {
         field_26578 = var13;
         var13 = field_26573;
      } else {
         field_26573 = var13;
         field_26578 = -1;
      }

      field_26582 = (field_26582 + 1) % 4;
      return var13 << 4;
   }

   public static boolean method_23654() {
      return field_26582 == 0;
   }

   private static Direction[][] method_23655(boolean var0) {
      byte var3 = 64;
      Direction[][] var4 = new Direction[var3][];

      for (int var5 = 0; var5 < var3; var5++) {
         ArrayList var6 = new ArrayList();

         for (int var7 = 0; var7 < Direction.field_803.length; var7++) {
            Direction var8 = Direction.field_803[var7];
            Direction var9 = !var0 ? var8 : var8.method_1046();
            int var10 = 1 << var9.ordinal();
            if ((var5 & var10) != 0) {
               var6.add(var8);
            }
         }

         Direction[] var11 = var6.<Direction>toArray(new Direction[var6.size()]);
         var4[var5] = var11;
      }

      return var4;
   }

   public static Direction[] method_23651(int var0) {
      int var3 = ~var0 & 63;
      return field_26579[var3];
   }

   public static void method_23652() {
      field_26575 = null;
   }
}
