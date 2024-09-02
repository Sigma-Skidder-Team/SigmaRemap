package net.minecraft.client.gui.widget;

import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.util.Util;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.Objects;

public abstract class Widget extends AbstractGui implements Class1190, Class1152 {
   public static final ResourceLocation field6474 = new ResourceLocation("textures/gui/widgets.png");
   public int field6475;
   public int field6476;
   public int field6477;
   public int field6478;
   private ITextComponent field6479;
   private boolean field6480;
   public boolean field6481;
   public boolean active = true;
   public boolean field6483 = true;
   public float field6484 = 1.0F;
   public long field6485 = Long.MAX_VALUE;
   private boolean field6486;

   public Widget(int var1, int var2, int var3, int var4, ITextComponent var5) {
      this.field6477 = var1;
      this.field6478 = var2;
      this.field6475 = var3;
      this.field6476 = var4;
      this.field6479 = var5;
   }

   public int method5728() {
      return this.field6476;
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
      if (this.field6483) {
         this.field6481 = var2 >= this.field6477 && var3 >= this.field6478 && var2 < this.field6477 + this.field6475 && var3 < this.field6478 + this.field6476;
         if (this.field6480 != this.method5737()) {
            if (!this.method5737()) {
               this.field6485 = Long.MAX_VALUE;
            } else if (!this.field6486) {
               this.method5744(750);
            } else {
               this.method5744(200);
            }
         }

         if (this.field6483) {
            this.method5655(var1, var2, var3, var4);
         }

         this.method5730();
         this.field6480 = this.method5737();
      }
   }

   public void method5730() {
      if (this.active && this.method5737() && Util.milliTime() > this.field6485) {
         String var3 = this.method5634().getString();
         if (!var3.isEmpty()) {
            NarratorChatListener.INSTANCE.say(var3);
            this.field6485 = Long.MAX_VALUE;
         }
      }
   }

   public IFormattableTextComponent method5634() {
      return new TranslationTextComponent("gui.narrate.button", this.method5745());
   }

   public void method5655(MatrixStack var1, int var2, int var3, float var4) {
      Minecraft var7 = Minecraft.getInstance();
      FontRenderer var8 = var7.fontRenderer;
      var7.getTextureManager().bindTexture(field6474);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, this.field6484);
      int var9 = this.method5729(this.method5737());
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      this.method5696(var1, this.field6477, this.field6478, 0, 46 + var9 * 20, this.field6475 / 2, this.field6476);
      this.method5696(var1, this.field6477 + this.field6475 / 2, this.field6478, 200 - this.field6475 / 2, 46 + var9 * 20, this.field6475 / 2, this.field6476);
      this.method5731(var1, var7, var2, var3);
      int var10 = !this.active ? 10526880 : 16777215;
      drawCenteredString(
         var1,
         var8,
         this.method5745(),
         this.field6477 + this.field6475 / 2,
         this.field6478 + (this.field6476 - 8) / 2,
         var10 | MathHelper.method37773(this.field6484 * 255.0F) << 24
      );
   }

   public void method5731(MatrixStack var1, Minecraft var2, int var3, int var4) {
   }

   public void method5732(double var1, double var3) {
   }

   public void method5733(double var1, double var3) {
   }

   public void method5734(double var1, double var3, double var5, double var7) {
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      if (this.active && this.field6483) {
         if (this.method5735(var5)) {
            boolean var8 = this.method5736(var1, var3);
            if (var8) {
               this.method5739(Minecraft.getInstance().getSoundHandler());
               this.method5732(var1, var3);
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public boolean method2565(double var1, double var3, int var5) {
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
   public boolean method2516(double var1, double var3, int var5, double var6, double var8) {
      if (!this.method5735(var5)) {
         return false;
      } else {
         this.method5734(var1, var3, var6, var8);
         return true;
      }
   }

   public boolean method5736(double var1, double var3) {
      return this.active
         && this.field6483
         && var1 >= (double)this.field6477
         && var3 >= (double)this.field6478
         && var1 < (double)(this.field6477 + this.field6475)
         && var3 < (double)(this.field6478 + this.field6476);
   }

   public boolean method5737() {
      return this.field6481 || this.field6486;
   }

   @Override
   public boolean method5538(boolean var1) {
      if (this.active && this.field6483) {
         this.field6486 = !this.field6486;
         this.method5664(this.field6486);
         return this.field6486;
      } else {
         return false;
      }
   }

   public void method5664(boolean var1) {
   }

   @Override
   public boolean method2485(double var1, double var3) {
      return this.active
         && this.field6483
         && var1 >= (double)this.field6477
         && var3 >= (double)this.field6478
         && var1 < (double)(this.field6477 + this.field6475)
         && var3 < (double)(this.field6478 + this.field6476);
   }

   public void method5738(MatrixStack var1, int var2, int var3) {
   }

   public void method5739(SoundHandler var1) {
      var1.method1000(MinecraftSoundManager.playSoundWithCustomPitch(Sounds.field27176, 1.0F));
   }

   public int method5740() {
      return this.field6475;
   }

   public void method5741(int var1) {
      this.field6475 = var1;
   }

   public void method5742(float var1) {
      this.field6484 = var1;
   }

   public void setMessage(ITextComponent var1) {
      if (!Objects.equals(var1.getString(), this.field6479.getString())) {
         this.method5744(250);
      }

      this.field6479 = var1;
   }

   public void method5744(int var1) {
      this.field6485 = Util.milliTime() + (long)var1;
   }

   public ITextComponent method5745() {
      return this.field6479;
   }

   public boolean method5746() {
      return this.field6486;
   }

   public void method5747(boolean var1) {
      this.field6486 = var1;
   }
}
