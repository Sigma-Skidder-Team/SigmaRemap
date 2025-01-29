package com.mentalfrostbyte.jello.resource;

import java.awt.Font;

import com.mojang.blaze3d.matrix.MatrixStack;
import org.newdawn.slick.Color;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class DefaultClientFont extends TrueTypeFont {
   public final int field31945;
   public Minecraft field31946 = Minecraft.getInstance();

   public DefaultClientFont(int var1) {
      super(new Font("Arial", 0, var1), false);
      this.field31945 = var1;
   }

   private int method23949(char var1) {
      return this.field31946.fontRenderer.getStringWidth(String.valueOf(var1)) * this.field31945;
   }

   @Override
   public int getWidth(String var1) {
      return this.field31946.fontRenderer.getStringWidth(var1) * this.field31945;
   }

   @Override
   public int method23952() {
      return 9 * this.field31945;
   }

   @Override
   public int getHeight(String var1) {
      return 9 * this.field31945;
   }

   @Override
   public int getLineHeight() {
      return 9 * this.field31945;
   }

   @Override
   public void drawString(float var1, float var2, String var3, Color var4) {
      this.drawString(var1, var2, var3, var4, 0, var3.length() - 1);
   }

   @Override
   public void drawString(float var1, float var2, String whatchars, Color color, int var5, int var6) {
      GL11.glPushMatrix();
      GL11.glScalef((float)this.field31945, (float)this.field31945, 0.0F);
      GL11.glTranslatef(-var1 / (float)this.field31945, -var2 / (float)this.field31945 + 1.0F, 0.0F);
      this.field31946
         .fontRenderer
         .method38807(
                 whatchars,
            var1,
            var2,
            new java.awt.Color(color.field16455, color.field16456, color.field16457, color.field16458).getRGB(),
            new MatrixStack().getLast().getMatrix(),
            false,
            false
         );
      GL11.glPopMatrix();
   }

   @Override
   public void drawString(float var1, float var2, String var3) {
      this.drawString(var1, var2, var3, Color.field16442);
   }
}
