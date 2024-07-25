package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import javax.annotation.Nullable;

public class class_2730 {
   private static final class_7571 field_13328 = new class_7571();
   private final boolean field_13332;
   private final class_7298 field_13334;
   private final Random field_13327 = new Random();
   private final World field_13330;
   private final double field_13322;
   private final double field_13336;
   private final double field_13326;
   private final Entity field_13323;
   private final float field_13325;
   private final class_6199 field_13324;
   private final class_7571 field_13333;
   private final List<class_1331> field_13335 = Lists.newArrayList();
   private final Map<class_704, class_1343> field_13331 = Maps.newHashMap();

   public class_2730(World var1, Entity var2, double var3, double var5, double var7, float var9, List<class_1331> var10) {
      this(var1, var2, var3, var5, var7, var9, false, class_7298.field_37311, var10);
   }

   public class_2730(
           World var1, Entity var2, double var3, double var5, double var7, float var9, boolean var10, class_7298 var11, List<class_1331> var12
   ) {
      this(var1, var2, var3, var5, var7, var9, var10, var11);
      this.field_13335.addAll(var12);
   }

   public class_2730(World var1, Entity var2, double var3, double var5, double var7, float var9, boolean var10, class_7298 var11) {
      this(var1, var2, (class_6199)null, (class_7571)null, var3, var5, var7, var9, var10, var11);
   }

   public class_2730(
           World var1, Entity var2, class_6199 var3, class_7571 var4, double var5, double var7, double var9, float var11, boolean var12, class_7298 var13
   ) {
      this.field_13330 = var1;
      this.field_13323 = var2;
      this.field_13325 = var11;
      this.field_13322 = var5;
      this.field_13336 = var7;
      this.field_13326 = var9;
      this.field_13332 = var12;
      this.field_13334 = var13;
      this.field_13324 = var3 != null ? var3 : class_6199.method_28350(this);
      this.field_13333 = var4 != null ? var4 : this.method_12268(var2);
   }

   private class_7571 method_12268(Entity var1) {
      return (class_7571)(var1 != null ? new class_362(var1) : field_13328);
   }

   public static float method_12265(class_1343 var0, Entity var1) {
      class_4092 var4 = var1.method_37241();
      double var5 = 1.0 / ((var4.field_19940 - var4.field_19941) * 2.0 + 1.0);
      double var7 = 1.0 / ((var4.field_19939 - var4.field_19937) * 2.0 + 1.0);
      double var9 = 1.0 / ((var4.field_19942 - var4.field_19938) * 2.0 + 1.0);
      double var11 = (1.0 - Math.floor(1.0 / var5) * var5) / 2.0;
      double var13 = (1.0 - Math.floor(1.0 / var9) * var9) / 2.0;
      if (!(var5 < 0.0) && !(var7 < 0.0) && !(var9 < 0.0)) {
         int var15 = 0;
         int var16 = 0;

         for (float var17 = 0.0F; var17 <= 1.0F; var17 = (float)((double)var17 + var5)) {
            for (float var18 = 0.0F; var18 <= 1.0F; var18 = (float)((double)var18 + var7)) {
               for (float var19 = 0.0F; var19 <= 1.0F; var19 = (float)((double)var19 + var9)) {
                  double var20 = class_9299.method_42794((double)var17, var4.field_19941, var4.field_19940);
                  double var22 = class_9299.method_42794((double)var18, var4.field_19937, var4.field_19939);
                  double var24 = class_9299.method_42794((double)var19, var4.field_19938, var4.field_19942);
                  class_1343 var26 = new class_1343(var20 + var11, var22, var24 + var13);
                  if (var1.field_41768.method_28265(new class_972(var26, var0, class_3132.field_15553, class_9583.field_48747, var1)).method_33990()
                     == class_1430.field_7721) {
                     var15++;
                  }

                  var16++;
               }
            }
         }

         return (float)var15 / (float)var16;
      } else {
         return 0.0F;
      }
   }

