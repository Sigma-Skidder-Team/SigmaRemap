package mapped;

import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.settings.impl.*;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.module.settings.*;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.render.animation.Direction;
import com.mentalfrostbyte.jello.util.ClientColors;
import org.lwjgl.opengl.GL11;

import java.util.HashMap;
import java.util.Map.Entry;

public class Class4343 extends Class4339 implements Class4342 {
   private Module field21219;
   private boolean field21220;
   private boolean field21221;
   public int field21222 = 200;
   private HashMap<UITextDisplay, Setting> field21223 = new HashMap<UITextDisplay, Setting>();
   public HashMap<Module, CustomGuiScreen> field21224 = new HashMap<Module, CustomGuiScreen>();
   public Animation field21225 = new Animation(114, 114);
   private String field21226 = "";
   private String field21227 = "";

   public Class4343(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, Module var7) {
      super(var1, var2, var3, var4, var5, var6);
      this.field21219 = var7;
      this.method13300(false);
      this.method13511();
   }

   private int method13531(CustomGuiScreen panel, Setting setting, int var3, int var4, int var5) {
      switch (Class8666.field39049[setting.getSettingType().ordinal()]) {
         case 1:
            UITextDisplay var37 = new UITextDisplay(panel, setting.getName() + "lbl", var3, var4, this.field21222, 24,
                  UITextDisplay.field20778, setting.getName());
            UICheckBox var45 = new UICheckBox(panel, setting.getName() + "checkbox", panel.getWidthA() - 24 - var5,
                  var4 + 6, 24, 24);
            this.field21223.put(var37, setting);
            var45.method13705((Boolean) setting.getCurrentValue(), false);
            setting.addObserver(var1x -> {
               if (var45.method13703() != (Boolean) var1x.getCurrentValue()) {
                  var45.method13705((Boolean) var1x.getCurrentValue(), false);
               }
            });
            var45.method13036(var1x -> setting.setCurrentValue(((UICheckBox) var1x).method13703()));
            var45.setSize((var1x, var2x) -> var1x.setXA(var2x.getWidthA() - 24 - var5));
            panel.addToList(var37);
            panel.addToList(var45);
            var4 += 24 + var5;
            break;
         case 2:
            UITextDisplay var36 = new UITextDisplay(panel, setting.getName() + "lbl", var3, var4, this.field21222, 24,
                  UITextDisplay.field20778, setting.getName());
            this.field21223.put(var36, setting);
            NumberSetting numbaSetting = (NumberSetting) setting;
            Class4277 var47 = new Class4277(panel, setting.getName() + "slider", panel.getWidthA() - 126 - var5,
                  var4 + 6, 126, 24);
            var47.method13137().setFont(ResourceRegistry.JelloLightFont14);
            var47.method13304(Float.toString((Float) setting.getCurrentValue()));
            var47.method13140(Class4277.method13134(numbaSetting.getMin(), numbaSetting.getMax(),
                  (Float) numbaSetting.getCurrentValue()), false);
            var47.method13143(-1.0F);
            int var13 = numbaSetting.getDecimalPlaces();
            numbaSetting.addObserver(
                  var3x -> {
                     if (Class4277.method13135(var47.method13138(), numbaSetting.getMin(), numbaSetting.getMax(),
                           numbaSetting.getStep(), var13) != (Float) var3x.getCurrentValue()) {
                        var47.method13304(Float.toString((Float) var3x.getCurrentValue()));
                        var47.method13140(Class4277.method13134(numbaSetting.getMin(), numbaSetting.getMax(),
                              (Float) var3x.getCurrentValue()), false);
                     }
                  });
            var47.method13036(var4x -> {
               float var7 = ((Class4277) var4x).method13138();
               float var8x = Class4277.method13135(var7, numbaSetting.getMin(), numbaSetting.getMax(),
                     numbaSetting.getStep(), var13);
               if (var8x != (Float) setting.getCurrentValue()) {
                  var47.method13304(Float.toString(var8x));
                  setting.setCurrentValue(var8x);
               }
            });
            var47.setSize((var1x, var2x) -> var1x.setXA(var2x.getWidthA() - 126 - var5));
            panel.addToList(var36);
            panel.addToList(var47);
            var4 += 24 + var5;
            break;
         case 3:
            int var19 = 114;
            int var27 = 27;
            UITextDisplay var43;
            this.addToList(
                  var43 = new UITextDisplay(panel, setting.getName() + "lbl", var3, var4, this.field21222, var27,
                        UITextDisplay.field20778, setting.getName()));
            this.field21223.put(var43, setting);
            UIInput var35;
            this.addToList(
                  var35 = new UIInput(
                        panel,
                        setting.getName() + "txt",
                        panel.getWidthA() - var5 - var19,
                        var4 + var27 / 4 - 1,
                        var19,
                        var27,
                        UIInput.field20741,
                        (String) setting.getCurrentValue()));
            var35.setFont(ResourceRegistry.JelloLightFont18);
            var35.method13151(var1x -> setting.setCurrentValue(var1x.getTypedText()));
            setting.addObserver(var2x -> {
               if (var35.getTypedText() != ((InputSetting) setting).getCurrentValue()) {
                  var35.method13304(((InputSetting) setting).getCurrentValue());
               }
            });
            var4 += var27 + var5;
            break;
         case 4:
            UITextDisplay var34 = new UITextDisplay(panel, setting.getName() + "lbl", var3, var4 + 2, this.field21222,
                  27, UITextDisplay.field20778, setting.getName());
            Class4363 var42 = new Class4363(
                  panel,
                  setting.getName() + "btn",
                  panel.getWidthA() - var5,
                  var4 + 6 - 1,
                  123,
                  27,
                  ((ModeSetting) setting).getAvailableModes(),
                  ((ModeSetting) setting).getModeIndex());
            this.field21223.put(var34, setting);
            setting.addObserver(var2x -> {
               if (var42.method13655() != ((ModeSetting) setting).getModeIndex()) {
                  var42.method13656(((ModeSetting) setting).getModeIndex());
               }
            });
            var42.method13036(var2x -> {
               ((ModeSetting) setting).setModeByIndex(((Class4363) var2x).method13655());
               var42.method13656(((ModeSetting) setting).getModeIndex());
            });
            var42.setSize((var2x, var3x) -> var2x.setXA(panel.getWidthA() - 123 - var5));
            panel.addToList(var34);
            panel.addToList(var42);
            var4 += 27 + var5;
         case 5:
         default:
            break;
         case 6:
            CustomGuiScreen var17 = new CustomGuiScreen(panel, setting.getName() + "view", var3, var4,
                  panel.getWidthA(), 0);
            int var25 = 0;

            for (Setting var41 : ((SubOptionSetting) setting).getSubSettings()) {
               var25 = this.method13531(var17, var41, 0, var25, var5);
            }

            new Class6665().method20320(var17, panel);
            var17.setSize((var1x, var2x) -> var1x.setWidthA(var2x.getWidthA() - var5));
            panel.addToList(var17);
            var4 += var17.getHeightA() + var5;
            break;
         case 7:
            UITextDisplay var32 = new UITextDisplay(panel, setting.getName() + "lbl", var3, var4, this.field21222, 27,
                  UITextDisplay.field20778, setting.getName());
            Class4377 var40 = new Class4377(
                  panel, setting.getName() + "btn", panel.getWidthA() - var5, var4 + 6, 123, 27,
                  ((TextBoxSetting) setting).getOptions(), (Integer) setting.getCurrentValue());
            this.field21223.put(var32, setting);
            setting.addObserver(var1x -> {
               if (var40.method13720() != (Integer) var1x.getCurrentValue()) {
                  var40.method13722((Integer) var1x.getCurrentValue(), false);
               }
            });
            var40.method13036(var1x -> setting.setCurrentValue(((Class4377) var1x).method13720()));
            var40.setSize((var2x, var3x) -> var2x.setXA(panel.getWidthA() - 123 - var5));
            panel.addToList(var32);
            panel.addToList(var40);
            var4 += 27 + var5;
            break;
         case 8:
            UITextDisplay var31 = new UITextDisplay(panel, setting.getName() + "lbl", var3, var4, this.field21222, 200,
                  UITextDisplay.field20778, setting.getName());
            Class4258 var39 = new Class4258(
                  panel,
                  setting.getName() + "picker",
                  panel.getWidthA() - var5,
                  var4 + 5,
                  175,
                  200,
                  ((BooleanListSetting) setting).isEnabled(),
                  ((BooleanListSetting) setting).getCurrentValue().<String>toArray(new String[0]));
            this.field21223.put(var31, setting);
            var39.method13036(var2x -> setting.setCurrentValue(var39.method13072()));
            var39.setSize((var2x, var3x) -> var2x.setXA(panel.getWidthA() - 175 - var5));
            panel.addToList(var31);
            panel.addToList(var39);
            var4 += 200 + var5;
            break;
         case 9:
            ColorSetting var30 = (ColorSetting) setting;
            UITextDisplay var38 = new UITextDisplay(panel, setting.getName() + "lbl", var3, var4, this.field21222, 24,
                  UITextDisplay.field20778, setting.getName());
            Class4252 var46 = new Class4252(
                  panel, setting.getName() + "color", panel.getWidthA() - 160 - var5 + 10, var4, 160, 114,
                  (Integer) setting.getCurrentValue(), var30.isRainbowEnabled());
            this.field21223.put(var38, setting);
            setting.addObserver(var3x -> {
               var46.method13048((Integer) setting.getCurrentValue());
               var46.method13046(var30.isRainbowEnabled());
            });
            var46.method13036(var2x -> {
               setting.updateCurrentValue(((Class4252) var2x).method13049(), false);
               var30.setRainbowEnabled(((Class4252) var2x).method13047());
            });
            panel.addToList(var38);
            panel.addToList(var46);
            var4 += 114 + var5 - 10;
            break;
         case 10:
            SpeedRampSetting.SpeedRamp var10 = (SpeedRampSetting.SpeedRamp) setting.getCurrentValue();
            UITextDisplay var11 = new UITextDisplay(panel, setting.getName() + "lbl", var3, var4, this.field21222, 24,
                  UITextDisplay.field20778, setting.getName());
            Class4250 var12 = new Class4250(
                  panel,
                  setting.getName() + "color",
                  panel.getWidthA() - 150 - var5 + 10,
                  var4,
                  150,
                  150,
                  20,
                  var10.startValue,
                  var10.middleValue,
                  var10.endValue,
                  var10.maxValue);
            this.field21223.put(var11, setting);
            setting.addObserver(var2x -> {
               SpeedRampSetting.SpeedRamp var5x = (SpeedRampSetting.SpeedRamp) setting.getCurrentValue();
               var12.method13041(var5x.startValue, var5x.middleValue, var5x.endValue, var5x.maxValue);
            });
            var12.method13036(
                  var2x -> ((SpeedRampSetting) setting).updateValues(var12.method13040()[0], var12.method13040()[1],
                        var12.method13040()[2], var12.method13040()[3]));
            panel.addToList(var11);
            panel.addToList(var12);
            var4 += 150 + var5 - 10;
      }

      return var4 - (var5 - 10);
   }

