package com.mentalfrostbyte.jello.gui.screens;

import com.mentalfrostbyte.jello.gui.Screen;
import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.ClientColors;
import mapped.EasingFunctions;
import mapped.RenderUtil;
import mapped.VanillaMainMenuScreen;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class CreditsScreen extends Screen {
   private float field21072 = 0.0F;
   private int field21073 = 0;
   private int field21074 = 0;
   private boolean field21075 = true;

   public CreditsScreen() {
      super("Credits");
      this.method13300(false);
   }

   @Override
   public void draw(float var1) {
      super.draw(var1);
      int var4 = ResourcesDecrypter.mentalfrostbytePNG.getImageWidth();
      int var5 = ResourcesDecrypter.mentalfrostbytePNG.getImageHeight();
      var4 = Math.min(var4, (int)((float) Minecraft.getInstance().mainWindow.getHeight() / 1.65F));
      var5 = Math.min(var5, (int)((float) Minecraft.getInstance().mainWindow.getHeight() / 1.65F));
      this.method13416();
      RenderUtil.drawRect(
         0.0F, 0.0F, (float)this.getWidthA(), (float)this.getHeightA(), MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.9F * this.field21072)
      );
      float var6 = EasingFunctions.easeOutBack(!((double)this.field21072 < 0.5) ? (float)((double)this.field21072 - 0.5) * 2.0F : 0.0F, 0.0F, 1.0F, 1.0F);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(this.getWidthA() / 2), (float)(this.getHeightA() / 2), 0.0F);
      GL11.glScaled((double)var6, (double)var6, 0.0);
      GL11.glTranslatef((float)(-this.getWidthA() / 2), (float)(-this.getHeightA() / 2), 0.0F);
      String var7 = "##Jello \n";
      String var8 = "Jello by MF";
      ClientResource var9 = ResourceRegistry.JelloLightFont25;
      RenderUtil.drawString(
         var9, (float)((this.getWidthA() - var9.getStringWidth(var8)) / 2), (float)(this.getHeightA() - 110), var8, ClientColors.DEEP_TEAL.getColor
      );
      GL11.glPopMatrix();
      RenderUtil.drawImage(
         (float)(this.getWidthA() / 2) - ((float)var4 - (float)var4 * (this.field21072 - 1.0F) * this.field21072) / 2.0F,
         (float)(
            (double)(Math.max((float)var5 * 1.2F, (float)(this.getHeightA() / 2)) - (float)var5)
               - (double)var5
                  * Math.sin((double)(this.field21072 * this.field21072) * Math.PI)
                  * Math.sin((double)(this.field21072 * this.field21072) * Math.PI)
         ),
         (float)var4 - (float)var4 * (this.field21072 - 1.0F) * this.field21072,
         (float)var5 - (float)var5 * (this.field21072 - 1.0F) * this.field21072,
         ResourcesDecrypter.mentalfrostbytePNG,
         MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, Math.min(1.0F, this.field21072))
      );
      if (!((double)this.field21072 < 0.986)) {
         this.field21072 = 1.0F;
      } else {
         this.field21072 = (float)Math.max(
            0.0,
            Math.min(
               1.0,
               (double)this.field21072
                  + 0.05 * (double)(30.0F / (float) Minecraft.getFps())
                  - (double)(this.field21072 * 0.04F * (30.0F / (float) Minecraft.getFps()))
            )
         );
      }
   }

   private void method13416() {
      int var3 = this.getHeightO() * -1;
      float var4 = (float)this.getWidthO() / (float)this.getWidthA() * -114.0F;
      if (this.field21075) {
         this.field21073 = (int)var4;
         this.field21074 = var3;
         this.field21075 = false;
      }

      float var5 = var4 - (float)this.field21073;
      float var6 = (float)(var3 - this.field21074);
      RenderUtil.method11455(
         (float)this.field21074, (float)this.field21073, (float)(this.getWidthA() * 2), (float)(this.getHeightA() + 114), ResourcesDecrypter.panoramaPNG
      );
      float var7 = 0.5F;
      if (var4 != (float)this.field21073) {
         this.field21073 = (int)((float)this.field21073 + var5 * var7);
      }

      if (var3 != this.field21074) {
         this.field21074 = (int)((float)this.field21074 + var6 * var7);
      }
   }

   @Override
   public void keyPressed(int var1) {
      super.keyPressed(var1);
      if (var1 == 256) {
         Minecraft.getInstance().displayGuiScreen(new VanillaMainMenuScreen());
      }
   }
}
