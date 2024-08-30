package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.Class4307;
import com.mentalfrostbyte.jello.unmapped.Class8005;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import net.minecraft.client.Minecraft;

public class MainmenuScreen2 extends Class4305 {
   private final Class4240 field21123;
   private final Class4240 field21124;
   private final Class4240 field21125;
   private final Class4240 field21126;
   private final Class4240 field21127;
   private final Class4302 field21128;
   private final Class4287 field21129;
   private final Class4287 field21130;
   private final Class4365 field21131;
   private final UIButton field21132;
   private final UIButton field21133;
   public int field21134 = 0;

   public MainmenuScreen2(Class4305 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.method13300(false);
      boolean var9 = false;
      boolean var10 = false;
      byte var11 = 2;
      byte var12 = 2;
      short var13 = 128;
      short var14 = 128;
      ClientResource var15 = ResourceRegistry.JelloLightFont20;
      ClientResource var16 = ResourceRegistry.JelloLightFont18;
      int var17 = 0;
      byte var18 = 80;
      byte var19 = 10;
      String var20 = "© Sigma Prod";
      StringBuilder var10000 = new StringBuilder().append("Jello for Sigma ");
      Client.getInstance();
      String var21 = var10000.append(Client.VERSION).append("  -  1.8 to ").append(Class8005.field34418.method18580()).toString();
      this.method13230(
         this.field21123 = new Class4236(
            this,
            "Singleplayer",
            this.method13447(var17++),
            this.method13448(),
            128,
            128,
            ResourcesDecrypter.singleplayerPNG,
            new Class6387(ClientColors.LIGHT_GREYISH_BLUE.getColor, ClientColors.DEEP_TEAL.getColor)
         )
      );
      this.method13230(
         this.field21124 = new Class4236(
            this,
            "Multiplayer",
            this.method13447(var17++),
            this.method13448(),
            128,
            128,
            ResourcesDecrypter.multiplayerPNG,
            new Class6387(ClientColors.LIGHT_GREYISH_BLUE.getColor, ClientColors.DEEP_TEAL.getColor)
         )
      );
      this.method13230(
         this.field21125 = new Class4236(
            this,
            "Realms",
            this.method13447(var17++),
            this.method13448(),
            128,
            128,
            ResourcesDecrypter.shopPNG,
            new Class6387(ClientColors.LIGHT_GREYISH_BLUE.getColor, ClientColors.DEEP_TEAL.getColor)
         )
      );
      this.method13230(
         this.field21126 = new Class4236(
            this,
            "Options",
            this.method13447(var17++),
            this.method13448(),
            128,
            128,
            ResourcesDecrypter.optionsPNG,
            new Class6387(ClientColors.LIGHT_GREYISH_BLUE.getColor, ClientColors.DEEP_TEAL.getColor)
         )
      );
      this.method13230(
         this.field21127 = new Class4236(
            this,
            "Alt Manager",
            this.method13447(var17++),
            this.method13448(),
            128,
            128,
            ResourcesDecrypter.altPNG,
            new Class6387(ClientColors.LIGHT_GREYISH_BLUE.getColor, ClientColors.DEEP_TEAL.getColor)
         )
      );
      this.method13230(
         this.field21130 = new Class4287(
            this, "Copyright", 10, this.method13269() - 31, var15.method23942(var20), 128, new Class6387(ClientColors.LIGHT_GREYISH_BLUE.getColor), var20, var15
         )
      );
      this.method13230(
         this.field21129 = new Class4287(
            this,
            "Version",
            this.method13267() - var15.method23942(var21) - 9,
            this.method13269() - 31,
            128,
            128,
            new Class6387(ClientColors.LIGHT_GREYISH_BLUE.getColor),
            var21,
            var15
         )
      );
      this.field21130.field20779 = true;
      this.field21129.field20779 = true;
      this.method13230(
         this.field21132 = new UIButton(
            this, "changelog", 432, 24, 110, 50, new Class6387(ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.7F)), "Changelog", ResourceRegistry.JelloLightFont20
         )
      );
      this.method13230(
         this.field21133 = new UIButton(
            this, "quit", 30, 24, 50, 50, new Class6387(ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.4F)), "Exit", ResourceRegistry.JelloLightFont20
         )
      );
      this.field21133.method13251((var1x, var2x) -> {
         ((Class4310)this.method13258()).method13341();
         new Thread(() -> {
            Minecraft.getInstance().shutdown();
         }).start();
      });
      this.method13230(this.field21131 = new Class4365(this, "Account", 0, var19, 0, var18, "Log in"));
      this.method13230(this.field21128 = new Class4302(this, "pre", 0, 0, 240, 100));
      this.field21128.method13247((var1x, var2x) -> {
         if (Client.getInstance().getNetworkManager().account != null) {
            ((Class4310)this.method13258()).method13343();
         } else {
            this.method13446(new Class4322());
         }
      });
      this.field21132.method13251((var1x, var2x) -> ((Class4310)this.method13258()).method13342());
      this.field21123.method13251((var1x, var2x) -> this.method13445(new Class1341(Minecraft.getInstance().currentScreen)));
      this.field21124.method13251((var1x, var2x) -> this.method13445(new JelloPortalScreen(Minecraft.getInstance().currentScreen)));
      this.field21126.method13251((var1x, var2x) -> this.method13445(new Class1129(Minecraft.getInstance().currentScreen, Minecraft.getInstance().gameSettings)));
      this.field21127.method13251((var1x, var2x) -> this.method13446(new Class4313()));
      this.field21125.method13251((var1x, var2x) -> this.method13443());
      this.field21131.method13251((var1x, var2x) -> {
         if (Client.getInstance().getNetworkManager().account != null) {
            ((Class4310)this.method13258()).method13345();
         } else {
            this.method13446(new Class4322());
         }
      });
      this.field21130.method13251((var1x, var2x) -> {
         if (this.field21134++ > 8) {
            Client.getInstance().getGuiManager().method33482(new CreditsScreen());
         }
      });
   }

   public void method13443() {
      Class8005.field34417 = Class8005.field34418;
      Class810 var3 = new Class810();
      var3.method2209(Minecraft.getInstance().currentScreen);
      this.method13444();
   }

   @Override
   public void draw(float var1) {
      this.method13224();
      Texture var4 = ResourcesDecrypter.logoLargePNG;
      int var5 = var4.getImageWidth();
      int var6 = var4.getImageHeight();
      if (GuiManager.field41348 > 1.0F) {
         var4 = ResourcesDecrypter.logoLarge2xPNG;
      }

      RenderUtil.method11449(
         (float)(this.method13267() / 2 - var5 / 2),
         (float)(this.method13269() / 2 - var6),
         (float)var5,
         (float)var6,
         ResourcesDecrypter.logoLargePNG,
         ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1)
      );
      super.draw(var1);
   }

   @Override
   public void method13028(int var1, int var2) {
      this.field21128.method13288(!Client.getInstance().getNetworkManager().isPremium());
      byte var5 = 30;
      byte var6 = 90;
      this.field21132.method13264(var6 + (!Client.getInstance().getNetworkManager().isPremium() ? 202 : 0));
      this.field21133.method13264(var5 + (!Client.getInstance().getNetworkManager().isPremium() ? 202 : 0));
      super.method13028(var1, var2);
   }

   public void method13444() {
      Client.getInstance().getSoundManager().play("clicksound");
   }

   public void method13445(Screen var1) {
      Minecraft.getInstance().displayGuiScreen(var1);
      this.method13444();
   }

   public void method13446(Class4307 var1) {
      Client.getInstance().getGuiManager().method33482(var1);
      this.method13444();
   }

   private int method13447(int var1) {
      short var4 = 128;
      short var5 = 128;
      byte var6 = 5;
      byte var7 = -6;
      short var8 = 610;
      return this.method13267() / 2 - 305 + var1 * 128 + var1 * -6;
   }

   private int method13448() {
      return this.method13269() / 2 + 14;
   }
}