   public void method_12266() {
      HashSet var3 = Sets.newHashSet();
      byte var4 = 16;

      for (int var5 = 0; var5 < 16; var5++) {
         for (int var6 = 0; var6 < 16; var6++) {
            for (int var7 = 0; var7 < 16; var7++) {
               if (var5 == 0 || var5 == 15 || var6 == 0 || var6 == 15 || var7 == 0 || var7 == 15) {
                  double var15 = (double)((float)var5 / 15.0F * 2.0F - 1.0F);
                  double var17 = (double)((float)var6 / 15.0F * 2.0F - 1.0F);
                  double var19 = (double)((float)var7 / 15.0F * 2.0F - 1.0F);
                  double var21 = Math.sqrt(var15 * var15 + var17 * var17 + var19 * var19);
                  var15 /= var21;
                  var17 /= var21;
                  var19 /= var21;
                  float var23 = this.field_13325 * (0.7F + this.field_13330.field_33033.nextFloat() * 0.6F);
                  double var24 = this.field_13322;
                  double var26 = this.field_13336;
                  double var28 = this.field_13326;

                  for (float var30 = 0.3F; var23 > 0.0F; var23 -= 0.22500001F) {
                     class_1331 var31 = new class_1331(var24, var26, var28);
                     class_2522 var32 = this.field_13330.method_28262(var31);
                     class_4774 var33 = this.field_13330.method_28258(var31);
                     Optional var34 = this.field_13333.method_34424(this, this.field_13330, var31, var32, var33);
                     if (var34.isPresent()) {
                        var23 -= (var34.get() + 0.3F) * 0.3F;
                     }

                     if (var23 > 0.0F && this.field_13333.method_34425(this, this.field_13330, var31, var32, var23)) {
                        var3.add(var31);
                     }

                     var24 += var15 * 0.3F;
                     var26 += var17 * 0.3F;
                     var28 += var19 * 0.3F;
                  }
               }
            }
         }
      }

      this.field_13335.addAll(var3);
      float var53 = this.field_13325 * 2.0F;
      int var54 = class_9299.method_42847(this.field_13322 - (double)var53 - 1.0);
      int var55 = class_9299.method_42847(this.field_13322 + (double)var53 + 1.0);
      int var8 = class_9299.method_42847(this.field_13336 - (double)var53 - 1.0);
      int var9 = class_9299.method_42847(this.field_13336 + (double)var53 + 1.0);
      int var10 = class_9299.method_42847(this.field_13326 - (double)var53 - 1.0);
      int var11 = class_9299.method_42847(this.field_13326 + (double)var53 + 1.0);
      List var12 = this.field_13330
         .method_25870(this.field_13323, new class_4092((double)var54, (double)var8, (double)var10, (double)var55, (double)var9, (double)var11));
      class_1343 var13 = new class_1343(this.field_13322, this.field_13336, this.field_13326);

      for (int var14 = 0; var14 < var12.size(); var14++) {
         Entity var35 = (Entity)var12.get(var14);
         if (!var35.method_37085()) {
            double var36 = (double)(class_9299.method_42842(var35.method_37274(var13)) / var53);
            if (var36 <= 1.0) {
               double var38 = var35.method_37302() - this.field_13322;
               double var40 = (!(var35 instanceof class_1356) ? var35.method_37388() : var35.method_37309()) - this.field_13336;
               double var42 = var35.method_37156() - this.field_13326;
               double var44 = (double)class_9299.method_42842(var38 * var38 + var40 * var40 + var42 * var42);
               if (var44 != 0.0) {
                  var38 /= var44;
                  var40 /= var44;
                  var42 /= var44;
                  double var46 = (double)method_12265(var13, var35);
                  double var48 = (1.0 - var36) * var46;
                  var35.method_37181(this.method_12274(), (float)((int)((var48 * var48 + var48) / 2.0 * 7.0 * (double)var53 + 1.0)));
                  double var50 = var48;
                  if (var35 instanceof class_5834) {
                     var50 = class_5139.method_23553((class_5834)var35, var48);
                  }

                  var35.method_37215(var35.method_37098().method_6214(var38 * var50, var40 * var50, var42 * var50));
                  if (var35 instanceof class_704) {
                     class_704 var52 = (class_704)var35;
                     if (!var52.method_37221() && (!var52.method_3186() || !var52.field_3876.field_4942)) {
                        this.field_13331.put(var52, new class_1343(var38 * var48, var40 * var48, var42 * var48));
                     }
                  }
               }
            }
         }
      }
   }

