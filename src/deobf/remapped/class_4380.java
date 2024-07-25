package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_4380 extends class_551 implements class_1538 {
   private boolean field_21489 = false;
   private boolean field_21488 = false;

   public class_4380(class_317 var1) {
      super(var1);
   }

   @Override
   public Predicate<ItemStack> method_2653() {
      return field_3287;
   }

   @Override
   public Predicate<ItemStack> method_2655() {
      return field_3286;
   }

   @Override
   public class_954<ItemStack> method_11231(World var1, class_704 var2, class_2584 var3) {
      ItemStack var6 = var2.method_26617(var3);
      if (!method_20408(var6)) {
         if (var2.method_26475(var6).method_28022()) {
            return class_954.<ItemStack>method_4202(var6);
         } else {
            if (!method_20408(var6)) {
               this.field_21489 = false;
               this.field_21488 = false;
               var2.method_26462(var3);
            }

            return class_954.<ItemStack>method_4206(var6);
         }
      } else {
         method_20402(var1, var2, var3, var6, method_20404(var6), 1.0F);
         method_20412(var6, false);
         return class_954.<ItemStack>method_4206(var6);
      }
   }

   @Override
   public void method_11206(ItemStack var1, World var2, class_5834 var3, int var4) {
      int var7 = this.method_11230(var1) - var4;
      float var8 = method_20406(var7, var1);
      if (var8 >= 1.0F && !method_20408(var1) && method_20410(var3, var1)) {
         method_20412(var1, true);
         class_562 var9 = !(var3 instanceof class_704) ? class_562.field_3332 : class_562.field_3335;
         var2.method_29528(
            (class_704)null,
            var3.method_37302(),
            var3.method_37309(),
            var3.method_37156(),
            class_463.field_2703,
            var9,
            1.0F,
            1.0F / (field_12172.nextFloat() * 0.5F + 1.0F) + 0.2F
         );
      }
   }

   private static boolean method_20410(class_5834 var0, ItemStack var1) {
      int var4 = class_2931.method_13423(class_3668.field_17875, var1);
      int var5 = var4 != 0 ? 3 : 1;
      boolean var6 = var0 instanceof class_704 && ((class_704)var0).field_3876.field_4944;
      ItemStack var7 = var0.method_26475(var1);
      ItemStack var8 = var7.method_27973();

      for (int var9 = 0; var9 < var5; var9++) {
         if (var9 > 0) {
            var7 = var8.method_27973();
         }

         if (var7.method_28022() && var6) {
            var7 = new ItemStack(class_4897.field_25024);
            var8 = var7.method_27973();
         }

         if (!method_20414(var0, var1, var7, var9 > 0, var6)) {
            return false;
         }
      }

      return true;
   }

   private static boolean method_20414(class_5834 var0, ItemStack var1, ItemStack var2, boolean var3, boolean var4) {
      if (var2.method_28022()) {
         return false;
      } else {
         boolean var7 = var4 && var2.method_27960() instanceof class_603;
         ItemStack var8;
         if (!var7 && !var4 && !var3) {
            var8 = var2.method_27953(1);
            if (var2.method_28022() && var0 instanceof class_704) {
               ((class_704)var0).inventory.method_32419(var2);
            }
         } else {
            var8 = var2.method_27973();
         }

         method_20409(var1, var8);
         return true;
      }
   }

   public static boolean method_20408(ItemStack var0) {
      class_5734 var3 = var0.method_27990();
      return var3 != null && var3.method_25933("Charged");
   }

   public static void method_20412(ItemStack var0, boolean var1) {
      class_5734 var4 = var0.method_27994();
      var4.method_25934("Charged", var1);
   }

   private static void method_20409(ItemStack var0, ItemStack var1) {
      class_5734 var4 = var0.method_27994();
      class_3416 var5;
      if (!var4.method_25939("ChargedProjectiles", 9)) {
         var5 = new class_3416();
      } else {
         var5 = var4.method_25927("ChargedProjectiles", 10);
      }

      class_5734 var6 = new class_5734();
      var1.method_27998(var6);
      var5.add(var6);
      var4.method_25946("ChargedProjectiles", var5);
   }

   private static List<ItemStack> method_20411(ItemStack var0) {
      ArrayList var3 = Lists.newArrayList();
      class_5734 var4 = var0.method_27990();
      if (var4 != null && var4.method_25939("ChargedProjectiles", 9)) {
         class_3416 var5 = var4.method_25927("ChargedProjectiles", 10);
         if (var5 != null) {
            for (int var6 = 0; var6 < var5.size(); var6++) {
               class_5734 var7 = var5.method_15764(var6);
               var3.add(ItemStack.method_28015(var7));
            }
         }
      }

      return var3;
   }

   private static void method_20399(ItemStack var0) {
      class_5734 var3 = var0.method_27990();
      if (var3 != null) {
         class_3416 var4 = var3.method_25927("ChargedProjectiles", 9);
         var4.clear();
         var3.method_25946("ChargedProjectiles", var4);
      }
   }

   public static boolean method_20413(ItemStack var0, class_2451 var1) {
      return method_20411(var0).stream().anyMatch(var1x -> var1x.method_27960() == var1);
   }

   private static void method_20400(
           World var0, class_5834 var1, class_2584 var2, ItemStack var3, ItemStack var4, float var5, boolean var6, float var7, float var8, float var9
   ) {
      if (!var0.field_33055) {
         boolean var12 = var4.method_27960() == class_4897.field_24479;
         Object var13;
         if (!var12) {
            var13 = method_20415(var0, var1, var3, var4);
            if (var6 || var9 != 0.0F) {
               ((class_6749)var13).field_34835 = class_4237.field_20565;
            }
         } else {
            var13 = new class_8612(var0, var4, var1, var1.method_37302(), var1.method_37388() - 0.15F, var1.method_37156(), true);
         }

         if (!(var1 instanceof class_3832)) {
            class_1343 var14 = var1.method_37371(1.0F);
            Quaternion var15 = new Quaternion(new class_2426(var14), var9, true);
            class_1343 var16 = var1.method_37307(1.0F);
            class_2426 var17 = new class_2426(var16);
            var17.method_11058(var15);
            ((class_5783)var13).method_26161((double)var17.method_11057(), (double)var17.method_11061(), (double)var17.method_11055(), var7, var8);
         } else {
            class_3832 var18 = (class_3832)var1;
            var18.method_17812(var18.method_17809(), var3, (class_5783)var13, var9);
         }

         var3.method_28003(!var12 ? 1 : 3, var1, var1x -> var1x.method_26447(var2));
         var0.method_7509((Entity)var13);
         var0.method_29528(
            (class_704)null, var1.method_37302(), var1.method_37309(), var1.method_37156(), class_463.field_2025, class_562.field_3335, 1.0F, var5
         );
      }
   }

   private static class_6749 method_20415(World var0, class_5834 var1, ItemStack var2, ItemStack var3) {
      class_603 var6 = (class_603)(!(var3.method_27960() instanceof class_603) ? class_4897.field_25024 : var3.method_27960());
      class_6749 var7 = var6.method_2819(var0, var3, var1);
      if (var1 instanceof class_704) {
         var7.method_30918(true);
      }

      var7.method_30941(class_463.field_2328);
      var7.method_30934(true);
      int var8 = class_2931.method_13423(class_3668.field_17843, var2);
      if (var8 > 0) {
         var7.method_30922((byte)var8);
      }

      return var7;
   }

   public static void method_20402(World var0, class_5834 var1, class_2584 var2, ItemStack var3, float var4, float var5) {
      List var8 = method_20411(var3);
      float[] var9 = method_20398(var1.method_26594());

      for (int var10 = 0; var10 < var8.size(); var10++) {
         ItemStack var11 = (ItemStack)var8.get(var10);
         boolean var12 = var1 instanceof class_704 && ((class_704)var1).field_3876.field_4944;
         if (!var11.method_28022()) {
            if (var10 != 0) {
               if (var10 != 1) {
                  if (var10 == 2) {
                     method_20400(var0, var1, var2, var3, var11, var9[var10], var12, var4, var5, 10.0F);
                  }
               } else {
                  method_20400(var0, var1, var2, var3, var11, var9[var10], var12, var4, var5, -10.0F);
               }
            } else {
               method_20400(var0, var1, var2, var3, var11, var9[var10], var12, var4, var5, 0.0F);
            }
         }
      }

      method_20407(var0, var1, var3);
   }

   private static float[] method_20398(Random var0) {
      boolean var3 = var0.nextBoolean();
      return new float[]{1.0F, method_20401(var3), method_20401(!var3)};
   }

   private static float method_20401(boolean var0) {
      float var3 = !var0 ? 0.43F : 0.63F;
      return 1.0F / (field_12172.nextFloat() * 0.5F + 1.8F) + var3;
   }

   private static void method_20407(World var0, class_5834 var1, ItemStack var2) {
      if (var1 instanceof class_9359) {
         class_9359 var5 = (class_9359)var1;
         if (!var0.field_33055) {
            class_8807.field_45069.method_18394(var5, var2);
         }

         var5.method_3211(class_6234.field_31907.method_43790(var2.method_27960()));
      }

      method_20399(var2);
   }

   @Override
   public void method_11228(World var1, class_5834 var2, ItemStack var3, int var4) {
      if (!var1.field_33055) {
         int var7 = class_2931.method_13423(class_3668.field_17846, var3);
         class_8461 var8 = this.method_20405(var7);
         class_8461 var9 = var7 != 0 ? null : class_463.field_1943;
         float var10 = (float)(var3.method_28004() - var4) / (float)method_20403(var3);
         if (var10 < 0.2F) {
            this.field_21489 = false;
            this.field_21488 = false;
         }

         if (var10 >= 0.2F && !this.field_21489) {
            this.field_21489 = true;
            var1.method_29528((class_704)null, var2.method_37302(), var2.method_37309(), var2.method_37156(), var8, class_562.field_3335, 0.5F, 1.0F);
         }

         if (var10 >= 0.5F && var9 != null && !this.field_21488) {
            this.field_21488 = true;
            var1.method_29528((class_704)null, var2.method_37302(), var2.method_37309(), var2.method_37156(), var9, class_562.field_3335, 0.5F, 1.0F);
         }
      }
   }

   @Override
   public int method_11230(ItemStack var1) {
      return method_20403(var1) + 3;
   }

   public static int method_20403(ItemStack var0) {
      int var3 = class_2931.method_13423(class_3668.field_17846, var0);
      return var3 != 0 ? 25 - 5 * var3 : 25;
   }

   @Override
   public class_6209 method_11233(ItemStack var1) {
      return class_6209.field_31735;
   }

   private class_8461 method_20405(int var1) {
      switch (var1) {
         case 1:
            return class_463.field_1951;
         case 2:
            return class_463.field_2598;
         case 3:
            return class_463.field_2259;
         default:
            return class_463.field_2429;
      }
   }

   private static float method_20406(int var0, ItemStack var1) {
      float var4 = (float)var0 / (float)method_20403(var1);
      if (var4 > 1.0F) {
         var4 = 1.0F;
      }

      return var4;
   }

   @Override
   public void method_11218(ItemStack var1, World var2, List<ITextComponent> var3, class_4605 var4) {
      List var7 = method_20411(var1);
      if (method_20408(var1) && !var7.isEmpty()) {
         ItemStack var8 = (ItemStack)var7.get(0);
         var3.add(new TranslationTextComponent("item.minecraft.crossbow.projectile").appendString(" ").append(var8.method_28001()));
         if (var4.method_21347() && var8.method_27960() == class_4897.field_24479) {
            ArrayList var9 = Lists.newArrayList();
            class_4897.field_24479.method_11218(var8, var2, var9, var4);
            if (!var9.isEmpty()) {
               for (int var10 = 0; var10 < var9.size(); var10++) {
                  var9.set(var10, new StringTextComponent("  ").append((ITextComponent)var9.get(var10)).mergeStyle(TextFormatting.GRAY));
               }

               var3.addAll(var9);
            }
         }
      }
   }

   private static float method_20404(ItemStack var0) {
      return var0.method_27960() == class_4897.field_25030 && method_20413(var0, class_4897.field_24479) ? 1.6F : 3.15F;
   }

   @Override
   public int method_2654() {
      return 8;
   }
}
