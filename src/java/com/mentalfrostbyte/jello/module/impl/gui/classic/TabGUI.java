package com.mentalfrostbyte.jello.module.impl.gui.classic;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRender;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.event.impl.EventKeyPress;
import com.mentalfrostbyte.jello.event.priority.HigestPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import com.mentalfrostbyte.jello.settings.NumberSetting;
import com.mentalfrostbyte.jello.settings.Setting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import mapped.*;
import net.minecraft.client.Minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TabGUI extends Module {
   public static final Animation field23380 = new Animation(200, 200, Direction.BACKWARDS);
   public Animation field23381 = new Animation(500, 0, Direction.BACKWARDS);
   private Animation field23382 = new Animation(300, 300, Direction.BACKWARDS);
   private List<ModuleCategory> field23383 = new ArrayList<ModuleCategory>();
   private int field23384 = 0;
   private static List<Class7554> field23385 = new ArrayList<Class7554>();

   public TabGUI() {
      super(ModuleCategory.GUI, "TabGUI", "Manage mods without opening the ClickGUI");
   }

   @Override
   public void method15953() {
      this.field23383.add(ModuleCategory.COMBAT);
      this.field23383.add(ModuleCategory.PLAYER);
      this.field23383.add(ModuleCategory.MOVEMENT);
      this.field23383.add(ModuleCategory.RENDER);
      this.field23383.add(ModuleCategory.WORLD);
      this.field23383.add(ModuleCategory.MISC);
      ArrayList var3 = new ArrayList();

      for (ModuleCategory var5 : this.field23383) {
         var3.add(var5.getName());
      }

      field23385.add(0, new Class7555(var3, 0));
   }

   @EventTarget
   private void method15954(EventKeyPress var1) {
      if (this.isEnabled()) {
         Class2071 var4 = method15960(var1.getKey());
         if (var4 != null) {
            field23380.changeDirection(Direction.FORWARDS);
            this.field23384 = 80;
            int var5 = this.method15969();
            Class7554 var6 = field23385.get(var5 - 1);
            if (var4 != Class2071.field13494 && (!this.method15971() && var4 != Class2071.field13492 || var5 != 3)) {
               this.field23381 = new Animation(500, 200, Direction.BACKWARDS);
            }

            switch (Class4647.field22175[var4.ordinal()]) {
               case 1:
                  if (var5 == 3 && this.method15971()) {
                     this.method15970(false);
                  } else if (var5 > 1) {
                     if (field23385.get(field23385.size() - 1).method24723()) {
                        field23385.remove(field23385.size() - 1);
                     }

                     var6.method24722();
                  }
                  break;
               case 2:
                  if (var5 == 3 && this.method15971()) {
                     this.method15955(true);
                  } else if (var6 instanceof Class7555) {
                     Class7555 var14 = (Class7555)var6;
                     var14.method24731();
                  }
                  break;
               case 3:
                  if (var5 == 3 && this.method15971()) {
                     this.method15955(false);
                  } else if (var6 instanceof Class7555) {
                     Class7555 var13 = (Class7555)var6;
                     var13.method24730();
                  }
                  break;
               case 4:
                  if (var5 == 1) {
                     Class7555 var11 = (Class7555)var6;
                     this.method15962(this.field23383.get(var11.field32402));
                  } else if (var5 == 2 && var6 instanceof Class7555) {
                     Class7555 var12 = (Class7555)field23385.get(0);
                     Class7555 var15 = (Class7555)var6;
                     ModuleCategory var16 = this.field23383.get(var12.field32402);
                     Module var17 = Client.getInstance().getModuleManager().getModulesByCategory(var16).get(var15.field32402);
                     this.method15963(var17);
                  } else if (var5 == 3) {
                     this.method15970(true);
                  }
                  break;
               case 5:
                  if (var5 == 2 && var6 instanceof Class7555) {
                     Class7555 var7 = (Class7555)field23385.get(0);
                     Class7555 var8 = (Class7555)var6;
                     ModuleCategory var9 = this.field23383.get(var7.field32402);
                     Module var10 = Client.getInstance().getModuleManager().getModulesByCategory(var9).get(var8.field32402);
                     var10.setEnabled(!var10.isEnabled());
                  }
            }
         }
      }
   }

   private void method15955(boolean var1) {
      Class7555 var4 = (Class7555)field23385.get(0);
      Class7555 var5 = (Class7555)field23385.get(1);
      Class7555 var6 = (Class7555)field23385.get(2);
      ModuleCategory var7 = this.field23383.get(var4.field32402);
      Module var8 = Client.getInstance().getModuleManager().getModulesByCategory(var7).get(var5.field32402);
      Setting var9 = this.method15968(var8).get(var6.field32402);
      if (!(var9 instanceof ModeSetting)) {
         if (!(var9 instanceof BooleanSetting)) {
            if (var9 instanceof NumberSetting) {
               NumberSetting var10 = (NumberSetting)var9;
               Object var11 = var10.getCurrentValue();
               if (var11 instanceof Float) {
                  Float var12 = (Float)var10.getCurrentValue();
                  if (var1) {
                     var12 = var12 - var10.getStep();
                  } else {
                     var12 = var12 + var10.getStep();
                  }

                  var12 = Math.min(Math.max(var12, var10.getMin()), var10.getMax());
                  var10.setCurrentValue(var12);
               }
            }
         } else {
            BooleanSetting var13 = (BooleanSetting)var9;
            var13.setCurrentValue(Boolean.valueOf(!var13.getCurrentValue()));
         }
      } else {
         ModeSetting var14 = (ModeSetting)var9;
         int var15 = var14.getModeIndex();
         if (!var1) {
            var15--;
         } else {
            var15++;
         }

         if (var15 > var14.getAvailableModes().size() - 1) {
            var15 = 0;
         }

         if (var15 < 0) {
            var15 = var14.getAvailableModes().size() - 1;
         }

         var14.setModeByIndex(var15);
      }

      var6.method24728(this.method15967(var8));
   }

   @EventTarget
   private void method15956(TickEvent var1) {
      if (this.isEnabled()) {
         if (this.field23384 <= 0) {
            field23380.changeDirection(Direction.BACKWARDS);
            this.field23381.changeDirection(Direction.BACKWARDS);
         } else {
            this.field23384--;
         }
      }
   }

   @EventTarget
   @HigestPriority
   private void method15957(EventRender var1) {
      if (this.isEnabled() && mc.player != null) {
         if (! Minecraft.getInstance().gameSettings.showDebugInfo) {
            if (!Minecraft.getInstance().gameSettings.hideGUI) {
               this.method15958();

               for (Class7554 var5 : field23385) {
                  var5.method24726((float)(0.5 + (double)field23380.calcPercent() * 0.5));
               }

               this.method15959((float)(0.5 + (double)field23380.calcPercent() * 0.5));
               RenderUtil.method11424(12.0F, 30.0F, 90.0F, 1.0F, ClientColors.LIGHT_GREYISH_BLUE.getColor);
            }
         }
      }
   }

   private void method15958() {
      if (field23385.size() >= 2) {
         Class7555 var3 = (Class7555)field23385.get(1);
         Class7555 var4 = (Class7555)field23385.get(0);
         ModuleCategory var5 = this.field23383.get(var4.field32402);
         int var6 = 0;

         for (Module var8 : Client.getInstance().getModuleManager().getModulesByCategory(var5)) {
            var3.method24727(var6++, (!var8.isEnabled() ? "§7" : "") + var8.getSuffix());
         }
      }
   }

   private void method15959(float var1) {
      int var4 = this.method15969();
      if (var4 == 2 || var4 == 3) {
         Class7555 var5 = (Class7555)field23385.get(0);
         Class7555 var6 = (Class7555)field23385.get(1);
         Class7555 var7 = var4 != 3 ? null : (Class7555)field23385.get(2);
         Class7555 var8 = var6;
         if (var7 != null) {
            var8 = var7;
         }

         if (var8.method24732() && field23380.getDirection() == Direction.FORWARDS) {
            if (this.method15969() == field23385.size()) {
               this.field23381.changeDirection(Direction.FORWARDS);
            } else if (field23385.get(field23385.size() - 1).method24724()) {
               this.field23381.changeDirection(Direction.FORWARDS);
            }
         }

         ModuleCategory var9 = this.field23383.get(var5.field32402);
         Module var10 = Client.getInstance().getModuleManager().getModulesByCategory(var9).get(var6.field32402);
         String var11 = var10.getDescription();
         if (var4 == 3) {
            Setting var12 = this.method15968(var10).get(var7.field32402);
            var11 = var12.getDescription();
         }

         float var17 = Class8056.method27664(this.field23382.calcPercent(), 0.0F, 1.0F, 1.0F) * field23380.calcPercent();
         if (this.field23382.getDirection() == Direction.BACKWARDS) {
            var17 = Class8056.method27663(this.field23382.calcPercent(), 0.0F, 1.0F, 1.0F);
         }

         RenderUtil.method11435(
            (float)var8.method24720() + (float)var8.method24719() + 14.0F * var17,
            (float)var8.method24721() + 16.0F + (float)(25 * var8.field32402),
            24.0F * var17,
            MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, var1 * 0.6F),
            MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, var1 * 0.6F)
         );
         int var13 = var8.method24720() + var8.method24719() + 4 + Math.round(var17 * 28.0F);
         int var14 = var8.method24721() + 25 * var8.field32402 + 4;
         int var15 = var8.field32394.method23942(var11) + 8;
         float var16 = Class8056.method27664(this.field23381.calcPercent(), 0.0F, 1.0F, 1.0F);
         RenderUtil.method11424((float)var13, (float)var14, (float)var15 * var16, 25.0F, MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, var1 * 0.6F));
         RenderUtil.startScissor((float)var13, (float)var14, (float)var15 * var16, 25.0F);
         RenderUtil.drawString(
            var8.field32394, (float)(var13 + 4), (float)(var14 + 2), var11, MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, Math.min(1.0F, var1 * 1.7F))
         );
         RenderUtil.endScissor();
      }
   }

   public static Class2071 method15960(int var0) {
      switch (var0) {
         case 257:
            return Class2071.field13494;
         case 258:
         case 259:
         case 260:
         case 261:
         default:
            return null;
         case 262:
            return Class2071.field13492;
         case 263:
            return Class2071.field13493;
         case 264:
            return Class2071.field13496;
         case 265:
            return Class2071.field13495;
      }
   }

   public static int method15961(int var0) {
      int var3 = 0;

      for (int var4 = 0; var4 < var0; var4++) {
         var3 += field23385.get(var4).method24719();
      }

      return 4 + var3 + 5 * var0;
   }

   public void method15962(ModuleCategory var1) {
      ArrayList var4 = new ArrayList();

      for (Module var6 : Client.getInstance().getModuleManager().getModulesByCategory(var1)) {
         var4.add(var6.getSuffix());
      }

      this.method15964(1);
      field23385.add(1, new Class7555(var4, 1));
   }

   public void method15963(Module var1) {
      List var4 = this.method15967(var1);
      if (var4.size() != 0) {
         this.method15964(2);
         field23385.add(2, new Class7555(var4, 2));
      }
   }

   public void method15964(int var1) {
      Iterator var4 = field23385.iterator();

      while (var4.hasNext()) {
         if (((Class7554)var4.next()).field32395 >= var1) {
            var4.remove();
         }
      }
   }

   @Override
   public void onDisable() {
      field23380.changeDirection(Direction.BACKWARDS);
      this.field23384 = 0;
   }

   @Override
   public void onEnable() {
      field23380.changeDirection(Direction.FORWARDS);
      this.field23384 = 40;
   }

   public List<String> method15967(Module var1) {
      ArrayList var4 = new ArrayList();

      for (Setting var6 : this.method15968(var1)) {
         var4.add(var6.getName() + " " + var6.getCurrentValue());
      }

      return var4;
   }

   public List<Setting> method15968(Module var1) {
      ArrayList var4 = new ArrayList<Setting>(var1.getSettingMap().values());
      if (var1 instanceof ModuleWithModuleSettings) {
         ModuleWithModuleSettings var5 = (ModuleWithModuleSettings)var1;
         var5.method16724();
         if (var5.method16726() != null) {
            var4.addAll(var5.method16726().getSettingMap().values());
         }
      }

      Iterator var7 = var4.iterator();

      while (var7.hasNext()) {
         Setting var6 = (Setting)var7.next();
         if (var6.getName().equals("Keybind")) {
            var7.remove();
         }
      }

      return var4;
   }

   private int method15969() {
      Class7554 var3 = field23385.get(field23385.size() - 1);
      int var4 = field23385.size();
      if (var3.method24723()) {
         var4--;
      }

      return var4;
   }

   private void method15970(boolean var1) {
      this.field23382.changeDirection(!var1 ? Direction.BACKWARDS : Direction.FORWARDS);
   }

   private boolean method15971() {
      return this.field23382.getDirection() == Direction.FORWARDS;
   }
}