   public void method_12272(boolean var1) {
      if (this.field_13330.field_33055) {
         this.field_13330
            .method_29527(
               this.field_13322,
               this.field_13336,
               this.field_13326,
               class_463.field_2445,
               class_562.field_3322,
               4.0F,
               (1.0F + (this.field_13330.field_33033.nextFloat() - this.field_13330.field_33033.nextFloat()) * 0.2F) * 0.7F,
               false
            );
      }

      boolean var4 = this.field_13334 != class_7298.field_37310;
      if (var1) {
         if (!(this.field_13325 < 2.0F) && var4) {
            this.field_13330.method_43361(class_3090.field_15377, this.field_13322, this.field_13336, this.field_13326, 1.0, 0.0, 0.0);
         } else {
            this.field_13330.method_43361(class_3090.field_15339, this.field_13322, this.field_13336, this.field_13326, 1.0, 0.0, 0.0);
         }
      }

      if (var4) {
         ObjectArrayList var5 = new ObjectArrayList();
         Collections.shuffle(this.field_13335, this.field_13330.field_33033);

         for (class_1331 var7 : this.field_13335) {
            class_2522 var8 = this.field_13330.method_28262(var7);
            class_6414 var9 = var8.method_8360();
            if (!var8.method_8345()) {
               class_1331 var10 = var7.method_6072();
               this.field_13330.method_29599().method_16056("explosion_blocks");
               if (var9.method_29256(this) && this.field_13330 instanceof class_6331) {
                  class_3757 var11 = !var9.method_10802() ? null : this.field_13330.method_28260(var7);
                  class_8480 var12 = new class_8480((class_6331)this.field_13330)
                     .method_39068(this.field_13330.field_33033)
                     .method_39065(class_8712.field_44671, class_1343.method_6216(var7))
                     .method_39065(class_8712.field_44670, ItemStack.EMPTY)
                     .method_39069(class_8712.field_44673, var11)
                     .method_39069(class_8712.field_44676, this.field_13323);
                  if (this.field_13334 == class_7298.field_37311) {
                     var12.method_39065(class_8712.field_44672, this.field_13325);
                  }

                  var8.method_8333(var12).forEach(var2 -> method_12271(var5, var2, var10));
               }

               this.field_13330.method_7513(var7, class_4783.field_23184.method_29260(), 3);
               var9.method_29279(this.field_13330, var7, this);
               this.field_13330.method_29599().method_16054();
            }
         }

         ObjectListIterator var14 = var5.iterator();

         while (var14.hasNext()) {
            Pair var16 = (Pair)var14.next();
            class_6414.method_29267(this.field_13330, (class_1331)var16.getSecond(), (ItemStack)var16.getFirst());
         }
      }

      if (this.field_13332) {
         for (class_1331 var15 : this.field_13335) {
            if (this.field_13327.nextInt(3) == 0
               && this.field_13330.method_28262(var15).method_8345()
               && this.field_13330.method_28262(var15.method_6100()).method_8321(this.field_13330, var15.method_6100())) {
               this.field_13330.method_29594(var15, class_9476.method_43768(this.field_13330, var15));
            }
         }
      }
   }

   private static void method_12271(ObjectArrayList<Pair<ItemStack, class_1331>> var0, ItemStack var1, class_1331 var2) {
      int var5 = var0.size();

      for (int var6 = 0; var6 < var5; var6++) {
         Pair var7 = (Pair)var0.get(var6);
         ItemStack var8 = (ItemStack)var7.getFirst();
         if (class_91.method_249(var8, var1)) {
            ItemStack var9 = class_91.method_247(var8, var1, 16);
            var0.set(var6, Pair.of(var9, var7.getSecond()));
            if (var1.method_28022()) {
               return;
            }
         }
      }

      var0.add(Pair.of(var1, var2));
   }

   public class_6199 method_12274() {
      return this.field_13324;
   }

   public Map<class_704, class_1343> method_12267() {
      return this.field_13331;
   }

   @Nullable
   public class_5834 method_12273() {
      if (this.field_13323 != null) {
         if (!(this.field_13323 instanceof class_1356)) {
            if (!(this.field_13323 instanceof class_5834)) {
               if (this.field_13323 instanceof class_5783) {
                  Entity var3 = ((class_5783)this.field_13323).method_26166();
                  if (var3 instanceof class_5834) {
                     return (class_5834)var3;
                  }
               }

               return null;
            } else {
               return (class_5834)this.field_13323;
            }
         } else {
            return ((class_1356)this.field_13323).method_6256();
         }
      } else {
         return null;
      }
   }

   public void method_12269() {
      this.field_13335.clear();
   }

   public List<class_1331> method_12275() {
      return this.field_13335;
   }
}
