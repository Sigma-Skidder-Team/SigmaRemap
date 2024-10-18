package com.mentalfrostbyte.jello.gui.screens;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.gui.Screen;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.gui.jello.BrainFreeze;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.render.animation.Direction;
import com.mentalfrostbyte.jello.util.render.animation.MathHelper;
import lol.ClientColors;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.Util;
import totalcross.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JelloClickGUI extends Screen {
   public ClickGUIBlurOverlay blurOverlay;
   private static Minecraft mc = Minecraft.getInstance();
   private static Animation field20942;
   private static boolean field20943;
   private static boolean field20944;
   private Map<ModuleCategory, JelloClickGUIPanels> categoryPanel = new HashMap<ModuleCategory, JelloClickGUIPanels>();
   public MusicPlayer musicPlayer;
   public BrainFreezeGui brainFreeze;
   public ConfigButtonOnClickGui configButton;
   public ModuleSettingUI field20949;
   public AlertPanel field20950;
   private static boolean field20951 = true;
   public JelloClickGUIPanels jelloClickGUIPanels = null;

   public JelloClickGUI() {
      super("JelloScreen");
      field20944 = field20944 | !field20943;
      int x = 30;
      int y = 30;
      this.addToList(this.brainFreeze = new BrainFreezeGui(this, "brainFreeze"));
      JelloClickGUI var5 = this;

      for (Module module : Client.getInstance().getModuleManager().getModuleMap().values()) {
         if (!this.categoryPanel.containsKey(module.getAdjustedCategoryBasedOnClientMode())) {
            JelloClickGUIPanels clickGUIPanels = new JelloClickGUIPanels(this, module.getAdjustedCategoryBasedOnClientMode().getName(), x, y, module.getAdjustedCategoryBasedOnClientMode());
            this.categoryPanel.put(module.getAdjustedCategoryBasedOnClientMode(), clickGUIPanels);
            this.addToList(clickGUIPanels);

            x += clickGUIPanels.getWidthA() + 10;
            if (this.categoryPanel.size() == 4) {
               x = 30;
               y += clickGUIPanels.getHeightA() - 20;
            }

            clickGUIPanels.method13507(var2 -> var5.method13222(() -> {
                  var5.addToList(this.field20949 = new ModuleSettingUI(var5, "settings", 0, 0, this.widthA, this.heightA, var2));
                  this.field20949.method13292(true);
            }));
         }
      }

      this.addToList(this.musicPlayer = new MusicPlayer(this, "musicPlayer"));
      this.musicPlayer.method13215(true);
      PNGIconButton var9;
      this.addToList(var9 = new PNGIconButton(this, "more", this.getWidthA() - 69, this.getHeightA() - 55, 55, 41, ResourcesDecrypter.optionsPNG1));
      var9.method13307().method19406(MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.3F));
      var9.method13300(false);
      this.musicPlayer.setEnabled(field20951);
      var9.doThis((var1, var2) -> this.method13222(() -> {
            if (this.configButton != null && this.method13239(this.configButton)) {
               this.method13234(this.configButton);
            } else {
               this.addToList(this.configButton = new ConfigButtonOnClickGui(this, "morepopover", this.getWidthA() - 14, this.getHeightA() - 14));
               this.configButton.method13292(true);
            }
         }));
      field20942 = new Animation(450, 125);
      this.blurOverlay = new ClickGUIBlurOverlay(this, this, "overlay");
      MultiUtilities.method17739();
      MultiUtilities.method17740(field20942.calcPercent());
   }

   public boolean method13314() {
      if (Client.getInstance().getMusicManager().hasPython() && Client.getInstance().getMusicManager().hasVCRedist()) {
         return false;
      } else if (this.field20950 == null) {
         this.method13222(() -> {
            List<MiniAlert> var3 = new ArrayList();
            var3.add(new MiniAlert(AlertType.HEADER, "Music", 40));
            var3.add(new MiniAlert(AlertType.FIRSTLINE, "Jello Music requires:", 20));
            if (!Client.getInstance().getMusicManager().hasPython()) {
               var3.add(new MiniAlert(AlertType.FIRSTLINE, "- Python 3.12.5", 30));
            }

            if (!Client.getInstance().getMusicManager().hasVCRedist()) {
               var3.add(new MiniAlert(AlertType.FIRSTLINE, "- Visual C++ 2010 x86", 30));
            }

            var3.add(new MiniAlert(AlertType.BUTTON, "Download", 55));
            this.method13233(this.field20950 = new AlertPanel(this, "music", true, "Dependencies.", var3.toArray(new MiniAlert[0])));
            this.field20950.method13036(var0 -> {
               if (!Client.getInstance().getMusicManager().hasPython()) {
                  Util.getOSType().openLink("https://www.python.org/ftp/python/3.12.5/python-3.12.5-macos11.pkg");
               }

               if (!Client.getInstance().getMusicManager().hasVCRedist()) {
                  Util.getOSType().openLink("https://www.microsoft.com/en-US/Download/confirmation.aspx?id=26999");
               }
            });
            this.field20950.method13604(var1 -> new Thread(() -> {
                this.method13222(() -> {
                   this.method13236(this.field20950);
                   this.field20950 = null;
                });
            }).start());
            this.field20950.method13603(true);
         });
         return true;
      } else {
         return true;
      }
   }

   public void method13315() {
      for (JelloClickGUIPanels var4 : this.categoryPanel.values()) {
         var4.method13504();
      }
   }

   @Override
   public void method13028(int var1, int var2) {
      this.musicPlayer.setEnabled(this.musicPlayer.getWidthA() < this.getWidthA() && this.musicPlayer.getHeightA() < this.getHeightA());
      super.method13028(var1, var2);
      MultiUtilities.method17740(Math.min(1.0F, field20942.calcPercent() * 4.0F));
      this.brainFreeze.setEnabled(Client.getInstance().getModuleManager().getModuleByClass(BrainFreeze.class).isEnabled());
      if (this.configButton != null) {
         int var5 = var1 - this.configButton.method13271();
         int var6 = var2 - this.configButton.method13272();
         boolean var7 = var5 >= -10 && var6 >= -10;
         if (!var7) {
            this.configButton.method13613();
         }
      }

      if (this.configButton != null && this.configButton.method13614()) {
         this.method13236(this.configButton);
         this.configButton = null;
      }

      if (field20942.getDirection() == Direction.BACKWARDS && this.field20949 != null && !this.field20949.field20671) {
         this.field20949.field20671 = true;
      }

      if (this.field20949 != null && this.field20949.field20671 && this.field20949.animation1.calcPercent() == 0.0F) {
         this.method13222(() -> {
            this.method13236(this.field20949);
            this.field20949 = null;
         });
      }

      if (field20944) {
         float var8 = (float)(0.03F * (60.0 / (double)this.method13313()));
         Direction var9 = field20942.getDirection();
         field20942.changeDirection(!field20943 ? Direction.FORWARDS : Direction.BACKWARDS);
         if (field20942.calcPercent() <= 0.0F && field20943) {
            field20943 = false;
            this.method13316(field20943);
         } else if (field20942.calcPercent() >= 1.0F && field20942.getDirection() == var9) {
            field20943 = true;
            this.method13316(field20943);
         }
      }

      if (field20944 && field20943) {
         MultiUtilities.method17742();
      }
   }

   @Override
   public int method13313() {
      return Minecraft.getFps();
   }

   @Override
   public JSONObject method13160(JSONObject var1) {
      MultiUtilities.method17742();
      this.method13234(this.blurOverlay);
      return super.method13160(var1);
   }

   @Override
   public void method13161(JSONObject var1) {
      super.method13161(var1);
   }

   private void method13316(boolean var1) {
      field20944 = false;
      if (!var1) {
         mc.displayGuiScreen(null);
      }
   }

   @Override
   public boolean method13078(int var1, int var2, int var3) {
      if (var3 <= 1) {
         return super.method13078(var1, var2, var3);
      } else {
         this.keyPressed(var3);
         return false;
      }
   }

   @Override
   public void keyPressed(int var1) {
      super.keyPressed(var1);
      int var4 = Client.getInstance().getModuleManager().getMacOSTouchBar().method13728(ClickGui.class);
      if (var1 == 256 || var1 == var4 && this.field20949 == null && !this.method13227()) {
         if (field20944) {
            field20943 = !field20943;
         }

         field20944 = true;
      }
   }

   public float method13317(float var1, float var2) {
      return field20942.getDirection() != Direction.BACKWARDS
         ? (float)(Math.pow(2.0, (double)(-10.0F * var1)) * Math.sin((double)(var1 - var2 / 4.0F) * (Math.PI * 2) / (double)var2) + 1.0)
         : QuadraticEasing.easeOutQuad(var1, 0.0F, 1.0F, 1.0F);
   }

   @Override
   public void draw(float var1) {
      float var4 = field20944 && !field20943
         ? this.method13317(field20942.calcPercent(), 0.8F) * 0.5F + 0.5F
         : (!field20944 ? 1.0F : this.method13317(field20942.calcPercent(), 1.0F));
      float var5 = 0.2F * var1 * var4;
      RenderUtil.drawRect(
         (float)this.xA,
         (float)this.yA,
         (float)(this.xA + this.widthA),
         (float)(this.yA + this.heightA),
         MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, var5)
      );
      Object var6 = null;
      float var7 = 1.0F;
      if (this.field20949 != null) {
         float var8 = EasingFunctions.easeOutBack(this.field20949.animation.calcPercent(), 0.0F, 1.0F, 1.0F);
         if (this.field20949.animation.getDirection() == Direction.BACKWARDS) {
            var8 = MathHelper.calculateBackwardTransition(this.field20949.animation.calcPercent(), 0.0F, 1.0F, 1.0F);
         }

         var7 -= this.field20949.animation.calcPercent() * 0.1F;
         var4 *= 1.0F + var8 * 0.2F;
      }

      if (Client.getInstance().getModuleManager().getConfigurationManager().getCurrentConfig() != null) {
         String var12 = Client.getInstance().getModuleManager().getConfigurationManager().getCurrentConfig().getName;
         RenderUtil.drawString(
            ResourceRegistry.JelloLightFont20,
            (float)(this.widthA - ResourceRegistry.JelloLightFont20.getStringWidth(var12) - 80),
            (float)(this.heightA - 47),
            var12,
            MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.5F * Math.max(0.0F, Math.min(1.0F, var4)))
         );
      }

      for (CustomGuiScreen var9 : this.method13241()) {
         float var10 = (float)(var9.getYA() + var9.getHeightA() / 2 - mc.mainWindow.getHeight() / 2) * (1.0F - var4) * 0.5F;
         float var11 = (float)(var9.getXA() + var9.getWidthA() / 2 - mc.mainWindow.getWidth() / 2) * (1.0F - var4) * 0.5F;
         var9.method13286((int)var11, (int)var10);
         var9.method13279(1.5F - var4 * 0.5F, 1.5F - var4 * 0.5F);
      }

      super.draw(var1 * Math.min(1.0F, var4) * var7);
      if (this.jelloClickGUIPanels != null) {
         this.jelloClickGUIPanels.method13292(false);
      }

      this.blurOverlay.method13292(false);
      this.method13234(this.blurOverlay);
   }
}
