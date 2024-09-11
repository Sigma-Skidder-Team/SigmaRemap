package net.minecraft.client.gui.screen;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.matrix.MatrixStack;
import mapped.*;
import net.minecraft.client.AbstractOption;
import net.minecraft.client.GameSettings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.util.text.*;
import org.lwjgl.glfw.GLFW;

import java.util.ArrayList;
import java.util.List;

public class VideoSettingsScreen extends Class838 {
   private static AbstractOption[] field4658;
   private Class1296 field4659;
   private int field4660;
   private Screen field4661;
   private GameSettings field4662;
   private static AbstractOption[] field4663 = new AbstractOption[]{
      AbstractOption.field25343,
      AbstractOption.field25333,
      AbstractOption.field25337,
      AbstractOption.FRAMERATE_LIMIT,
      AbstractOption.field25386,
      AbstractOption.field25370,
      AbstractOption.field25344,
      AbstractOption.field25359,
      AbstractOption.field25329,
      AbstractOption.field25338,
      AbstractOption.field25435,
      AbstractOption.field25434
   };
   private GPUWarning field4664;
   private static final ITextComponent field4665 = new TranslationTextComponent("options.graphics.fabulous").mergeStyle(TextFormatting.ITALIC);
   private static final ITextComponent field4666 = new TranslationTextComponent("options.graphics.warning.message", field4665, field4665);
   private static final ITextComponent field4667 = new TranslationTextComponent("options.graphics.warning.title").mergeStyle(TextFormatting.RED);
   private static final ITextComponent field4668 = new TranslationTextComponent("options.graphics.warning.accept");
   private static final ITextComponent field4669 = new TranslationTextComponent("options.graphics.warning.cancel");
   private static final ITextComponent field4670 = new StringTextComponent("\n");
   private Class9046 field4671 = new Class9046(this, new Class7548());
   private List<Widget> field4672 = this.field4566;
   private Widget field4673;
   private GameSettings field4674 = Minecraft.getInstance().gameSettings;

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      int var8 = this.field4674.guiScale;
      if (!super.mouseClicked(var1, var3, var5)) {
         return false;
      } else {
         if (this.field4674.guiScale != var8) {
            this.mc.updateWindowSize();
         }

         if (this.field4664.method979()) {
            ArrayList var9 = Lists.newArrayList(new ITextProperties[]{field4666, field4670});
            String var10 = this.field4664.method982();
            if (var10 != null) {
               var9.add(field4670);
               var9.add(new TranslationTextComponent("options.graphics.warning.renderer", var10).mergeStyle(TextFormatting.GRAY));
            }

            String var11 = this.field4664.method984();
            if (var11 != null) {
               var9.add(field4670);
               var9.add(new TranslationTextComponent("options.graphics.warning.vendor", var11).mergeStyle(TextFormatting.GRAY));
            }

            String var12 = this.field4664.method983();
            if (var12 != null) {
               var9.add(field4670);
               var9.add(new TranslationTextComponent("options.graphics.warning.version", var12).mergeStyle(TextFormatting.GRAY));
            }

            this.mc.displayGuiScreen(new Class1307(field4667, var9, ImmutableList.of(new Class8001(field4668, var1x -> {
               this.field4674.graphicFanciness = GraphicsFanciness.FABULOUS;
               Minecraft.getInstance().worldRenderer.loadRenderers();
               this.field4664.method977();
               this.mc.displayGuiScreen(this);
            }), new Class8001(field4669, var1x -> {
               this.field4664.method978();
               this.mc.displayGuiScreen(this);
            }))));
         }

         return true;
      }
   }

   @Override
   public boolean mouseReleased(double var1, double var3, int var5) {
      return super.mouseReleased(var1, var3, var5);
   }

   public VideoSettingsScreen(Screen var1, GameSettings var2) {
      super(new TranslationTextComponent("options.videoTitle"));
      this.field4661 = var1;
      this.field4662 = var2;
      this.field4664 = this.field4661.mc.getGPUWarning();
      this.field4664.method981();
      if (this.field4662.graphicFanciness == GraphicsFanciness.FABULOUS) {
         this.field4664.method977();
      }
   }

   @Override
   public void init() {
      this.field4672.clear();

      for (int var3 = 0; var3 < field4663.length; var3++) {
         AbstractOption var4 = field4663[var3];
         if (var4 != null) {
            int var5 = this.width / 2 - 155 + var3 % 2 * 160;
            int var6 = this.height / 6 + 21 * (var3 / 2) - 12;
            Widget var7 = this.<Widget>addButton(var4.createWidget(this.mc.gameSettings, var5, var6, 150));
            if (var4 == AbstractOption.field25344) {
               this.field4673 = var7;
            }
         }
      }

      int var8 = this.height / 6 + 21 * (field4663.length / 2) - 12;
      int var12 = 0;
      var12 = this.width / 2 - 155 + 0;
      this.<Class1211>addButton(new Class1211(231, var12, var8, Class8043.method27619("of.options.shaders")));
      var12 = this.width / 2 - 155 + 160;
      this.<Class1211>addButton(new Class1211(202, var12, var8, Class8043.method27619("of.options.quality")));
      var8 += 21;
      var12 = this.width / 2 - 155 + 0;
      this.<Class1211>addButton(new Class1211(201, var12, var8, Class8043.method27619("of.options.details")));
      var12 = this.width / 2 - 155 + 160;
      this.<Class1211>addButton(new Class1211(212, var12, var8, Class8043.method27619("of.options.performance")));
      var8 += 21;
      var12 = this.width / 2 - 155 + 0;
      this.<Class1211>addButton(new Class1211(211, var12, var8, Class8043.method27619("of.options.animations")));
      var12 = this.width / 2 - 155 + 160;
      this.<Class1211>addButton(new Class1211(222, var12, var8, Class8043.method27619("of.options.other")));
      var8 += 21;
      this.<Class1210>addButton(new Class1210(200, this.width / 2 - 100, this.height / 6 + 168 + 11, I18n.format("gui.done")));
   }

   @Override
   public void method2563(Widget var1) {
      if (var1 == this.field4673) {
         this.method2582();
      }

      this.method2581();
      if (var1 instanceof Class1210) {
         Class1210 var4 = (Class1210)var1;
         this.method2583(var4, 1);
      }
   }

   private void method2581() {
      if (this.field4664.method979()) {
         ArrayList var3 = Lists.newArrayList(new ITextProperties[]{field4666, field4670});
         String var4 = this.field4664.method982();
         if (var4 != null) {
            var3.add(field4670);
            var3.add(new TranslationTextComponent("options.graphics.warning.renderer", var4).mergeStyle(TextFormatting.GRAY));
         }

         String var5 = this.field4664.method984();
         if (var5 != null) {
            var3.add(field4670);
            var3.add(new TranslationTextComponent("options.graphics.warning.vendor", var5).mergeStyle(TextFormatting.GRAY));
         }

         String var6 = this.field4664.method983();
         if (var6 != null) {
            var3.add(field4670);
            var3.add(new TranslationTextComponent("options.graphics.warning.version", var6).mergeStyle(TextFormatting.GRAY));
         }

         this.mc.displayGuiScreen(new Class1307(field4667, var3, ImmutableList.of(new Class8001(field4668, var1 -> {
            this.field4662.graphicFanciness = GraphicsFanciness.FABULOUS;
            Minecraft.getInstance().worldRenderer.loadRenderers();
            this.field4664.method977();
            this.mc.displayGuiScreen(this);
         }), new Class8001(field4669, var1 -> {
            this.field4664.method978();
            this.mc.displayGuiScreen(this);
         }))));
      }
   }

   @Override
   public void method2564(Widget var1) {
      if (var1 == this.field4673) {
         AbstractOption.field25344.method17945(this.field4662, -1);
         this.method2582();
      }
   }

   private void method2582() {
      this.mc.updateWindowSize();
      MainWindow var3 = this.mc.getMainWindow();
      int var4 = Class7540.method24650(this.field4673);
      int var5 = Class7540.method24651(this.field4673);
      int var6 = this.field4673.field6477 + (var4 - var5);
      int var7 = this.field4673.field6478 + var5 / 2;
      GLFW.glfwSetCursorPos(var3.getHandle(), (double)var6 * var3.getGuiScaleFactor(), (double)var7 * var3.getGuiScaleFactor());
   }

   private void method2583(Class1210 var1, int var2) {
      if (var1.active) {
         if (var1.field6523 == 200) {
            this.mc.gameSettings.saveOptions();
            this.mc.displayGuiScreen(this.field4661);
         }

         if (var1.field6523 == 201) {
            this.mc.gameSettings.saveOptions();
            Class847 var5 = new Class847(this, this.field4662);
            this.mc.displayGuiScreen(var5);
         }

         if (var1.field6523 == 202) {
            this.mc.gameSettings.saveOptions();
            Class846 var6 = new Class846(this, this.field4662);
            this.mc.displayGuiScreen(var6);
         }

         if (var1.field6523 == 211) {
            this.mc.gameSettings.saveOptions();
            Class840 var7 = new Class840(this, this.field4662);
            this.mc.displayGuiScreen(var7);
         }

         if (var1.field6523 == 212) {
            this.mc.gameSettings.saveOptions();
            Class839 var8 = new Class839(this, this.field4662);
            this.mc.displayGuiScreen(var8);
         }

         if (var1.field6523 == 222) {
            this.mc.gameSettings.saveOptions();
            Class841 var9 = new Class841(this, this.field4662);
            this.mc.displayGuiScreen(var9);
         }

         if (var1.field6523 == 231) {
            if (Class7944.method26892() || Class7944.method26893()) {
               Class7944.method26964(Class8043.method27619("of.message.shaders.aa1"), Class8043.method27619("of.message.shaders.aa2"));
               return;
            }

            if (Class7944.method26890()) {
               Class7944.method26964(Class8043.method27619("of.message.shaders.af1"), Class8043.method27619("of.message.shaders.af2"));
               return;
            }

            if (Class7944.method26819()) {
               Class7944.method26964(Class8043.method27619("of.message.shaders.gf1"), Class8043.method27619("of.message.shaders.gf2"));
               return;
            }

            this.mc.gameSettings.saveOptions();
            Class842 var10 = new Class842(this, this.field4662);
            this.mc.displayGuiScreen(var10);
         }
      }
   }

   @Override
   public void onClose() {
      this.mc.gameSettings.saveOptions();
      super.onClose();
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      drawCenteredString(var1, this.mc.fontRenderer, this.title, this.width / 2, 15, 16777215);
      String var7 = Class7944.method26777();
      String var8 = "HD_U";
      if (var8.equals("HD")) {
         var7 = "OptiFine HD G5";
      }

      if (var8.equals("HD_U")) {
         var7 = "OptiFine HD G5 Ultra";
      }

      if (var8.equals("L")) {
         var7 = "OptiFine G5 Light";
      }

      drawString(var1, this.mc.fontRenderer, var7, 2, this.height - 10, 8421504);
      String var9 = "Minecraft 1.16.4";
      int var10 = this.mc.fontRenderer.getStringWidth(var9);
      drawString(var1, this.mc.fontRenderer, var9, this.width - var10 - 2, this.height - 10, 8421504);
      super.render(var1, var2, var3, var4);
      this.field4671.method33640(var1, var2, var3, this.field4672);
   }

   public static String method2584(ChatScreen var0) {
      return var0.field7048.getText();
   }
}
