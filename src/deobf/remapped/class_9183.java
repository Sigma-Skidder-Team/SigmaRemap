package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;

public class class_9183 extends class_7651 {
   private final class_7675 field_46989;

   public class_9183(class_7039 var1, class_7675 var2) {
      super(var1, null);
      this.field_46988 = var1;
      this.field_46989 = var2;
   }

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.method_42326(this.field_46989, var1, var4, var3, var7, var8);
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (this.field_46989.field_39004 != class_6804.field_35065) {
         class_7039.method_32285(this.field_46988, this.field_46989.field_39016);
      } else {
         class_7039.method_32285(this.field_46988, -1L);
         class_7039.method_32271(this.field_46988).method_8609(new class_2341(this.field_46989, this.field_46988));
      }

      return true;
   }

   private void method_42326(class_7675 var1, class_7966 var2, int var3, int var4, int var5, int var6) {
      this.method_42325(var1, var2, var3 + 36, var4, var5, var6);
   }

   private void method_42325(class_7675 var1, class_7966 var2, int var3, int var4, int var5, int var6) {
      if (var1.field_39004 != class_6804.field_35065) {
         short var9 = 225;
         byte var10 = 2;
         if (!var1.field_39020) {
            if (var1.field_39004 != class_6804.field_35064) {
               if (class_7039.method_32303(this.field_46988, var1) && var1.field_39008 < 7) {
                  class_7039.method_32328(this.field_46988, var2, var3 + 225 - 14, var4 + 2, var5, var6, var1.field_39008);
               } else if (var1.field_39004 == class_6804.field_35061) {
                  class_7039.method_32229(this.field_46988, var2, var3 + 225 - 14, var4 + 2, var5, var6);
               }
            } else {
               class_7039.method_32247(this.field_46988, var2, var3 + 225 - 14, var4 + 2, var5, var6);
            }
         } else {
            class_7039.method_32348(this.field_46988, var2, var3 + 225 - 14, var4 + 2, var5, var6);
         }

         if (!class_7039.method_32303(this.field_46988, var1) && !class_7039.method_32307()) {
            class_7039.method_32313(this.field_46988, var2, var3 + 225, var4 + 2, var5, var6);
         } else {
            class_7039.method_32231(this.field_46988, var2, var3 + 225, var4 + 2, var5, var6);
         }

         if (!"0".equals(var1.field_39002.field_23123)) {
            String var11 = TextFormatting.GRAY + "" + var1.field_39002.field_23123;
            class_7039.method_32242(this.field_46988)
               .method_45385(var2, var11, (float)(var3 + 207 - class_7039.method_32316(this.field_46988).method_45395(var11)), (float)(var4 + 3), 8421504);
            if (var5 >= var3 + 207 - class_7039.method_32335(this.field_46988).method_45395(var11)
               && var5 <= var3 + 207
               && var6 >= var4 + 1
               && var6 <= var4 + 10
               && var6 < this.field_46988.field_940 - 40
               && var6 > 32
               && !this.field_46988.method_32211()) {
               class_7039.method_32325(this.field_46988, new ITextComponent[]{new StringTextComponent(var1.field_39002.field_23125)});
            }
         }

         if (class_7039.method_32303(this.field_46988, var1) && var1.field_39020) {
            class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
            class_3542.method_16488();
            class_7039.method_32344(this.field_46988).method_8577().method_35674(class_7039.method_32225());
            class_3542.method_16398(class_5033.field_26042, class_8535.field_43697);
            ITextComponent var23;
            ITextComponent var24;
            if (!var1.field_39005) {
               var23 = class_7039.method_32250();
               var24 = class_7039.method_32345();
            } else {
               var23 = class_7039.method_32342();
               var24 = class_7039.method_32243();
            }

            int var13 = class_7039.method_32286(this.field_46988).method_45379(var24) + 17;
            byte var14 = 16;
            int var15 = var3 + class_7039.method_32276(this.field_46988).method_45379(var23) + 8;
            int var16 = var4 + 13;
            boolean var17 = false;
            if (var5 >= var15
               && var5 < var15 + var13
               && var6 > var16
               && var6 <= var16 + 16 & var6 < this.field_46988.field_940 - 40
               && var6 > 32
               && !this.field_46988.method_32211()) {
               var17 = true;
               class_7039.method_32236(this.field_46988, class_270.field_971);
            }

            int var18 = !var17 ? 1 : 2;
            class_2089.method_9778(var2, var15, var16, 0.0F, (float)(46 + var18 * 20), var13 / 2, 8, 256, 256);
            class_2089.method_9778(var2, var15 + var13 / 2, var16, (float)(200 - var13 / 2), (float)(46 + var18 * 20), var13 / 2, 8, 256, 256);
            class_2089.method_9778(var2, var15, var16 + 8, 0.0F, (float)(46 + var18 * 20 + 12), var13 / 2, 8, 256, 256);
            class_2089.method_9778(var2, var15 + var13 / 2, var16 + 8, (float)(200 - var13 / 2), (float)(46 + var18 * 20 + 12), var13 / 2, 8, 256, 256);
            class_3542.method_16448();
            int var19 = var4 + 11 + 5;
            int var20 = !var17 ? 16777215 : 16777120;
            class_7039.method_32239(this.field_46988).method_45378(var2, var23, (float)(var3 + 2), (float)(var19 + 1), 15553363);
            class_2089.method_9788(var2, class_7039.method_32324(this.field_46988), var24, var15 + var13 / 2, var19 + 1, var20);
         } else {
            if (var1.field_39015 != class_8840.field_45209) {
               class_7039.method_32300(this.field_46988).method_45385(var2, var1.method_34769(), (float)(var3 + 2), (float)(var4 + 12), 7105644);
            } else {
               int var12 = class_7039.method_32217(this.field_46988).method_45379(class_7039.method_32208());
               class_7039.method_32304(this.field_46988).method_45378(var2, class_7039.method_32208(), (float)(var3 + 2), (float)(var4 + 12), 13413468);
               class_7039.method_32237(this.field_46988).method_45385(var2, var1.method_34783(), (float)(var3 + 2 + var12), (float)(var4 + 12), 7105644);
            }

            if (!class_7039.method_32303(this.field_46988, var1)) {
               class_7039.method_32245(this.field_46988).method_45385(var2, var1.field_39006, (float)(var3 + 2), (float)(var4 + 12 + 11), 5000268);
            }
         }

         class_7039.method_32306(this.field_46988).method_45385(var2, var1.method_34772(), (float)(var3 + 2), (float)(var4 + 1), 16777215);
         class_3570.method_16603(var1.field_39014, () -> {
            class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
            class_2089.method_9780(var2, var3 - 36, var4, 32, 32, 8.0F, 8.0F, 8, 8, 64, 64);
            class_2089.method_9780(var2, var3 - 36, var4, 32, 32, 40.0F, 8.0F, 8, 8, 64, 64);
         });
      } else {
         class_7039.method_32287(this.field_46988).method_8577().method_35674(class_7039.method_32246());
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         class_3542.method_16374();
         class_2089.method_9778(var2, var3 + 10, var4 + 6, 0.0F, 0.0F, 40, 20, 40, 20);
         float var21 = 0.5F + (1.0F + class_9299.method_42818((float)class_7039.method_32235(this.field_46988) * 0.25F)) * 0.25F;
         int var22 = 0xFF000000 | (int)(127.0F * var21) << 16 | (int)(255.0F * var21) << 8 | (int)(127.0F * var21);
         class_2089.method_9788(var2, class_7039.method_32228(this.field_46988), class_7039.method_32341(), var3 + 10 + 40 + 75, var4 + 12, var22);
      }
   }
}
