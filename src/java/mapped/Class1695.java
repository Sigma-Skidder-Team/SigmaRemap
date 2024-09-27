package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;

public class Class1695 implements AutoCloseable {
   private final Class7529 field9231;
   private final DynamicTexture field9232;
   private final RenderType field9233;
   public final Class194 field9234;

   public Class1695(Class194 var1, Class7529 var2) {
      this.field9234 = var1;
      this.field9231 = var2;
      this.field9232 = new DynamicTexture(128, 128, true);
      ResourceLocation var5 = Class194.method598(var1).method1077("map/" + var2.method24608(), this.field9232);
      this.field9233 = RenderType.method14339(var5);
   }

   private void method7290() {
      for (int var3 = 0; var3 < 128; var3++) {
         for (int var4 = 0; var4 < 128; var4++) {
            int var5 = var4 + var3 * 128;
            int var6 = this.field9231.field32322[var5] & 255;
            if (var6 / 4 != 0) {
               this.field9232.method1141().method7890(var4, var3, MaterialColor.field30946[var6 / 4].method22640(var6 & 3));
            } else {
               this.field9232.method1141().method7890(var4, var3, 0);
            }
         }
      }

      this.field9232.method1140();
   }

   private void method7291(MatrixStack var1, Class7733 var2, boolean var3, int var4) {
      boolean var7 = false;
      boolean var8 = false;
      float var9 = 0.0F;
      Matrix4f var10 = var1.getLast().getMatrix();
      Class5422 var11 = var2.method25597(this.field9233);
      var11.pos(var10, 0.0F, 128.0F, -0.01F).color(255, 255, 255, 255).tex(0.0F, 1.0F).method17034(var4).endVertex();
      var11.pos(var10, 128.0F, 128.0F, -0.01F).color(255, 255, 255, 255).tex(1.0F, 1.0F).method17034(var4).endVertex();
      var11.pos(var10, 128.0F, 0.0F, -0.01F).color(255, 255, 255, 255).tex(1.0F, 0.0F).method17034(var4).endVertex();
      var11.pos(var10, 0.0F, 0.0F, -0.01F).color(255, 255, 255, 255).tex(0.0F, 0.0F).method17034(var4).endVertex();
      int var12 = 0;

      for (Class7982 var14 : this.field9231.field32327.values()) {
         if (!var3 || var14.method27130()) {
            var1.push();
            var1.translate((double)(0.0F + (float)var14.method27127() / 2.0F + 64.0F), (double)(0.0F + (float)var14.method27128() / 2.0F + 64.0F), -0.02F);
            var1.rotate(Vector3f.ZP.rotationDegrees((float)(var14.method27129() * 360) / 16.0F));
            var1.method35292(4.0F, 4.0F, 3.0F);
            var1.translate(-0.125, 0.125, 0.0);
            byte var15 = var14.method27125();
            float var16 = (float)(var15 % 16 + 0) / 16.0F;
            float var17 = (float)(var15 / 16 + 0) / 16.0F;
            float var18 = (float)(var15 % 16 + 1) / 16.0F;
            float var19 = (float)(var15 / 16 + 1) / 16.0F;
            Matrix4f var20 = var1.getLast().getMatrix();
            float var21 = -0.001F;
            Class5422 var22 = var2.method25597(Class194.method599());
            var22.pos(var20, -1.0F, 1.0F, (float)var12 * -0.001F)
               .color(255, 255, 255, 255)
               .tex(var16, var17)
               .method17034(var4)
               .endVertex();
            var22.pos(var20, 1.0F, 1.0F, (float)var12 * -0.001F)
               .color(255, 255, 255, 255)
               .tex(var18, var17)
               .method17034(var4)
               .endVertex();
            var22.pos(var20, 1.0F, -1.0F, (float)var12 * -0.001F)
               .color(255, 255, 255, 255)
               .tex(var18, var19)
               .method17034(var4)
               .endVertex();
            var22.pos(var20, -1.0F, -1.0F, (float)var12 * -0.001F)
               .color(255, 255, 255, 255)
               .tex(var16, var19)
               .method17034(var4)
               .endVertex();
            var1.pop();
            if (var14.method27131() != null) {
               FontRenderer var23 = Minecraft.getInstance().fontRenderer;
               ITextComponent var24 = var14.method27131();
               float var25 = (float)var23.method38821(var24);
               float var26 = MathHelper.clamp(25.0F / var25, 0.0F, 0.6666667F);
               var1.push();
               var1.translate(
                  (double)(0.0F + (float)var14.method27127() / 2.0F + 64.0F - var25 * var26 / 2.0F),
                  (double)(0.0F + (float)var14.method27128() / 2.0F + 64.0F + 4.0F),
                  -0.025F
               );
               var1.method35292(var26, var26, 1.0F);
               var1.translate(0.0, 0.0, -0.1F);
               var23.method38812(var24, 0.0F, 0.0F, -1, false, var1.getLast().getMatrix(), var2, false, Integer.MIN_VALUE, var4);
               var1.pop();
            }

            var12++;
         }
      }
   }

   @Override
   public void close() {
      this.field9232.close();
   }

   // $VF: synthetic method
   public static void method7292(Class1695 var0) {
      var0.method7290();
   }

   // $VF: synthetic method
   public static void method7293(Class1695 var0, MatrixStack var1, Class7733 var2, boolean var3, int var4) {
      var0.method7291(var1, var2, var3, var4);
   }

   // $VF: synthetic method
   public static Class7529 method7294(Class1695 var0) {
      return var0.field9231;
   }
}
