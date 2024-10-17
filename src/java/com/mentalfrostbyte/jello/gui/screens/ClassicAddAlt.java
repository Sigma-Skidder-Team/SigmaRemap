package com.mentalfrostbyte.jello.gui.screens;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.account.Account;
import com.mentalfrostbyte.jello.account.AccountManager;
import com.mentalfrostbyte.jello.gui.Screen;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.ClientColors;
import mapped.*;
import net.minecraft.client.Minecraft;
import org.lwjgl.glfw.GLFW;

public class ClassicAddAlt extends Screen {
   public SigmaClassicTextBox field21116;
   public SigmaClassicTextBox field21117;
   public Class4300 field21118;
   public Class4300 field21119;
   public Class4300 field21120;
   public AccountManager field21121 = Client.getInstance().getAccountManager();
   private String field21122 = "§7Idle...";

   public ClassicAddAlt() {
      super("Alt Manager");
      this.method13300(false);
      int var3 = 400;
      int var4 = 114;
      int var5 = (this.getWidthA() - var3) / 2;
      this.addToList(
         this.field21116 = new SigmaClassicTextBox(this, "username", var5, var4, var3, 45, SigmaClassicTextBox.field20741, "", "Username / E-Mail", ResourceRegistry.field38868)
      );
      var4 += 80;
      this.addToList(this.field21117 = new SigmaClassicTextBox(this, "password", var5, var4, var3, 45, SigmaClassicTextBox.field20741, "", "Password", ResourceRegistry.field38868));
      var4 += 190;
      this.addToList(this.field21118 = new Class4300(this, "login", var5, var4, var3, 40, "Login", ClientColors.MID_GREY.getColor));
      var4 += 50;
      this.addToList(this.field21119 = new Class4300(this, "back", var5, var4, var3, 40, "Back", ClientColors.MID_GREY.getColor));
      var4 += 50;
      this.addToList(this.field21120 = new Class4300(this, "import", var5, var4, var3, 40, "Import user:pass", ClientColors.MID_GREY.getColor));
      this.field21117.method13155(true);
      this.field21117.method13147("*");
      this.field21118.doThis((var1, var2) -> {
         this.field21122 = "§bLogging in...";
         new Thread(() -> {
            Account var3x = new Account(this.field21116.getTypedText(), this.field21117.getTypedText());
            if (!this.field21121.updateSelectedEmail(var3x)) {
               this.field21122 = "§cAlt failed!";
            } else {
               this.field21121.updateAccount(var3x);
               this.field21122 = "Alt added. (" + var3x.getEmail() + (!var3x.isEmailAValidEmailFormat() ? "" : " - offline name") + ")";
            }
         }).start();
      });
      this.field21119.doThis((var0, var1) -> Client.getInstance().getGuiManager().method33482(new SigmaClassicAltManager()));
      this.field21120.doThis((var1, var2) -> {
         String var5x = "";

         try {
            var5x = GLFW.glfwGetClipboardString(Minecraft.getInstance().mainWindow.getHandle());
         } catch (Exception var7x) {
         }

         if (var5x != "" && var5x.contains(":")) {
            String[] var6x = var5x.split(":");
            if (var6x.length == 2) {
               this.field21116.method13304(var6x[0].replace("\n", ""));
               this.field21117.method13304(var6x[1].replace("\n", ""));
            }
         }
      });
   }

   @Override
   public void draw(float var1) {
      RenderUtil.method11455(0.0F, 0.0F, (float)this.getWidthA(), (float)this.getHeightA(), ClassicDecryption.mainmenubackground);
      RenderUtil.drawRect(0.0F, 0.0F, (float)this.getWidthA(), (float)this.getHeightA(), MultiUtilities.applyAlpha(ClientColors.PALE_RED.getColor, 0.1F));
      RenderUtil.drawRect(0.0F, 0.0F, (float)this.getWidthA(), (float)this.getHeightA(), MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.95F));
      RenderUtil.method11440(
         ResourceRegistry.field38868, (float)(this.getWidthA() / 2), 38.0F, "Add Alt", ClientColors.LIGHT_GREYISH_BLUE.getColor, Class2218.field14492, Class2218.field14488
      );
      RenderUtil.method11441(
         ResourceRegistry.field38868,
         (float)(this.getWidthA() / 2),
         58.0F,
         this.field21122,
         ClientColors.LIGHT_GREYISH_BLUE.getColor,
         Class2218.field14492,
         Class2218.field14488,
         true
      );
      super.draw(var1);
   }

   @Override
   public void keyPressed(int var1) {
      super.keyPressed(var1);
      if (var1 == 256) {
         Client.getInstance().getGuiManager().method33482(new SigmaClassicAltManager());
      }
   }
}
