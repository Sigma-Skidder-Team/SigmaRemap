package remapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class class_8976 {
   private static String[] field_45988;
   private final class_5851[] field_45986 = new class_5851[32];
   private final int field_45990;
   private final class_1546 field_45989;
   private final class_5424 field_45987 = new class_5424();

   public class_8976(class_1546 var1, int var2) {
      this.field_45989 = var1;
      this.field_45990 = var2;
   }

   @Nullable
   public class_3998 method_41159(class_9525 var1, class_5886 var2, Set<BlockPos> var3, float var4, int var5, float var6) {
      this.field_45987.method_24664();
      this.field_45989.method_7014(var1, var2);
      class_5851 var9 = this.field_45989.method_7003();
      Map var10 = var3.stream()
         .collect(
            Collectors.toMap(
               var1x -> this.field_45989.method_7013((double)var1x.method_12173(), (double)var1x.method_12165(), (double)var1x.method_12185()),
               Function.<BlockPos>identity()
            )
         );
      class_3998 var11 = this.method_41162(var9, var10, var4, var5, var6);
      this.field_45989.method_7005();
      return var11;
   }

   @Nullable
   private class_3998 method_41162(class_5851 var1, Map<class_1478, BlockPos> var2, float var3, int var4, float var5) {
      Set var8 = var2.keySet();
      var1.field_29734 = 0.0F;
      var1.field_29727 = this.method_41163(var1, var8);
      var1.field_29732 = var1.field_29727;
      this.field_45987.method_24664();
      this.field_45987.method_24666(var1);
      ImmutableSet var9 = ImmutableSet.of();
      int var10 = 0;
      HashSet var11 = Sets.newHashSetWithExpectedSize(var8.size());
      int var12 = (int)((float)this.field_45990 * var5);

      while (!this.field_45987.method_24663()) {
         if (++var10 >= var12) {
            break;
         }

         class_5851 var13 = this.field_45987.method_24667();
         var13.field_29726 = true;

         for (class_1478 var15 : var8) {
            if (var13.method_26685(var15) <= (float)var4) {
               var15.method_6817();
               var11.add(var15);
            }
         }

         if (!var11.isEmpty()) {
            break;
         }

         if (!(var13.method_26688(var1) >= var3)) {
            int var20 = this.field_45989.method_7002(this.field_45986, var13);

            for (int var21 = 0; var21 < var20; var21++) {
               class_5851 var16 = this.field_45986[var21];
               float var17 = var13.method_26688(var16);
               var16.field_29728 = var13.field_29728 + var17;
               float var18 = var13.field_29734 + var17 + var16.field_29729;
               if (var16.field_29728 < var3 && (!var16.method_26690() || var18 < var16.field_29734)) {
                  var16.field_29739 = var13;
                  var16.field_29734 = var18;
                  var16.field_29727 = this.method_41163(var16, var8) * 1.5F;
                  if (!var16.method_26690()) {
                     var16.field_29732 = var16.field_29734 + var16.field_29727;
                     this.field_45987.method_24666(var16);
                  } else {
                     this.field_45987.method_24668(var16, var16.field_29734 + var16.field_29727);
                  }
               }
            }
         }
      }

      Optional var19 = var11.isEmpty()
         ? var8.stream()
            .<class_3998>map(var2x -> this.method_41160(var2x.method_6814(), (BlockPos)var2.get(var2x), false))
            .min(Comparator.<class_3998>comparingDouble(class_3998::method_18444).thenComparingInt(class_3998::method_18437))
         : var11.stream()
            .<class_3998>map(var2x -> this.method_41160(var2x.method_6814(), (BlockPos)var2.get(var2x), true))
            .min(Comparator.comparingInt(class_3998::method_18437));
      return var19.isPresent() ? (class_3998)var19.get() : null;
   }

   private float method_41163(class_5851 var1, Set<class_1478> var2) {
      float var5 = Float.MAX_VALUE;

      for (class_1478 var7 : var2) {
         float var8 = var1.method_26688(var7);
         var7.method_6816(var8, var1);
         var5 = Math.min(var8, var5);
      }

      return var5;
   }

   private class_3998 method_41160(class_5851 var1, BlockPos var2, boolean var3) {
      ArrayList var6 = Lists.newArrayList();
      class_5851 var7 = var1;
      var6.add(0, var1);

      while (var7.field_29739 != null) {
         var7 = var7.field_29739;
         var6.add(0, var7);
      }

      return new class_3998(var6, var2, var3);
   }
}
