package com.mentalfrostbyte.jello.gui.screens;

import com.mentalfrostbyte.jello.gui.Screen;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.render.animation.Direction;
import lol.ClientColors;
import lol.Texture;
import mapped.EasingFunctions;
import mapped.JelloOptionsMainMenu;
import mapped.QuadraticEasing;
import mapped.RenderUtil;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class JelloInGameOptions extends Screen {
   private int field21109 = 0;
   private int field21110 = 0;
   private boolean field21111 = true;
   public static Animation field21112 = new Animation(300, 200);
   private Texture field21113;
   private JelloOptionsMainMenu field21114;
   public static net.minecraft.client.gui.screen.Screen field21115 = null;

   public JelloInGameOptions() {
      super("options");


      this.method13300(false);
      int var3 = Math.max((int)((float)this.heightA * 0.8F), 420);
      int var4 = (int)((float)this.widthA * 0.8F);
      this.addToList(
         this.field21114 = new JelloOptionsMainMenu(
            this, "centerBlock", this.getWidthA() - var4, this.getHeightA() - var3, var4 - (this.getWidthA() - var4), var3 - (this.getHeightA() - var3)
         )
      );
      field21112 = new Animation(300, 100);
   }

   @Override
   public void method13028(int var1, int var2) {
      if (field21112.getDirection() == Direction.BACKWARDS && field21112.calcPercent() == 0.0F && field21115 != null) {
         Minecraft.getInstance().displayGuiScreen(field21115);
      }

      super.method13028(var1, var2);
   }

   @Override
   public void draw(float var1) {
      float var4 = 1.3F - EasingFunctions.easeOutBack(field21112.calcPercent(), 0.0F, 1.0F, 1.0F) * 0.3F;
      float var5 = 1.0F;
      if (field21112.getDirection() == Direction.BACKWARDS) {
         var4 = 0.7F + QuadraticEasing.easeOutQuad(field21112.calcPercent(), 0.0F, 1.0F, 1.0F) * 0.3F;
         var5 = field21112.calcPercent();
      }

      int var6 = MultiUtilities.method17690(-1072689136, MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.1F), var5);
      int var7 = MultiUtilities.method17690(-804253680, MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.1F), var5);
      RenderUtil.method11431(0, 0, this.getWidthA(), this.getHeightA(), var6, var7);
      this.method13279(var4, var4);
      this.method13224();
      super.draw(field21112.calcPercent());
   }

   private void method13437(float var1) {
      int var4 = this.getHeightO() * -1;
      float var5 = (float)this.getWidthO() / (float)this.getWidthA() * -114.0F;
      if (this.field21111) {
         this.field21109 = (int)var5;
         this.field21110 = var4;
         this.field21111 = false;
      }

      float var6 = var5 - (float)this.field21109;
      float var7 = (float)(var4 - this.field21110);
      GL11.glPushMatrix();
      if (this.field21113 != null) {
         RenderUtil.method11448(
                 (float)this.field21110,
                 (float)this.field21109,
                 (float)(this.getWidthA() * 2),
                 (float)(this.getHeightA() + 114),
                 this.field21113,
                 MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1)
         );
      }

      GL11.glPopMatrix();
      float var8 = 0.5F;
      if (var5 != (float)this.field21109) {
         this.field21109 = (int)((float)this.field21109 + var6 * var8);
      }

      if (var4 != this.field21110) {
         this.field21110 = (int)((float)this.field21110 + var7 * var8);
      }
   }

   public static void method13438(net.minecraft.client.gui.screen.Screen var0) {
      field21115 = var0;
      field21112.changeDirection(Direction.BACKWARDS);
   }

   @Override
   public void keyPressed(int var1) {
      super.keyPressed(var1);
      if (var1 == 256) {
         Minecraft.getInstance().displayGuiScreen(null);
      }
   }
}
