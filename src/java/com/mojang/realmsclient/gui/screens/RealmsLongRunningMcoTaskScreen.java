package com.mojang.realmsclient.gui.screens;

import com.google.common.collect.Sets;
import com.mojang.blaze3d.matrix.MatrixStack;
import mapped.Class6034;
import mapped.Class789;
import mapped.Class796;
import mapped.Class9229;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.realms.RealmsScreen;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;

public class RealmsLongRunningMcoTaskScreen extends RealmsScreen implements Class796 {
   private static final Logger field4156 = LogManager.getLogger();
   private final Screen field4157;
   private volatile ITextComponent field4158 = StringTextComponent.EMPTY;
   private volatile ITextComponent field4159;
   private volatile boolean field4160;
   private int field4161;
   private final Class789 field4162;
   private final int field4163 = 212;
   public static final String[] field4164 = new String[]{
      "▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃",
      "_ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄",
      "_ _ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅",
      "_ _ _ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆",
      "_ _ _ _ ▃ ▄ ▅ ▆ ▇ █ ▇",
      "_ _ _ _ _ ▃ ▄ ▅ ▆ ▇ █",
      "_ _ _ _ ▃ ▄ ▅ ▆ ▇ █ ▇",
      "_ _ _ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆",
      "_ _ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅",
      "_ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄",
      "▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃",
      "▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _",
      "▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _ _",
      "▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _ _ _",
      "▇ █ ▇ ▆ ▅ ▄ ▃ _ _ _ _",
      "█ ▇ ▆ ▅ ▄ ▃ _ _ _ _ _",
      "▇ █ ▇ ▆ ▅ ▄ ▃ _ _ _ _",
      "▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _ _ _",
      "▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _ _",
      "▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _"
   };

   public RealmsLongRunningMcoTaskScreen(Screen var1, Class789 var2) {
      this.field4157 = var1;
      this.field4162 = var2;
      var2.method1906(this);
      Thread var5 = new Thread(var2, "Realms-long-running-task");
      var5.setUncaughtExceptionHandler(new Class6034(field4156));
      var5.start();
   }

   @Override
   public void tick() {
      super.tick();
      Class9229.method34716(this.field4158.getString());
      this.field4161++;
      this.field4162.method1910();
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.keyPressed(var1, var2, var3);
      } else {
         this.method1922();
         return true;
      }
   }

   @Override
   public void init() {
      this.field4162.method1911();
      this.<Button>addButton(new Button(this.width / 2 - 106, method1929(12), 212, 20, DialogTexts.GUI_CANCEL, var1 -> this.method1922()));
   }

   private void method1922() {
      this.field4160 = true;
      this.field4162.method1912();
      this.mc.displayGuiScreen(this.field4157);
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      drawCenteredString(var1, this.fontRenderer, this.field4158, this.width / 2, method1929(3), 16777215);
      ITextComponent var7 = this.field4159;
      if (var7 != null) {
         drawCenteredString(var1, this.fontRenderer, var7, this.width / 2, method1929(8), 16711680);
      } else {
         method5690(var1, this.fontRenderer, field4164[this.field4161 % field4164.length], this.width / 2, method1929(8), 8421504);
      }

      super.render(var1, var2, var3, var4);
   }

   @Override
   public void method1907(ITextComponent var1) {
      this.field4159 = var1;
      Class9229.method34711(var1.getString());
      this.method1924();
      this.<Button>addButton(
         new Button(this.width / 2 - 106, this.height / 4 + 120 + 12, 200, 20, DialogTexts.field30663, var1x -> this.method1922())
      );
   }

   private void method1924() {
      HashSet var3 = Sets.newHashSet(this.field4566);
      this.children.removeIf(var3::contains);
      this.field4566.clear();
   }

   public void method1925(ITextComponent var1) {
      this.field4158 = var1;
   }

   public boolean method1926() {
      return this.field4160;
   }
}
