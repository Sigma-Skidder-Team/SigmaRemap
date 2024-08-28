package mapped;

import com.mentalfrostbyte.jello.account.Account;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;

import java.awt.image.BufferedImage;

public class Class4349 extends Class4278 {
   public Account field21249 = null;
   private BufferedImage field21250;
   private Texture field21251;
   private float field21252 = 0.0F;
   private Class4285 field21253;
   private boolean field21254 = false;
   private float field21255 = 0.0F;
   private int field21256 = 0;
   private int field21257 = 0;
   private int field21258 = Class5628.method17690(Class1979.field12896.field12910, Class1979.field12891.field12910, 20.0F);

   public Class4349(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Account var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field21249 = var7;
      this.method13230(this.field21253 = new Class4285(this, "loading", var5 - 50, 35, 30, 30));
      this.field21253.method13296(false);
   }

   public void method13580(boolean var1) {
      this.method13581(var1, false);
   }

   public void method13581(boolean var1, boolean var2) {
      this.field21254 = var1;
      if (var2) {
         this.field21252 = 1.0F;
      }
   }

   public boolean method13582() {
      return this.field21254;
   }

   @Override
   public void method13027(float var1) {
      this.method13225();
      this.field21252 = (float)((double)this.field21252 + (this.field21254 ? 0.2 : -0.2));
      this.field21252 = Math.min(1.0F, Math.max(0.0F, this.field21252));
      this.field21258 = Class5628.method17690(Class1979.field12896.field12910, Class1979.field12891.field12910, 2.0F);
      if (this.field21254 || this.method13212() || this.method13298()) {
         Class3192.method11426(
            (float)this.field20895,
            (float)this.field20896,
            (float)(this.field20895 + this.field20897),
            (float)(this.field20896 + this.field20898),
            Class5628.method17688(Class1979.field12896.field12910, 0.05F)
         );
      }

      if (!this.method13212()) {
         if (this.method13298() && this.field21254) {
            Class3192.method11429(
               (float)this.field20895,
               (float)this.field20896,
               (float)(this.field20895 + this.field20897),
               (float)(this.field20896 + this.field20898),
               2,
               Class5628.method17688(Class1979.field12899.field12910, 0.5F)
            );
         } else if (!this.method13298()) {
            if (this.field21254) {
               Class3192.method11429(
                  (float)this.field20895,
                  (float)this.field20896,
                  (float)(this.field20895 + this.field20897),
                  (float)(this.field20896 + this.field20898),
                  2,
                  Class5628.method17688(Class1979.field12899.field12910, 0.3F)
               );
            }
         } else {
            Class3192.method11429(
               (float)this.field20895,
               (float)this.field20896,
               (float)(this.field20895 + this.field20897),
               (float)(this.field20896 + this.field20898),
               2,
               Class5628.method17688(Class1979.field12891.field12910, 0.3F)
            );
         }
      } else {
         Class3192.method11429(
            (float)this.field20895,
            (float)this.field20896,
            (float)(this.field20895 + this.field20897),
            (float)(this.field20896 + this.field20898),
            2,
            Class5628.method17688(Class1979.field12899.field12910, 0.65F)
         );
      }

      Class3192.method11421(this.field20895, this.field20896, this.field20895 + this.field20897, this.field20896 + this.field20898, true);
      if (this.field21249 != null) {
         this.method13584();
         Class3192.method11422();
         if (this.field21252 > 0.0F && this.field20898 > 55) {
            Class3192.method11449(
               (float)(this.field20895 + this.method13267()),
               (float)this.field20896 + (float)(26 * this.field20898) / 100.0F,
               18.0F * this.field21252 * (float)this.field20898 / 100.0F,
               (float)(47 * this.field20898) / 100.0F,
               ResourcesDecrypter.selectPNG,
               !this.method13212() ? Class1979.field12896.field12910 : this.field21258
            );
         }

         super.method13027(var1);
      }
   }

   public void method13583() {
      Class3192.method11450(
         (float)(this.field20895 + 13), (float)(this.field20896 + 13), 75.0F, 75.0F, this.field21249.setSkinTexture(), Class1979.field12896.field12910, true
      );
      Class3192.method11464((float)(this.field20895 + 13), (float)(this.field20896 + 13), 75.0F, 75.0F, 20.0F, 1.0F);
      Class3192.method11449(
         (float)(this.field20895 + 1),
         (float)this.field20896,
         100.0F,
         100.0F,
         ResourcesDecrypter.cerclePNG,
         !this.method13212() ? Class1979.field12896.field12910 : this.field21258
      );
   }

   public void method13584() {
      String var3 = this.field21249.getKnownName();
      if (var3.equals("Unknown name")) {
         var3 = this.field21249.getEmail();
      }

      Class3192.method11440(
         ResourceRegistry.field38868,
         (float)(this.field20895 + this.field20897 / 2),
         (float)(this.field20896 + 20),
         var3,
         Class5628.method17688(Class1979.field12891.field12910, 0.4F),
         Class2218.field14492,
         Class2218.field14492
      );
      Class3192.method11440(
         ResourceRegistry.field38868,
         (float)(this.field20895 + this.field20897 / 2),
         (float)(this.field20896 + 18),
         var3,
         Class1979.field12896.field12910,
         Class2218.field14492,
         Class2218.field14492
      );
      if (!this.field21249.isEmailAValidEmailFormat()) {
         Class3192.method11441(
            ResourceRegistry.field38868,
            (float)(this.field20895 + this.field20897 / 2),
            (float)(this.field20896 + 32),
            this.field21249.getPassword().replaceAll(".", "*"),
            -8355712,
            Class2218.field14492,
            Class2218.field14489,
            true
         );
      } else {
         Class3192.method11441(
            ResourceRegistry.field38868,
            (float)(this.field20895 + this.field20897 / 2),
            (float)(this.field20896 + 29),
            "Cracked",
            Class1979.field12901.field12910,
            Class2218.field14492,
            Class2218.field14489,
            true
         );
      }
   }

   public void method13585(int var1) {
      this.field21256 = var1;
      this.field21257 = var1;
   }

   public void method13586(boolean var1) {
      this.field21253.method13296(var1);
   }
}
