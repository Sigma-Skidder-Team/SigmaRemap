package mapped;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;

public class Class1048 extends Class1047 {
   private static final Class9289<BlockPos> field5804 = Class9361.<BlockPos>method35441(Class1048.class, Class7784.field33401);
   private static final Class9289<Boolean> field5805 = Class9361.<Boolean>method35441(Class1048.class, Class7784.field33398);
   private static final Class9289<Integer> field5806 = Class9361.<Integer>method35441(Class1048.class, Class7784.field33391);
   private static final Class8522 field5807 = new Class8522().method30203(10.0).method30205().method30204().method30206();
   public static final Predicate<Class1000> field5808 = var0 -> !var0.method4135() && var0.method3066() && var0.method3250();

   public Class1048(Class8992<? extends Class1048> var1, Class1655 var2) {
      super(var1, var2);
      this.field5596 = new Class6836(this);
      this.field5595 = new Class8093(this, 10);
      this.method4281(true);
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, Class39 var5) {
      this.method3352(this.method3350());
      this.field5032 = 0.0F;
      return super.method4276(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method2998() {
      return false;
   }

   @Override
   public void method4775(int var1) {
   }

   public void method4776(BlockPos var1) {
      this.field5063.method35446(field5804, var1);
   }

   public BlockPos method4777() {
      return this.field5063.<BlockPos>method35445(field5804);
   }

   public boolean method4778() {
      return this.field5063.<Boolean>method35445(field5805);
   }

   public void method4779(boolean var1) {
      this.field5063.method35446(field5805, var1);
   }

   public int method4780() {
      return this.field5063.<Integer>method35445(field5806);
   }

   public void method4781(int var1) {
      this.field5063.method35446(field5806, var1);
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5804, BlockPos.field13032);
      this.field5063.method35442(field5805, false);
      this.field5063.method35442(field5806, 2400);
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method102("TreasurePosX", this.method4777().method8304());
      var1.method102("TreasurePosY", this.method4777().getY());
      var1.method102("TreasurePosZ", this.method4777().method8306());
      var1.method115("GotFish", this.method4778());
      var1.method102("Moistness", this.method4780());
   }

   @Override
   public void method2723(Class39 var1) {
      int var4 = var1.method122("TreasurePosX");
      int var5 = var1.method122("TreasurePosY");
      int var6 = var1.method122("TreasurePosZ");
      this.method4776(new BlockPos(var4, var5, var6));
      super.method2723(var1);
      this.method4779(var1.method132("GotFish"));
      this.method4781(var1.method122("Moistness"));
   }

   @Override
   public void method4219() {
      this.field5600.method20002(0, new Class2727(this));
      this.field5600.method20002(0, new Class2763(this));
      this.field5600.method20002(1, new Class2683(this));
      this.field5600.method20002(2, new Class2776(this, 4.0));
      this.field5600.method20002(4, new Class2740(this, 1.0, 10));
      this.field5600.method20002(4, new Class2668(this));
      this.field5600.method20002(5, new Class2612(this, PlayerEntity.class, 6.0F));
      this.field5600.method20002(5, new Class2756(this, 10));
      this.field5600.method20002(6, new Class2647(this, 1.2F, true));
      this.field5600.method20002(8, new Class2688(this));
      this.field5600.method20002(8, new Class2602(this));
      this.field5600.method20002(9, new Class2770<Class1105>(this, Class1105.class, 8.0F, 1.0, 1.0));
      this.field5601.method20002(1, new Class2704(this, Class1105.class).method10918());
   }

   public static Class7037 method4782() {
      return Class1006.method4220().method21849(Class9173.field42105, 10.0).method21849(Class9173.field42108, 1.2F).method21849(Class9173.field42110, 3.0);
   }

   @Override
   public Class6990 method4221(Class1655 var1) {
      return new Class6997(this, var1);
   }

   @Override
   public boolean method3114(Entity var1) {
      boolean var4 = var1.method2741(Class8654.method31115(this), (float)((int)this.method3086(Class9173.field42110)));
      if (var4) {
         this.method3399(this, var1);
         this.method2863(Class6067.field26500, 1.0F, 1.0F);
      }

      return var4;
   }

   @Override
   public int method3350() {
      return 4800;
   }

   @Override
   public int method3012(int var1) {
      return this.method3350();
   }

   @Override
   public float method2957(Class2090 var1, Class8847 var2) {
      return 0.3F;
   }

   @Override
   public int method4259() {
      return 1;
   }

   @Override
   public int method4260() {
      return 1;
   }

   @Override
   public boolean method3313(Entity var1) {
      return true;
   }

   @Override
   public boolean method2980(Class8848 var1) {
      Class2106 var4 = Class1006.method4271(var1);
      return !this.method2943(var4).method32105() ? false : var4 == Class2106.field13731 && super.method2980(var1);
   }

   @Override
   public void method4246(Class1000 var1) {
      if (this.method2943(Class2106.field13731).method32105()) {
         Class8848 var4 = var1.method4124();
         if (this.method4252(var4)) {
            this.method3134(var1);
            this.method2944(Class2106.field13731, var4);
            this.field5605[Class2106.field13731.method8773()] = 2.0F;
            this.method2751(var1, var4.method32179());
            var1.method2904();
         }
      }
   }

   @Override
   public void tick() {
      super.tick();
      if (!this.method4305()) {
         if (!this.method3254()) {
            this.method4781(this.method4780() - 1);
            if (this.method4780() <= 0) {
               this.method2741(Class8654.field39011, 1.0F);
            }

            if (this.field5036) {
               this.method3434(
                  this.method3433()
                     .method11339((double)((this.field5054.nextFloat() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.field5054.nextFloat() * 2.0F - 1.0F) * 0.2F))
               );
               this.field5031 = this.field5054.nextFloat() * 360.0F;
               this.field5036 = false;
               this.field5078 = true;
            }
         } else {
            this.method4781(2400);
         }

         if (this.field5024.field9020 && this.method3250() && this.method3433().method11349() > 0.03) {
            Vector3d var3 = this.method3281(0.0F);
            float var4 = Class9679.method37764(this.field5031 * (float) (Math.PI / 180.0)) * 0.3F;
            float var5 = Class9679.method37763(this.field5031 * (float) (Math.PI / 180.0)) * 0.3F;
            float var6 = 1.2F - this.field5054.nextFloat() * 0.7F;

            for (int var7 = 0; var7 < 2; var7++) {
               this.field5024
                  .method6746(
                     Class7940.field34105,
                     this.getPosX() - var3.field18048 * (double)var6 + (double)var4,
                     this.getPosY() - var3.field18049,
                     this.getPosZ() - var3.field18050 * (double)var6 + (double)var5,
                     0.0,
                     0.0,
                     0.0
                  );
               this.field5024
                  .method6746(
                     Class7940.field34105,
                     this.getPosX() - var3.field18048 * (double)var6 - (double)var4,
                     this.getPosY() - var3.field18049,
                     this.getPosZ() - var3.field18050 * (double)var6 - (double)var5,
                     0.0,
                     0.0,
                     0.0
                  );
            }
         }
      } else {
         this.method3352(this.method3350());
      }
   }

   @Override
   public void method2866(byte var1) {
      if (var1 != 38) {
         super.method2866(var1);
      } else {
         this.method4783(Class7940.field34078);
      }
   }

   private void method4783(Class7436 var1) {
      for (int var4 = 0; var4 < 7; var4++) {
         double var5 = this.field5054.nextGaussian() * 0.01;
         double var7 = this.field5054.nextGaussian() * 0.01;
         double var9 = this.field5054.nextGaussian() * 0.01;
         this.field5024.method6746(var1, this.method3438(1.0), this.method3441() + 0.2, this.method3445(1.0), var5, var7, var9);
      }
   }

   @Override
   public Class2274 method4285(PlayerEntity var1, Class79 var2) {
      Class8848 var5 = var1.method3094(var2);
      if (!var5.method32105() && var5.method32107().method11743(Class5985.field26114)) {
         if (!this.field5024.field9020) {
            this.method2863(Class6067.field26502, 1.0F, 1.0F);
         }

         this.method4779(true);
         if (!var1.field4919.field29609) {
            var5.method32182(1);
         }

         return Class2274.method9002(this.field5024.field9020);
      } else {
         return super.method4285(var1, var2);
      }
   }

   public static boolean method4784(Class8992<Class1048> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      if (var3.getY() > 45 && var3.getY() < var1.method6776()) {
         Optional var7 = var1.method7178(var3);
         return (
               !Objects.equals(var7, Optional.<Class8705<Class8907>>of(Class9495.field44121))
                  || !Objects.equals(var7, Optional.<Class8705<Class8907>>of(Class9495.field44145))
            )
            && var1.method6739(var3).method23486(Class8953.field40469);
      } else {
         return false;
      }
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field26503;
   }

   @Nullable
   @Override
   public Class9455 method2880() {
      return Class6067.field26501;
   }

   @Nullable
   @Override
   public Class9455 method4241() {
      return !this.method3250() ? Class6067.field26498 : Class6067.field26499;
   }

   @Override
   public Class9455 method2860() {
      return Class6067.field26506;
   }

   @Override
   public Class9455 method2859() {
      return Class6067.field26507;
   }

   public boolean method4785() {
      BlockPos var3 = this.method4230().method21643();
      return var3 == null ? false : var3.method8317(this.method3431(), 12.0);
   }

   @Override
   public void method2915(Vector3d var1) {
      if (this.method3138() && this.method3250()) {
         this.method3265(this.method2918(), var1);
         this.move(Class2107.field13742, this.method3433());
         this.method3434(this.method3433().method11344(0.9));
         if (this.method4232() == null) {
            this.method3434(this.method3433().method11339(0.0, -0.005, 0.0));
         }
      } else {
         super.method2915(var1);
      }
   }

   @Override
   public boolean method4295(PlayerEntity var1) {
      return true;
   }

   // $VF: synthetic method
   public static Random method4787(Class1048 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Random method4788(Class1048 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Random method4789(Class1048 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Class8522 method4790() {
      return field5807;
   }
}
