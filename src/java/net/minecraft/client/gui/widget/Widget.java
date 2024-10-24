package net.minecraft.client.gui.widget;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.Util;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.Objects;

public abstract class Widget extends AbstractGui implements Class1190, IGuiEventListener2 {
   public static final ResourceLocation WIDGETS_LOCATION = new ResourceLocation("textures/gui/widgets.png");
   public int width;
   public int height;
   public int x;
   public int y;
   private ITextComponent message;
   private boolean wasHovered;
   public boolean isHovered;
   public boolean active = true;
   public boolean visible = true;
   public float alpha = 1.0F;
   public long nextNarration = Long.MAX_VALUE;
   private boolean focused;

   public Widget(int var1, int var2, int var3, int var4, ITextComponent var5) {
      this.x = var1;
      this.y = var2;
      this.width = var3;
      this.height = var4;
      this.message = var5;
   }

   public int method5728() {
      return this.height;
   }

   public int method5729(boolean var1) {
      int var4 = 1;
      if (this.active) {
         if (var1) {
            var4 = 2;
         }
      } else {
         var4 = 0;
      }

      return var4;
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      if (this.visible) {
         this.isHovered = var2 >= this.x && var3 >= this.y && var2 < this.x + this.width && var3 < this.y + this.height;
         if (this.wasHovered != this.isHovered()) {
            if (!this.isHovered()) {
               this.nextNarration = Long.MAX_VALUE;
            } else if (!this.focused) {
               this.method5744(750);
            } else {
               this.method5744(200);
            }
         }

         if (this.visible) {
            this.renderButton(var1, var2, var3, var4);
         }

         this.method5730();
         this.wasHovered = this.isHovered();
      }
   }

   public void method5730() {
      if (this.active && this.isHovered() && Util.milliTime() > this.nextNarration) {
         String var3 = this.method5634().getString();
         if (!var3.isEmpty()) {
            NarratorChatListener.INSTANCE.say(var3);
            this.nextNarration = Long.MAX_VALUE;
         }
      }
   }

   public IFormattableTextComponent method5634() {
      return new TranslationTextComponent("gui.narrate.button", this.method5745());
   }

   public void renderButton(MatrixStack var1, int var2, int var3, float var4) {
      Minecraft var7 = Minecraft.getInstance();
      FontRenderer var8 = var7.fontRenderer;
      var7.getTextureManager().bindTexture(WIDGETS_LOCATION);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, this.alpha);
      int var9 = this.method5729(this.isHovered());
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      this.blit(var1, this.x, this.y, 0, 46 + var9 * 20, this.width / 2, this.height);
      this.blit(var1, this.x + this.width / 2, this.y, 200 - this.width / 2, 46 + var9 * 20, this.width / 2, this.height);
      this.method5731(var1, var7, var2, var3);
      int var10 = !this.active ? 10526880 : 16777215;
      drawCenteredString(
         var1,
         var8,
         this.method5745(),
         this.x + this.width / 2,
         this.y + (this.height - 8) / 2,
         var10 | MathHelper.ceil(this.alpha * 255.0F) << 24
      );
   }

   public void method5731(MatrixStack var1, Minecraft var2, int var3, int var4) {
   }

   public void onClick(double var1, double var3) {
   }

   public void method5733(double var1, double var3) {
   }

   public void method5734(double var1, double var3, double var5, double var7) {
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      if (this.active && this.visible) {
         if (this.method5735(var5)) {
            boolean var8 = this.method5736(var1, var3);
            if (var8) {
               this.playDownSound(Minecraft.getInstance().getSoundHandler());
               this.onClick(var1, var3);
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public boolean mouseReleased(double var1, double var3, int var5) {
      if (!this.method5735(var5)) {
         return false;
      } else {
         this.method5733(var1, var3);
         return true;
      }
   }

   public boolean method5735(int var1) {
      return var1 == 0;
   }

   @Override
   public boolean mouseDragged(double var1, double var3, int var5, double var6, double var8) {
      if (!this.method5735(var5)) {
         return false;
      } else {
         this.method5734(var1, var3, var6, var8);
         return true;
      }
   }

   public boolean method5736(double var1, double var3) {
      return this.active
         && this.visible
         && var1 >= (double)this.x
         && var3 >= (double)this.y
         && var1 < (double)(this.x + this.width)
         && var3 < (double)(this.y + this.height);
   }

   public boolean isHovered() {
      return this.isHovered || this.focused;
   }

   @Override
   public boolean changeFocus(boolean var1) {
      if (this.active && this.visible) {
         this.focused = !this.focused;
         this.method5664(this.focused);
         return this.focused;
      } else {
         return false;
      }
   }

   public void method5664(boolean var1) {
   }

   @Override
   public boolean isMouseOver(double var1, double var3) {
      return this.active
         && this.visible
         && var1 >= (double)this.x
         && var3 >= (double)this.y
         && var1 < (double)(this.x + this.width)
         && var3 < (double)(this.y + this.height);
   }

   public void renderToolTip(MatrixStack var1, int var2, int var3) {
   }

   public void playDownSound(SoundHandler var1) {
      var1.play(CustomSoundPlayer.playSoundWithCustomPitch(SoundEvents.field27176, 1.0F));
   }

   public int method5740() {
      return this.width;
   }

   public void method5741(int var1) {
      this.width = var1;
   }

   public void method5742(float var1) {
      this.alpha = var1;
   }

   public void setMessage(ITextComponent var1) {
      if (!Objects.equals(var1.getString(), this.message.getString())) {
         this.method5744(250);
      }

      this.message = var1;
   }

   public void method5744(int var1) {
      this.nextNarration = Util.milliTime() + (long)var1;
   }

   public ITextComponent method5745() {
      return this.message;
   }

   public boolean method5746() {
      return this.focused;
   }

   public void method5747(boolean var1) {
      this.focused = var1;
   }
}
