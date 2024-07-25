package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class class_6670 extends class_6353<class_9716, class_3169<class_9716>> {
   public class_6670(EntityRenderDispatcher var1) {
      this(var1, false);
   }

   public class_6670(EntityRenderDispatcher var1, boolean var2) {
      super(var1, new class_3169<class_9716>(0.0F, var2), 0.5F);
      this.method_29100(new class_3035(this, new class_2344(0.5F), new class_2344(1.0F)));
      this.method_29100(new class_6329<class_9716, class_3169<class_9716>>(this));
      this.method_29100(new class_6829<class_9716, class_3169<class_9716>>(this));
      this.method_29100(new class_5985(this));
      this.method_29100(new class_9284(this));
      this.method_29100(new class_8386<class_9716, class_3169<class_9716>>(this));
      this.method_29100(new class_8062<class_9716, class_3169<class_9716>>(this));
      this.method_29100(new class_9871<class_9716>(this));
      this.method_29100(new class_2401<class_9716>(this));
      this.method_29100(new class_3787<class_9716, class_3169<class_9716>>(this));
   }

   public void method_30609(class_9716 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      this.method_30611(var1);
      super.method_29107(var1, var2, var3, var4, var5, var6);
   }

   public class_1343 method_30612(class_9716 var1, float var2) {
      return !var1.method_37382() ? super.method_32555(var1, var2) : new class_1343(0.0, -0.125, 0.0);
   }

   private void method_30611(class_9716 var1) {
      class_3169 var4 = this.method_11447();
      if (!var1.method_37221()) {
         var4.method_10741(true);
         var4.field_11695.field_8200 = var1.method_3168(class_7742.field_39259);
         var4.field_15846.field_8200 = var1.method_3168(class_7742.field_39258);
         var4.field_15849.field_8200 = var1.method_3168(class_7742.field_39266);
         var4.field_15853.field_8200 = var1.method_3168(class_7742.field_39255);
         var4.field_15851.field_8200 = var1.method_3168(class_7742.field_39264);
         var4.field_15855.field_8200 = var1.method_3168(class_7742.field_39256);
         var4.field_11697 = var1.method_37382();
         class_5455 var5 = method_30605(var1, class_2584.field_12791);
         class_5455 var6 = method_30605(var1, class_2584.field_12794);
         if (var5.method_24844()) {
            var6 = !var1.method_26568().method_28022() ? class_5455.field_27802 : class_5455.field_27806;
         }

         if (var1.method_26432() != class_1736.field_8943) {
            var4.field_11698 = var6;
            var4.field_11702 = var5;
         } else {
            var4.field_11698 = var5;
            var4.field_11702 = var6;
         }
      } else {
         var4.method_10741(false);
         var4.field_11696.field_8200 = true;
         var4.field_11695.field_8200 = true;
      }
   }

   private static class_5455 method_30605(class_9716 var0, class_2584 var1) {
      ItemStack var4 = var0.method_26617(var1);
      if (var4.method_28022()) {
         return class_5455.field_27806;
      } else {
         if (var0.method_26500() == var1 && var0.method_26466() > 0) {
            class_6209 var5 = var4.method_27952();
            if (var5 == class_6209.field_31740) {
               return class_5455.field_27801;
            }

            if (var5 == class_6209.field_31738) {
               return class_5455.field_27803;
            }

            if (var5 == class_6209.field_31736) {
               return class_5455.field_27807;
            }

            if (var5 == class_6209.field_31735 && var1 == var0.method_26500()) {
               return class_5455.field_27799;
            }
         } else if (!var0.field_29599 && var4.method_27960() == class_4897.field_25030 && class_4380.method_20408(var4)) {
            return class_5455.field_27804;
         }

         return class_5455.field_27802;
      }
   }

   public Identifier method_30607(class_9716 var1) {
      return var1.method_44889();
   }

   public void method_30613(class_9716 var1, class_7966 var2, float var3) {
      float var6 = 0.9375F;
      var2.method_36062(0.9375F, 0.9375F, 0.9375F);
   }

   public void method_30603(class_9716 var1, ITextComponent var2, class_7966 var3, class_2565 var4, int var5) {
      double var8 = this.field_36493.method_28129(var1);
      var3.method_36063();
      if (var8 < 100.0) {
         class_1097 var10 = var1.method_3219();
         class_4399 var11 = var10.method_4833(2);
         if (var11 != null) {
            class_8274 var12 = var10.method_4855(var1.method_37206(), var11);
            super.method_32545(
               var1, new StringTextComponent(Integer.toString(var12.method_38146())).appendString(" ").append(var11.method_20488()), var3, var4, var5
            );
            var3.method_36065(0.0, 0.25875F, 0.0);
         }
      }

      super.method_32545(var1, var2, var3, var4, var5);
      var3.method_36064();
   }

   public void method_30608(class_7966 var1, class_2565 var2, int var3, class_9716 var4) {
      this.method_30606(var1, var2, var3, var4, this.field_32487.field_11705, this.field_32487.field_15855);
   }

   public void method_30610(class_7966 var1, class_2565 var2, int var3, class_9716 var4) {
      this.method_30606(var1, var2, var3, var4, this.field_32487.field_11701, this.field_32487.field_15851);
   }

   private void method_30606(class_7966 var1, class_2565 var2, int var3, class_9716 var4, class_1549 var5, class_1549 var6) {
      class_3169 var9 = this.method_11447();
      this.method_30611(var4);
      var9.field_33202 = 0.0F;
      var9.field_11697 = false;
      var9.field_11699 = 0.0F;
      var9.method_10738(var4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      var5.field_8191 = 0.0F;
      var5.method_7060(var1, var2.method_11645(RenderLayer.method_16734(var4.method_44889())), var3, class_5367.field_27381);
      var6.field_8191 = 0.0F;
      var6.method_7060(var1, var2.method_11645(RenderLayer.method_16705(var4.method_44889())), var3, class_5367.field_27381);
   }

   public void method_30604(class_9716 var1, class_7966 var2, float var3, float var4, float var5) {
      float var8 = var1.method_26602(var5);
      if (!var1.method_26618()) {
         if (!(var8 > 0.0F)) {
            super.method_29099(var1, var2, var3, var4, var5);
         } else {
            super.method_29099(var1, var2, var3, var4, var5);
            float var9 = !var1.method_37285() ? -90.0F : -90.0F - var1.field_41755;
            float var10 = class_9299.method_42795(var8, 0.0F, var9);
            var2.method_36060(class_2426.field_12080.method_11074(var10));
            if (var1.method_37297()) {
               var2.method_36065(0.0, -1.0, 0.3F);
            }
         }
      } else {
         super.method_29099(var1, var2, var3, var4, var5);
         float var21 = (float)var1.method_26422() + var5;
         float var22 = class_9299.method_42828(var21 * var21 / 100.0F, 0.0F, 1.0F);
         if (!var1.method_26600()) {
            var2.method_36060(class_2426.field_12080.method_11074(var22 * (-90.0F - var1.field_41755)));
         }

         class_1343 var11 = var1.method_37307(var5);
         class_1343 var12 = var1.method_37098();
         double var13 = Entity.method_37266(var12);
         double var15 = Entity.method_37266(var11);
         if (var13 > 0.0 && var15 > 0.0) {
            double var17 = (var12.field_7336 * var11.field_7336 + var12.field_7334 * var11.field_7334) / Math.sqrt(var13 * var15);
            double var19 = var12.field_7336 * var11.field_7334 - var12.field_7334 * var11.field_7336;
            var2.method_36060(class_2426.field_12074.method_11062((float)(Math.signum(var19) * Math.acos(var17))));
         }
      }
   }
}
