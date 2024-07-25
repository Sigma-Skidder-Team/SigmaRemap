package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_5962 implements AutoCloseable {
   private final class_2134 field_30380;
   private final class_7884 field_30379;
   private final RenderLayer field_30377;

   private class_5962(class_8451 var1, class_2134 var2) {
      this.field_30378 = var1;
      this.field_30380 = var2;
      this.field_30379 = new class_7884(128, 128, true);
      Identifier var5 = class_8451.method_38864(var1).method_35684("map/" + var2.method_32926(), this.field_30379);
      this.field_30377 = RenderLayer.method_16732(var5);
   }

   private void method_27238() {
      for (int var3 = 0; var3 < 128; var3++) {
         for (int var4 = 0; var4 < 128; var4++) {
            int var5 = var4 + var3 * 128;
            int var6 = this.field_30380.field_10691[var5] & 255;
            if (var6 / 4 != 0) {
               this.field_30379.method_35651().method_26242(var4, var3, class_1513.field_8024[var6 / 4].method_6926(var6 & 3));
            } else {
               this.field_30379.method_35651().method_26242(var4, var3, 0);
            }
         }
      }

      this.field_30379.method_35650();
   }

   private void method_27233(class_7966 var1, class_2565 var2, boolean var3, int var4) {
      boolean var7 = false;
      boolean var8 = false;
      float var9 = 0.0F;
      class_8107 var10 = var1.method_36058().method_28620();
      class_7907 var11 = var2.method_11645(this.field_30377);
      var11.method_35762(var10, 0.0F, 128.0F, -0.01F).method_35743(255, 255, 255, 255).method_35745(0.0F, 1.0F).method_35747(var4).method_35735();
      var11.method_35762(var10, 128.0F, 128.0F, -0.01F).method_35743(255, 255, 255, 255).method_35745(1.0F, 1.0F).method_35747(var4).method_35735();
      var11.method_35762(var10, 128.0F, 0.0F, -0.01F).method_35743(255, 255, 255, 255).method_35745(1.0F, 0.0F).method_35747(var4).method_35735();
      var11.method_35762(var10, 0.0F, 0.0F, -0.01F).method_35743(255, 255, 255, 255).method_35745(0.0F, 0.0F).method_35747(var4).method_35735();
      int var12 = 0;

      for (class_3245 var14 : this.field_30380.field_10683.values()) {
         if (!var3 || var14.method_14851()) {
            var1.method_36063();
            var1.method_36065((double)(0.0F + (float)var14.method_14846() / 2.0F + 64.0F), (double)(0.0F + (float)var14.method_14850() / 2.0F + 64.0F), -0.02F);
            var1.method_36060(class_2426.field_12076.method_11074((float)(var14.method_14844() * 360) / 16.0F));
            var1.method_36062(4.0F, 4.0F, 3.0F);
            var1.method_36065(-0.125, 0.125, 0.0);
            byte var15 = var14.method_14845();
            float var16 = (float)(var15 % 16 + 0) / 16.0F;
            float var17 = (float)(var15 / 16 + 0) / 16.0F;
            float var18 = (float)(var15 % 16 + 1) / 16.0F;
            float var19 = (float)(var15 / 16 + 1) / 16.0F;
            class_8107 var20 = var1.method_36058().method_28620();
            float var21 = -0.001F;
            class_7907 var22 = var2.method_11645(class_8451.method_38863());
            var22.method_35762(var20, -1.0F, 1.0F, (float)var12 * -0.001F)
               .method_35743(255, 255, 255, 255)
               .method_35745(var16, var17)
               .method_35747(var4)
               .method_35735();
            var22.method_35762(var20, 1.0F, 1.0F, (float)var12 * -0.001F)
               .method_35743(255, 255, 255, 255)
               .method_35745(var18, var17)
               .method_35747(var4)
               .method_35735();
            var22.method_35762(var20, 1.0F, -1.0F, (float)var12 * -0.001F)
               .method_35743(255, 255, 255, 255)
               .method_35745(var18, var19)
               .method_35747(var4)
               .method_35735();
            var22.method_35762(var20, -1.0F, -1.0F, (float)var12 * -0.001F)
               .method_35743(255, 255, 255, 255)
               .method_35745(var16, var19)
               .method_35747(var4)
               .method_35735();
            var1.method_36064();
            if (var14.method_14847() != null) {
               TextRenderer var23 = MinecraftClient.getInstance().textRenderer;
               ITextComponent var24 = var14.method_14847();
               float var25 = (float)var23.method_45379(var24);
               float var26 = MathHelper.clamp(25.0F / var25, 0.0F, 0.6666667F);
               var1.method_36063();
               var1.method_36065(
                  (double)(0.0F + (float)var14.method_14846() / 2.0F + 64.0F - var25 * var26 / 2.0F),
                  (double)(0.0F + (float)var14.method_14850() / 2.0F + 64.0F + 4.0F),
                  -0.025F
               );
               var1.method_36062(var26, var26, 1.0F);
               var1.method_36065(0.0, 0.0, -0.1F);
               var23.method_45405(var24, 0.0F, 0.0F, -1, false, var1.method_36058().method_28620(), var2, false, Integer.MIN_VALUE, var4);
               var1.method_36064();
            }

            var12++;
         }
      }
   }

   @Override
   public void close() {
      this.field_30379.close();
   }
}
