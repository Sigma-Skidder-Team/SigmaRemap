package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.network.Class9507;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;

public class Class4275 extends Class4247 {
   private Class4287 field20712;
   private Class4281 field20713;
   private Class4281 field20714;
   private Class4281 field20715;
   private Class4281 field20716;
   private Class4274 field20717;
   private Class4274 field20718;
   private Class4274 field20719;
   private Class4285 field20720;
   public static int field20721 = 390;
   public static int field20722 = 590;

   public Class4275(Class4305 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.method13230(
         this.field20712 = new Class4287(
            this,
            "Register",
            228,
            43,
            ResourceRegistry.JelloMediumFont40.method23942("New Account"),
            50,
            new Class6387(Class1979.field12891.field12910, Class1979.field12891.field12910, Class1979.field12891.field12910, -7631989),
            "New Account",
            ResourceRegistry.JelloMediumFont40
         )
      );
      this.method13230(
         this.field20717 = new Class4274(
            this, "RegisterButton", 468, 291, ResourceRegistry.JelloLightFont25.method23942("Register"), 70, Class6387.field27961, "Register", ResourceRegistry.JelloLightFont25
         )
      );
      this.method13230(
         this.field20718 = new Class4274(
            this, "LoginButton", 98, 333, ResourceRegistry.JelloLightFont14.method23942("Login"), 14, Class6387.field27961, "Login", ResourceRegistry.JelloLightFont14
         )
      );
      this.method13230(this.field20720 = new Class4285(this, "loading", 530, 314, 30, 30));
      this.field20720.method13296(false);
      this.field20720.method13294(true);
      byte var9 = 50;
      short var10 = 320;
      byte var11 = 106;
      Class6387 var12 = new Class6387(-892679478, -892679478, -892679478, Class1979.field12899.field12910, Class2218.field14488, Class2218.field14492);
      this.method13230(this.field20713 = new Class4281(this, "Username", 228, var11, var10, var9, var12, "", "Username"));
      this.field20713.method13306(ResourceRegistry.JelloLightFont20);
      this.method13230(this.field20714 = new Class4281(this, "Email", 228, var11 + 53, var10, var9, var12, "", "Email"));
      this.field20714.method13306(ResourceRegistry.JelloLightFont20);
      this.method13230(this.field20715 = new Class4281(this, "Password", 228, var11 + 106, var10, var9, var12, "", "Password"));
      this.field20715.method13306(ResourceRegistry.JelloLightFont20);
      this.field20715.method13155(true);
      this.method13230(this.field20716 = new Class4281(this, "CaptchaBox", 228, var11 + 53 + 135, 80, var9, var12, "", "Captcha"));
      this.field20716.method13306(ResourceRegistry.JelloLightFont20);
      this.field20716.method13288(false);
      this.field20717.method13251((var1x, var2x) -> this.method13126());
      this.field20718.method13251((var1x, var2x) -> {
         Class4322 var5x = (Class4322)this.method13258();
         var5x.method13423();
      });
   }

   @Override
   public void method13027(float var1) {
      super.method13224();
      super.method13225();
      byte var4 = 28;
      Class3192.method11454((float)(this.field20895 + var4), (float)(this.field20896 + var4 + 10), 160.0F, 160.0F, ResourcesDecrypter.sigmaPNG, var1);
      short var5 = 305;
      short var6 = 316;
      Class9507 var7 = Client.getInstance().getNetworkManager().method30452();
      if (var7 != null) {
         this.field20716.method13288(var7.method36702());
         if (var7.method36702()) {
            Class3192.method11424(
               (float)(this.field20895 + var6), (float)(this.field20896 + var5), 114.0F, 40.0F, Class5628.method17688(Class1979.field12891.field12910, 0.04F)
            );
         }

         if (var7.method36701() != null) {
            Class3192.method11419((float)(this.field20895 + var6), (float)(this.field20896 + var5), 190.0F, 50.0F);
            Class3192.method11455((float)(this.field20895 + var6), (float)(this.field20896 + var5), 190.0F, 190.0F, var7.method36701());
            Class3192.method11422();
         }
      }

      super.method13027(var1);
   }

   public void method13126() {
      new Thread(
            () -> {
               this.field20720.method13296(true);
               this.field20717.method13288(false);
               Class9507 var3 = Client.getInstance().getNetworkManager().method30452();
               if (var3 != null) {
                  var3.method36706(this.field20716.method13303());
               }

               Client.getInstance().getNetworkManager().method30456();
               String var4 = Client.getInstance()
                  .getNetworkManager()
                  .method30448(this.field20713.method13303(), this.field20715.method13303(), this.field20714.method13303(), var3);
               Class4322 var5 = (Class4322)this.method13258();
               if (var4 != null) {
                  var5.method13424("Error", var4);
                  this.field20716.method13304("");
               } else {
                  var5.method13424("Success", "You can now login.");
                  var5.method13423();
               }

               this.field20720.method13296(false);
               this.field20717.method13288(true);
            }
         )
         .start();
   }
}
