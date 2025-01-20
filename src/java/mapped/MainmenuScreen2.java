package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.gui.screens.AltManagerScreen;
import com.mentalfrostbyte.jello.gui.screens.JelloMainMenuScreen;
import com.mentalfrostbyte.jello.gui.screens.LoginAndOutScreen;
import com.mentalfrostbyte.jello.resource.TrueTypeFont;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.gui.Screen;
import com.mentalfrostbyte.jello.unmapped.ResourceList;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.ClientColors;
import lol.Texture;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.OptionsScreen;
import net.minecraft.client.gui.screen.WorldSelectionScreen;

public class MainmenuScreen2 extends CustomGuiScreen {
   private final ButtonPanel singleplayerButton;
   private final ButtonPanel multiplayerButton;
   private final ButtonPanel realmsButton;
   private final ButtonPanel optionsButton;
   private final ButtonPanel altManagerButton;
   private final Class4302 field21128;
   private final UITextDisplay field21129;
   private final UITextDisplay field21130;
   private final Class4365 loginButton;
   private final UIButton changelogButton;
   private final UIButton field21133;
   public int field21134 = 0;

   public MainmenuScreen2(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.method13300(false);
      boolean var9 = false;
      boolean var10 = false;
      byte var11 = 2;
      byte var12 = 2;
      short var13 = 128;
      short var14 = 128;
      TrueTypeFont var15 = ResourceRegistry.JelloLightFont20;
      TrueTypeFont var16 = ResourceRegistry.JelloLightFont18;
      int var17 = 0;
      byte var18 = 80;
      byte var19 = 10;
      String var20 = "© Sigma Prod";
      StringBuilder var10000 = new StringBuilder().append("Jello for Sigma ");
      Client.getInstance();
      String var21 = var10000.append(Client.VERSION).append("  -  1.8 to ").append("1.16.4").toString();
      this.addToList(
            this.singleplayerButton = new Class4236(
                  this,
                  "Singleplayer",
                  this.method13447(var17++),
                  this.method13448(),
                  128,
                  128,
                  ResourceList.singleplayerPNG,
                  new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.getColor, ClientColors.DEEP_TEAL.getColor)));
      this.addToList(
            this.multiplayerButton = new Class4236(
                  this,
                  "Multiplayer",
                  this.method13447(var17++),
                  this.method13448(),
                  128,
                  128,
                  ResourceList.multiplayerPNG,
                  new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.getColor, ClientColors.DEEP_TEAL.getColor)));
      this.addToList(
            this.realmsButton = new Class4236(
                  this,
                  "Realms",
                  this.method13447(var17++),
                  this.method13448(),
                  128,
                  128,
                  ResourceList.shopPNG,
                  new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.getColor, ClientColors.DEEP_TEAL.getColor)));
      this.addToList(
            this.optionsButton = new Class4236(
                  this,
                  "Options",
                  this.method13447(var17++),
                  this.method13448(),
                  128,
                  128,
                  ResourceList.optionsPNG,
                  new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.getColor, ClientColors.DEEP_TEAL.getColor)));
      this.addToList(
            this.altManagerButton = new Class4236(
                  this,
                  "Alt Manager",
                  this.method13447(var17++),
                  this.method13448(),
                  128,
                  128,
                  ResourceList.altPNG,
                  new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.getColor, ClientColors.DEEP_TEAL.getColor)));
      this.addToList(
            this.field21130 = new UITextDisplay(
                  this, "Copyright", 10, this.getHeightA() - 31, var15.getStringWidth(var20), 128,
                  new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.getColor), var20, var15));
      this.addToList(
            this.field21129 = new UITextDisplay(
                  this,
                  "Version",
                  this.getWidthA() - var15.getStringWidth(var21) - 9,
                  this.getHeightA() - 31,
                  128,
                  128,
                  new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.getColor),
                  var21,
                  var15));
      this.field21130.field20779 = true;
      this.field21129.field20779 = true;
      this.addToList(
            this.changelogButton = new UIButton(
                  this, "changelog", 432, 24, 110, 50,
                  new ColorHelper(MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.7F)),
                  "Changelog", ResourceRegistry.JelloLightFont20));
      this.addToList(
            this.field21133 = new UIButton(
                  this, "quit", 30, 24, 50, 50,
                  new ColorHelper(MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.4F)), "Exit",
                  ResourceRegistry.JelloLightFont20));
      this.field21133.doThis((var1x, var2x) -> {
         ((JelloMainMenuScreen) this.getScreen()).method13341();
         new Thread(() -> {
            try {
               Thread.sleep(2000L);
               Minecraft.getInstance().shutdown();
            } catch (InterruptedException e) {
               Minecraft.getInstance().shutdown();
            }
         }).start();
      });
      this.addToList(this.loginButton = new Class4365(this, "Account", 0, var19, 0, var18, "Log in"));
      this.addToList(this.field21128 = new Class4302(this, "pre", 0, 0, 240, 100));
      this.field21128.method13247((var1x, var2x) -> {
         if (Client.getInstance().networkManager.account != null) {
            ((JelloMainMenuScreen) this.getScreen()).method13343();
         } else {
            this.displayScreen(new LoginAndOutScreen());
         }
      });
      this.changelogButton.doThis((var1x, var2x) -> ((JelloMainMenuScreen) this.getScreen()).animateIn());
      this.singleplayerButton
            .doThis((var1x, var2x) -> this.displayGUI(new WorldSelectionScreen(Minecraft.getInstance().currentScreen)));
      this.multiplayerButton
            .doThis((var1x, var2x) -> this.displayGUI(new JelloPortalScreen(Minecraft.getInstance().currentScreen)));
      this.optionsButton.doThis((var1x, var2x) -> this.displayGUI(
            new OptionsScreen(Minecraft.getInstance().currentScreen, Minecraft.getInstance().gameSettings)));
      this.altManagerButton.doThis((var1x, var2x) -> this.displayScreen(new AltManagerScreen()));
      this.realmsButton.doThis((var1x, var2x) -> this.method13443());
      this.loginButton.doThis((var1x, var2x) -> {
         if (Client.getInstance().networkManager.account != null) {
            ((JelloMainMenuScreen) this.getScreen()).logout();
         } else {
            this.displayScreen(new LoginAndOutScreen());
         }
      });
      this.field21130.doThis((var1x, var2x) -> {
         if (this.field21134++ > 8) {
            Client.getInstance().guiManager.method33482(new LoginAndOutScreen());
         }
      });
   }

   public void method13443() {
      Class810 var3 = new Class810();
      var3.method2209(Minecraft.getInstance().currentScreen);
      this.playClickSound();
   }

   @Override
   public void draw(float var1) {
      this.method13224();
      Texture largeLogo = ResourceList.logoLargePNG;
      int imageWidth = largeLogo.getImageWidth();
      int imageHeight = largeLogo.getImageHeight();
      if (GuiManager.portalScaleFactor > 1.0F) {
         largeLogo = ResourceList.logoLarge2xPNG;
      }

      RenderUtil.drawImage(
            (float) (this.getWidthA() / 2 - imageWidth / 2),
            (float) (this.getHeightA() / 2 - imageHeight),
            (float) imageWidth,
            (float) imageHeight,
            ResourceList.logoLargePNG,
            MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1));
      super.draw(var1);
   }

   @Override
   public void method13028(int var1, int var2) {
      this.field21128.setEnabled(!Client.getInstance().networkManager.isPremium());
      byte var5 = 30;
      byte var6 = 90;
      this.changelogButton.setXA(var6 + (!Client.getInstance().networkManager.isPremium() ? 202 : 0));
      this.field21133.setXA(var5 + (!Client.getInstance().networkManager.isPremium() ? 202 : 0));
      super.method13028(var1, var2);
   }

   public void playClickSound() {
      Client.getInstance().soundManager.play("clicksound");
   }

   public void displayGUI(net.minecraft.client.gui.screen.Screen var1) {
      Minecraft.getInstance().displayGuiScreen(var1);
      this.playClickSound();
   }

   public void displayScreen(Screen var1) {
      Client.getInstance().guiManager.method33482(var1);
      this.playClickSound();
   }

   private int method13447(int var1) {
      short var4 = 128;
      short var5 = 128;
      byte var6 = 5;
      byte var7 = -6;
      short var8 = 610;
      return this.getWidthA() / 2 - 305 + var1 * 128 + var1 * -6;
   }

   private int method13448() {
      return this.getHeightA() / 2 + 14;
   }
}