   private void method13511() {
      int var4 = 20;

      for (Setting var6 : this.field21219.getSettingMap().values()) {
         var4 = this.method13531(this, var6, 20, var4, 20);
      }

      int var17 = var4;
      if (this.field21219 instanceof ModuleWithModuleSettings) {
         ModuleWithModuleSettings var18 = (ModuleWithModuleSettings) this.field21219;

         for (Module var10 : var18.moduleArray) {
            int var11 = 0;
            CustomGuiScreen var12 = new CustomGuiScreen(this, var10.getName() + "SubView", 0, var17, this.widthA,
                  this.heightA - var4);
            var12.setSize((var0, var1) -> var0.setWidthA(var1.getWidthA()));

            for (Setting var14 : var10.getSettingMap().values()) {
               var11 = this.method13531(var12, var14, 20, var11, 20);
            }

            var4 = Math.max(var4 + var11, var4);

            for (CustomGuiScreen var20 : var12.method13241()) {
               if (var20 instanceof Class4363) {
                  Class4363 var15 = (Class4363) var20;
                  int var16 = var15.method13649() + var15.getYA() + var15.getHeightA() + 14;
                  var11 = Math.max(var11, var16);
               }
            }

            var12.setHeightA(var11);
            this.addToList(var12);
            this.field21224.put(var10, var12);
         }

         var18.method16727((var1, var2, var3x) -> this.field21224.get(var2).setEnabled(var3x));
         var18.method16724();
      }

      this.addToList(new CustomGuiScreen(this, "extentionhack", 0, var4, 0, 20));
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
   }

