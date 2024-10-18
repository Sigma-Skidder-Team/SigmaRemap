package mapped;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.advancements.Advancement;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.network.play.ClientPlayNetHandler;
import net.minecraft.network.play.client.CSeenAdvancementsPacket;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;
import java.util.Map;

public class AdvancementsScreen extends Screen implements Class1131 {
   private static final ResourceLocation field6179 = new ResourceLocation("textures/gui/advancements/window.png");
   private static final ResourceLocation field6180 = new ResourceLocation("textures/gui/advancements/tabs.png");
   private static final ITextComponent field6181 = new TranslationTextComponent("advancements.sad_label");
   private static final ITextComponent field6182 = new TranslationTextComponent("advancements.empty");
   private static final ITextComponent field6183 = new TranslationTextComponent("gui.advancements");
   private final Class8730 field6184;
   private final Map<Advancement, Class1271> field6185 = Maps.newLinkedHashMap();
   private Class1271 field6186;
   private boolean field6187;

   public AdvancementsScreen(Class8730 var1) {
      super(NarratorChatListener.EMPTY);
      this.field6184 = var1;
   }

   @Override
   public void init() {
      this.field6185.clear();
      this.field6186 = null;
      this.field6184.method31511(this);
      if (this.field6186 == null && !this.field6185.isEmpty()) {
         this.field6184.method31510(this.field6185.values().iterator().next().method6001(), true);
      } else {
         this.field6184.method31510(this.field6186 != null ? this.field6186.method6001() : null, true);
      }
   }

   @Override
   public void onClose() {
      this.field6184.method31511((Class1131)null);
      ClientPlayNetHandler var3 = this.mc.getConnection();
      if (var3 != null) {
         var3.sendPacket(CSeenAdvancementsPacket.closedScreen());
      }
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      if (var5 == 0) {
         int var8 = (this.width - 252) / 2;
         int var9 = (this.height - 140) / 2;

         for (Class1271 var11 : this.field6185.values()) {
            if (var11.method6007(var8, var9, var1, var3)) {
               this.field6184.method31510(var11.method6001(), true);
               break;
            }
         }
      }

      return super.mouseClicked(var1, var3, var5);
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (!this.mc.gameSettings.keyBindAdvancements.matchesKey(var1, var2)) {
         return super.keyPressed(var1, var2, var3);
      } else {
         this.mc.displayGuiScreen((Screen)null);
         this.mc.mouseHelper.grabMouse();
         return true;
      }
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      int var7 = (this.width - 252) / 2;
      int var8 = (this.height - 140) / 2;
      this.renderBackground(var1);
      this.method5445(var1, var2, var3, var7, var8);
      this.method5446(var1, var7, var8);
      this.method5447(var1, var2, var3, var7, var8);
   }

   @Override
   public boolean mouseDragged(double var1, double var3, int var5, double var6, double var8) {
      if (var5 == 0) {
         if (this.field6187) {
            if (this.field6186 != null) {
               this.field6186.method6009(var6, var8);
            }
         } else {
            this.field6187 = true;
         }

         return true;
      } else {
         this.field6187 = false;
         return false;
      }
   }

   private void method5445(MatrixStack var1, int var2, int var3, int var4, int var5) {
      Class1271 var8 = this.field6186;
      if (var8 != null) {
         RenderSystem.pushMatrix();
         RenderSystem.translatef((float)(var4 + 9), (float)(var5 + 18), 0.0F);
         var8.method6005(var1);
         RenderSystem.popMatrix();
         RenderSystem.depthFunc(515);
         RenderSystem.disableDepthTest();
      } else {
         fill(var1, var4 + 9, var5 + 18, var4 + 9 + 234, var5 + 18 + 113, -16777216);
         int var9 = var4 + 9 + 117;
         drawCenteredString(var1, this.font, field6182, var9, var5 + 18 + 56 - 4, -1);
         drawCenteredString(var1, this.font, field6181, var9, var5 + 18 + 113 - 9, -1);
      }
   }

   public void method5446(MatrixStack var1, int var2, int var3) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.enableBlend();
      this.mc.getTextureManager().bindTexture(field6179);
      this.blit(var1, var2, var3, 0, 0, 252, 140);
      if (this.field6185.size() > 1) {
         this.mc.getTextureManager().bindTexture(field6180);

         for (Class1271 var7 : this.field6185.values()) {
            var7.method6003(var1, var2, var3, var7 == this.field6186);
         }

         RenderSystem.enableRescaleNormal();
         RenderSystem.defaultBlendFunc();

         for (Class1271 var9 : this.field6185.values()) {
            var9.method6004(var2, var3, this.field4563);
         }

         RenderSystem.disableBlend();
      }

      this.font.func_243248_b(var1, field6183, (float)(var2 + 8), (float)(var3 + 6), 4210752);
   }

   private void method5447(MatrixStack var1, int var2, int var3, int var4, int var5) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      if (this.field6186 != null) {
         RenderSystem.pushMatrix();
         RenderSystem.enableDepthTest();
         RenderSystem.translatef((float)(var4 + 9), (float)(var5 + 18), 400.0F);
         this.field6186.method6006(var1, var2 - var4 - 9, var3 - var5 - 18, var4, var5);
         RenderSystem.disableDepthTest();
         RenderSystem.popMatrix();
      }

      if (this.field6185.size() > 1) {
         for (Class1271 var9 : this.field6185.values()) {
            if (var9.method6007(var4, var5, (double)var2, (double)var3)) {
               this.method2459(var1, var9.method6002(), var2, var3);
            }
         }
      }
   }

   @Override
   public void method5448(Advancement var1) {
      Class1271 var4 = Class1271.method6008(this.mc, this, this.field6185.size(), var1);
      if (var4 != null) {
         this.field6185.put(var1, var4);
      }
   }

   @Override
   public void method5449(Advancement var1) {
   }

   @Override
   public void method5450(Advancement var1) {
      Class1271 var4 = this.method5456(var1);
      if (var4 != null) {
         var4.method6010(var1);
      }
   }

   @Override
   public void method5451(Advancement var1) {
   }

   @Override
   public void method5452(Advancement var1, Class2006 var2) {
      Class1194 var5 = this.method5455(var1);
      if (var5 != null) {
         var5.method5709(var2);
      }
   }

   @Override
   public void method5453(Advancement var1) {
      this.field6186 = this.field6185.get(var1);
   }

   @Override
   public void method5454() {
      this.field6185.clear();
      this.field6186 = null;
   }

   @Nullable
   public Class1194 method5455(Advancement var1) {
      Class1271 var4 = this.method5456(var1);
      return var4 != null ? var4.method6012(var1) : null;
   }

   @Nullable
   private Class1271 method5456(Advancement var1) {
      while (var1.method27026() != null) {
         var1 = var1.method27026();
      }

      return this.field6185.get(var1);
   }
}
