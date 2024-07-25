package remapped;

import com.google.common.collect.Sets;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class class_8765 implements class_6491 {
   public static final class_4639 field_44880 = new class_4639("textures/misc/enchanted_item_glint.png");
   private static final Set<class_2451> field_44879 = Sets.newHashSet(new class_2451[]{class_4897.field_25302});
   public float field_44875;
   private final class_4480 field_44876;
   private final class_7889 field_44873;
   private final class_6662 field_44872;
   public class_7458 field_44874 = null;
   private static boolean field_44877 = false;

   public class_8765(class_7889 var1, class_7458 var2, class_6662 var3) {
      this.field_44873 = var1;
      this.field_44874 = var2;
      if (!class_7860.field_40017.method_22501()) {
         this.field_44876 = new class_4480(var2);
      } else {
         this.field_44876 = (class_4480)class_7860.method_35574(class_7860.field_40017, this.field_44874);
      }

      for (class_2451 var7 : class_8669.field_44382) {
         if (!field_44879.contains(var7)) {
            this.field_44876.method_20804(var7, new class_454(class_8669.field_44382.method_39797(var7), "inventory"));
         }
      }

      this.field_44872 = var3;
   }

   public class_4480 method_40267() {
      return this.field_44876;
   }

   public void method_40279(class_7373 var1, class_6098 var2, int var3, int var4, class_7966 var5, class_7907 var6) {
      boolean var9 = class_3111.method_14295().method_38524();
      boolean var10 = class_3111.method_14405() && var9;
      if (var10) {
         var6.method_35736(class_6727.field_34745);
      }

      Random var11 = new Random();
      long var12 = 42L;

      for (class_240 var17 : class_240.field_803) {
         var11.setSeed(42L);
         this.method_40271(var5, var6, var1.method_33580((class_2522)null, var17, var11), var2, var3, var4);
      }

      var11.setSeed(42L);
      this.method_40271(var5, var6, var1.method_33580((class_2522)null, (class_240)null, var11), var2, var3, var4);
      if (var10) {
         var6.method_35736((class_3581)null);
         class_1920.method_8797();
      }
   }

   public void method_40270(class_6098 var1, class_5612 var2, boolean var3, class_7966 var4, class_2565 var5, int var6, int var7, class_7373 var8) {
      if (!var1.method_28022()) {
         var4.method_36063();
         boolean var11 = var2 == class_5612.field_28489 || var2 == class_5612.field_28496 || var2 == class_5612.field_28495;
         if (var1.method_27960() == class_4897.field_25086 && var11) {
            var8 = this.field_44876.method_20803().method_33943(new class_454("minecraft:trident#inventory"));
         }

         if (!class_7860.field_39856.method_3596()) {
            var8.method_33586().method_34982(var2).method_4082(var3, var4);
         } else {
            var8 = (class_7373)class_7860.field_39856.method_3582(var4, var8, var2, var3);
         }

         var4.method_36065(-0.5, -0.5, -0.5);
         if (!var8.method_33582() && (var1.method_27960() != class_4897.field_25086 || var11)) {
            boolean var16;
            if (var2 != class_5612.field_28489 && !var2.method_25468() && var1.method_27960() instanceof class_6201) {
               class_6414 var13 = ((class_6201)var1.method_27960()).method_28392();
               var16 = !(var13 instanceof class_3333) && !(var13 instanceof class_5402);
            } else {
               var16 = true;
            }

            if (var8.method_16967()) {
               class_7860.field_39839.method_3582(this, var8, var1, var4, var5, var6, var7, var16);
            } else {
               class_3581 var17 = class_6416.method_29332(var1, var16);
               class_7907 var14;
               if (var1.method_27960() == class_4897.field_24830 && var1.method_27977()) {
                  var4.method_36063();
                  class_6279 var15 = var4.method_36058();
                  if (var2 != class_5612.field_28489) {
                     if (var2.method_25468()) {
                        var15.method_28620().method_36830(0.75F);
                     }
                  } else {
                     var15.method_28620().method_36830(0.5F);
                  }

                  if (!var16) {
                     var14 = method_40272(var5, var17, var15);
                  } else {
                     var14 = method_40277(var5, var17, var15);
                  }

                  var4.method_36064();
               } else if (!var16) {
                  var14 = method_40280(var5, var17, true, var1.method_27977());
               } else {
                  var14 = method_40275(var5, var17, true, var1.method_27977());
               }

               if (class_3111.method_14390()) {
                  var8 = class_3290.method_15078(var1, var8, class_602.field_3456, false);
                  class_602.field_3456 = null;
               }

               if (class_5052.method_23281()) {
                  class_5052.method_23286();
               }

               this.method_40279(var8, var1, var6, var7, var4, var14);
               if (class_5052.method_23281()) {
                  if (class_5052.method_23269()) {
                     class_5052.method_23282();
                     var14 = method_40280(var5, var17, true, false);
                     this.method_40279(var8, var1, class_5778.field_29187, var7, var4, var14);
                     class_5052.method_23278();
                  }

                  class_5052.method_23275();
               }
            }
         } else if (!class_7860.field_39949.method_3596()) {
            class_9762.field_49579.method_45049(var1, var2, var4, var5, var6, var7);
         } else {
            class_9762 var12 = (class_9762)class_7860.method_35555(var1.method_27960(), class_7860.field_39949);
            var12.method_45049(var1, var2, var4, var5, var6, var7);
         }

         var4.method_36064();
      }
   }

   public static class_7907 method_40282(class_2565 var0, class_3581 var1, boolean var2, boolean var3) {
      if (class_6588.field_33945) {
         var3 = false;
      }

      if (class_5052.method_23276()) {
         var3 = false;
      }

      return !var3
         ? var0.method_11645(var1)
         : class_2764.method_12575(var0.method_11645(!var2 ? class_3581.method_16711() : class_3581.method_16707()), var0.method_11645(var1));
   }

   public static class_7907 method_40272(class_2565 var0, class_3581 var1, class_6279 var2) {
      return class_2764.method_12575(
         new class_3764(var0.method_11645(class_3581.method_16716()), var2.method_28620(), var2.method_28618()), var0.method_11645(var1)
      );
   }

   public static class_7907 method_40277(class_2565 var0, class_3581 var1, class_6279 var2) {
      return class_2764.method_12575(
         new class_3764(var0.method_11645(class_3581.method_16715()), var2.method_28620(), var2.method_28618()), var0.method_11645(var1)
      );
   }

   public static class_7907 method_40280(class_2565 var0, class_3581 var1, boolean var2, boolean var3) {
      if (class_6588.field_33945) {
         var3 = false;
      }

      if (class_5052.method_23276()) {
         var3 = false;
      }

      if (!var3) {
         return var0.method_11645(var1);
      } else {
         return MinecraftClient.method_8497() && var1 == class_5276.method_24076()
            ? class_2764.method_12575(var0.method_11645(class_3581.method_16739()), var0.method_11645(var1))
            : class_2764.method_12575(var0.method_11645(!var2 ? class_3581.method_16757() : class_3581.method_16716()), var0.method_11645(var1));
      }
   }

   public static class_7907 method_40275(class_2565 var0, class_3581 var1, boolean var2, boolean var3) {
      if (class_6588.field_33945) {
         var3 = false;
      }

      if (class_5052.method_23276()) {
         var3 = false;
      }

      return !var3
         ? var0.method_11645(var1)
         : class_2764.method_12575(var0.method_11645(!var2 ? class_3581.method_16763() : class_3581.method_16715()), var0.method_11645(var1));
   }

   private void method_40271(class_7966 var1, class_7907 var2, List<class_5024> var3, class_6098 var4, int var5, int var6) {
      boolean var9 = !var4.method_28022();
      class_6279 var10 = var1.method_36058();
      boolean var11 = class_5052.method_23281();
      int var12 = var3.size();

      for (int var13 = 0; var13 < var12; var13++) {
         class_5024 var14 = (class_5024)var3.get(var13);
         if (var11) {
            var14 = class_5052.method_23266(var14);
            if (var14 == null) {
               continue;
            }
         }

         int var15 = -1;
         if (var9 && var14.method_23149()) {
            var15 = this.field_44872.method_30590(var4, var14.method_23160());
         }

         float var16 = (float)(var15 >> 16 & 0xFF) / 255.0F;
         float var17 = (float)(var15 >> 8 & 0xFF) / 255.0F;
         float var18 = (float)(var15 & 0xFF) / 255.0F;
         if (!class_7860.field_40161.method_45472()) {
            var2.method_35757(var10, var14, var16, var17, var18, var5, var6);
         } else {
            var2.method_1248(var10, var14, var16, var17, var18, var5, var6, true);
         }
      }
   }

   public class_7373 method_40278(class_6098 var1, class_6486 var2, class_5834 var3) {
      class_2451 var6 = var1.method_27960();
      class_7373 var7;
      if (var6 != class_4897.field_25086) {
         var7 = this.field_44876.method_20806(var1);
      } else {
         var7 = this.field_44876.method_20803().method_33943(new class_454("minecraft:trident_in_hand#inventory"));
      }

      class_174 var8 = !(var2 instanceof class_174) ? null : (class_174)var2;
      class_602.field_3456 = null;
      class_7373 var9 = var7.method_33584().method_2816(var7, var1, var8, var3);
      if (class_3111.method_14390()) {
         var9 = class_3290.method_15078(var1, var9, class_602.field_3456, true);
      }

      return var9 != null ? var9 : this.field_44876.method_20803().method_33942();
   }

   public void method_40269(class_6098 var1, class_5612 var2, int var3, int var4, class_7966 var5, class_2565 var6) {
      this.method_40268((class_5834)null, var1, var2, false, var5, var6, (class_6486)null, var3, var4);
   }

   public void method_40268(
      class_5834 var1, class_6098 var2, class_5612 var3, boolean var4, class_7966 var5, class_2565 var6, class_6486 var7, int var8, int var9
   ) {
      if (!var2.method_28022()) {
         class_7373 var12 = this.method_40278(var2, var7, var1);
         this.method_40270(var2, var3, var4, var5, var6, var8, var9, var12);
      }
   }

   public void method_40264(class_6098 var1, int var2, int var3) {
      this.method_40266(var1, var2, var3, this.method_40278(var1, (class_6486)null, (class_5834)null));
   }

   public void method_40266(class_6098 var1, int var2, int var3, class_7373 var4) {
      field_44877 = true;
      class_3542.method_16438();
      this.field_44873.method_35674(class_8359.field_42824);
      this.field_44873.method_35679(class_8359.field_42824).method_37049(false, false);
      class_3542.method_16381();
      class_3542.method_16374();
      class_3542.method_16433();
      class_3542.method_16488();
      class_3542.method_16398(class_5033.field_26042, class_8535.field_43697);
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      class_3542.method_16413((float)var2, (float)var3, 100.0F + this.field_44875);
      class_3542.method_16413(8.0F, 8.0F, 0.0F);
      class_3542.method_16403(1.0F, -1.0F, 1.0F);
      class_3542.method_16403(16.0F, 16.0F, 16.0F);
      class_7966 var7 = new class_7966();
      class_3758 var8 = MinecraftClient.getInstance().method_8589().method_13796();
      boolean var9 = !var4.method_33585();
      if (var9) {
         class_2083.method_9716();
      }

      this.method_40270(var1, class_5612.field_28489, false, var7, var8, 15728880, class_5367.field_27381, var4);
      var8.method_17415();
      class_3542.method_16428();
      if (var9) {
         class_2083.method_9717();
      }

      class_3542.method_16458();
      class_3542.method_16443();
      class_3542.method_16489();
      field_44877 = false;
   }

   public void method_40274(class_6098 var1, int var2, int var3) {
      this.method_40263(MinecraftClient.getInstance().field_9632, var1, var2, var3);
   }

   public void method_40284(class_6098 var1, int var2, int var3) {
      this.method_40263((class_5834)null, var1, var2, var3);
   }

   public void method_40273(class_5834 var1, class_6098 var2, int var3, int var4) {
      this.method_40263(var1, var2, var3, var4);
   }

   private void method_40263(class_5834 var1, class_6098 var2, int var3, int var4) {
      if (!var2.method_28022()) {
         this.field_44875 += 50.0F;

         try {
            this.method_40266(var2, var3, var4, this.method_40278(var2, (class_6486)null, var1));
         } catch (Throwable var10) {
            class_159 var8 = class_159.method_643(var10, "Rendering item");
            class_6544 var9 = var8.method_639("Item being rendered");
            var9.method_29851("Item Type", () -> String.valueOf(var2.method_27960()));
            var9.method_29851("Registry Name", () -> String.valueOf(class_7860.method_35555(var2.method_27960(), class_7860.field_40006)));
            var9.method_29851("Item Damage", () -> String.valueOf(var2.method_28026()));
            var9.method_29851("Item NBT", () -> String.valueOf(var2.method_27990()));
            var9.method_29851("Item Foil", () -> String.valueOf(var2.method_27977()));
            throw new class_3297(var8);
         }

         this.field_44875 -= 50.0F;
      }
   }

   public void method_40281(class_9854 var1, class_6098 var2, int var3, int var4) {
      this.method_40265(var1, var2, var3, var4, (String)null);
   }

   public void method_40265(class_9854 var1, class_6098 var2, int var3, int var4, String var5) {
      if (!var2.method_28022()) {
         class_7966 var8 = new class_7966();
         if (var2.method_27997() != 1 || var5 != null) {
            String var9 = var5 != null ? var5 : String.valueOf(var2.method_27997());
            var8.method_36065(0.0, 0.0, (double)(this.field_44875 + 200.0F));
            class_3758 var10 = class_2565.method_11648(class_8042.method_36499().method_36501());
            var1.method_45411(
               var9,
               (float)(var3 + 19 - 2 - var1.method_45395(var9)),
               (float)(var4 + 6 + 3),
               16777215,
               true,
               var8.method_36058().method_28620(),
               var10,
               false,
               0,
               15728880
            );
            var10.method_17415();
         }

         if (class_8835.method_40635(var2)) {
            class_3542.method_16491();
            class_3542.method_16354();
            class_3542.method_16458();
            class_3542.method_16448();
            class_8042 var19 = class_8042.method_36499();
            class_9633 var21 = var19.method_36501();
            float var11 = (float)var2.method_28026();
            float var12 = (float)var2.method_27957();
            float var13 = Math.max(0.0F, (var12 - var11) / var12);
            int var14 = Math.round(13.0F - var11 * 13.0F / var12);
            int var15 = class_9299.method_42792(var13 / 3.0F, 1.0F, 1.0F);
            if (class_7860.field_39914.method_3596() && class_7860.field_39876.method_3596()) {
               double var16 = class_7860.method_35578(var2.method_27960(), class_7860.field_39914, var2);
               int var18 = class_7860.method_35569(var2.method_27960(), class_7860.field_39876, var2);
               var14 = Math.round(13.0F - (float)var16 * 13.0F);
               var15 = var18;
            }

            if (class_3111.method_14438()) {
               var15 = class_9300.method_42861(var13, var15);
            }

            this.method_40276(var21, var3 + 2, var4 + 13, 13, 2, 0, 0, 0, 255);
            this.method_40276(var21, var3 + 2, var4 + 13, var14, 1, var15 >> 16 & 0xFF, var15 >> 8 & 0xFF, var15 & 0xFF, 255);
            class_3542.method_16488();
            class_3542.method_16374();
            class_3542.method_16432();
            class_3542.method_16428();
         }

         class_5989 var20 = MinecraftClient.getInstance().field_9632;
         float var22 = var20 != null ? var20.method_3173().method_32960(var2.method_27960(), MinecraftClient.getInstance().method_8554()) : 0.0F;
         if (var22 > 0.0F) {
            class_3542.method_16491();
            class_3542.method_16354();
            class_3542.method_16488();
            class_3542.method_16437();
            class_8042 var23 = class_8042.method_36499();
            class_9633 var24 = var23.method_36501();
            this.method_40276(
               var24, var3, var4 + class_9299.method_42848(16.0F * (1.0F - var22)), 16, class_9299.method_42816(16.0F * var22), 255, 255, 255, 127
            );
            class_3542.method_16432();
            class_3542.method_16428();
         }
      }
   }

   private void method_40276(class_9633 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var1.method_44471(7, class_7985.field_40903);
      var1.method_35761((double)(var2 + 0), (double)(var3 + 0), 0.0).method_35743(var6, var7, var8, var9).method_35735();
      var1.method_35761((double)(var2 + 0), (double)(var3 + var5), 0.0).method_35743(var6, var7, var8, var9).method_35735();
      var1.method_35761((double)(var2 + var4), (double)(var3 + var5), 0.0).method_35743(var6, var7, var8, var9).method_35735();
      var1.method_35761((double)(var2 + var4), (double)(var3 + 0), 0.0).method_35743(var6, var7, var8, var9).method_35735();
      class_8042.method_36499().method_36500();
   }

   @Override
   public void method_29609(class_7832 var1) {
      this.field_44876.method_20801();
   }

   public class_2645 method_40262() {
      return class_2310.field_11561;
   }
}
