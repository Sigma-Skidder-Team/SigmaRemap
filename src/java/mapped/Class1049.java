package mapped;

import java.util.Random;

public abstract class Class1049 extends Class1047 {
   private static final Class9289<Boolean> field5809 = Class9361.<Boolean>method35441(Class1049.class, Class7784.field33398);

   public Class1049(Class8992<? extends Class1049> var1, Class1655 var2) {
      super(var1, var2);
      this.field5596 = new Class6830(this);
   }

   @Override
   public float method2957(Class2090 var1, Class8847 var2) {
      return var2.field39969 * 0.65F;
   }

   public static Class7037 method4791() {
      return Class1006.method4220().method21849(Class9173.field42105, 3.0);
   }

   @Override
   public boolean method4255() {
      return super.method4255() || this.method4793();
   }

   public static boolean method4792(Class8992<? extends Class1049> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      return var1.method6738(var3).method23448(Blocks.WATER) && var1.method6738(var3.method8311()).method23448(Blocks.WATER);
   }

   @Override
   public boolean method4254(double var1) {
      return !this.method4793() && !this.method3381();
   }

   @Override
   public int method4267() {
      return 8;
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5809, false);
   }

   private boolean method4793() {
      return this.field5063.<Boolean>method35445(field5809);
   }

   public void method4794(boolean var1) {
      this.field5063.method35446(field5809, var1);
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method115("FromBucket", this.method4793());
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.method4794(var1.method132("FromBucket"));
   }

   @Override
   public void method4219() {
      super.method4219();
      this.field5600.method20002(0, new Class2747(this, 1.25));
      this.field5600.method20002(2, new Class2770<PlayerEntity>(this, PlayerEntity.class, 8.0F, 1.6, 1.4, Class8088.field34763::test));
      this.field5600.method20002(4, new Class2741(this));
   }

   @Override
   public Class6990 method4221(Class1655 var1) {
      return new Class6997(this, var1);
   }

   @Override
   public void method2915(Vector3d var1) {
      if (this.method3138() && this.method3250()) {
         this.method3265(0.01F, var1);
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
   public void method2871() {
      if (!this.method3250() && this.field5036 && this.field5038) {
         this.method3434(
            this.method3433()
               .method11339((double)((this.field5054.nextFloat() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.field5054.nextFloat() * 2.0F - 1.0F) * 0.05F))
         );
         this.field5036 = false;
         this.field5078 = true;
         this.method2863(this.method4798(), this.method3099(), this.method3100());
      }

      super.method2871();
   }

   @Override
   public Class2274 method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.method3094(var2);
      if (var5.method32107() == Class8514.field37883 && this.method3066()) {
         this.method2863(Class6067.field26430, 1.0F, 1.0F);
         var5.method32182(1);
         ItemStack var6 = this.method4796();
         this.method4795(var6);
         if (!this.field5024.field9020) {
            Class9551.field44474.method15152((Class878)var1, var6);
         }

         if (!var5.method32105()) {
            if (!var1.field4902.method4045(var6)) {
               var1.method2882(var6, false);
            }
         } else {
            var1.method3095(var2, var6);
         }

         this.method2904();
         return Class2274.method9002(this.field5024.field9020);
      } else {
         return super.method4285(var1, var2);
      }
   }

   public void method4795(ItemStack var1) {
      if (this.method3381()) {
         var1.method32150(this.method3380());
      }
   }

   public abstract ItemStack method4796();

   public boolean method4797() {
      return true;
   }

   public abstract Class9455 method4798();

   @Override
   public Class9455 method2859() {
      return Class6067.field26583;
   }

   @Override
   public void method3241(BlockPos var1, Class7380 var2) {
   }
}
