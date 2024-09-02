package net.minecraft.client.gui.widget;

import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.Util;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TextFieldWidget extends Widget implements Class1190, Class1152 {
   private final FontRenderer field6418;
   private String field6419 = "";
   private int field6420 = 32;
   private int field6421;
   private boolean field6422 = true;
   private boolean field6423 = true;
   private boolean field6424 = true;
   private boolean field6425;
   private int field6426;
   private int field6427;
   private int field6428;
   private int field6429 = 14737632;
   private int field6430 = 7368816;
   private String field6431;
   private Consumer<String> field6432;
   private Predicate<String> field6433 = Objects::nonNull;
   private BiFunction<String, Integer, Class9125> field6434 = (var0, var1x) -> Class9125.method34038(var0, Style.EMPTY);

   public TextFieldWidget(FontRenderer var1, int var2, int var3, int var4, int var5, ITextComponent var6) {
      this(var1, var2, var3, var4, var5, (TextFieldWidget)null, var6);
   }

   public TextFieldWidget(FontRenderer var1, int var2, int var3, int var4, int var5, TextFieldWidget var6, ITextComponent var7) {
      super(var2, var3, var4, var5, var7);
      this.field6418 = var1;
      if (var6 != null) {
         this.method5635(var6.getText());
      }
   }

   public void method5631(Consumer<String> var1) {
      this.field6432 = var1;
   }

   public void method5632(BiFunction<String, Integer, Class9125> var1) {
      this.field6434 = var1;
   }

   public void method5633() {
      this.field6421++;
   }

   @Override
   public IFormattableTextComponent method5634() {
      ITextComponent var3 = this.method5745();
      return new TranslationTextComponent("gui.narrate.editBox", var3, this.field6419);
   }

   public void method5635(String var1) {
      if (this.field6433.test(var1)) {
         if (var1.length() <= this.field6420) {
            this.field6419 = var1;
         } else {
            this.field6419 = var1.substring(0, this.field6420);
         }

         this.method5652();
         this.method5668(this.field6427);
         this.method5640(var1);
      }
   }

   public String getText() {
      return this.field6419;
   }

   public String method5637() {
      int var3 = this.field6427 >= this.field6428 ? this.field6428 : this.field6427;
      int var4 = this.field6427 >= this.field6428 ? this.field6427 : this.field6428;
      return this.field6419.substring(var3, var4);
   }

   public void method5638(Predicate<String> var1) {
      this.field6433 = var1;
   }

   public void method5639(String var1) {
      int var4 = this.field6427 >= this.field6428 ? this.field6428 : this.field6427;
      int var5 = this.field6427 >= this.field6428 ? this.field6427 : this.field6428;
      int var6 = this.field6420 - this.field6419.length() - (var4 - var5);
      String var7 = SharedConstants.method34772(var1);
      int var8 = var7.length();
      if (var6 < var8) {
         var7 = var7.substring(0, var6);
         var8 = var6;
      }

      String var9 = new StringBuilder(this.field6419).replace(var4, var5, var7).toString();
      if (this.field6433.test(var9)) {
         this.field6419 = var9;
         this.method5650(var4 + var8);
         this.method5668(this.field6427);
         this.method5640(this.field6419);
      }
   }

   private void method5640(String var1) {
      if (this.field6432 != null) {
         this.field6432.accept(var1);
      }

      this.field6485 = Util.milliTime() + 500L;
   }

   private void method5641(int var1) {
      if (!Screen.hasControlDown()) {
         this.method5643(var1);
      } else {
         this.method5642(var1);
      }
   }

   public void method5642(int var1) {
      if (!this.field6419.isEmpty()) {
         if (this.field6428 == this.field6427) {
            this.method5643(this.method5644(var1) - this.field6427);
         } else {
            this.method5639("");
         }
      }
   }

   public void method5643(int var1) {
      if (!this.field6419.isEmpty()) {
         if (this.field6428 == this.field6427) {
            int var4 = this.method5648(var1);
            int var5 = Math.min(var4, this.field6427);
            int var6 = Math.max(var4, this.field6427);
            if (var5 != var6) {
               String var7 = new StringBuilder(this.field6419).delete(var5, var6).toString();
               if (this.field6433.test(var7)) {
                  this.field6419 = var7;
                  this.method5649(var5);
               }
            }
         } else {
            this.method5639("");
         }
      }
   }

   public int method5644(int var1) {
      return this.method5645(var1, this.method5659());
   }

   private int method5645(int var1, int var2) {
      return this.method5646(var1, var2, true);
   }

   private int method5646(int var1, int var2, boolean var3) {
      int var6 = var2;
      boolean var7 = var1 < 0;
      int var8 = Math.abs(var1);

      for (int var9 = 0; var9 < var8; var9++) {
         if (!var7) {
            int var10 = this.field6419.length();
            var6 = this.field6419.indexOf(32, var6);
            if (var6 != -1) {
               while (var3 && var6 < var10 && this.field6419.charAt(var6) == ' ') {
                  var6++;
               }
            } else {
               var6 = var10;
            }
         } else {
            while (var3 && var6 > 0 && this.field6419.charAt(var6 - 1) == ' ') {
               var6--;
            }

            while (var6 > 0 && this.field6419.charAt(var6 - 1) != ' ') {
               var6--;
            }
         }
      }

      return var6;
   }

   public void method5647(int var1) {
      this.method5649(this.method5648(var1));
   }

   private int method5648(int var1) {
      return Util.method38528(this.field6419, this.field6427, var1);
   }

   public void method5649(int var1) {
      this.method5650(var1);
      if (!this.field6425) {
         this.method5668(this.field6427);
      }

      this.method5640(this.field6419);
   }

   public void method5650(int var1) {
      this.field6427 = MathHelper.method37775(var1, 0, this.field6419.length());
   }

   public void method5651() {
      this.method5649(0);
   }

   public void method5652() {
      this.method5649(this.field6419.length());
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (!this.method5653()) {
         return false;
      } else {
         this.field6425 = Screen.method2476();
         if (Screen.method2481(var1)) {
            this.method5652();
            this.method5668(0);
            return true;
         } else if (Screen.method2480(var1)) {
            Minecraft.getInstance().keyboardListener.method36350(this.method5637());
            return true;
         } else if (Screen.method2479(var1)) {
            if (this.field6424) {
               this.method5639(Minecraft.getInstance().keyboardListener.method36349());
            }

            return true;
         } else if (Screen.method2478(var1)) {
            Minecraft.getInstance().keyboardListener.method36350(this.method5637());
            if (this.field6424) {
               this.method5639("");
            }

            return true;
         } else {
            switch (var1) {
               case 259:
                  if (this.field6424) {
                     this.field6425 = false;
                     this.method5641(-1);
                     this.field6425 = Screen.method2476();
                  }

                  return true;
               case 260:
               case 264:
               case 265:
               case 266:
               case 267:
               default:
                  return false;
               case 261:
                  if (this.field6424) {
                     this.field6425 = false;
                     this.method5641(1);
                     this.field6425 = Screen.method2476();
                  }

                  return true;
               case 262:
                  if (Screen.hasControlDown()) {
                     this.method5649(this.method5644(1));
                  } else {
                     this.method5647(1);
                  }

                  return true;
               case 263:
                  if (Screen.hasControlDown()) {
                     this.method5649(this.method5644(-1));
                  } else {
                     this.method5647(-1);
                  }

                  return true;
               case 268:
                  this.method5651();
                  return true;
               case 269:
                  this.method5652();
                  return true;
            }
         }
      }
   }

   public boolean method5653() {
      return this.method5670() && this.method5746() && this.method5665();
   }

   @Override
   public boolean charTyped(char var1, int var2) {
      if (this.method5653()) {
         if (!SharedConstants.isAllowedCharacter(var1)) {
            return false;
         } else {
            if (this.field6424) {
               this.method5639(Character.toString(var1));
            }

            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      if (!this.method5670()) {
         return false;
      } else {
         boolean var8 = var1 >= (double)this.field6477
            && var1 < (double)(this.field6477 + this.field6475)
            && var3 >= (double)this.field6478
            && var3 < (double)(this.field6478 + this.field6476);
         if (this.field6423) {
            this.method5654(var8);
         }

         if (this.method5746() && var8 && var5 == 0) {
            int var9 = MathHelper.floor(var1) - this.field6477;
            if (this.field6422) {
               var9 -= 4;
            }

            String var10 = this.field6418.method38824(this.field6419.substring(this.field6426), this.method5667());
            this.method5649(this.field6418.method38824(var10, var9).length() + this.field6426);
            return true;
         } else {
            return false;
         }
      }
   }

   public void method5654(boolean var1) {
      super.method5747(var1);
   }

   @Override
   public void method5655(MatrixStack var1, int var2, int var3, float var4) {
      if (this.method5670()) {
         if (this.method5660()) {
            int var7 = !this.method5746() ? -6250336 : -1;
            method5686(var1, this.field6477 - 1, this.field6478 - 1, this.field6477 + this.field6475 + 1, this.field6478 + this.field6476 + 1, var7);
            method5686(var1, this.field6477, this.field6478, this.field6477 + this.field6475, this.field6478 + this.field6476, -16777216);
         }

         int var19 = !this.field6424 ? this.field6430 : this.field6429;
         int var8 = this.field6427 - this.field6426;
         int var9 = this.field6428 - this.field6426;
         String var10 = this.field6418.method38824(this.field6419.substring(this.field6426), this.method5667());
         boolean var11 = var8 >= 0 && var8 <= var10.length();
         boolean var12 = this.method5746() && this.field6421 / 6 % 2 == 0 && var11;
         int var13 = !this.field6422 ? this.field6477 : this.field6477 + 4;
         int var14 = !this.field6422 ? this.field6478 : this.field6478 + (this.field6476 - 8) / 2;
         int var15 = var13;
         if (var9 > var10.length()) {
            var9 = var10.length();
         }

         if (!var10.isEmpty()) {
            String var16 = !var11 ? var10 : var10.substring(0, var8);
            var15 = this.field6418.method38802(var1, this.field6434.apply(var16, this.field6426), (float)var13, (float)var14, var19);
         }

         boolean var20 = this.field6427 < this.field6419.length() || this.field6419.length() >= this.method5658();
         int var17 = var15;
         if (var11) {
            if (var20) {
               var17 = var15 - 1;
               var15--;
            }
         } else {
            var17 = var8 <= 0 ? var13 : var13 + this.field6475;
         }

         if (!var10.isEmpty() && var11 && var8 < var10.length()) {
            this.field6418.method38802(var1, this.field6434.apply(var10.substring(var8), this.field6427), (float)var15, (float)var14, var19);
         }

         if (!var20 && this.field6431 != null) {
            this.field6418.drawStringWithShadow(var1, this.field6431, (float)(var17 - 1), (float)var14, -8355712);
         }

         if (var12) {
            if (!var20) {
               this.field6418.drawStringWithShadow(var1, "_", (float)var17, (float)var14, var19);
            } else {
               AbstractGui.method5686(var1, var17, var14 - 1, var17 + 1, var14 + 1 + 9, -3092272);
            }
         }

         if (var9 != var8) {
            int var18 = var13 + this.field6418.getStringWidth(var10.substring(0, var9));
            this.method5656(var17, var14 - 1, var18 - 1, var14 + 1 + 9);
         }
      }
   }

   private void method5656(int var1, int var2, int var3, int var4) {
      if (var1 < var3) {
         int var7 = var1;
         var1 = var3;
         var3 = var7;
      }

      if (var2 < var4) {
         int var9 = var2;
         var2 = var4;
         var4 = var9;
      }

      if (var3 > this.field6477 + this.field6475) {
         var3 = this.field6477 + this.field6475;
      }

      if (var1 > this.field6477 + this.field6475) {
         var1 = this.field6477 + this.field6475;
      }

      Tessellator var10 = Tessellator.getInstance();
      BufferBuilder var8 = var10.getBuffer();
      RenderSystem.color4f(0.0F, 0.0F, 255.0F, 255.0F);
      RenderSystem.disableTexture();
      RenderSystem.method27857();
      RenderSystem.method27859(Class2270.field14769);
      var8.begin(7, DefaultVertexFormats.field43341);
      var8.pos((double)var1, (double)var4, 0.0).endVertex();
      var8.pos((double)var3, (double)var4, 0.0).endVertex();
      var8.pos((double)var3, (double)var2, 0.0).endVertex();
      var8.pos((double)var1, (double)var2, 0.0).endVertex();
      var10.draw();
      RenderSystem.method27858();
      RenderSystem.enableTexture();
   }

   public void method5657(int var1) {
      this.field6420 = var1;
      if (this.field6419.length() > var1) {
         this.field6419 = this.field6419.substring(0, var1);
         this.method5640(this.field6419);
      }
   }

   private int method5658() {
      return this.field6420;
   }

   public int method5659() {
      return this.field6427;
   }

   private boolean method5660() {
      return this.field6422;
   }

   public void method5661(boolean var1) {
      this.field6422 = var1;
   }

   public void method5662(int var1) {
      this.field6429 = var1;
   }

   public void method5663(int var1) {
      this.field6430 = var1;
   }

   @Override
   public boolean method5538(boolean var1) {
      return this.field6483 && this.field6424 ? super.method5538(var1) : false;
   }

   @Override
   public boolean method2485(double var1, double var3) {
      return this.field6483
         && var1 >= (double)this.field6477
         && var1 < (double)(this.field6477 + this.field6475)
         && var3 >= (double)this.field6478
         && var3 < (double)(this.field6478 + this.field6476);
   }

   @Override
   public void method5664(boolean var1) {
      if (var1) {
         this.field6421 = 0;
      }
   }

   private boolean method5665() {
      return this.field6424;
   }

   public void method5666(boolean var1) {
      this.field6424 = var1;
   }

   public int method5667() {
      return !this.method5660() ? this.field6475 : this.field6475 - 8;
   }

   public void method5668(int var1) {
      int var4 = this.field6419.length();
      this.field6428 = MathHelper.method37775(var1, 0, var4);
      if (this.field6418 != null) {
         if (this.field6426 > var4) {
            this.field6426 = var4;
         }

         int var5 = this.method5667();
         String var6 = this.field6418.method38824(this.field6419.substring(this.field6426), var5);
         int var7 = var6.length() + this.field6426;
         if (this.field6428 == this.field6426) {
            this.field6426 = this.field6426 - this.field6418.method38823(this.field6419, var5, true).length();
         }

         if (this.field6428 <= var7) {
            if (this.field6428 <= this.field6426) {
               this.field6426 = this.field6426 - (this.field6426 - this.field6428);
            }
         } else {
            this.field6426 = this.field6426 + (this.field6428 - var7);
         }

         this.field6426 = MathHelper.method37775(this.field6426, 0, var4);
      }
   }

   public void method5669(boolean var1) {
      this.field6423 = var1;
   }

   public boolean method5670() {
      return this.field6483;
   }

   public void method5671(boolean var1) {
      this.field6483 = var1;
   }

   public void method5672(String var1) {
      this.field6431 = var1;
   }

   public int method5673(int var1) {
      return var1 <= this.field6419.length() ? this.field6477 + this.field6418.getStringWidth(this.field6419.substring(0, var1)) : this.field6477;
   }

   public void method5674(int var1) {
      this.field6477 = var1;
   }
}
