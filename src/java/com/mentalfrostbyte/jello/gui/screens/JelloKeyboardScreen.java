package com.mentalfrostbyte.jello.gui.screens;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.gui.Screen;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.ClientColors;
import lol.Texture;
import mapped.*;
import net.minecraft.client.Minecraft;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map.Entry;

public class JelloKeyboardScreen extends Screen {
   private static Minecraft field20953 = Minecraft.getInstance();
   private Texture field20954;
   public Date field20955;
   public Class4375 field20956;
   public Class4270 field20957;
   public boolean field20958 = false;
   public boolean field20959;
   public Class4358 field20960;
   public int field20961;
   public boolean field20962;
   private boolean field20963;
   private boolean field20964;

   public JelloKeyboardScreen() {
      super("KeybindManager");
      this.field20955 = new Date();
      this.addToList(this.field20957 = new Class4270(this, "keyboard", (this.widthA - 1060) / 2, (this.heightA - 357) / 2));
      this.field20957.method13279(0.4F, 0.4F);
      this.field20957
         .method13036(
            var2 -> {
               boolean var5 = false;

               for (CustomGuiScreen var7 : this.method13241()) {
                  if (var7 instanceof Class4375) {
                     var5 = true;
                  }
               }

               if (this.field20957.field20696 == this.field20961 && var5) {
                  this.method13333();
               } else {
                  int[] var8 = this.field20957.method13105(this.field20957.field20696);
                  String var9 = MultiUtilities.method17736(this.field20957.field20696);
                  this.field20956 = new Class4375(
                     this, "popover", this.field20957.getXA() + var8[0], this.field20957.getYA() + var8[1], this.field20957.field20696, var9
                  );
                  this.field20956.method13036(var1x -> this.method13329(this.field20957));
                  this.field20956.method13713(var1x -> {
                     var1x.method13292(false);
                     this.method13331();
                  });
                  this.field20961 = this.field20957.field20696;
               }
            }
         );
      MultiUtilities.method17739();
   }

   public static ArrayList<Class6984> method13328() {
      ArrayList var2 = new ArrayList();

      for (Module var4 : Client.getInstance().getModuleManager().getModuleMap().values()) {
         var2.add(new Class6984(var4));
      }

      for (Entry var6 : GuiManager.field41338.entrySet()) {
         var2.add(new Class6984((Class<? extends net.minecraft.client.gui.screen.Screen>)var6.getKey()));
      }

      return var2;
   }

   private void method13329(Class4270 var1) {
      this.method13222(new Class635(this, var1));
   }

   private void method13330() {
      this.method13222(new Class544(this, this));
   }

   private void method13331() {
      this.method13222(new Class1533(this, this));
   }

   private void method13332() {
      this.method13222(new Class543(this, this));
   }

   private void method13333() {
      this.method13222(new Class1376(this, this));
   }

   @Override
   public void method13028(int var1, int var2) {
      if (this.method13212()) {
         this.field20957.method13242();
         this.method13244();
         this.field20961 = 0;
         this.field20956 = null;
      }

      if (this.field20956 != null) {
         this.field20957.method13242();
         this.method13244();
         this.addToList(this.field20956);
         this.field20956 = null;
      }

      super.method13028(var1, var2);
      this.method13300(false);
   }

   @Override
   public int method13313() {
      return 60;
   }

   @Override
   public void keyPressed(int var1) {
      super.keyPressed(var1);
      if (var1 == 256) {
         MultiUtilities.method17742();
         field20953.displayGuiScreen(null);
      }
   }

   @Override
   public void draw(float var1) {
      var1 = (float)Math.min(200L, new Date().getTime() - this.field20955.getTime()) / 200.0F;
      float var4 = EasingFunctions.easeOutBack(var1, 0.0F, 1.0F, 1.0F);
      this.method13279(0.8F + var4 * 0.2F, 0.8F + var4 * 0.2F);
      float var5 = 0.25F * var1;
      RenderUtil.drawRect(
         (float)this.xA,
         (float)this.yA,
         (float)(this.xA + this.widthA),
         (float)(this.yA + this.heightA),
         MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, var5)
      );
      super.method13224();
      RenderUtil.drawString(
         ResourceRegistry.JelloMediumFont40,
         (float)((this.widthA - 1060) / 2),
         (float)((this.heightA - 357) / 2 - 90),
         "Keybind Manager",
         ClientColors.LIGHT_GREYISH_BLUE.getColor
      );
      super.draw(var1);
   }

   // $VF: synthetic method
   public static int method13337(JelloKeyboardScreen var0) {
      return var0.widthA;
   }

   // $VF: synthetic method
   public static int method13338(JelloKeyboardScreen var0) {
      return var0.heightA;
   }

   // $VF: synthetic method
   public static void method13339(JelloKeyboardScreen var0) {
      var0.method13332();
   }
}
