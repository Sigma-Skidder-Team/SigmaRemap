package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Set;

public class class_8739 extends class_4285<class_1297> {
   public class_8739(Codec<class_1297> var1) {
      super(var1);
   }

   public static boolean method_40122(class_8308 var0, BlockPos var1) {
      return method_40126(var0, var1) || var0.method_38320(var1, var0x -> var0x.method_8349(class_2351.field_11730));
   }

   private static boolean method_40119(class_8308 var0, BlockPos var1) {
      return var0.method_38320(var1, var0x -> var0x.method_8350(class_4783.field_23323));
   }

   private static boolean method_40125(class_8308 var0, BlockPos var1) {
      return var0.method_38320(var1, var0x -> var0x.method_8350(class_4783.field_23900));
   }

   public static boolean method_40118(class_8308 var0, BlockPos var1) {
      return var0.method_38320(var1, var0x -> var0x.method_8345() || var0x.method_8349(class_2351.field_11737));
   }

   private static boolean method_40129(class_8308 var0, BlockPos var1) {
      return var0.method_38320(var1, var0x -> {
         class_6414 var3 = var0x.method_8360();
         return method_19910(var3) || var3 == class_4783.field_23421;
      });
   }

   private static boolean method_40121(class_8308 var0, BlockPos var1) {
      return var0.method_38320(var1, var0x -> {
         class_5371 var3 = var0x.method_8362();
         return var3 == class_5371.field_27428;
      });
   }

   public static void method_40128(class_1678 var0, BlockPos var1, class_2522 var2) {
      var0.method_7513(var1, var2, 19);
   }

   public static boolean method_40126(class_8308 var0, BlockPos var1) {
      return method_40118(var0, var1) || method_40121(var0, var1) || method_40125(var0, var1);
   }

   private boolean method_40127(class_6755 var1, Random var2, BlockPos var3, Set<BlockPos> var4, Set<BlockPos> var5, class_9616 var6, class_1297 var7) {
      int var10 = var7.field_7154.method_4973(var2);
      int var11 = var7.field_7147.method_9628(var2, var10, var7);
      int var12 = var10 - var11;
      int var13 = var7.field_7147.method_9632(var2, var12);
      BlockPos var14;
      if (var7.field_7153) {
         var14 = var3;
      } else {
         int var15 = var1.method_22563(class_3801.field_18599, var3).method_12165();
         int var16 = var1.method_22563(class_3801.field_18592, var3).method_12165();
         if (var16 - var15 > var7.field_7149) {
            return false;
         }

         int var17;
         if (var7.field_7150 != class_3801.field_18599) {
            if (var7.field_7150 != class_3801.field_18592) {
               var17 = var1.method_22563(var7.field_7150, var3).method_12165();
            } else {
               var17 = var16;
            }
         } else {
            var17 = var15;
         }

         var14 = new BlockPos(var3.method_12173(), var17, var3.method_12185());
      }

      if (var14.method_12165() < 1 || var14.method_12165() + var10 + 1 > 256) {
         return false;
      } else if (!method_40129(var1, var14.method_6100())) {
         return false;
      } else {
         OptionalInt var18 = var7.field_7146.method_38259();
         int var19 = this.method_40124(var1, var10, var14, var7);
         if (var19 < var10 && (!var18.isPresent() || var19 < var18.getAsInt())) {
            return false;
         } else {
            List var20 = var7.field_7154.method_4966(var1, var2, var19, var14, var4, var6, var7);
            var20.forEach(var8 -> var7.field_7147.method_9629(var1, var2, var7, var19, var8, var11, var13, var5, var6));
            return true;
         }
      }
   }

   private int method_40124(class_8308 var1, int var2, BlockPos var3, class_1297 var4) {
      class_2921 var7 = new class_2921();

      for (int var8 = 0; var8 <= var2 + 1; var8++) {
         int var9 = var4.field_7146.method_38262(var2, var8);

         for (int var10 = -var9; var10 <= var9; var10++) {
            for (int var11 = -var9; var11 <= var9; var11++) {
               var7.method_13360(var3, var10, var8, var11);
               if (!method_40122(var1, var7) || !var4.field_7148 && method_40119(var1, var7)) {
                  return var8 - 2;
               }
            }
         }
      }

      return var2;
   }

   @Override
   public void method_19906(class_1678 var1, BlockPos var2, class_2522 var3) {
      method_40128(var1, var2, var3);
   }

