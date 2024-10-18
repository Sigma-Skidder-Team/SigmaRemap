package com.mentalfrostbyte.jello.gui.screens;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.account.Account;
import com.mentalfrostbyte.jello.account.AccountManager;
import com.mentalfrostbyte.jello.gui.Screen;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.ClientColors;
import lol.Texture;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.ServerList;
import totalcross.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class SigmaClassicAltManager extends Screen {
   private int field21050;
   private float field21051;
   private float field21052 = 0.75F;
   private boolean field21053 = true;
   public UIButton field21054;
   private Class4344 field21055;
   private AlertPanel field21056;
   private AlertPanel field21057;
   private float field21058 = 0.65F;
   private float field21059 = 1.0F - this.field21058;
   private int field21060 = 30;
   public AccountManager field21061 = Client.getInstance().getAccountManager();
   private Texture field21062;
   private float field21063;
   private Class2209 field21064 = Class2209.field14448;
   private boolean field21065 = false;
   private SigmaClassicTextBox field21066;
   private ClassicAltManager field21067;
   private String status = "§7Idle...";

   public SigmaClassicAltManager() {
      super("Alt Manager");
      this.method13300(false);
      ClassicParticleEngine var3;
      this.addToList(var3 = new ClassicParticleEngine(this, "particles"));
      var3.method13294(true);
      ArrayList var4 = new ArrayList();
      ServerList var5 = new ServerList(Minecraft.getInstance());
      var5.loadServerList();
      int var6 = var5.countServers();

      for (int var7 = 0; var7 < var6; var7++) {
         ServerData var8 = var5.getServerData(var7);
         if (!var4.contains(var8.serverIP)) {
            var4.add(var8.serverIP);
         }
      }

      short var9 = 790;
      this.addToList(
         this.field21066 = new SigmaClassicTextBox(
            this,
            "textbox",
            (Minecraft.getInstance().mainWindow.getWidth() - var9) / 2 - 140,
            this.getHeightA() - 40,
            140,
            32,
            UIInput.field20741,
            "",
            "Search...",
            ResourceRegistry.JelloLightFont18
         )
      );
      this.field21066.setFont(ResourceRegistry.field38868);
      this.field21066.method13151(var1 -> this.method13402());
      this.method13403();
      this.addToList(
         this.field21067 = new ClassicAltManager(this, "toolbar", (Minecraft.getInstance().mainWindow.getWidth() - var9) / 2 + 16, this.getHeightA() - 94)
      );
      this.field21067.method13296(false);
   }

   private void method13395(Account var1) {
      byte var4 = 52;
      Class4349 var5;
      this.field21055
         .addToList(
            var5 = new Class4349(this.field21055, var1.getEmail(), 4, var4 * this.method13400() + 4, this.field21055.getWidthA() - 8, var4, var1)
         );
      var5.doThis((var2, var3) -> {
         if (var3 == 0) {
            Class4349 var6 = this.method13406();
            if (var6 != null) {
               var6.method13580(false);
            }

            var5.method13580(true);
            this.field21067.method13296(true);
            if (var6 != null && var6.equals(var5)) {
               this.method13398(var5);
            }
         }
      });
   }

   public void method13396() {
      Class4349 var3 = this.method13406();
      if (var3 != null) {
         this.method13398(var3);
      }
   }

   public void method13397() {
      Class4349 var3 = this.method13406();
      if (var3 != null) {
         this.field21061.removeAccount(var3.field21249);
         this.field21067.method13296(false);
         this.method13402();
      }
   }

   public void method13398(Class4349 var1) {
      this.method13399(var1.field21249);
   }

   public void method13399(Account var1) {
      this.status = "§bLogging in...";
      new Thread(() -> {
         if (!this.field21061.login(var1)) {
            this.status = "§cLogin Failed!";
         } else {
            this.status = "§aLogged in. (" + var1.getName() + (!var1.isEmailAValidEmailFormat() ? "" : " - offline name") + ")";
         }
      }).start();
   }

   @Override
   public void draw(float var1) {
      this.method13401();
      super.draw(var1);
      RenderUtil.drawString(ResourceRegistry.field38868, 20.0F, 20.0F, Minecraft.getInstance().getSession().getUsername(), -2236963);
      RenderUtil.method11440(
         ResourceRegistry.field38868,
         (float)(this.getWidthA() / 2),
         20.0F,
         "Account Manager - " + this.method13400() + " alts",
         ClientColors.LIGHT_GREYISH_BLUE.getColor,
         Class2218.field14492,
         Class2218.field14488
      );
      RenderUtil.method11441(
         ResourceRegistry.field38868,
         (float)(this.getWidthA() / 2),
         40.0F,
         this.status,
         ClientColors.LIGHT_GREYISH_BLUE.getColor,
         Class2218.field14492,
         Class2218.field14488,
         false
      );
   }

   private int method13400() {
      int var3 = 0;

      for (CustomGuiScreen var5 : this.field21055.method13241()) {
         if (!(var5 instanceof Class4292)) {
            for (CustomGuiScreen var7 : var5.method13241()) {
               var3++;
            }
         }
      }

      return var3;
   }

   private void method13401() {
      RenderUtil.method11455(0.0F, 0.0F, (float)this.getWidthA(), (float)this.getHeightA(), ClassicDecryption.mainmenubackground);
      RenderUtil.renderBackgroundBox(0.0F, 0.0F, (float)this.getWidthA(), (float)this.getHeightA(), MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.23F));
   }

   @Override
   public void keyPressed(int var1) {
      super.keyPressed(var1);
      if (var1 == 256) {
         Minecraft.getInstance().displayGuiScreen(new VanillaMainMenuScreen());
      }
   }

   @Override
   public JSONObject method13160(JSONObject var1) {
      this.field21061.saveAlts();
      return var1;
   }

   @Override
   public void method13161(JSONObject var1) {
      for (CustomGuiScreen var5 : this.field21055.method13241()) {
         if (!(var5 instanceof Class4292)) {
            for (CustomGuiScreen var7 : var5.method13241()) {
               this.field21055.method13234(var7);
            }
         }
      }

      this.method13402();
   }

   public void method13402() {
      this.method13222(new Class1387(this));
   }

   public void method13403() {
      List<Account> var4 = Class8270.method28878(this.field21061.getAccounts(), Class2209.field14448, "", this.field21066.getTypedText());
      int var5 = 0;
      if (this.field21055 != null) {
         var5 = this.field21055.method13513();
         this.method13236(this.field21055);
      }

      CustomGuiScreen var6 = this.method13221("alts");
      if (var6 != null) {
         this.method13236(var6);
      }

      int var7 = Minecraft.getInstance().mainWindow.getWidth() - 200;
      int var8 = this.getWidthA() - var7;
      this.method13233(this.field21055 = new Class4344(this, "alts", var8 / 2, 69, var7, Minecraft.getInstance().mainWindow.getHeight() - 169));

      for (Account var10 : var4) {
         this.method13395(var10);
      }

      this.field21055.method13512(var5);
      this.field21055.method13300(false);
      this.field21055.method13515(true);
      this.field21055.method13242();
   }

   private void method13404(Object var1) {
   }

   public int method13405() {
      return Minecraft.getInstance().mainWindow.getHeight() / 12 + 280 + Minecraft.getInstance().mainWindow.getHeight() / 12;
   }

   public Class4349 method13406() {
      for (CustomGuiScreen var4 : this.field21055.method13241()) {
         if (!(var4 instanceof Class4292)) {
            for (CustomGuiScreen var6 : var4.method13241()) {
               if (var6 instanceof Class4349) {
                  Class4349 var7 = (Class4349)var6;
                  if (var7.method13582()) {
                     return var7;
                  }
               }
            }
         }
      }

      return null;
   }
}