   @Override
   public void draw(float var1) {
      boolean var4 = false;

      for (Entry var6 : this.field21223.entrySet()) {
         UITextDisplay var7 = (UITextDisplay) var6.getKey();
         Setting var8 = (Setting) var6.getValue();
         if (var7.method13298() && var7.method13289()) {
            var4 = true;
            this.field21226 = var8.getDescription();
            this.field21227 = var8.getName();
            break;
         }
      }

      GL11.glPushMatrix();
      super.draw(var1);
      GL11.glPopMatrix();
      this.field21225.changeDirection(!var4 ? Direction.BACKWARDS : Direction.FORWARDS);
      RenderUtil.drawString(
            ResourceRegistry.JelloLightFont14,
            (float) (this.getXA() + 10),
            (float) (this.getYA() + this.getHeightA() + 24),
            this.field21227,
            MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor(),
                  0.5F * this.field21225.calcPercent()));
      RenderUtil.drawString(
            ResourceRegistry.JelloLightFont14,
            (float) (this.getXA() + 11),
            (float) (this.getYA() + this.getHeightA() + 24),
            this.field21227,
            MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor(),
                  0.5F * this.field21225.calcPercent()));
      RenderUtil.drawString(
            ResourceRegistry.JelloLightFont14,
            (float) (this.getXA() + 14 + ResourceRegistry.JelloLightFont14.getWidth(this.field21227) + 2),
            (float) (this.getYA() + this.getHeightA() + 24),
            this.field21226,
            MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor(),
                  0.5F * this.field21225.calcPercent()));
   }

   @Override
   public boolean method13525() {
      return this.field21220;
   }

   @Override
   public void method13526() {
      this.field21220 = true;
   }

   @Override
   public boolean method13527() {
      return this.field21221;
   }

   @Override
   public void method13528(boolean var1) {
      if (var1 != this.method13527()) {
         this.method13526();
      }
   }
}
