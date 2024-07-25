package remapped;

import net.minecraft.util.text.ITextComponent;

public abstract class class_7067<T extends class_8145> {
   public final class_6122 field_36493;
   public float field_36492;
   public float field_36494 = 1.0F;
   private class_6629 field_36490 = null;
   private class_4639 field_36491 = null;

   public class_7067(class_6122 var1) {
      this.field_36493 = var1;
   }

   public final int method_32554(T var1, float var2) {
      class_1331 var5 = new class_1331(var1.method_37339(var2));
      return class_5778.method_26127(this.method_32546((T)var1, var5), this.method_32552((T)var1, var5));
   }

   public int method_32552(T var1, class_1331 var2) {
      return var1.field_41768.method_25266(class_2957.field_14437, var2);
   }

   public int method_32546(T var1, class_1331 var2) {
      return !var1.method_37264() ? var1.field_41768.method_25266(class_2957.field_14440, var2) : 15;
   }

   public boolean method_32548(T var1, class_2359 var2, double var3, double var5, double var7) {
      if (var1.method_37185(var3, var5, var7)) {
         if (var1.field_41750) {
            return true;
         } else {
            class_4092 var11 = var1.method_37210().method_18898(0.5);
            if (var11.method_18925() || var11.method_18906() == 0.0) {
               var11 = new class_4092(
                  var1.method_37302() - 2.0,
                  var1.method_37309() - 2.0,
                  var1.method_37156() - 2.0,
                  var1.method_37302() + 2.0,
                  var1.method_37309() + 2.0,
                  var1.method_37156() + 2.0
               );
            }

            return var2.method_10824(var11);
         }
      } else {
         return false;
      }
   }

   public class_1343 method_32555(T var1, float var2) {
      return class_1343.field_7335;
   }

   public void method_32551(T var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      if (class_7860.field_40248.method_22501()) {
         Object var9 = class_7860.method_35574(class_7860.field_40248, var1, var1.method_19839(), this, var4, var5, var6, var3);
         class_7860.method_35567(var9);
         Object var10 = class_7860.method_35555(var9, class_7860.field_40148);
         if (var10 != class_8835.field_45188 && (var10 == class_8835.field_45190 || this.method_32549((T)var1))) {
            ITextComponent var11 = (ITextComponent)class_7860.method_35555(var9, class_7860.field_40074);
            this.method_32545((T)var1, var11, var4, var5, var6);
         }
      } else if (this.method_32549((T)var1)) {
         this.method_32545((T)var1, var1.method_19839(), var4, var5, var6);
      }
   }

   public boolean method_32549(T var1) {
      return var1.method_37141() && var1.method_45507();
   }

   public abstract class_4639 method_11446(T var1);

   public class_9854 method_32553() {
      return this.field_36493.method_28134();
   }

   public void method_32545(T var1, ITextComponent var2, class_7966 var3, class_2565 var4, int var5) {
      double var8 = this.field_36493.method_28129(var1);
      boolean var10 = !(var8 > 4096.0);
      if (class_7860.field_40106.method_3596()) {
         var10 = class_7860.field_40106.method_3592(var1, var8);
      }

      if (var10) {
         boolean var11 = !var1.method_37073();
         float var12 = var1.method_37074() + 0.5F;
         int var13 = !"deadmau5".equals(var2.getString()) ? 0 : -10;
         var3.method_36063();
         var3.method_36065(0.0, (double)var12, 0.0);
         var3.method_36060(this.field_36493.method_28121());
         var3.method_36062(-0.025F, -0.025F, 0.025F);
         class_8107 var14 = var3.method_36058().method_28620();
         float var15 = MinecraftClient.getInstance().field_9577.method_40872(0.25F);
         int var16 = (int)(var15 * 255.0F) << 24;
         class_9854 var17 = this.method_32553();
         float var18 = (float)(-var17.method_45379(var2) / 2);
         var17.method_45405(var2, var18, (float)var13, 553648127, false, var14, var4, var11, var16, var5);
         if (var11) {
            var17.method_45405(var2, var18, (float)var13, -1, false, var14, var4, false, 0, var5);
         }

         var3.method_36064();
      }
   }

   public class_6122 method_32558() {
      return this.field_36493;
   }

   public class_222<class_6629, class_133> method_32557() {
      return this.field_36490 != null ? class_222.<class_6629, class_133>method_939(this.field_36490) : null;
   }

   public void method_32547(class_222<class_6629, class_133> var1) {
      this.field_36490 = (class_6629)var1.method_940().get();
   }

   public class_4639 method_32556() {
      return this.field_36491;
   }

   public void method_32544(class_4639 var1) {
      this.field_36491 = var1;
   }
}
