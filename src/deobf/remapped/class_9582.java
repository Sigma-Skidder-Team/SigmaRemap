package remapped;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class class_9582 {
   private static class_7373 field_48741 = null;
   private static class_7373 field_48742 = null;
   private static class_7373 field_48734 = null;
   private static class_7373 field_48728 = null;
   private static class_7373 field_48729 = null;
   private static class_7373 field_48732 = null;
   private static List field_48740 = null;
   private static List field_48745 = null;
   private static List field_48727 = null;
   private static List field_48736 = null;
   private static List field_48746 = null;
   private static List field_48737 = null;
   private static class_7373 field_48738 = null;
   private static class_7373 field_48733 = null;
   private static class_7373 field_48730 = null;
   private static class_7373 field_48739 = null;
   private static class_7373 field_48731 = null;
   private static class_7373 field_48744 = null;
   private static final Random field_48743 = new Random();

   public static class_7373 method_44261(class_7373 var0, class_2522 var1) {
      if (Config.method_14410()) {
         List var4 = var0.method_33580(var1, (Direction)null, field_48743);
         if (var4 != field_48740) {
            if (var4 != field_48745) {
               if (var4 != field_48727) {
                  if (var4 != field_48736) {
                     if (var4 != field_48746) {
                        return var4 != field_48737 ? var0 : field_48744;
                     } else {
                        return field_48731;
                     }
                  } else {
                     return field_48739;
                  }
               } else {
                  return field_48730;
               }
            } else {
               return field_48733;
            }
         } else {
            return field_48738;
         }
      } else {
         return var0;
      }
   }

   public static boolean method_44266(class_2522 var0, class_2522 var1) {
      if (var0 != var1) {
         class_6414 var4 = var0.method_8360();
         class_6414 var5 = var1.method_8360();
         return var4 == var5;
      } else {
         return true;
      }
   }

   public static void method_44262() {
      ArrayList var2 = new ArrayList();
      field_48741 = method_44264("acacia", var2);
      field_48742 = method_44264("birch", var2);
      field_48734 = method_44264("dark_oak", var2);
      field_48728 = method_44264("jungle", var2);
      field_48729 = method_44264("oak", var2);
      field_48732 = method_44264("spruce", var2);
      field_48740 = method_44265(field_48741);
      field_48745 = method_44265(field_48742);
      field_48727 = method_44265(field_48734);
      field_48736 = method_44265(field_48728);
      field_48746 = method_44265(field_48729);
      field_48737 = method_44265(field_48732);
      field_48738 = method_44263(field_48741);
      field_48733 = method_44263(field_48742);
      field_48730 = method_44263(field_48734);
      field_48739 = method_44263(field_48728);
      field_48731 = method_44263(field_48729);
      field_48744 = method_44263(field_48732);
      if (var2.size() > 0) {
         Config.method_14277("Enable face culling: " + Config.method_14289(var2.toArray()));
      }
   }

   private static List method_44265(class_7373 var0) {
      return var0 != null ? var0.method_33580((class_2522)null, (Direction)null, field_48743) : null;
   }

   public static class_7373 method_44264(String var0, List var1) {
      class_7458 var4 = Config.method_14346();
      if (var4 == null) {
         return null;
      } else {
         Identifier var5 = new Identifier("blockstates/" + var0 + "_leaves.json");
         if (Config.method_14247(var5)) {
            Identifier var6 = new Identifier("models/block/" + var0 + "_leaves.json");
            if (!Config.method_14247(var6)) {
               return null;
            } else {
               class_454 var7 = new class_454(var0 + "_leaves", "normal");
               class_7373 var8 = var4.method_33943(var7);
               if (var8 != null && var8 != var4.method_33942()) {
                  List var9 = var8.method_33580((class_2522)null, (Direction)null, field_48743);
                  if (var9.size() == 0) {
                     return var8;
                  } else if (var9.size() != 6) {
                     return null;
                  } else {
                     for (class_5024 var11 : var9) {
                        List var12 = var8.method_33580((class_2522)null, var11.method_23150(), field_48743);
                        if (var12.size() > 0) {
                           return null;
                        }

                        var12.add(var11);
                     }

                     var9.clear();
                     var1.add(var0 + "_leaves");
                     return var8;
                  }
               } else {
                  return null;
               }
            }
         } else {
            return null;
         }
      }
   }

   private static class_7373 method_44263(class_7373 var0) {
      if (var0 == null) {
         return null;
      } else if (var0.method_33580((class_2522)null, (Direction)null, field_48743).size() > 0) {
         Config.method_14317(
            "SmartLeaves: Model is not cube, general quads: " + var0.method_33580((class_2522)null, (Direction)null, field_48743).size() + ", model: " + var0
         );
         return var0;
      } else {
         Direction[] var3 = Direction.field_803;

         for (int var4 = 0; var4 < var3.length; var4++) {
            Direction var5 = var3[var4];
            List var6 = var0.method_33580((class_2522)null, var5, field_48743);
            if (var6.size() != 1) {
               Config.method_14317("SmartLeaves: Model is not cube, side: " + var5 + ", quads: " + var6.size() + ", model: " + var0);
               return var0;
            }
         }

         class_7373 var14 = class_9885.method_45535(var0);
         List[] var15 = new List[var3.length];

         for (int var16 = 0; var16 < var3.length; var16++) {
            Direction var7 = var3[var16];
            List var8 = var14.method_33580((class_2522)null, var7, field_48743);
            class_5024 var9 = (class_5024)var8.get(0);
            class_5024 var10 = new class_5024(
               (int[])var9.method_23155().clone(), var9.method_23160(), var9.method_23150(), var9.method_23148(), var9.method_23168()
            );
            int[] var11 = var10.method_23155();
            int[] var12 = (int[])var11.clone();
            int var13 = var11.length / 4;
            System.arraycopy(var11, 0 * var13, var12, 3 * var13, var13);
            System.arraycopy(var11, 1 * var13, var12, 2 * var13, var13);
            System.arraycopy(var11, 2 * var13, var12, 1 * var13, var13);
            System.arraycopy(var11, 3 * var13, var12, 0 * var13, var13);
            System.arraycopy(var12, 0, var11, 0, var12.length);
            var8.add(var10);
         }

         return var14;
      }
   }
}
