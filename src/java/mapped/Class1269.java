package mapped;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.util.Util;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;

import java.util.Iterator;
import java.util.List;

public class Class1269 extends AbstractGui implements Class1270 {
   private final Minecraft field6744;
   private final List<Class9113> field6745 = Lists.newArrayList();
   private boolean field6746;

   public Class1269(Minecraft var1) {
      this.field6744 = var1;
   }

   public void method5999(MatrixStack var1) {
      if (!this.field6746 && this.field6744.gameSettings.showSubtitles) {
         this.field6744.getSoundHandler().method1011(this);
         this.field6746 = true;
      } else if (this.field6746 && !this.field6744.gameSettings.showSubtitles) {
         this.field6744.getSoundHandler().method1012(this);
         this.field6746 = false;
      }

      if (this.field6746 && !this.field6745.isEmpty()) {
         RenderSystem.pushMatrix();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         Vector3d var4 = new Vector3d(this.field6744.player.getPosX(), this.field6744.player.getPosYEye(), this.field6744.player.getPosZ());
         Vector3d var5 = new Vector3d(0.0, 0.0, -1.0)
            .method11350(-this.field6744.player.rotationPitch * (float) (Math.PI / 180.0))
            .method11351(-this.field6744.player.rotationYaw * (float) (Math.PI / 180.0));
         Vector3d var6 = new Vector3d(0.0, 1.0, 0.0)
            .method11350(-this.field6744.player.rotationPitch * (float) (Math.PI / 180.0))
            .method11351(-this.field6744.player.rotationYaw * (float) (Math.PI / 180.0));
         Vector3d var7 = var5.method11335(var6);
         int var8 = 0;
         int var9 = 0;
         Iterator var10 = this.field6745.iterator();

         while (var10.hasNext()) {
            Class9113 var11 = (Class9113)var10.next();
            if (var11.method33994() + 3000L > Util.milliTime()) {
               var9 = Math.max(var9, this.field6744.fontRenderer.method38821(var11.method33993()));
            } else {
               var10.remove();
            }
         }

         var9 = var9
            + this.field6744.fontRenderer.getStringWidth("<")
            + this.field6744.fontRenderer.getStringWidth(" ")
            + this.field6744.fontRenderer.getStringWidth(">")
            + this.field6744.fontRenderer.getStringWidth(" ");

         for (Class9113 var12 : this.field6745) {
            short var13 = 255;
            ITextComponent var14 = var12.method33993();
            Vector3d var15 = var12.method33995().method11336(var4).method11333();
            double var16 = -var7.dotProduct(var15);
            double var18 = -var5.dotProduct(var15);
            boolean var20 = var18 > 0.5;
            int var21 = var9 / 2;
            byte var22 = 9;
            int var23 = var22 / 2;
            float var24 = 1.0F;
            int var25 = this.field6744.fontRenderer.method38821(var14);
            int var26 = MathHelper.floor(MathHelper.method37779(255.0, 75.0, (double)((float)(Util.milliTime() - var12.method33994()) / 3000.0F)));
            int var27 = var26 << 16 | var26 << 8 | var26;
            RenderSystem.pushMatrix();
            RenderSystem.translatef(
               (float)this.field6744.getMainWindow().getScaledWidth() - (float)var21 * 1.0F - 2.0F,
               (float)(this.field6744.getMainWindow().getScaledHeight() - 30) - (float)(var8 * (var22 + 1)) * 1.0F,
               0.0F
            );
            RenderSystem.scalef(1.0F, 1.0F, 1.0F);
            method5686(var1, -var21 - 1, -var23 - 1, var21 + 1, var23 + 1, this.field6744.gameSettings.method37140(0.8F));
            RenderSystem.enableBlend();
            if (!var20) {
               if (!(var16 > 0.0)) {
                  if (var16 < 0.0) {
                     this.field6744.fontRenderer.method38801(var1, "<", (float)(-var21), (float)(-var23), var27 + -16777216);
                  }
               } else {
                  this.field6744
                     .fontRenderer
                     .method38801(var1, ">", (float)(var21 - this.field6744.fontRenderer.getStringWidth(">")), (float)(-var23), var27 + -16777216);
               }
            }

            this.field6744.fontRenderer.func_243248_b(var1, var14, (float)(-var25 / 2), (float)(-var23), var27 + -16777216);
            RenderSystem.popMatrix();
            var8++;
         }

         RenderSystem.disableBlend();
         RenderSystem.popMatrix();
      }
   }

   @Override
   public void method6000(Class6340 var1, Class6648 var2) {
      if (var2.method20300() != null) {
         ITextComponent var5 = var2.method20300();
         if (!this.field6745.isEmpty()) {
            for (Class9113 var7 : this.field6745) {
               if (var7.method33993().equals(var5)) {
                  var7.method33996(new Vector3d(var1.method19287(), var1.method19288(), var1.method19289()));
                  return;
               }
            }
         }

         this.field6745.add(new Class9113(this, var5, new Vector3d(var1.method19287(), var1.method19288(), var1.method19289())));
      }
   }
}
