package remapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class class_6541 {
   public static final Codec<class_6541> field_33265 = class_8669.field_44411.dispatchStable(class_6541::method_29835, Function.identity());
   public final class_3498 field_33263;
   public final class_3498 field_33264;
   private final class_9610 field_33261;
   private final long field_33262;
   private final List<class_2034> field_33260 = Lists.newArrayList();

   public class_6541(class_3498 var1, class_9610 var2) {
      this(var1, var1, var2, 0L);
   }

   public class_6541(class_3498 var1, class_3498 var2, class_9610 var3, long var4) {
      this.field_33263 = var1;
      this.field_33264 = var2;
      this.field_33261 = var3;
      this.field_33262 = var4;
   }

   private void method_29832() {
      if (this.field_33260.isEmpty()) {
         class_7655 var3 = this.field_33261.method_44375();
         if (var3 != null && var3.method_34653() != 0) {
            ArrayList var4 = Lists.newArrayList();

            for (class_6325 var6 : this.field_33263.method_16086()) {
               if (var6.method_28875().method_9458(class_5390.field_27511)) {
                  var4.add(var6);
               }
            }

            int var19 = var3.method_34655();
            int var20 = var3.method_34653();
            int var7 = var3.method_34652();
            Random var8 = new Random();
            var8.setSeed(this.field_33262);
            double var9 = var8.nextDouble() * Math.PI * 2.0;
            int var11 = 0;
            int var12 = 0;

            for (int var13 = 0; var13 < var20; var13++) {
               double var14 = (double)(4 * var19 + var19 * var12 * 6) + (var8.nextDouble() - 0.5) * (double)var19 * 2.5;
               int var16 = (int)Math.round(Math.cos(var9) * var14);
               int var17 = (int)Math.round(Math.sin(var9) * var14);
               BlockPos var18 = this.field_33263.method_16085((var16 << 4) + 8, 0, (var17 << 4) + 8, 112, var4::contains, var8);
               if (var18 != null) {
                  var16 = var18.getX() >> 4;
                  var17 = var18.getZ() >> 4;
               }

               this.field_33260.add(new class_2034(var16, var17));
               var9 += (Math.PI * 2) / (double)var7;
               if (++var11 == var7) {
                  var12++;
                  var11 = 0;
                  var7 += 2 * var7 / (var12 + 1);
                  var7 = Math.min(var7, var20 - var13);
                  var9 += var8.nextDouble() * Math.PI * 2.0;
               }
            }
         }
      }
   }

   public abstract Codec<? extends class_6541> method_29835();

   public abstract class_6541 method_29828(long var1);

   public void method_29834(class_8669<class_6325> var1, class_5990 var2) {
      class_2034 var5 = var2.method_27352();
      ((class_7481)var2).method_34032(new class_546(var1, var5, this.field_33264));
   }

   public void method_29829(long var1, class_859 var3, class_5990 var4, class_6033 var5) {
      class_859 var8 = var3.method_3730(this.field_33263);
      class_8679 var9 = new class_8679();
      byte var10 = 8;
      class_2034 var11 = var4.method_27352();
      int var12 = var11.field_10328;
      int var13 = var11.field_10327;
      class_2025 var14 = this.field_33263.method_28192(var11.field_10328 << 2, 0, var11.field_10327 << 2).method_28875();
      BitSet var15 = ((class_7481)var4).method_34019(var5);

      for (int var16 = var12 - 8; var16 <= var12 + 8; var16++) {
         for (int var17 = var13 - 8; var17 <= var13 + 8; var17++) {
            List var18 = var14.method_9462(var5);
            ListIterator var19 = var18.listIterator();

            while (var19.hasNext()) {
               int var20 = var19.nextIndex();
               class_987 var21 = (class_987)((Supplier)var19.next()).get();
               var9.method_39861(var1 + (long)var20, var16, var17);
               if (var21.method_4310(var9, var16, var17)) {
                  var21.method_4312(var4, var8::method_3726, var9, this.method_29816(), var16, var17, var12, var13, var15);
               }
            }
         }
      }
   }

   @Nullable
   public BlockPos method_29820(class_6331 var1, class_5390<?> var2, BlockPos var3, int var4, boolean var5) {
      if (this.field_33263.method_16090(var2)) {
         if (var2 != class_5390.field_27511) {
            class_4757 var16 = this.field_33261.method_44376(var2);
            return var16 != null ? var2.method_24548(var1, var1.method_28991(), var3, var4, var5, var1.method_3133(), var16) : null;
         } else {
            this.method_29832();
            BlockPos var8 = null;
            double var9 = Double.MAX_VALUE;
            class_2921 var11 = new class_2921();

            for (class_2034 var13 : this.field_33260) {
               var11.method_13362((var13.field_10328 << 4) + 8, 32, (var13.field_10327 << 4) + 8);
               double var14 = var11.method_12180(var3);
               if (var8 != null) {
                  if (var14 < var9) {
                     var8 = new BlockPos(var11);
                     var9 = var14;
                  }
               } else {
                  var8 = new BlockPos(var11);
                  var9 = var14;
               }
            }

            return var8;
         }
      } else {
         return null;
      }
   }

   public void method_29818(class_702 var1, class_2033 var2) {
      int var5 = var1.method_3137();
      int var6 = var1.method_3139();
      int var7 = var5 * 16;
      int var8 = var6 * 16;
      BlockPos var9 = new BlockPos(var7, 0, var8);
      class_6325 var10 = this.field_33263.method_28192((var5 << 2) + 2, 2, (var6 << 2) + 2);
      class_8679 var11 = new class_8679();
      long var12 = var11.method_39867(var1.method_3133(), var7, var8);

      try {
         var10.method_28862(var2, this, var1, var12, var11, var9);
      } catch (Exception var16) {
         class_159 var15 = class_159.method_643(var16, "Biome decoration");
         var15.method_639("Generation").method_29850("CenterX", var5).method_29850("CenterZ", var6).method_29850("Seed", var12).method_29850("Biome", var10);
         throw new class_3297(var15);
      }
   }

   public abstract void method_29814(class_702 var1, class_5990 var2);

   public void method_29815(class_702 var1) {
   }

   public class_9610 method_29825() {
      return this.field_33261;
   }

   public int method_29823() {
      return 64;
   }

   public class_3498 method_29817() {
      return this.field_33264;
   }

   public int method_29826() {
      return 256;
   }

   public List<class_3222> method_29836(class_6325 var1, class_2033 var2, class_4565 var3, BlockPos var4) {
      return var1.method_28886().method_27794(var3);
   }

   public void method_29837(class_6322 var1, class_2033 var2, class_5990 var3, class_5799 var4, long var5) {
      class_2034 var9 = var3.method_27352();
      class_6325 var10 = this.field_33263.method_28192((var9.field_10328 << 2) + 2, 0, (var9.field_10327 << 2) + 2);
      this.method_29833(class_8390.field_42914, var1, var2, var3, var4, var5, var9, var10);

      for (Supplier var12 : var10.method_28875().method_9459()) {
         this.method_29833((class_7865<?, ?>)var12.get(), var1, var2, var3, var4, var5, var9, var10);
      }
   }

   private void method_29833(
      class_7865<?, ?> var1, class_6322 var2, class_2033 var3, class_5990 var4, class_5799 var5, long var6, class_2034 var8, class_6325 var9
   ) {
      class_3200 var12 = var3.method_9528(class_6979.method_31922(var4.method_27352(), 0), var1.field_40267, var4);
      int var13 = var12 == null ? 0 : var12.method_14732();
      class_4757 var14 = this.field_33261.method_44376(var1.field_40267);
      if (var14 != null) {
         class_3200 var15 = var1.method_35604(var2, this, this.field_33263, var5, var6, var8, var9, var13, var14);
         var3.method_9530(class_6979.method_31922(var4.method_27352(), 0), var1.field_40267, var15, var4);
      }
   }

   public void method_29827(class_700 var1, class_2033 var2, class_5990 var3) {
      byte var6 = 8;
      int var7 = var3.method_27352().field_10328;
      int var8 = var3.method_27352().field_10327;
      int var9 = var7 << 4;
      int var10 = var8 << 4;
      class_6979 var11 = class_6979.method_31922(var3.method_27352(), 0);

      for (int var12 = var7 - 8; var12 <= var7 + 8; var12++) {
         for (int var13 = var8 - 8; var13 <= var8 + 8; var13++) {
            long var14 = class_2034.method_9540(var12, var13);

            for (class_3200 var17 : var1.method_22553(var12, var13).method_27363().values()) {
               try {
                  if (var17 != class_3200.field_15991 && var17.method_14724().method_44401(var9, var10, var9 + 15, var10 + 15)) {
                     var2.method_9527(var11, var17.method_14727(), var14, var3);
                     class_1892.method_8444(var1, var17);
                  }
               } catch (Exception var21) {
                  class_159 var19 = class_159.method_643(var21, "Generating structure reference");
                  class_6544 var20 = var19.method_639("Structure");
                  var20.method_29851("Id", () -> class_8669.field_44457.method_39797(var17.method_14727()).toString());
                  var20.method_29851("Name", () -> var17.method_14727().method_24556());
                  var20.method_29851("Class", () -> var17.method_14727().getClass().getCanonicalName());
                  throw new class_3297(var19);
               }
            }
         }
      }
   }

   public abstract void method_29824(class_9379 var1, class_2033 var2, class_5990 var3);

   public int method_29816() {
      return 63;
   }

   public abstract int method_29830(int var1, int var2, class_3801 var3);

   public abstract class_6163 method_29822(int var1, int var2);

   public int method_29831(int var1, int var2, class_3801 var3) {
      return this.method_29830(var1, var2, var3);
   }

   public int method_29819(int var1, int var2, class_3801 var3) {
      return this.method_29830(var1, var2, var3) - 1;
   }

   public boolean method_29821(class_2034 var1) {
      this.method_29832();
      return this.field_33260.contains(var1);
   }

   static {
      class_8669.<Codec<? extends class_6541>>method_39791(class_8669.field_44411, "noise", class_322.field_1204);
      class_8669.<Codec<? extends class_6541>>method_39791(class_8669.field_44411, "flat", class_6463.field_32943);
      class_8669.<Codec<? extends class_6541>>method_39791(class_8669.field_44411, "debug", class_8510.field_43560);
   }
}
