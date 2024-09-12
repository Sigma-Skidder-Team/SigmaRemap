package com.mentalfrostbyte.jello.gui;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Screen;
import com.mentalfrostbyte.jello.util.ColorUtils;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.timer.TimerUtil;
import mapped.*;
import net.minecraft.client.Minecraft;

public class BirdGameScreen extends Screen {
   public Minecraft field21044 = Minecraft.getInstance();
   public TimerUtil field21045 = new TimerUtil();
   public Class4299 field21046;
   public Animation field21047;
   public int field21048 = 0;
   public int field21049 = 14;

   public BirdGameScreen() {
      super("BirdGameScreen");
      this.method13300(false);
      this.field21045.start();
      this.field21047 = new Animation(200, 0);
      ColorUtils.method17739();
      int var3 = 48;
      int var4 = 27;
      int var5 = 14;
      int var6 = var3 * var5;
      int var7 = var4 * var5;
      this.addToList(this.field21046 = new Class4299(this, "bird", (this.width - var6) / 2, (this.getHeight() - var7) / 2 + 30, var3, 27, var5));
   }

   @Override
   public void draw(float var1) {
      var1 = this.field21047.calcPercent();
      float var4 = EasingFunctions.easeOutBack(var1, 0.0F, 1.0F, 1.0F);
      this.method13279(0.8F + var4 * 0.2F, 0.8F + var4 * 0.2F);
      float var5 = 0.25F * var1;
      RenderUtil.drawRect(
         (float)this.x,
         (float)this.y,
         (float)(this.x + this.width),
         (float)(this.y + this.height),
         ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, var5)
      );
      super.method13224();
      RenderUtil.drawRoundedRect(
         (float)this.field21046.getX(),
         (float)this.field21046.getY(),
         (float)this.field21046.getWidth(),
         (float)this.field21046.getHeight(),
         40.0F,
         var1
      );
      RenderUtil.drawRect(
         (float)(this.field21046.getX() - 20),
         (float)(this.field21046.getY() - 20),
         (float)(this.field21046.getWidth() + 40),
         (float)(this.field21046.getHeight() + 40),
         14.0F,
         ClientColors.LIGHT_GREYISH_BLUE.getColor
      );
      super.draw(var1);
      int var6 = (this.width - this.field21046.getWidth()) / 2;
      int var7 = (this.height - this.field21046.getHeight()) / 2;
      RenderUtil.drawString(ResourceRegistry.JelloMediumFont40, (float)var6, (float)(var7 - 60), "Bird", ClientColors.LIGHT_GREYISH_BLUE.getColor);
//      this.field21048 = Math.max(this.field21046.method13179(), this.field21048);
      String var8 = "Max: " + this.field21048 + "   |   Score: 0";
      RenderUtil.drawString(
         ResourceRegistry.JelloLightFont20,
         (float)(var6 + this.field21046.getWidth() - ResourceRegistry.JelloLightFont20.method23942(var8)),
         (float)(var7 - 50),
         var8,
         ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.8F)
      );
   }

   @Override
   public void keyPressed(int var1) {
      super.keyPressed(var1);
      if (var1 == 256) {
         ColorUtils.method17742();
         Minecraft.getInstance().displayGuiScreen(null);
      }
   }
}
