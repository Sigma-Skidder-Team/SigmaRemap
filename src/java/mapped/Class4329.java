package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.network.Class9507;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.Class8603;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;

public class Class4329 extends Class4305 {
   public String field21135 = "";
   public Animation field21136 = new Animation(380, 200, Direction.BACKWARDS);
   private static Class2344 field21137;
   private Class4281 field21138;

   public Class4329(Class4305 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.method13300(false);
      Class4281 var9;
      this.method13230(var9 = new Class4281(this, "redeemBox", 100, 200, 350, 50, Class4281.field20742, "", "Premium Code"));
      Class4274 var10;
      this.method13230(
         var10 = new Class4274(
            this,
            "redeembtn",
            100,
            290,
            80,
            30,
            new Class6387(Class1979.field12896.field12910, Class1979.field12896.field12910, Class1979.field12896.field12910),
            "Redeem",
            ResourceRegistry.JelloLightFont20
         )
      );
      this.method13230(this.field21138 = new Class4281(this, "captcha", 195, 290, 75, 35, Class4281.field20742, "", "Captcha"));
      this.field21138.method13306(ResourceRegistry.JelloLightFont18);
      this.field21138.method13288(false);
      var10.method13251((var2x, var3x) -> new Thread(() -> {
            Class9507 var4x = Client.getInstance().getNetworkManager().method30452();
            if (var4x != null) {
               var4x.method36706(this.field21138.method13303());
            }

            this.field21135 = Client.getInstance().getNetworkManager().method30451(var9.method13303(), Client.getInstance().getNetworkManager().method30452());
            if (this.field21135 == null) {
               this.field21135 = "";
            }

            if (Client.getInstance().getNetworkManager().isPremium()) {
               this.method13222(() -> ((Class4310)this.method13258()).method13340());
            }
         }).start());
   }

   @Override
   public void method13027(float var1) {
      this.field21136.changeDirection(!this.method13295() ? Direction.BACKWARDS : Direction.FORWARDS);
      var1 = 1.0F;
      var1 *= this.field21136.calcPercent();
      float var4 = Class8603.method30791(this.field21136.calcPercent(), 0.17, 1.0, 0.51, 1.0);
      if (this.field21136.method25319() == Direction.BACKWARDS) {
         var4 = 1.0F;
      }

      this.method13285((int)(150.0F * (1.0F - var4)));
      this.method13225();
      Class9507 var5 = Client.getInstance().getNetworkManager().method30452();
      if (var5 != null) {
         this.field21138.method13288(var5.method36702());
         if (var5.method36701() != null) {
            Class3192.method11419((float)(this.field20895 + 295), (float)(this.field20896 + 280), 190.0F, 50.0F);
            Class3192.method11449(
               (float)(this.field20895 + 316),
               (float)(this.field20896 + 280),
               190.0F,
               190.0F,
               var5.method36701(),
               Class5628.method17688(Class1979.field12896.field12910, var1)
            );
            Class3192.method11422();
         }
      }

      Class3192.method11439(ResourceRegistry.field38860, 100.0F, 100.0F, "Redeem Premium", Class5628.method17688(Class1979.field12896.field12910, var1));
      Class3192.method11439(
         ResourceRegistry.JelloLightFont25,
         100.0F,
         150.0F,
         "Visit http://sigmaclient.info for more info",
         Class5628.method17688(Class1979.field12896.field12910, 0.6F * var1)
      );
      Class3192.method11439(ResourceRegistry.JelloLightFont18, 100.0F, 263.0F, this.field21135, Class5628.method17688(Class1979.field12896.field12910, 0.6F * var1));
      super.method13027(var1);
   }
}
