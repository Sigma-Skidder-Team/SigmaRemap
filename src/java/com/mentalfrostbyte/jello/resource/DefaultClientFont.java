package com.mentalfrostbyte.jello.resource;

import java.awt.Font;

import com.mojang.blaze3d.matrix.MatrixStack;
import mapped.Color;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class DefaultClientFont extends ClientResource {
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
   public int getStringWidth(String var1) {
      return this.field31946.fontRenderer.getStringWidth(var1) * this.field31945;
   }

   @Override
   public int method23952() {
      return 9 * this.field31945;
   }

   @Override
   public int method23941(String var1) {
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
   public void drawString(float var1, float var2, String var3, Color var4, int var5, int var6) {
      GL11.glPushMatrix();
      GL11.glScalef((float)this.field31945, (float)this.field31945, 0.0F);
      GL11.glTranslatef(-var1 / (float)this.field31945, -var2 / (float)this.field31945 + 1.0F, 0.0F);
      this.field31946
         .fontRenderer
         .renderString(
            var3,
            var1,
            var2,
            new java.awt.Color(var4.r, var4.g, var4.b, var4.a).getRGB(),
            new MatrixStack().getLast().getMatrix(),
            false,
            false
         );
      GL11.glPopMatrix();
   }

   @Override
   public void method23936(float var1, float var2, String var3) {
      this.drawString(var1, var2, var3, Color.field16442);
   }
}
