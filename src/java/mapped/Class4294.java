package mapped;

import com.mentalfrostbyte.jello.account.Account;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;

import java.awt.image.BufferedImage;

public class Class4294 extends Class4278 {
   public Account selectedAccount = null;
   private BufferedImage field20799;
   private Texture field20800;
   private Class4285 field20801;
   private boolean field20802 = false;
   private Animation field20803 = new Animation(114, 114, Direction.BACKWARDS);
   private float field20804 = 0.0F;
   public Animation field20805 = new Animation(300, 300, Direction.BACKWARDS);
   private int field20806 = 0;
   private int field20807 = 0;
   private int field20808 = Class5628.method17690(ClientColors.LIGHT_GREYISH_BLUE.getColor, ClientColors.DEEP_TEAL.getColor, 20.0F);

   public Class4294(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Account var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.selectedAccount = var7;
      this.method13230(this.field20801 = new Class4285(this, "loading", var5 - 50, 35, 30, 30));
      this.field20801.method13296(false);
   }

   public void method13166(boolean var1) {
      this.method13167(var1, false);
   }

   public void method13167(boolean var1, boolean var2) {
      this.field20803.changeDirection(!var1 ? Direction.BACKWARDS : Direction.FORWARDS);
      if (var2) {
         this.field20803.method25318(1.0F);
      }
   }

   public boolean method13168() {
      return this.field20803.method25319() == Direction.FORWARDS;
   }

   @Override
   public void method13027(float var1) {
      this.method13225();
      this.field20808 = Class5628.method17690(ClientColors.LIGHT_GREYISH_BLUE.getColor, ClientColors.DEEP_TEAL.getColor, 2.0F);
      int var4 = ((Class4339)this.field20892.method13258()).method13513();
      int var5 = Math.max(0, this.field20896 - var4);
      int var6 = Math.max(0, this.field20898 + Math.min(100, this.field20896 - var4 - var5));
      float var7 = (float)Math.min(50, var6) / 50.0F;
      int var8 = this.method13258().method13258().method13269() + this.method13258().method13258().method13272();
      int var9 = 0;
      var5 += var4;
      if (var5 - var4 <= var8) {
         if (var7 != 0.0F) {
            Class3192.method11467(
               this.field20895,
               var5,
               this.field20897,
               Math.max(20, var6),
               Class5628.method17688(!this.method13212() ? ClientColors.LIGHT_GREYISH_BLUE.getColor : this.field20808, var7)
            );
            Class3192.method11421(this.field20895, var5, this.field20895 + this.field20897 + 20, var5 + var6, true);
            if (this.selectedAccount != null) {
               this.method13169();
               this.method13170();
               this.method13171(var7);
               if (this.field20803.calcPercent() > 0.0F && var6 > 55) {
                  Class3192.method11449(
                     (float)(this.field20895 + this.method13267()),
                     (float)var5 + (float)(26 * var6) / 100.0F,
                     18.0F * this.field20803.calcPercent() * (float)var6 / 100.0F,
                     (float)(47 * var6) / 100.0F,
                     ResourcesDecrypter.selectPNG,
                     !this.method13212() ? ClientColors.LIGHT_GREYISH_BLUE.getColor : this.field20808
                  );
               }

               super.method13027(var1 * var7);
               Class3192.method11422();
            }
         }
      } else {
         var9++;
      }
   }

   public void method13169() {
      Class3192.method11450(
         (float)(this.field20895 + 13), (float)(this.field20896 + 13), 75.0F, 75.0F, this.selectedAccount.setSkinTexture(), ClientColors.LIGHT_GREYISH_BLUE.getColor, true
      );
      Class3192.method11464((float)(this.field20895 + 13), (float)(this.field20896 + 13), 75.0F, 75.0F, 20.0F, 1.0F);
      Class3192.method11449(
         (float)(this.field20895 + 1),
         (float)this.field20896,
         100.0F,
         100.0F,
         ResourcesDecrypter.cerclePNG,
         !this.method13212() ? ClientColors.LIGHT_GREYISH_BLUE.getColor : this.field20808
      );
   }

   public void method13170() {
      if (this.selectedAccount.isEmailAValidEmailFormat()) {
         Class3192.method11439(
            ResourceRegistry.JelloLightFont25, (float)(this.field20895 + 110), (float)(this.field20896 + 18), this.selectedAccount.getEmail(), ClientColors.DEEP_TEAL.getColor
         );
         Class3192.method11439(
            ResourceRegistry.JelloLightFont14,
            (float)(this.field20895 + 110),
            (float)(this.field20896 + 50),
            "Username: " + this.selectedAccount.getEmail(),
            ClientColors.MID_GREY.getColor
         );
         Class3192.method11439(
            ResourceRegistry.JelloLightFont14, (float)(this.field20895 + 110), (float)(this.field20896 + 65), "Offline account", ClientColors.MID_GREY.getColor
         );
      } else {
         Class3192.method11439(
            ResourceRegistry.JelloLightFont25, (float)(this.field20895 + 110), (float)(this.field20896 + 18), this.selectedAccount.getKnownName(), ClientColors.DEEP_TEAL.getColor
         );
         Class3192.method11439(
            ResourceRegistry.JelloLightFont14,
            (float)(this.field20895 + 110),
            (float)(this.field20896 + 50),
            "Email: " + this.selectedAccount.getEmail(),
            ClientColors.MID_GREY.getColor
         );
         Class3192.method11439(
            ResourceRegistry.JelloLightFont14,
            (float)(this.field20895 + 110),
            (float)(this.field20896 + 65),
            "Password: " + this.selectedAccount.getPassword().replaceAll(".", Character.toString('·')),
            ClientColors.MID_GREY.getColor
         );
      }
   }

   public void method13171(float var1) {
      this.field20804 = this.field20804 + (this.field20802 ? 0.33333334F : -0.33333334F);
      this.field20804 = Math.min(1.0F, Math.max(0.0F, this.field20804));
      this.field20806 = Math.max(0, this.field20806 - 1);
      float var4 = this.field20806 <= 20 ? 20.0F : -20.0F;
      float var5 = (float)this.field20806 >= var4 && (float)this.field20806 <= (float)this.field20807 - var4 ? 1.0F : (float)this.field20806 % var4 / var4;
      Class3192.method11449(
         (float)(this.field20895 + this.field20897 - 45),
         (float)(this.field20896 + 42),
         17.0F,
         17.0F,
         ResourcesDecrypter.errorsPNG,
         Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, var5 * var1)
      );
      Class3192.method11449(
         (float)(this.field20895 + this.field20897 - 45),
         (float)(this.field20896 + 45),
         17.0F,
         13.0F,
         ResourcesDecrypter.activePNG,
         Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, this.field20804 * var1)
      );
   }

   public void method13172(boolean var1) {
      this.field20802 = var1;
   }

   public void method13173(int var1) {
      this.field20806 = var1;
      this.field20807 = var1;
   }

   public void method13174(boolean var1) {
      this.field20801.method13296(var1);
   }
}
