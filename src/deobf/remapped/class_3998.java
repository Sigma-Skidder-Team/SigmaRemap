package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class class_3998 {
   private final List<class_5851> field_19422;
   private class_5851[] field_19421 = new class_5851[0];
   private class_5851[] field_19423 = new class_5851[0];
   private Set<class_1478> field_19416;
   private int field_19420;
   private final BlockPos field_19417;
   private final float field_19419;
   private final boolean field_19424;

   public class_3998(List<class_5851> var1, BlockPos var2, boolean var3) {
      this.field_19422 = var1;
      this.field_19417 = var2;
      this.field_19419 = !var1.isEmpty() ? this.field_19422.get(this.field_19422.size() - 1).method_26691(this.field_19417) : Float.MAX_VALUE;
      this.field_19424 = var3;
   }

   public void method_18434() {
      this.field_19420++;
   }

   public boolean method_18440() {
      return this.field_19420 <= 0;
   }

   public boolean method_18436() {
      return this.field_19420 >= this.field_19422.size();
   }

   @Nullable
   public class_5851 method_18448() {
      return this.field_19422.isEmpty() ? null : this.field_19422.get(this.field_19422.size() - 1);
   }

   public class_5851 method_18447(int var1) {
      return this.field_19422.get(var1);
   }

   public void method_18428(int var1) {
      if (this.field_19422.size() > var1) {
         this.field_19422.subList(var1, this.field_19422.size()).clear();
      }
   }

   public void method_18427(int var1, class_5851 var2) {
      this.field_19422.set(var1, var2);
   }

   public int method_18437() {
      return this.field_19422.size();
   }

   public int method_18429() {
      return this.field_19420;
   }

   public void method_18443(int var1) {
      this.field_19420 = var1;
   }

   public class_1343 method_18432(Entity var1, int var2) {
      class_5851 var5 = this.field_19422.get(var2);
      double var6 = (double)var5.field_29731 + (double)((int)(var1.method_37086() + 1.0F)) * 0.5;
      double var8 = (double)var5.field_29735;
      double var10 = (double)var5.field_29736 + (double)((int)(var1.method_37086() + 1.0F)) * 0.5;
      return new class_1343(var6, var8, var10);
   }

   public BlockPos method_18445(int var1) {
      return this.field_19422.get(var1).method_26686();
   }

   public class_1343 method_18439(Entity var1) {
      return this.method_18432(var1, this.field_19420);
   }

   public BlockPos method_18449() {
      return this.field_19422.get(this.field_19420).method_26686();
   }

   public class_5851 method_18438() {
      return this.field_19422.get(this.field_19420);
   }

   @Nullable
   public class_5851 method_18442() {
      return this.field_19420 <= 0 ? null : this.field_19422.get(this.field_19420 - 1);
   }

   public boolean method_18446(class_3998 var1) {
      if (var1 == null) {
         return false;
      } else if (var1.field_19422.size() != this.field_19422.size()) {
         return false;
      } else {
         for (int var4 = 0; var4 < this.field_19422.size(); var4++) {
            class_5851 var5 = this.field_19422.get(var4);
            class_5851 var6 = var1.field_19422.get(var4);
            if (var5.field_29731 != var6.field_29731 || var5.field_29735 != var6.field_29735 || var5.field_29736 != var6.field_29736) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean method_18433() {
      return this.field_19424;
   }

   public class_5851[] method_18435() {
      return this.field_19421;
   }

   public class_5851[] method_18431() {
      return this.field_19423;
   }

   public static class_3998 method_18441(class_8248 var0) {
      boolean var3 = var0.readBoolean();
      int var4 = var0.readInt();
      int var5 = var0.readInt();
      HashSet var6 = Sets.newHashSet();

      for (int var7 = 0; var7 < var5; var7++) {
         var6.add(class_1478.method_6815(var0));
      }

      BlockPos var13 = new BlockPos(var0.readInt(), var0.readInt(), var0.readInt());
      ArrayList var8 = Lists.newArrayList();
      int var9 = var0.readInt();

      for (int var10 = 0; var10 < var9; var10++) {
         var8.add(class_5851.method_26693(var0));
      }

      class_5851[] var14 = new class_5851[var0.readInt()];

      for (int var11 = 0; var11 < var14.length; var11++) {
         var14[var11] = class_5851.method_26693(var0);
      }

      class_5851[] var15 = new class_5851[var0.readInt()];

      for (int var12 = 0; var12 < var15.length; var12++) {
         var15[var12] = class_5851.method_26693(var0);
      }

      class_3998 var16 = new class_3998(var8, var13, var3);
      var16.field_19421 = var14;
      var16.field_19423 = var15;
      var16.field_19416 = var6;
      var16.field_19420 = var4;
      return var16;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.field_19422.size() + ")";
   }

   public BlockPos method_18426() {
      return this.field_19417;
   }

   public float method_18444() {
      return this.field_19419;
   }
}
