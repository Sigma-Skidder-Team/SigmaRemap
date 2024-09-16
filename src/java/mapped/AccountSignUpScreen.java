package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.network.Class9507;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.ColorUtils;

public class AccountSignUpScreen extends Class4247 {
   private UITextDisplay stringPanel;
   private UIInput usernameInputBox;
   private UIInput emailInputBox;
   private UIInput passwordInputBox;
   private UIInput captchaBox;
   private UIButton registerButton;
   private UIButton loginButton;
   private UILoadingCircle loadingBox;
   public static int widthy = 390;
   public static int height = 590;

   public AccountSignUpScreen(IconPanel var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.addToList(
         this.stringPanel = new UITextDisplay(
            this,
            "Register",
            228,
            43,
            ResourceRegistry.JelloMediumFont40.method23942("New Account"),
            50,
            new ColorHelper(ClientColors.DEEP_TEAL.getColor, ClientColors.DEEP_TEAL.getColor, ClientColors.DEEP_TEAL.getColor, -7631989),
            "New Account",
            ResourceRegistry.JelloMediumFont40
         )
      );
      this.addToList(
         this.registerButton = new UIButton(
            this, "RegisterButton", 468, 291, ResourceRegistry.JelloLightFont25.method23942("Register"), 70, ColorHelper.field27961, "Register", ResourceRegistry.JelloLightFont25
         )
      );
      this.addToList(
         this.loginButton = new UIButton(
            this, "LoginButton", 98, 333, ResourceRegistry.JelloLightFont14.method23942("Login"), 14, ColorHelper.field27961, "Login", ResourceRegistry.JelloLightFont14
         )
      );
      this.addToList(this.loadingBox = new UILoadingCircle(this, "loading", 530, 314, 30, 30));
      this.loadingBox.method13296(false);
      this.loadingBox.method13294(true);
      byte var9 = 50;
      short var10 = 320;
      byte var11 = 106;
      ColorHelper var12 = new ColorHelper(-892679478, -892679478, -892679478, ClientColors.MID_GREY.getColor, Class2218.field14488, Class2218.field14492);
      this.addToList(this.usernameInputBox = new UIInput(this, "Username", 228, var11, var10, var9, var12, "", "Username"));
      this.usernameInputBox.method13306(ResourceRegistry.JelloLightFont20);
      this.addToList(this.emailInputBox = new UIInput(this, "Email", 228, var11 + 53, var10, var9, var12, "", "Email"));
      this.emailInputBox.method13306(ResourceRegistry.JelloLightFont20);
      this.addToList(this.passwordInputBox = new UIInput(this, "Password", 228, var11 + 106, var10, var9, var12, "", "Password"));
      this.passwordInputBox.method13306(ResourceRegistry.JelloLightFont20);
      this.passwordInputBox.method13155(true);
      this.addToList(this.captchaBox = new UIInput(this, "CaptchaBox", 228, var11 + 53 + 135, 80, var9, var12, "", "Captcha"));
      this.captchaBox.method13306(ResourceRegistry.JelloLightFont20);
      this.captchaBox.method13288(false);
      this.registerButton.doThis((var1x, var2x) -> this.method13126());
      this.loginButton.doThis((var1x, var2x) -> {
         LoginAndOutScreen var5x = (LoginAndOutScreen)this.getIcoPanel();
         var5x.method13423();
      });
   }

   @Override
   public void draw(float var1) {
      super.method13224();
      super.method13225();
      byte var4 = 28;
      RenderUtil.method11454((float)(this.xA + var4), (float)(this.yA + var4 + 10), 160.0F, 160.0F, ResourcesDecrypter.sigmaPNG, var1);
      short var5 = 305;
      short var6 = 316;
      Class9507 var7 = Client.getInstance().getNetworkManager().method30452();
      if (var7 != null) {
         this.captchaBox.method13288(var7.method36702());
         if (var7.method36702()) {
            RenderUtil.method11424(
               (float)(this.xA + var6), (float)(this.yA + var5), 114.0F, 40.0F, ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.04F)
            );
         }

         if (var7.method36701() != null) {
            RenderUtil.startScissor((float)(this.xA + var6), (float)(this.yA + var5), 190.0F, 50.0F);
            RenderUtil.method11455((float)(this.xA + var6), (float)(this.yA + var5), 190.0F, 190.0F, var7.method36701());
            RenderUtil.endScissor();
         }
      }

      super.draw(var1);
   }

   public void method13126() {
      new Thread(
            () -> {
               this.loadingBox.method13296(true);
               this.registerButton.method13288(false);
               Class9507 var3 = Client.getInstance().getNetworkManager().method30452();
               if (var3 != null) {
                  var3.method36706(this.captchaBox.method13303());
               }

               String var4 = Client.getInstance()
                  .getNetworkManager()
                  .method30448(this.usernameInputBox.method13303(), this.passwordInputBox.method13303(), this.emailInputBox.method13303(), var3);
               LoginAndOutScreen var5 = (LoginAndOutScreen)this.getIcoPanel();
               var5.method13424("Success", "You can now login.");
               var5.method13423();

               this.loadingBox.method13296(false);
               this.registerButton.method13288(true);
            }
         )
         .start();
   }
}