   public final boolean method_40123(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_1297 var5) {
      HashSet var8 = Sets.newHashSet();
      HashSet var9 = Sets.newHashSet();
      HashSet var10 = Sets.newHashSet();
      class_9616 var11 = class_9616.method_44397();
      boolean var12 = this.method_40127(var1, var3, var4, var8, var9, var11, var5);
      if (var11.field_48996 <= var11.field_48991 && var12 && !var8.isEmpty()) {
         if (!var5.field_7156.isEmpty()) {
            ArrayList var13 = Lists.newArrayList(var8);
            ArrayList var14 = Lists.newArrayList(var9);
            var13.sort(Comparator.comparingInt(class_2700::method_12165));
            var14.sort(Comparator.comparingInt(class_2700::method_12165));
            var5.field_7156.forEach(var6 -> var6.method_28703(var1, var3, var13, var14, var10, var11));
         }

         class_5791 var15 = this.method_40120(var1, var11, var8, var10);
         class_6561.method_29985(var1, 3, var15, var11.field_48996, var11.field_48995, var11.field_48992);
         return true;
      } else {
         return false;
      }
   }

   private class_5791 method_40120(class_9379 var1, class_9616 var2, Set<BlockPos> var3, Set<BlockPos> var4) {
      ArrayList var7 = Lists.newArrayList();
      class_3087 var8 = new class_3087(var2.method_44393(), var2.method_44398(), var2.method_44387());
      byte var9 = 6;

      for (int var10 = 0; var10 < 6; var10++) {
         var7.add(Sets.newHashSet());
      }

      class_2921 var23 = new class_2921();

      for (BlockPos var12 : Lists.newArrayList(var4)) {
         if (var2.method_44395(var12)) {
            var8.method_26202(
               var12.method_12173() - var2.field_48996, var12.method_12165() - var2.field_48995, var12.method_12185() - var2.field_48992, true, true
            );
         }
      }

      for (BlockPos var26 : Lists.newArrayList(var3)) {
         if (var2.method_44395(var26)) {
            var8.method_26202(
               var26.method_12173() - var2.field_48996, var26.method_12165() - var2.field_48995, var26.method_12185() - var2.field_48992, true, true
            );
         }

         for (Direction var16 : Direction.values()) {
            var23.method_13371(var26, var16);
            if (!var3.contains(var23)) {
               class_2522 var17 = var1.method_28262(var23);
               if (var17.method_10307(class_6023.field_30689)) {
                  ((Set)var7.get(0)).add(var23.method_6072());
                  method_40128(var1, var23, var17.method_10308(class_6023.field_30689, Integer.valueOf(1)));
                  if (var2.method_44395(var23)) {
                     var8.method_26202(
                        var23.method_12173() - var2.field_48996, var23.method_12165() - var2.field_48995, var23.method_12185() - var2.field_48992, true, true
                     );
                  }
               }
            }
         }
      }

      for (int var25 = 1; var25 < 6; var25++) {
         Set var27 = (Set)var7.get(var25 - 1);
         Set var28 = (Set)var7.get(var25);

         for (BlockPos var30 : var27) {
            if (var2.method_44395(var30)) {
               var8.method_26202(
                  var30.method_12173() - var2.field_48996, var30.method_12165() - var2.field_48995, var30.method_12185() - var2.field_48992, true, true
               );
            }

            for (Direction var19 : Direction.values()) {
               var23.method_13371(var30, var19);
               if (!var27.contains(var23) && !var28.contains(var23)) {
                  class_2522 var20 = var1.method_28262(var23);
                  if (var20.method_10307(class_6023.field_30689)) {
                     int var21 = var20.<Integer>method_10313(class_6023.field_30689);
                     if (var21 > var25 + 1) {
                        class_2522 var22 = var20.method_10308(class_6023.field_30689, Integer.valueOf(var25 + 1));
                        method_40128(var1, var23, var22);
                        if (var2.method_44395(var23)) {
                           var8.method_26202(
                              var23.method_12173() - var2.field_48996,
                              var23.method_12165() - var2.field_48995,
                              var23.method_12185() - var2.field_48992,
                              true,
                              true
                           );
                        }

                        var28.add(var23.method_6072());
                     }
                  }
               }
            }
         }
      }

      return var8;
   }
}
