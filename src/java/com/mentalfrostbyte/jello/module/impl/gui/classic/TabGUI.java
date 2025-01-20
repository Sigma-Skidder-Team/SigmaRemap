package com.mentalfrostbyte.jello.module.impl.gui.classic;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventKeyPress;
import com.mentalfrostbyte.jello.event.impl.EventRender;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.event.priority.HigestPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.module.settings.impl.ModeSetting;
import com.mentalfrostbyte.jello.module.settings.impl.NumberSetting;
import com.mentalfrostbyte.jello.module.settings.Setting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.render.animation.Direction;
import com.mentalfrostbyte.jello.util.render.animation.MathHelper;
import com.mentalfrostbyte.jello.util.ClientColors;
import mapped.*;
import net.minecraft.client.Minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TabGUI extends Module {
   public static final Animation animationProgress = new Animation(200, 200, Direction.BACKWARDS);
   public Animation secondAnimationProgress = new Animation(500, 0, Direction.BACKWARDS);
   private Animation firstAnimationProgress = new Animation(300, 300, Direction.BACKWARDS);
   private List<ModuleCategory> categories = new ArrayList<ModuleCategory>();
   private int field23384 = 0;
   private static List<CategoryDrawPart> categoryDrawParts = new ArrayList<>();

   public TabGUI() {
      super(ModuleCategory.GUI, "TabGUI", "Manage mods without opening the ClickGUI");
   }

   @Override
   public void initialize() {
      this.categories.add(ModuleCategory.COMBAT);
      this.categories.add(ModuleCategory.PLAYER);
      this.categories.add(ModuleCategory.MOVEMENT);
      this.categories.add(ModuleCategory.RENDER);
      this.categories.add(ModuleCategory.WORLD);
      this.categories.add(ModuleCategory.MISC);
      ArrayList<String> categoryList = new ArrayList<>();

      for (ModuleCategory category : this.categories) {
         categoryList.add(category.getName());
      }

      categoryDrawParts.add(0, new CategoryDrawPart(categoryList, 0));
   }

   @EventTarget
   private void method15954(EventKeyPress event) {
      if (this.isEnabled()) {
         Class2071 var4 = method15960(event.getKey());
         if (var4 != null) {
            animationProgress.changeDirection(Direction.FORWARDS);
            this.field23384 = 80;
            int categoryState = this.getCurrentCategoryState();
            CategoryDrawPart category = categoryDrawParts.get(categoryState - 1);
            if (var4 != Class2071.field13494
                  && (!this.method15971() && var4 != Class2071.field13492 || categoryState != 3)) {
               this.secondAnimationProgress = new Animation(500, 200, Direction.BACKWARDS);
            }

            switch (Class4647.field22175[var4.ordinal()]) {
               case 1:
                  if (categoryState == 3 && this.method15971()) {
                     this.method15970(false);
                  } else if (categoryState > 1) {
                     if (categoryDrawParts.get(categoryDrawParts.size() - 1).isExpanded()) {
                        categoryDrawParts.remove(categoryDrawParts.size() - 1);
                     }

                     category.expand();
                  }
                  break;
               case 2:
                  if (categoryState == 3 && this.method15971()) {
                     this.onSettingChange(true);
                  } else if (category != null) {
                     category.method24731();
                  }
                  break;
               case 3:
                  if (categoryState == 3 && this.method15971()) {
                     this.onSettingChange(false);
                  } else if (category != null) {
                     category.method24730();
                  }
                  break;
               case 4:
                  if (categoryState == 1) {
                     this.method15962(this.categories.get(category.index));
                  } else if (categoryState == 2 && category != null) {
                     CategoryDrawPart drawPart = categoryDrawParts.get(0);
                     ModuleCategory modCategory = this.categories.get(drawPart.index);
                     Module module = Client.getInstance().moduleManager.getModulesByCategory(modCategory)
                           .get(category.index);
                     this.method15963(module);
                  } else if (categoryState == 3) {
                     this.method15970(true);
                  }
                  break;
               case 5:
                  if (categoryState == 2 && category != null) {
                     CategoryDrawPart drawPart = categoryDrawParts.get(0);
                     ModuleCategory modCat = this.categories.get(drawPart.index);
                     Module mod = Client.getInstance().moduleManager.getModulesByCategory(modCat).get(category.index);
                     mod.setEnabled(!mod.isEnabled());
                  }
                  break;
            }
         }
      }
   }

   private void onSettingChange(boolean var1) {
      CategoryDrawPart categoryIndex = categoryDrawParts.get(0);
      CategoryDrawPart moduleIndex = categoryDrawParts.get(1);
      CategoryDrawPart settingIndex = categoryDrawParts.get(2);
      ModuleCategory category = this.categories.get(categoryIndex.index);
      Module var8 = Client.getInstance().moduleManager.getModulesByCategory(category).get(moduleIndex.index);
      Setting<?> setting = this.getModuleSettings(var8).get(settingIndex.index);
      if (!(setting instanceof ModeSetting)) {
         if (!(setting instanceof BooleanSetting)) {
            if (setting instanceof NumberSetting) {
               NumberSetting<?> numberSetting = (NumberSetting<?>) setting;
               Object obj = numberSetting.getCurrentValue();
               if (obj != null) {
                  Float value = numberSetting.getCurrentValue();
                  if (var1) {
                     value = value - numberSetting.getStep();
                  } else {
                     value = value + numberSetting.getStep();
                  }

                  value = Math.min(Math.max(value, numberSetting.getMin()), numberSetting.getMax());
                  numberSetting.setCurrentValue(value);
               }
            }
         } else {
            BooleanSetting var13 = (BooleanSetting) setting;
            var13.setCurrentValue(!var13.getCurrentValue());
         }
      } else {
         ModeSetting var14 = (ModeSetting) setting;
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

      settingIndex.method24728(this.method15967(var8));
   }

   @EventTarget
   private void method15956(TickEvent var1) {
      if (this.isEnabled()) {
         if (this.field23384 <= 0) {
            animationProgress.changeDirection(Direction.BACKWARDS);
            this.secondAnimationProgress.changeDirection(Direction.BACKWARDS);
         } else {
            this.field23384--;
         }
      }
   }

   @EventTarget
   @HigestPriority
   private void method15957(EventRender var1) {
      if (this.isEnabled() && mc.player != null) {
         if (!Minecraft.getInstance().gameSettings.showDebugInfo) {
            if (!Minecraft.getInstance().gameSettings.hideGUI) {
               this.method15958();

               for (CategoryDrawPartBackground var5 : categoryDrawParts) {
                  var5.method24726((float) (0.5 + (double) animationProgress.calcPercent() * 0.5));
               }

               this.drawCategories((float) (0.5 + (double) animationProgress.calcPercent() * 0.5));
               RenderUtil.renderBackgroundBox(12.0F, 30.0F, 90.0F, 1.0F, ClientColors.LIGHT_GREYISH_BLUE.getColor());
            }
         }
      }
   }

   private void method15958() {
      if (categoryDrawParts.size() >= 2) {
         CategoryDrawPart var3 = categoryDrawParts.get(1);
         CategoryDrawPart var4 = categoryDrawParts.get(0);
         ModuleCategory var5 = this.categories.get(var4.index);
         int var6 = 0;

         for (Module var8 : Client.getInstance().moduleManager.getModulesByCategory(var5)) {
            var3.method24727(var6++, (!var8.isEnabled() ? "§7" : "") + var8.getSuffix());
         }
      }
   }

   private void drawCategories(float partialTicks) {
      int drawState = this.getCurrentCategoryState();
      if (drawState == 2 || drawState == 3) {
         CategoryDrawPart firstCategoryPart = categoryDrawParts.get(0);
         CategoryDrawPart secondCategoryPart = categoryDrawParts.get(1);
         CategoryDrawPart thirdCategoryPart = drawState != 3 ? null : categoryDrawParts.get(2);
         CategoryDrawPart activeCategoryPart = secondCategoryPart;
         if (thirdCategoryPart != null) {
            activeCategoryPart = thirdCategoryPart;
         }

         if (activeCategoryPart.isAnimating() && animationProgress.getDirection() == Direction.FORWARDS) {
            if (this.getCurrentCategoryState() == categoryDrawParts.size()) {
               this.secondAnimationProgress.changeDirection(Direction.FORWARDS);
            } else if (categoryDrawParts.get(categoryDrawParts.size() - 1).method24724()) {
               this.secondAnimationProgress.changeDirection(Direction.FORWARDS);
            }
         }

         ModuleCategory currentCategory = this.categories.get(firstCategoryPart.index);
         Module currentModule = Client.getInstance().moduleManager.getModulesByCategory(currentCategory)
               .get(secondCategoryPart.index);
         String description = currentModule.getDescription();
         if (drawState == 3) {
            Setting<?> currentSetting = this.getModuleSettings(currentModule).get(thirdCategoryPart.index);
            description = currentSetting.getDescription();
         }

         float animationProgressValue = MathHelper.calculateTransition(this.firstAnimationProgress.calcPercent(), 0.0F,
               1.0F, 1.0F) * animationProgress.calcPercent();
         if (this.firstAnimationProgress.getDirection() == Direction.BACKWARDS) {
            animationProgressValue = MathHelper.calculateBackwardTransition(this.firstAnimationProgress.calcPercent(),
                  0.0F, 1.0F, 1.0F);
         }

         RenderUtil.renderCategoryBox(
               (float) activeCategoryPart.getStartX() + (float) activeCategoryPart.getWidth()
                     + 14.0F * animationProgressValue,
               (float) activeCategoryPart.getStartY() + 16.0F + (float) (25 * activeCategoryPart.index),
               24.0F * animationProgressValue,
               MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor(), partialTicks * 0.6F),
               MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor(), partialTicks * 0.6F));
         int descriptionX = activeCategoryPart.getStartX() + activeCategoryPart.getWidth() + 4
               + Math.round(animationProgressValue * 28.0F);
         int descriptionY = activeCategoryPart.getStartY() + 25 * activeCategoryPart.index + 4;
         int descriptionWidth = activeCategoryPart.fontRenderer.getStringWidth(description) + 8;
         float secondAnimationValue = MathHelper.calculateTransition(this.secondAnimationProgress.calcPercent(), 0.0F,
               1.0F, 1.0F);
         RenderUtil.renderBackgroundBox((float) descriptionX, (float) descriptionY,
               (float) descriptionWidth * secondAnimationValue, 25.0F,
               MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor(), partialTicks * 0.6F));
         RenderUtil.startScissor((float) descriptionX, (float) descriptionY,
               (float) descriptionWidth * secondAnimationValue, 25.0F);
         RenderUtil.drawString(
               activeCategoryPart.fontRenderer, (float) (descriptionX + 4), (float) (descriptionY + 2), description,
               MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor(),
                     Math.min(1.0F, partialTicks * 1.7F)));
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
         var3 += categoryDrawParts.get(var4).getWidth();
      }

      return 4 + var3 + 5 * var0;
   }

   public void method15962(ModuleCategory var1) {
      ArrayList var4 = new ArrayList();

      for (Module var6 : Client.getInstance().moduleManager.getModulesByCategory(var1)) {
         var4.add(var6.getSuffix());
      }

      this.method15964(1);
      categoryDrawParts.add(1, new CategoryDrawPart(var4, 1));
   }

   public void method15963(Module var1) {
      List var4 = this.method15967(var1);
      if (var4.size() != 0) {
         this.method15964(2);
         categoryDrawParts.add(2, new CategoryDrawPart(var4, 2));
      }
   }

   public void method15964(int var1) {
      Iterator var4 = categoryDrawParts.iterator();

      while (var4.hasNext()) {
         if (((CategoryDrawPartBackground) var4.next()).field32395 >= var1) {
            var4.remove();
         }
      }
   }

   @Override
   public void onDisable() {
      animationProgress.changeDirection(Direction.BACKWARDS);
      this.field23384 = 0;
   }

   @Override
   public void onEnable() {
      animationProgress.changeDirection(Direction.FORWARDS);
      this.field23384 = 40;
   }

   public List<String> method15967(Module var1) {
      ArrayList var4 = new ArrayList();

      for (Setting var6 : this.getModuleSettings(var1)) {
         var4.add(var6.getName() + " " + var6.getCurrentValue());
      }

      return var4;
   }

   public List<Setting> getModuleSettings(Module var1) {
      ArrayList var4 = new ArrayList<Setting>(var1.getSettingMap().values());
      if (var1 instanceof ModuleWithModuleSettings) {
         ModuleWithModuleSettings var5 = (ModuleWithModuleSettings) var1;
         var5.method16724();
         if (var5.method16726() != null) {
            var4.addAll(var5.method16726().getSettingMap().values());
         }
      }

      Iterator var7 = var4.iterator();

      while (var7.hasNext()) {
         Setting var6 = (Setting) var7.next();
         if (var6.getName().equals("Keybind")) {
            var7.remove();
         }
      }

      return var4;
   }

   private int getCurrentCategoryState() {
      CategoryDrawPartBackground var3 = categoryDrawParts.get(categoryDrawParts.size() - 1);
      int var4 = categoryDrawParts.size();
      if (var3.isExpanded()) {
         var4--;
      }

      return var4;
   }

   private void method15970(boolean var1) {
      this.firstAnimationProgress.changeDirection(!var1 ? Direction.BACKWARDS : Direction.FORWARDS);
   }

   private boolean method15971() {
      return this.firstAnimationProgress.getDirection() == Direction.FORWARDS;
   }
}
