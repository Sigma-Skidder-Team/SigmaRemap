package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.network.Class9507;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import net.minecraft.client.util.Util;

public class LoginScreen extends Class4247 {
   private Class4287 field21352;
   private Class4281 field21353;
   private Class4281 field21354;
   private Class4281 field21355;
   private Class4274 field21356;
   private Class4274 field21357;
   private Class4274 field21358;
   private Class4285 field21359;
   public static int field21360 = 334;
   public static int field21361 = 571;

   public LoginScreen(Class4305 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.method13230(
         this.field21352 = new Class4287(
            this,
            "Login",
            228,
            43,
            ResourceRegistry.JelloMediumFont40.method23942("Login"),
            50,
            new Class6387(ClientColors.DEEP_TEAL.getColor, ClientColors.DEEP_TEAL.getColor, ClientColors.DEEP_TEAL.getColor, -7631989),
            "Login",
            ResourceRegistry.JelloMediumFont40
         )
      );
      this.method13230(
         this.field21356 = new Class4274(
            this, "LoginButton", 468, 238, ResourceRegistry.JelloLightFont25.method23942("Login"), 70, Class6387.field27961, "Login", ResourceRegistry.JelloLightFont25
         )
      );
      this.method13230(
         this.field21357 = new Class4274(
            this, "RegisterButton", 88, 250, ResourceRegistry.JelloLightFont14.method23942("Register"), 14, Class6387.field27961, "Register", ResourceRegistry.JelloLightFont14
         )
      );
      this.method13230(
         this.field21358 = new Class4274(
            this,
            "ForgotButton",
            60,
            275,
            ResourceRegistry.JelloLightFont14.method23942("Forgot password?"),
            14,
            Class6387.field27961,
            "Forgot password?",
            ResourceRegistry.JelloLightFont14
         )
      );
      this.method13230(this.field21359 = new Class4285(this, "loading", 511, 260, 30, 30));
      this.field21359.method13296(false);
      this.field21359.method13294(true);
      int var9 = 50;
      int var10 = 300;
      int var11 = 106;
      Class6387 var12 = new Class6387(-892679478, -892679478, -892679478, ClientColors.MID_GREY.getColor, Class2218.field14488, Class2218.field14492);
      this.method13230(this.field21353 = new Class4281(this, "Username", 228, var11, var10, var9, var12, "", "Username"));
      this.method13230(this.field21354 = new Class4281(this, "Password", 228, var11 + 53, var10, var9, var12, "", "Password"));
      this.field21353.method13306(ResourceRegistry.JelloLightFont20);
      this.field21354.method13306(ResourceRegistry.JelloLightFont20);
      this.field21354.method13155(true);
      this.method13230(this.field21355 = new Class4281(this, "CaptchaBox", 228, var11 + 135, 84, var9, var12, "", "Captcha"));
      this.field21355.method13306(ResourceRegistry.JelloLightFont20);
      this.field21355.method13288(false);
      this.field21356.method13251((var1x, var2x) -> this.method13688());
      this.field21357.method13251((var1x, var2x) -> {
         Class4322 var5x = (Class4322)this.method13258();
         var5x.method13422();
      });
      this.field21358.method13251((var0, var1x) -> Util.getOSType().method8181("https://sigmaclient.info/pwdreset.php"));
   }

   @Override
   public void draw(float var1) {
      super.method13224();
      super.method13225();
      byte var4 = 28;
      RenderUtil.method11454((float)(this.field20895 + var4), (float)(this.field20896 + var4 + 10), 160.0F, 160.0F, ResourcesDecrypter.sigmaPNG, var1);
      Class9507 var5 = Client.getInstance().getNetworkManager().method30452();
      if (var5 != null) {
         this.field21355.method13288(var5.method36702());
         if (var5.method36702()) {
            RenderUtil.method11424(
               (float)(this.field20895 + 330), (float)(this.field20896 + 255), 114.0F, 40.0F, ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.04F)
            );
         }

         if (var5.method36701() != null) {
            RenderUtil.method11419((float)(this.field20895 + 316), (float)(this.field20896 + 255), 190.0F, 50.0F);
            RenderUtil.method11455((float)(this.field20895 + 316), (float)(this.field20896 + 255), 190.0F, 190.0F, var5.method36701());
            RenderUtil.method11422();
         }
      }

      super.draw(var1);
   }

   public void method13688() {
      new Thread(() -> {
         this.field21359.method13296(true);
         this.field21356.method13288(false);
         Class9507 var3 = Client.getInstance().getNetworkManager().method30452();
         if (var3 != null) {
            var3.method36706(this.field21355.method13303());
         }

         String var4 = Client.getInstance().getNetworkManager().method30447(this.field21353.method13303(), this.field21354.method13303(), var3);
         if (var4 != null) {
            Class4322 var5 = (Class4322)this.method13258();
            var5.method13424("Error", var4);
            this.field21355.method13304("");
         } else {
            this.method13037();
         }

         this.field21359.method13296(false);
         this.field21356.method13288(true);
      }).start();
   }
}
