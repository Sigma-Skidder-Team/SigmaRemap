package com.mojang.realmsclient.gui.screens;

import com.mojang.realmsclient.dto.RealmsServer;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.realms.RealmsLabel;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RealmsResetWorldScreen extends Class813 {
   private static final Logger field4380 = LogManager.getLogger();
   private final Screen field4381;
   private final RealmsServer field4382;
   private RealmsLabel field4383;
   private RealmsLabel field4384;
   private ITextComponent field4385 = new TranslationTextComponent("mco.reset.world.title");
   private ITextComponent field4386 = new TranslationTextComponent("mco.reset.world.warning");
   private ITextComponent field4387 = DialogTexts.GUI_CANCEL;
   private int field4388 = 16711680;
   private static final ResourceLocation field4389 = new ResourceLocation("realms", "textures/gui/realms/slot_frame.png");
   private static final ResourceLocation field4390 = new ResourceLocation("realms", "textures/gui/realms/upload.png");
   private static final ResourceLocation field4391 = new ResourceLocation("realms", "textures/gui/realms/adventure.png");
   private static final ResourceLocation field4392 = new ResourceLocation("realms", "textures/gui/realms/survival_spawn.png");
   private static final ResourceLocation field4393 = new ResourceLocation("realms", "textures/gui/realms/new_world.png");
   private static final ResourceLocation field4394 = new ResourceLocation("realms", "textures/gui/realms/experience.png");
   private static final ResourceLocation field4395 = new ResourceLocation("realms", "textures/gui/realms/inspiration.png");
   private Class6108 field4396;
   private Class6108 field4397;
   private Class6108 field4398;
   private Class6108 field4399;
   public int field4400 = -1;
   private Class1899 field4401 = Class1899.field11147;
   private Class7044 field4402;
   private Class6130 field4403;
   private ITextComponent field4404;
   private final Runnable field4405;
   private final Runnable field4406;

   public RealmsResetWorldScreen(Screen var1, RealmsServer var2, Runnable var3, Runnable var4) {
      this.field4381 = var1;
      this.field4382 = var2;
      this.field4405 = var3;
      this.field4406 = var4;
   }

   public RealmsResetWorldScreen(Screen var1, RealmsServer var2, ITextComponent var3, ITextComponent var4, int var5, ITextComponent var6, Runnable var7, Runnable var8) {
      this(var1, var2, var7, var8);
      this.field4385 = var3;
      this.field4386 = var4;
      this.field4388 = var5;
      this.field4387 = var6;
   }

   public void method2246(int var1) {
      this.field4400 = var1;
   }

   public void func_224432_a(ITextComponent var1) {
      this.field4404 = var1;
   }

   @Override
   public void init() {
      this.<Button>addButton(
         new Button(this.width / 2 - 40, method1929(14) - 10, 80, 20, this.field4387, var1 -> this.mc.displayGuiScreen(this.field4381))
      );
      new Class356(this, "Realms-reset-world-fetcher").start();
      this.field4383 = this.<RealmsLabel>addListener(new RealmsLabel(this.field4385, this.width / 2, 7, 16777215));
      this.field4384 = this.<RealmsLabel>addListener(new RealmsLabel(this.field4386, this.width / 2, 22, this.field4388));
      this.<Class1242>addButton(
         new Class1242(
            this,
            this.method2248(1),
            method1929(0) + 10,
            new TranslationTextComponent("mco.reset.world.generate"),
            field4393,
            var1 -> this.mc.displayGuiScreen(new Class800(this, this.field4385))
         )
      );
      this.<Class1242>addButton(
         new Class1242(this, this.method2248(2), method1929(0) + 10, new TranslationTextComponent("mco.reset.world.upload"), field4390, var1 -> {
            Class811 var4 = new Class811(this.field4382.field27443, this.field4400 == -1 ? this.field4382.field27456 : this.field4400, this, this.field4406);
            this.mc.displayGuiScreen(var4);
         })
      );
      this.<Class1242>addButton(
         new Class1242(this, this.method2248(3), method1929(0) + 10, new TranslationTextComponent("mco.reset.world.template"), field4392, var1 -> {
            Class804 var4 = new Class804(this, Class2049.field13369, this.field4396);
            var4.method1956(new TranslationTextComponent("mco.reset.world.template"));
            this.mc.displayGuiScreen(var4);
         })
      );
      this.<Class1242>addButton(
         new Class1242(this, this.method2248(1), method1929(6) + 20, new TranslationTextComponent("mco.reset.world.adventure"), field4391, var1 -> {
            Class804 var4 = new Class804(this, Class2049.field13371, this.field4397);
            var4.method1956(new TranslationTextComponent("mco.reset.world.adventure"));
            this.mc.displayGuiScreen(var4);
         })
      );
      this.<Class1242>addButton(
         new Class1242(this, this.method2248(2), method1929(6) + 20, new TranslationTextComponent("mco.reset.world.experience"), field4394, var1 -> {
            Class804 var4 = new Class804(this, Class2049.field13372, this.field4398);
            var4.method1956(new TranslationTextComponent("mco.reset.world.experience"));
            this.mc.displayGuiScreen(var4);
         })
      );
      this.<Class1242>addButton(
         new Class1242(this, this.method2248(3), method1929(6) + 20, new TranslationTextComponent("mco.reset.world.inspiration"), field4395, var1 -> {
            Class804 var4 = new Class804(this, Class2049.field13373, this.field4399);
            var4.method1956(new TranslationTextComponent("mco.reset.world.inspiration"));
            this.mc.displayGuiScreen(var4);
         })
      );
      this.func_231411_u_();
   }

   @Override
   public void onClose() {
      this.mc.keyboardListener.enableRepeatEvents(false);
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.keyPressed(var1, var2, var3);
      } else {
         this.mc.displayGuiScreen(this.field4381);
         return true;
      }
   }

   private int method2248(int var1) {
      return this.width / 2 - 130 + (var1 - 1) * 100;
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      this.field4383.func_239560_a_(this, var1);
      this.field4384.func_239560_a_(this, var1);
      super.render(var1, var2, var3, var4);
   }

   private void method2249(MatrixStack var1, int var2, int var3, ITextComponent var4, ResourceLocation var5, boolean var6, boolean var7) {
      this.mc.getTextureManager().bindTexture(var5);
      if (!var6) {
         RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      } else {
         RenderSystem.method27889(0.56F, 0.56F, 0.56F, 1.0F);
      }

      AbstractGui.method5699(var1, var2 + 2, var3 + 14, 0.0F, 0.0F, 56, 56, 56, 56);
      this.mc.getTextureManager().bindTexture(field4389);
      if (!var6) {
         RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      } else {
         RenderSystem.method27889(0.56F, 0.56F, 0.56F, 1.0F);
      }

      AbstractGui.method5699(var1, var2, var3 + 12, 0.0F, 0.0F, 60, 60, 60, 60);
      int var10 = !var6 ? 16777215 : 10526880;
      drawCenteredString(var1, this.fontRenderer, var4, var2 + 30, var3, var10);
   }

   @Override
   public void method2245(Class6130 var1) {
      if (var1 != null) {
         if (this.field4400 == -1) {
            this.method2252(var1);
         } else {
            switch (Class9592.field44869[var1.field27472.ordinal()]) {
               case 1:
                  this.field4401 = Class1899.field11151;
                  break;
               case 2:
                  this.field4401 = Class1899.field11150;
                  break;
               case 3:
                  this.field4401 = Class1899.field11152;
                  break;
               case 4:
                  this.field4401 = Class1899.field11153;
            }

            this.field4403 = var1;
            this.method2250();
         }
      }
   }

   private void method2250() {
      this.method2251(() -> {
         switch (Class9592.field44870[this.field4401.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
               if (this.field4403 != null) {
                  this.method2252(this.field4403);
               }
               break;
            case 5:
               if (this.field4402 != null) {
                  this.method2253(this.field4402);
               }
         }
      });
   }

   public void method2251(Runnable var1) {
      this.mc.displayGuiScreen(new RealmsLongRunningMcoTaskScreen(this.field4381, new Class790(this.field4382.field27443, this.field4400, var1)));
   }

   public void method2252(Class6130 var1) {
      this.method2254((String)null, var1, -1, true);
   }

   private void method2253(Class7044 var1) {
      this.method2254(Class7044.method21946(var1), (Class6130)null, Class7044.method21947(var1), Class7044.method21948(var1));
   }

   private void method2254(String var1, Class6130 var2, int var3, boolean var4) {
      this.mc.displayGuiScreen(new RealmsLongRunningMcoTaskScreen(this.field4381, new Class1346(var1, var2, var3, var4, this.field4382.field27443, this.field4404, this.field4405)));
   }

   public void method2255(Class7044 var1) {
      if (this.field4400 != -1) {
         this.field4401 = Class1899.field11148;
         this.field4402 = var1;
         this.method2250();
      } else {
         this.method2253(var1);
      }
   }

   // $VF: synthetic method
   public static Minecraft method2264(RealmsResetWorldScreen var0) {
      return var0.mc;
   }

   // $VF: synthetic method
   public static Logger method2265() {
      return field4380;
   }

   // $VF: synthetic method
   public static Class6108 method2266(RealmsResetWorldScreen var0, Class6108 var1) {
      return var0.field4396 = var1;
   }

   // $VF: synthetic method
   public static Class6108 method2267(RealmsResetWorldScreen var0, Class6108 var1) {
      return var0.field4397 = var1;
   }

   // $VF: synthetic method
   public static Class6108 method2268(RealmsResetWorldScreen var0, Class6108 var1) {
      return var0.field4398 = var1;
   }

   // $VF: synthetic method
   public static Class6108 method2269(RealmsResetWorldScreen var0, Class6108 var1) {
      return var0.field4399 = var1;
   }

   // $VF: synthetic method
   public static void method2270(RealmsResetWorldScreen var0, MatrixStack var1, int var2, int var3, ITextComponent var4, ResourceLocation var5, boolean var6, boolean var7) {
      var0.method2249(var1, var2, var3, var4, var5, var6, var7);
   }
}
