package com.mentalfrostbyte.jello.gui;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4307;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.timer.Timer;
import mapped.*;

public class BirdGameScreen extends Class4307 {
   public Minecraft field21044 = Minecraft.getInstance();
   public Timer field21045 = new Timer();
   public Class4299 field21046;
   public Animation field21047;
   public int field21048 = 0;
   public int field21049 = 14;

   public BirdGameScreen() {
      super("BirdGameScreen");
      this.method13300(false);
      this.field21045.method27118();
      this.field21047 = new Animation(200, 0);
      Class5628.method17739();
      int var3 = 48;
      int var4 = 27;
      int var5 = 14;
      int var6 = var3 * var5;
      int var7 = var4 * var5;
      this.method13230(this.field21046 = new Class4299(this, "bird", (this.field20897 - var6) / 2, (this.method13269() - var7) / 2 + 30, var3, 27, var5));
   }

   @Override
   public void method13027(float var1) {
      var1 = this.field21047.calcPercent();
      float var4 = Class9747.method38214(var1, 0.0F, 1.0F, 1.0F);
      this.method13279(0.8F + var4 * 0.2F, 0.8F + var4 * 0.2F);
      float var5 = 0.25F * var1;
      Class3192.method11426(
         (float)this.field20895,
         (float)this.field20896,
         (float)(this.field20895 + this.field20897),
         (float)(this.field20896 + this.field20898),
         Class5628.method17688(Class1979.field12891.field12910, var5)
      );
      super.method13224();
      Class3192.method11463(
         (float)this.field21046.method13263(),
         (float)this.field21046.method13265(),
         (float)this.field21046.method13267(),
         (float)this.field21046.method13269(),
         40.0F,
         var1
      );
      Class3192.method11475(
         (float)(this.field21046.method13263() - 20),
         (float)(this.field21046.method13265() - 20),
         (float)(this.field21046.method13267() + 40),
         (float)(this.field21046.method13269() + 40),
         14.0F,
         Class1979.field12896.field12910
      );
      super.method13027(var1);
      int var6 = (this.field20897 - this.field21046.method13267()) / 2;
      int var7 = (this.field20898 - this.field21046.method13269()) / 2;
      Class3192.method11439(ResourceRegistry.JelloMediumFont40, (float)var6, (float)(var7 - 60), "Bird", Class1979.field12896.field12910);
//      this.field21048 = Math.max(this.field21046.method13179(), this.field21048);
      String var8 = "Max: " + this.field21048 + "   |   Score: 0";
      Class3192.method11439(
         ResourceRegistry.JelloLightFont20,
         (float)(var6 + this.field21046.method13267() - ResourceRegistry.JelloLightFont20.method23942(var8)),
         (float)(var7 - 50),
         var8,
         Class5628.method17688(Class1979.field12896.field12910, 0.8F)
      );
   }

   @Override
   public void method13065(int var1) {
      super.method13065(var1);
      if (var1 == 256) {
         Class5628.method17742();
         Minecraft.getInstance().displayGuiScreen(null);
      }
   }
}
