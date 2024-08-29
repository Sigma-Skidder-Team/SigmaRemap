package mapped;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;

public class Class4355 extends Class4247 {
   public int field21288;
   public final Animation field21289;
   public final Animation field21290;
   public String field21291;
   public Class1998 field21292;
   public int field21293;
   public int field21294;

   public Class4355(Class4305 var1, String var2, int var3, int var4, int var5, int var6, String var7, Class1998 var8, int var9) {
      super(var1, var2, var3, var4, var5, var6, true);
      this.field21288 = var4;
      this.field21289 = new Animation(114, 114);
      this.field21290 = new Animation(200, 200);
      this.field21290.changeDirection(Direction.BACKWARDS);
      this.field21291 = var7;
      this.field21292 = var8;
      this.field21293 = var9;
      this.field21294 = var6;
      this.field20883 = true;
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      this.field21289.changeDirection(!this.method13216() ? Direction.BACKWARDS : Direction.FORWARDS);
      boolean var5 = this.method13216() || var1 > this.method13271() + this.method13267() - 62;
      this.method13215(var5);
      if (this.field21290.method25319() == Direction.FORWARDS) {
         this.method13215(false);
         this.method13264(Math.round((float)this.method13267() * Class9782.method38556(this.field21290.calcPercent(), 0.0F, 1.0F, 1.0F)));
         if (this.field21290.calcPercent() == 1.0F) {
            this.method13037();
         }
      }
   }

   public void method13608() {
      this.field21290.changeDirection(Direction.FORWARDS);
   }

   @Override
   public void method13027(float var1) {
      Class3192.method11424(
         (float)this.field20895,
         (float)this.field20896,
         (float)this.field20897,
         (float)this.field20898,
         Class5628.method17688(Class5628.method17691(Class1979.field12896.field12910, 0.03F), this.field21289.calcPercent())
      );
      Class3192.method11439(
         ResourceRegistry.JelloLightFont20,
         (float)(this.field20895 + 68),
         (float)(this.field20896 + 14),
         this.field21291,
         Class5628.method17688(Class1979.field12891.field12910, 0.8F)
      );
      Class3192.method11439(
         ResourceRegistry.JelloLightFont14,
         (float)(this.field20895 + 68),
         (float)(this.field20896 + 38),
         "x:" + this.field21292.getX() + " z:" + this.field21292.getZ(),
         Class5628.method17688(Class1979.field12891.field12910, 0.5F)
      );
      byte var4 = 27;
      int var5 = this.field20897 - 43;
      float var6 = !this.method13216() ? 0.2F : 0.4F;
      Class3192.method11424(
         (float)(this.field20895 + var5), (float)(this.field20896 + var4), 20.0F, 2.0F, Class5628.method17688(Class1979.field12891.field12910, var6)
      );
      Class3192.method11424(
         (float)(this.field20895 + var5), (float)(this.field20896 + var4 + 5), 20.0F, 2.0F, Class5628.method17688(Class1979.field12891.field12910, var6)
      );
      Class3192.method11424(
         (float)(this.field20895 + var5), (float)(this.field20896 + var4 + 10), 20.0F, 2.0F, Class5628.method17688(Class1979.field12891.field12910, var6)
      );
      Class3192.method11438(
         (float)(this.field20895 + 35),
         (float)(this.field20896 + this.field20898 / 2),
         20.0F,
         Class5628.method17690(this.field21293, Class1979.field12891.field12910, 0.9F)
      );
      Class3192.method11438((float)(this.field20895 + 35), (float)(this.field20896 + this.field20898 / 2), 17.0F, this.field21293);
      Class3192.method11463(
         (float)this.field20895, (float)this.field20896, (float)this.field20897, (float)this.field20898, 14.0F, var1 * 0.2F * this.field21289.calcPercent()
      );
      super.method13027(var1);
   }
}
