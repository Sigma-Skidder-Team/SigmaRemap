package remapped;

import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class class_1878 extends class_9476 {
   private static String[] field_9524;
   public static final class_7044 field_9533 = class_6023.field_30686;
   public static final class_6720 field_9527 = class_6169.field_31564;
   public static final class_6720 field_9531 = class_6169.field_31567;
   public static final class_6720 field_9532 = class_6169.field_31569;
   public static final class_6720 field_9526 = class_6169.field_31566;
   public static final class_6720 field_9525 = class_6169.field_31563;
   private static final Map<Direction, class_6720> field_9530 = class_6169.field_31571
      .entrySet()
      .stream()
      .filter(var0 -> var0.getKey() != Direction.field_802)
      .collect(Util.<Direction, class_6720>toMap());
   private static final class_4190 field_9522 = class_6414.method_29292(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final class_4190 field_9528 = class_6414.method_29292(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final class_4190 field_9529 = class_6414.method_29292(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final class_4190 field_9520 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final class_4190 field_9523 = class_6414.method_29292(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<class_2522, class_4190> field_9534;
   private final Object2IntMap<class_6414> field_9535 = new Object2IntOpenHashMap();
   private final Object2IntMap<class_6414> field_9521 = new Object2IntOpenHashMap();

   public class_1878(class_3073 var1) {
      super(var1, 1.0F);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_9533, Integer.valueOf(0))
            .method_10308(field_9527, Boolean.valueOf(false))
            .method_10308(field_9531, Boolean.valueOf(false))
            .method_10308(field_9532, Boolean.valueOf(false))
            .method_10308(field_9526, Boolean.valueOf(false))
            .method_10308(field_9525, Boolean.valueOf(false))
      );
      this.field_9534 = ImmutableMap.copyOf(
         this.field_32751
            .method_36441()
            .stream()
            .filter(var0 -> var0.<Integer>method_10313(field_9533) == 0)
            .collect(Collectors.toMap(Function.<class_2522>identity(), class_1878::method_8412))
      );
   }

   private static class_4190 method_8412(class_2522 var0) {
      class_4190 var3 = class_3370.method_15536();
      if (var0.<Boolean>method_10313(field_9525)) {
         var3 = field_9522;
      }

      if (var0.<Boolean>method_10313(field_9527)) {
         var3 = class_3370.method_15530(var3, field_9520);
      }

      if (var0.<Boolean>method_10313(field_9532)) {
         var3 = class_3370.method_15530(var3, field_9523);
      }

      if (var0.<Boolean>method_10313(field_9531)) {
         var3 = class_3370.method_15530(var3, field_9529);
      }

      if (var0.<Boolean>method_10313(field_9526)) {
         var3 = class_3370.method_15530(var3, field_9528);
      }

      return !var3.method_19485() ? var3 : field_48307;
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      return !this.method_10787(var1, var4, var5)
         ? class_4783.field_23184.method_29260()
         : this.method_8408(var4, var5, var1.<Integer>method_10313(field_9533));
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return this.field_9534.get(var1.method_10308(field_9533, Integer.valueOf(0)));
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      return this.method_8413(var1.method_21862(), var1.method_21858());
   }

   public class_2522 method_8413(class_6163 var1, class_1331 var2) {
      class_1331 var5 = var2.method_6100();
      class_2522 var6 = var1.method_28262(var5);
      if (!this.method_43770(var6) && !var6.method_8308(var1, var5, Direction.field_817)) {
         class_2522 var7 = this.method_29260();

         for (Direction var11 : Direction.values()) {
            class_6720 var12 = field_9530.get(var11);
            if (var12 != null) {
               var7 = var7.method_10308(var12, Boolean.valueOf(this.method_43770(var1.method_28262(var2.method_6098(var11)))));
            }
         }

         return var7;
      } else {
         return this.method_29260();
      }
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, class_1331 var3) {
      class_1331 var6 = var3.method_6100();
      return var2.method_28262(var6).method_8308(var2, var6, Direction.field_817) || this.method_8404(var2, var3);
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      var2.method_28968().method_14011(var3, this, method_8415(var2.field_33033));
      if (var2.method_29537().method_1285(class_291.field_1035)) {
         if (!var1.method_8309(var2, var3)) {
            var2.method_7508(var3, false);
         }

         class_2522 var7 = var2.method_28262(var3.method_6100());
         boolean var8 = var7.method_8349(var2.method_22572().method_40240());
         int var9 = var1.<Integer>method_10313(field_9533);
         if (!var8 && var2.method_29561() && this.method_8411(var2, var3) && var4.nextFloat() < 0.2F + (float)var9 * 0.03F) {
            var2.method_7508(var3, false);
         } else {
            int var10 = Math.min(15, var9 + var4.nextInt(3) / 2);
            if (var9 != var10) {
               var1 = var1.method_10308(field_9533, Integer.valueOf(var10));
               var2.method_7513(var3, var1, 4);
            }

            if (!var8) {
               if (!this.method_8404(var2, var3)) {
                  class_1331 var22 = var3.method_6100();
                  if (!var2.method_28262(var22).method_8308(var2, var22, Direction.field_817) || var9 > 3) {
                     var2.method_7508(var3, false);
                  }

                  return;
               }

               if (var9 == 15 && var4.nextInt(4) == 0 && !this.method_43770(var2.method_28262(var3.method_6100()))) {
                  var2.method_7508(var3, false);
                  return;
               }
            }

            boolean var11 = var2.method_29529(var3);
            int var12 = !var11 ? 0 : -50;
            this.method_8409(var2, var3.method_6090(), 300 + var12, var4, var9);
            this.method_8409(var2, var3.method_6108(), 300 + var12, var4, var9);
            this.method_8409(var2, var3.method_6100(), 250 + var12, var4, var9);
            this.method_8409(var2, var3.method_6081(), 250 + var12, var4, var9);
            this.method_8409(var2, var3.method_6094(), 300 + var12, var4, var9);
            this.method_8409(var2, var3.method_6073(), 300 + var12, var4, var9);
            class_2921 var13 = new class_2921();

            for (int var14 = -1; var14 <= 1; var14++) {
               for (int var15 = -1; var15 <= 1; var15++) {
                  for (int var16 = -1; var16 <= 4; var16++) {
                     if (var14 != 0 || var16 != 0 || var15 != 0) {
                        int var17 = 100;
                        if (var16 > 1) {
                           var17 += (var16 - 1) * 100;
                        }

                        var13.method_13360(var3, var14, var16, var15);
                        int var18 = this.method_8410(var2, var13);
                        if (var18 > 0) {
                           int var19 = (var18 + 40 + var2.method_43370().method_2097() * 7) / (var9 + 30);
                           if (var11) {
                              var19 /= 2;
                           }

                           if (var19 > 0 && var4.nextInt(var17) <= var19 && (!var2.method_29561() || !this.method_8411(var2, var13))) {
                              int var20 = Math.min(15, var9 + var4.nextInt(5) / 4);
                              var2.method_7513(var13, this.method_8408(var2, var13, var20), 3);
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public boolean method_8411(World var1, class_1331 var2) {
      return var1.method_29569(var2)
         || var1.method_29569(var2.method_6108())
         || var1.method_29569(var2.method_6090())
         || var1.method_29569(var2.method_6094())
         || var1.method_29569(var2.method_6073());
   }

   private int method_8406(class_2522 var1) {
      return var1.method_10307(class_6023.field_30719) && var1.<Boolean>method_10313(class_6023.field_30719) ? 0 : this.field_9521.getInt(var1.method_8360());
   }

   private int method_8414(class_2522 var1) {
      return var1.method_10307(class_6023.field_30719) && var1.<Boolean>method_10313(class_6023.field_30719) ? 0 : this.field_9535.getInt(var1.method_8360());
   }

   private void method_8409(World var1, class_1331 var2, int var3, Random var4, int var5) {
      int var8 = this.method_8406(var1.method_28262(var2));
      if (var4.nextInt(var3) < var8) {
         class_2522 var9 = var1.method_28262(var2);
         if (var4.nextInt(var5 + 10) < 5 && !var1.method_29569(var2)) {
            int var10 = Math.min(var5 + var4.nextInt(5) / 4, 15);
            var1.method_7513(var2, this.method_8408(var1, var2, var10), 3);
         } else {
            var1.method_7508(var2, false);
         }

         class_6414 var12 = var9.method_8360();
         if (var12 instanceof class_2727) {
            class_2727 var11 = (class_2727)var12;
            class_2727.method_12256(var1, var2);
         }
      }
   }

   private class_2522 method_8408(class_9379 var1, class_1331 var2, int var3) {
      class_2522 var6 = method_43768(var1, var2);
      return !var6.method_8350(class_4783.field_23877) ? var6 : var6.method_10308(field_9533, Integer.valueOf(var3));
   }

   private boolean method_8404(class_6163 var1, class_1331 var2) {
      for (Direction var8 : Direction.values()) {
         if (this.method_43770(var1.method_28262(var2.method_6098(var8)))) {
            return true;
         }
      }

      return false;
   }

   private int method_8410(class_4924 var1, class_1331 var2) {
      if (!var1.method_22548(var2)) {
         return 0;
      } else {
         int var5 = 0;

         for (Direction var9 : Direction.values()) {
            class_2522 var10 = var1.method_28262(var2.method_6098(var9));
            var5 = Math.max(this.method_8414(var10), var5);
         }

         return var5;
      }
   }

   @Override
   public boolean method_43770(class_2522 var1) {
      return this.method_8414(var1) > 0;
   }

   @Override
   public void method_10760(class_2522 var1, World var2, class_1331 var3, class_2522 var4, boolean var5) {
      super.method_10760(var1, var2, var3, var4, var5);
      var2.method_43367().method_14011(var3, this, method_8415(var2.field_33033));
   }

   private static int method_8415(Random var0) {
      return 30 + var0.nextInt(10);
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_9533, field_9527, field_9531, field_9532, field_9526, field_9525);
   }

   private void method_8407(class_6414 var1, int var2, int var3) {
      this.field_9535.put(var1, var2);
      this.field_9521.put(var1, var3);
   }

   public static void method_8405() {
      class_1878 var2 = (class_1878)class_4783.field_23877;
      var2.method_8407(class_4783.field_23893, 5, 20);
      var2.method_8407(class_4783.field_23464, 5, 20);
      var2.method_8407(class_4783.field_23503, 5, 20);
      var2.method_8407(class_4783.field_23373, 5, 20);
      var2.method_8407(class_4783.field_23545, 5, 20);
      var2.method_8407(class_4783.field_23916, 5, 20);
      var2.method_8407(class_4783.field_23205, 5, 20);
      var2.method_8407(class_4783.field_23843, 5, 20);
      var2.method_8407(class_4783.field_23393, 5, 20);
      var2.method_8407(class_4783.field_23573, 5, 20);
      var2.method_8407(class_4783.field_23439, 5, 20);
      var2.method_8407(class_4783.field_23217, 5, 20);
      var2.method_8407(class_4783.field_23753, 5, 20);
      var2.method_8407(class_4783.field_23322, 5, 20);
      var2.method_8407(class_4783.field_23391, 5, 20);
      var2.method_8407(class_4783.field_23234, 5, 20);
      var2.method_8407(class_4783.field_23697, 5, 20);
      var2.method_8407(class_4783.field_23618, 5, 20);
      var2.method_8407(class_4783.field_23778, 5, 20);
      var2.method_8407(class_4783.field_23792, 5, 20);
      var2.method_8407(class_4783.field_23703, 5, 20);
      var2.method_8407(class_4783.field_23694, 5, 20);
      var2.method_8407(class_4783.field_23499, 5, 20);
      var2.method_8407(class_4783.field_23915, 5, 20);
      var2.method_8407(class_4783.field_23696, 5, 20);
      var2.method_8407(class_4783.field_23757, 5, 20);
      var2.method_8407(class_4783.field_23759, 5, 20);
      var2.method_8407(class_4783.field_23568, 5, 20);
      var2.method_8407(class_4783.field_23636, 5, 20);
      var2.method_8407(class_4783.field_23290, 5, 20);
      var2.method_8407(class_4783.field_23365, 5, 5);
      var2.method_8407(class_4783.field_23579, 5, 5);
      var2.method_8407(class_4783.field_23764, 5, 5);
      var2.method_8407(class_4783.field_23876, 5, 5);
      var2.method_8407(class_4783.field_23189, 5, 5);
      var2.method_8407(class_4783.field_23197, 5, 5);
      var2.method_8407(class_4783.field_23903, 5, 5);
      var2.method_8407(class_4783.field_23691, 5, 5);
      var2.method_8407(class_4783.field_23872, 5, 5);
      var2.method_8407(class_4783.field_23599, 5, 5);
      var2.method_8407(class_4783.field_23185, 5, 5);
      var2.method_8407(class_4783.field_23832, 5, 5);
      var2.method_8407(class_4783.field_23237, 5, 5);
      var2.method_8407(class_4783.field_23443, 5, 5);
      var2.method_8407(class_4783.field_23631, 5, 5);
      var2.method_8407(class_4783.field_23907, 5, 5);
      var2.method_8407(class_4783.field_23798, 5, 5);
      var2.method_8407(class_4783.field_23805, 5, 5);
      var2.method_8407(class_4783.field_23732, 5, 5);
      var2.method_8407(class_4783.field_23270, 5, 5);
      var2.method_8407(class_4783.field_23241, 5, 5);
      var2.method_8407(class_4783.field_23199, 5, 5);
      var2.method_8407(class_4783.field_23882, 5, 5);
      var2.method_8407(class_4783.field_23171, 5, 5);
      var2.method_8407(class_4783.field_23539, 30, 60);
      var2.method_8407(class_4783.field_23493, 30, 60);
      var2.method_8407(class_4783.field_23467, 30, 60);
      var2.method_8407(class_4783.field_23386, 30, 60);
      var2.method_8407(class_4783.field_23756, 30, 60);
      var2.method_8407(class_4783.field_23268, 30, 60);
      var2.method_8407(class_4783.field_23313, 30, 20);
      var2.method_8407(class_4783.field_23252, 15, 100);
      var2.method_8407(class_4783.field_23868, 60, 100);
      var2.method_8407(class_4783.field_23616, 60, 100);
      var2.method_8407(class_4783.field_23254, 60, 100);
      var2.method_8407(class_4783.field_23554, 60, 100);
      var2.method_8407(class_4783.field_23690, 60, 100);
      var2.method_8407(class_4783.field_23738, 60, 100);
      var2.method_8407(class_4783.field_23213, 60, 100);
      var2.method_8407(class_4783.field_23247, 60, 100);
      var2.method_8407(class_4783.field_23586, 60, 100);
      var2.method_8407(class_4783.field_23410, 60, 100);
      var2.method_8407(class_4783.field_23762, 60, 100);
      var2.method_8407(class_4783.field_23379, 60, 100);
      var2.method_8407(class_4783.field_23275, 60, 100);
      var2.method_8407(class_4783.field_23797, 60, 100);
      var2.method_8407(class_4783.field_23181, 60, 100);
      var2.method_8407(class_4783.field_23260, 60, 100);
      var2.method_8407(class_4783.field_23528, 60, 100);
      var2.method_8407(class_4783.field_23390, 60, 100);
      var2.method_8407(class_4783.field_23282, 60, 100);
      var2.method_8407(class_4783.field_23892, 60, 100);
      var2.method_8407(class_4783.field_23553, 60, 100);
      var2.method_8407(class_4783.field_23401, 60, 100);
      var2.method_8407(class_4783.field_23300, 30, 60);
      var2.method_8407(class_4783.field_23619, 30, 60);
      var2.method_8407(class_4783.field_23905, 30, 60);
      var2.method_8407(class_4783.field_23294, 30, 60);
      var2.method_8407(class_4783.field_23640, 30, 60);
      var2.method_8407(class_4783.field_23609, 30, 60);
      var2.method_8407(class_4783.field_23850, 30, 60);
      var2.method_8407(class_4783.field_23898, 30, 60);
      var2.method_8407(class_4783.field_23450, 30, 60);
      var2.method_8407(class_4783.field_23289, 30, 60);
      var2.method_8407(class_4783.field_23595, 30, 60);
      var2.method_8407(class_4783.field_23624, 30, 60);
      var2.method_8407(class_4783.field_23308, 30, 60);
      var2.method_8407(class_4783.field_23825, 30, 60);
      var2.method_8407(class_4783.field_23713, 30, 60);
      var2.method_8407(class_4783.field_23428, 30, 60);
      var2.method_8407(class_4783.field_23323, 15, 100);
      var2.method_8407(class_4783.field_23580, 5, 5);
      var2.method_8407(class_4783.field_23429, 60, 20);
      var2.method_8407(class_4783.field_23302, 15, 20);
      var2.method_8407(class_4783.field_23509, 60, 20);
      var2.method_8407(class_4783.field_23920, 60, 20);
      var2.method_8407(class_4783.field_23688, 60, 20);
      var2.method_8407(class_4783.field_23298, 60, 20);
      var2.method_8407(class_4783.field_23693, 60, 20);
      var2.method_8407(class_4783.field_23359, 60, 20);
      var2.method_8407(class_4783.field_23546, 60, 20);
      var2.method_8407(class_4783.field_23497, 60, 20);
      var2.method_8407(class_4783.field_23689, 60, 20);
      var2.method_8407(class_4783.field_23662, 60, 20);
      var2.method_8407(class_4783.field_23296, 60, 20);
      var2.method_8407(class_4783.field_23841, 60, 20);
      var2.method_8407(class_4783.field_23170, 60, 20);
      var2.method_8407(class_4783.field_23569, 60, 20);
      var2.method_8407(class_4783.field_23188, 60, 20);
      var2.method_8407(class_4783.field_23656, 60, 20);
      var2.method_8407(class_4783.field_23848, 30, 60);
      var2.method_8407(class_4783.field_23886, 60, 60);
      var2.method_8407(class_4783.field_23348, 60, 60);
      var2.method_8407(class_4783.field_23566, 30, 20);
      var2.method_8407(class_4783.field_23274, 5, 20);
      var2.method_8407(class_4783.field_23637, 60, 100);
      var2.method_8407(class_4783.field_23338, 5, 20);
      var2.method_8407(class_4783.field_23611, 30, 20);
   }
}
