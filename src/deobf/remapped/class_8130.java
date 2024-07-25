package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class class_8130 {
   private static String[] field_41641;
   private static final Comparator<class_678> field_41646 = Comparator.<class_678, Integer>comparing(var0 -> -var0.field_3742)
      .thenComparing(var0 -> -var0.field_3744)
      .thenComparing(var0 -> var0.field_3743.method_38459());
   private final int field_41645;
   private final Set<class_678> field_41644 = Sets.newHashSetWithExpectedSize(256);
   private final List<class_5054> field_41640 = Lists.newArrayListWithCapacity(256);
   private int field_41639;
   private int field_41638;
   private final int field_41642;
   private final int field_41643;

   public class_8130(int var1, int var2, int var3) {
      this.field_41645 = var3;
      this.field_41642 = var1;
      this.field_41643 = var2;
   }

   public int method_36992() {
      return this.field_41639;
   }

   public int method_36994() {
      return this.field_41638;
   }

   public void method_36990(class_8353 var1) {
      class_678 var4 = new class_678(var1, this.field_41645);
      this.field_41644.add(var4);
   }

   public void method_36996() {
      ArrayList var3 = Lists.newArrayList(this.field_41644);
      var3.sort(field_41646);

      for (class_678 var5 : var3) {
         if (!this.method_36995(var5)) {
            throw new class_1882(
               var5.field_3743,
               var3.stream().<class_8353>map(var0 -> var0.field_3743).collect(ImmutableList.toImmutableList()),
               this.field_41639,
               this.field_41638,
               this.field_41642,
               this.field_41643
            );
         }
      }

      this.field_41639 = class_9299.method_42801(this.field_41639);
      this.field_41638 = class_9299.method_42801(this.field_41638);
   }

   public void method_36993(class_1798 var1) {
      for (class_5054 var5 : this.field_41640) {
         var5.method_23290(var2 -> {
            class_678 var5x = var2.method_23291();
            class_8353 var6 = var5x.field_3743;
            var1.method_7997(var6, this.field_41639, this.field_41638, var2.method_23289(), var2.method_23288());
         });
      }
   }

   private static int method_36989(int var0, int var1) {
      return (var0 >> var1) + ((var0 & (1 << var1) - 1) != 0 ? 1 : 0) << var1;
   }

   private boolean method_36995(class_678 var1) {
      for (class_5054 var5 : this.field_41640) {
         if (var5.method_23292(var1)) {
            return true;
         }
      }

      return this.method_36997(var1);
   }

   private boolean method_36997(class_678 var1) {
      int var4 = class_9299.method_42801(this.field_41639);
      int var5 = class_9299.method_42801(this.field_41638);
      int var6 = class_9299.method_42801(this.field_41639 + var1.field_3744);
      int var7 = class_9299.method_42801(this.field_41638 + var1.field_3742);
      boolean var8 = var6 <= this.field_41642;
      boolean var9 = var7 <= this.field_41643;
      if (!var8 && !var9) {
         return false;
      } else {
         int var10 = class_1750.method_7802(this.field_41638);
         boolean var11 = var8 && var6 <= 2 * var10;
         if (this.field_41639 == 0 && this.field_41638 == 0) {
            var11 = true;
         }

         class_5054 var12;
         if (!var11) {
            var12 = new class_5054(0, this.field_41638, this.field_41639, var1.field_3742);
            this.field_41638 = this.field_41638 + var1.field_3742;
         } else {
            if (this.field_41638 == 0) {
               this.field_41638 = var1.field_3742;
            }

            var12 = new class_5054(this.field_41639, 0, var1.field_3744, this.field_41638);
            this.field_41639 = this.field_41639 + var1.field_3744;
         }

         var12.method_23292(var1);
         this.field_41640.add(var12);
         return true;
      }
   }
}
