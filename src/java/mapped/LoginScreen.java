package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.gui.screens.LoginAndOutScreen;
import com.mentalfrostbyte.jello.network.Class9507;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.unmapped.ResourceList;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.ClientColors;
import net.minecraft.util.Util;

public class LoginScreen extends Class4247 {
    private UIInput inputUsername;
   private UIInput inputPassword;
   private UIInput field21355;
   private UIButton loginButton;
   private UIButton registerButton;
   private UIButton forgotButton;
   private UILoadingCircle loadingThingy;
   public static int widthy = 334;
   public static int heighty = 571;

   public LoginScreen(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
       this.addToList(
               new UITextDisplay(
                  this,
                  "Login",
                  228,
                  43,
                  ResourceRegistry.JelloMediumFont40.getStringWidth("Login"),
                  50,
                  new ColorHelper(ClientColors.DEEP_TEAL.getColor, ClientColors.DEEP_TEAL.getColor, ClientColors.DEEP_TEAL.getColor, -7631989),
                  "Login",
                  ResourceRegistry.JelloMediumFont40
               )
      );
      this.addToList(
         this.loginButton = new UIButton(
            this, "LoginButton", 468, 238, ResourceRegistry.JelloLightFont25.getStringWidth("Login"), 70, ColorHelper.field27961, "Login", ResourceRegistry.JelloLightFont25
         )
      );
      this.addToList(
         this.registerButton = new UIButton(
            this, "RegisterButton", 88, 250, ResourceRegistry.JelloLightFont14.getStringWidth("Register"), 14, ColorHelper.field27961, "Register", ResourceRegistry.JelloLightFont14
         )
      );
      this.addToList(
         this.forgotButton = new UIButton(
            this,
            "ForgotButton",
            60,
            275,
            ResourceRegistry.JelloLightFont14.getStringWidth("Forgot password?"),
            14,
            ColorHelper.field27961,
            "Forgot password?",
            ResourceRegistry.JelloLightFont14
         )
      );
      this.addToList(this.loadingThingy = new UILoadingCircle(this, "loading", 511, 260, 30, 30));
      this.loadingThingy.method13296(false);
      this.loadingThingy.method13294(true);
      int var9 = 50;
      int var10 = 300;
      int var11 = 106;
      ColorHelper var12 = new ColorHelper(-892679478, -892679478, -892679478, ClientColors.MID_GREY.getColor, Class2218.field14488, Class2218.field14492);
      this.addToList(this.inputUsername = new UIInput(this, "Username", 228, var11, var10, var9, var12, "", "Username"));
      this.addToList(this.inputPassword = new UIInput(this, "Password", 228, var11 + 53, var10, var9, var12, "", "Password"));
      this.inputUsername.setFont(ResourceRegistry.JelloLightFont20);
      this.inputPassword.setFont(ResourceRegistry.JelloLightFont20);
      this.inputPassword.method13155(true);
      this.addToList(this.field21355 = new UIInput(this, "CaptchaBox", 228, var11 + 135, 84, var9, var12, "", "Captcha"));
      this.field21355.setFont(ResourceRegistry.JelloLightFont20);
      this.field21355.setEnabled(false);
      this.loginButton.doThis((var1x, var2x) -> this.method13688());
      this.registerButton.doThis((var1x, var2x) -> {
         LoginAndOutScreen var5x = (LoginAndOutScreen)this.getScreen();
         var5x.method13422();
      });
      this.forgotButton.doThis((var0, var1x) -> Util.getOSType().openLink("https://sigma-web-alpha.vercel.app/"));
   }

   @Override
   public void draw(float var1) {
      super.method13224();
      super.method13225();
      byte var4 = 28;
      RenderUtil.drawImage((float)(this.xA + var4), (float)(this.yA + var4 + 10), 160.0F, 160.0F, ResourceList.sigmaPNG, var1);
      Class9507 var5 = Client.getInstance().getNetworkManager().method30452();
      if (var5 != null) {
         this.field21355.setEnabled(var5.method36702());
         if (var5.method36702()) {
            RenderUtil.renderBackgroundBox(
               (float)(this.xA + 330), (float)(this.yA + 255), 114.0F, 40.0F, MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.04F)
            );
         }

         if (var5.method36701() != null) {
            RenderUtil.startScissor((float)(this.xA + 316), (float)(this.yA + 255), 190.0F, 50.0F);
            RenderUtil.method11455((float)(this.xA + 316), (float)(this.yA + 255), 190.0F, 190.0F, var5.method36701());
            RenderUtil.endScissor();
         }
      }

      super.draw(var1);
   }

   public void method13688() {
      new Thread(() -> {
         this.loadingThingy.method13296(true);
         this.loginButton.setEnabled(false);
         Class9507 var3 = Client.getInstance().getNetworkManager().method30452();
         if (var3 != null) {
            var3.method36706(this.field21355.getTypedText());
         }

         String var4 = Client.getInstance().getNetworkManager().newAccount(this.inputUsername.getTypedText(), this.inputPassword.getTypedText(), var3);
         if (var4 != null) {
            LoginAndOutScreen var5 = (LoginAndOutScreen)this.getScreen();
            var5.method13424("Error", var4);
            this.field21355.method13304("");
         } else {
            this.method13037();
         }

         this.loadingThingy.method13296(false);
         this.loginButton.setEnabled(true);
      }).start();
   }
}
